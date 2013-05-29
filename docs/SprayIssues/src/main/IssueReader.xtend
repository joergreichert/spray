package main

import com.google.gdata.client.projecthosting.IssuesQuery
import com.google.gdata.client.projecthosting.ProjectHostingService
import com.google.gdata.data.DateTime
import com.google.gdata.data.HtmlTextConstruct
import com.google.gdata.data.Person
import com.google.gdata.data.TextContent
import com.google.gdata.data.projecthosting.IssueCommentsEntry
import com.google.gdata.data.projecthosting.IssueCommentsFeed
import com.google.gdata.data.projecthosting.IssuesEntry
import com.google.gdata.data.projecthosting.IssuesFeed
import com.google.gdata.data.projecthosting.Label
import com.google.gdata.util.ServiceException
import java.io.File
import java.io.FileWriter
import java.io.IOException
import java.net.URL
import java.text.DateFormat
import java.text.DecimalFormat
import java.util.Date
import java.util.List
import org.eclipse.xtend.lib.Property

class IssueReader {
	@Property private String userName
	@Property private String passPhrase
	@Property private String namespace
	@Property private String projectName
	@Property private ProjectHostingService projectService
	@Property private URL feedUrl
	private val DecimalFormat idFormatter = new DecimalFormat("0000")
	private val DateFormat dateFormatter = DateFormat::dateTimeInstance
	private val maxResults = 25

	def static void main(String... args) throws ServiceException, IOException {
		val issueReader = new IssueReader() => [
			userName = args.get(0)
			passPhrase = args.get(1)
			namespace = "a/eclipselabs.org/"
			projectName = "spray"
		]
		issueReader.printAllIssues()
	}
	
	def getProjectService() {
		if(_projectService == null) {
			createNewProjectService
		}
		_projectService
	}
	
	def createNewProjectService() {
		_projectService = new ProjectHostingService(projectName)
		_projectService.setUserCredentials(userName, passPhrase)
	}
	

	def getFeedUrl() {
		if(_feedUrl == null) {
			_feedUrl = new URL('''https://code.google.com/«namespace»feeds/issues/p/«projectName»/issues/full'''.toString)
		}	
		_feedUrl	
	}
	
	def private void printAllIssues() throws ServiceException,
			IOException {
		val allQuery = new IssuesQuery(feedUrl)
		allQuery.maxResults = 1000
		val issueCount = projectService.query(allQuery, typeof(IssuesFeed)).entries.size;
		allQuery.maxResults = maxResults
		val max = ((issueCount - (issueCount % maxResults)) / maxResults)
		(1..max).forEach[writeSpan(allQuery)]
	}

	def private writeSpan(int index, IssuesQuery allQuery) {
		writeSpan(index, 0, allQuery)
	}
	
	def private writeSpan(int index, int initialIndex, IssuesQuery allQuery) {
  		allQuery.setStartIndex(((index - 1) * maxResults) + initialIndex + 1)	
  		allQuery.setMaxResults(maxResults)
  		val resultFeed = projectService.query(allQuery, typeof(IssuesFeed));
  		if(resultFeed.entries.size > 0) {
			val fw = new FileWriter(new File("output" + index + ".txt"))
			resultFeed.entries.forEach[fw.write(transform.toString)]
			fw.close
		}
	}
	
	def private transform(IssuesEntry it) '''
		requirement issue«issueId.value.formatId» "«title.plainText.formatText»"
			type functional
			comment "
				«transformEntry»
			
				«transformComments.join("\n\n")»
			"
			stakeholder "Spray user"
			status «status.value.transformStatus»
			labels «labels.map[transformLabel].join(" ")»
			
			
	'''
	
	def private formatId(Integer id) {
		idFormatter.format(id)
	}

	def private formatDate(DateTime dateTime) {
		if(dateTime == null) {
			"<unknown date>"
		} else {
			dateFormatter.format(new Date(dateTime.value))
		}
	}
	
	def private transformStatus(String status) {
		switch(status) {
			case "New" : "open /* new */"
			case "Accepted" : "ready"
			case "Started" : "in-progress"
			case "Fixed" : "done /* Fixed */"
			case "Duplicate" : "done /* Duplicate */"
			case "Postponed" : "open /* Postponed */"
			case "Invalid" : "done /* Invalid */"
			case "NoFixNeeded" : "done /* No fix needed */"
			case "WontFix" : "done /* WontFix */"
			case "NotReproducable" : "done /* NotReproducable */"
			case "Done" : "done"
		}
	}
	
	def private transformLabel(Label label) {
		"\"" + label.value.replace("Type-", "Type: ").replace("Priority-", "Priority: ").replace("Component-", "Component: ") + "\""
	}

	def private List<CharSequence> transformComments(IssuesEntry issue) {
		issue.transformComments(0)
	}
	
	def private List<CharSequence> transformComments(IssuesEntry it, int callCount) {
		val feedUrl = new URL('''https://code.google.com/«namespace»feeds/issues/p/«projectName»/issues/«issueId.value»/comments/full'''.toString);
		try {
	  		val resultFeed = projectService.getFeed(feedUrl, typeof(IssueCommentsFeed));
			resultFeed.getEntries().map[transformEntry]
		} catch(java.net.SocketException e) {
			return <CharSequence>newArrayList(e.message)
		}
	}
	
	def private dispatch transformEntry(IssuesEntry it) 
		'''«published.formatDate» («authors.map[transformPerson].join(", ")»): «((content as TextContent)?.content as HtmlTextConstruct).html.formatText»'''

	def private dispatch transformEntry(IssueCommentsEntry it) 
		'''«published.formatDate» («authors.map[transformPerson].join(", ")»): «((content as TextContent)?.content as HtmlTextConstruct).html.formatText»'''

	def private String transformPerson(Person person) {
		person.name
	}
	
	def private formatText(String comment) {
		comment.replace("\\", "\\\\").replace("\"", "\\\"")
	}
}