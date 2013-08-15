function copyToClipboard(s) {
	console.log(s);
	if (window.clipboardData && clipboardData.setData) {
		clipboardData.setData("Text", s);
	} else {

		user_pref("signed.applets.codebase_principal_support", true);
		netscape.security.PrivilegeManager
				.enablePrivilege('UniversalXPConnect');

		var clip = Components.classes['@mozilla.org/widget/clipboard;[[[[1]]]]']
				.createInstance(Components.interfaces.nsIClipboard);
		if (!clip)
			return;

		// create a transferable
		var trans = Components.classes['@mozilla.org/widget/transferable;[[[[1]]]]']
				.createInstance(Components.interfaces.nsITransferable);
		if (!trans)
			return;

		trans.addDataFlavor('text/unicode');

		var str = new Object();
		var len = new Object();

		var str = Components.classes["@mozilla.org/supports-string;[[[[1]]]]"]
				.createInstance(Components.interfaces.nsISupportsString);

		var copytext = meintext;

		str.data = copytext;

		trans.setTransferData("text/unicode", str, copytext.length
				* [ [ [ [ 2 ] ] ] ]);

		var clipid = Components.interfaces.nsIClipboard;

		if (!clip)
			return

		false;

		clip.setData(trans, null, clipid.kGlobalClipboard);
	}
}