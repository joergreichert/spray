package org.eclipselabs.spray2.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipselabs.spray2.xtext.services.Spray2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSpray2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'diagram'", "'for'", "'import'", "'.'", "'*'", "'style'", "'node'", "'{'", "'}'", "'edge'", "'figure'", "'tooling'", "'behavior'", "'text'", "'('", "'editable'", "'='", "'format'", "')'", "'compartment'", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'**'", "'/'", "'%'", "'!'", "'as'", "'?.'", "'*.'", "','", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'default'", "'case'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalSpray2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSpray2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSpray2Parser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g"; }



     	private Spray2GrammarAccess grammarAccess;
     	
        public InternalSpray2Parser(TokenStream input, Spray2GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Diagram";	
       	}
       	
       	@Override
       	protected Spray2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDiagram"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:67:1: entryRuleDiagram returns [EObject current=null] : iv_ruleDiagram= ruleDiagram EOF ;
    public final EObject entryRuleDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagram = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:68:2: (iv_ruleDiagram= ruleDiagram EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:69:2: iv_ruleDiagram= ruleDiagram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDiagramRule()); 
            }
            pushFollow(FOLLOW_ruleDiagram_in_entryRuleDiagram75);
            iv_ruleDiagram=ruleDiagram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDiagram; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagram85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiagram"


    // $ANTLR start "ruleDiagram"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:76:1: ruleDiagram returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( ( ruleQualifiedName ) ) ( (lv_style_5_0= ruleSprayStyleRef ) )? ( (lv_sprayElements_6_0= ruleSprayElement ) )* ) ;
    public final EObject ruleDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_imports_0_0 = null;

        EObject lv_style_5_0 = null;

        EObject lv_sprayElements_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( ( ruleQualifiedName ) ) ( (lv_style_5_0= ruleSprayStyleRef ) )? ( (lv_sprayElements_6_0= ruleSprayElement ) )* ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( ( ruleQualifiedName ) ) ( (lv_style_5_0= ruleSprayStyleRef ) )? ( (lv_sprayElements_6_0= ruleSprayElement ) )* )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( ( ruleQualifiedName ) ) ( (lv_style_5_0= ruleSprayStyleRef ) )? ( (lv_sprayElements_6_0= ruleSprayElement ) )* )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:80:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( ( ruleQualifiedName ) ) ( (lv_style_5_0= ruleSprayStyleRef ) )? ( (lv_sprayElements_6_0= ruleSprayElement ) )*
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:81:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:81:1: (lv_imports_0_0= ruleImport )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:82:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDiagramAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleDiagram131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDiagramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleDiagram144); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDiagramAccess().getDiagramKeyword_1());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:102:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:103:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:103:1: (lv_name_2_0= RULE_ID )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:104:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDiagram161); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getDiagramAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDiagramRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleDiagram178); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDiagramAccess().getForKeyword_3());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:124:1: ( ( ruleQualifiedName ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:125:1: ( ruleQualifiedName )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:125:1: ( ruleQualifiedName )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:126:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDiagramRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDiagramAccess().getModelTypeEClassCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDiagram201);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:139:2: ( (lv_style_5_0= ruleSprayStyleRef ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:140:1: (lv_style_5_0= ruleSprayStyleRef )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:140:1: (lv_style_5_0= ruleSprayStyleRef )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:141:3: lv_style_5_0= ruleSprayStyleRef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDiagramAccess().getStyleSprayStyleRefParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSprayStyleRef_in_ruleDiagram222);
                    lv_style_5_0=ruleSprayStyleRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDiagramRule());
                      	        }
                             		set(
                             			current, 
                             			"style",
                              		lv_style_5_0, 
                              		"SprayStyleRef");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:157:3: ( (lv_sprayElements_6_0= ruleSprayElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17||LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:158:1: (lv_sprayElements_6_0= ruleSprayElement )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:158:1: (lv_sprayElements_6_0= ruleSprayElement )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:159:3: lv_sprayElements_6_0= ruleSprayElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDiagramAccess().getSprayElementsSprayElementParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSprayElement_in_ruleDiagram244);
            	    lv_sprayElements_6_0=ruleSprayElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDiagramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"sprayElements",
            	              		lv_sprayElements_6_0, 
            	              		"SprayElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiagram"


    // $ANTLR start "entryRuleImport"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:183:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:184:2: (iv_ruleImport= ruleImport EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:185:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport281);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport291); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:192:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:195:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:196:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:196:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:196:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleImport328); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:200:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:201:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:201:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:202:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport349);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildCard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:226:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:227:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:228:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard386);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard397); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:235:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:238:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:239:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:239:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:240:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard444);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:250:1: (kw= '.' kw= '*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:251:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedNameWithWildCard463); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedNameWithWildCard476); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRuleSprayStyleRef"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:270:1: entryRuleSprayStyleRef returns [EObject current=null] : iv_ruleSprayStyleRef= ruleSprayStyleRef EOF ;
    public final EObject entryRuleSprayStyleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSprayStyleRef = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:271:2: (iv_ruleSprayStyleRef= ruleSprayStyleRef EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:272:2: iv_ruleSprayStyleRef= ruleSprayStyleRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSprayStyleRefRule()); 
            }
            pushFollow(FOLLOW_ruleSprayStyleRef_in_entryRuleSprayStyleRef518);
            iv_ruleSprayStyleRef=ruleSprayStyleRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSprayStyleRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSprayStyleRef528); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSprayStyleRef"


    // $ANTLR start "ruleSprayStyleRef"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:279:1: ruleSprayStyleRef returns [EObject current=null] : (otherlv_0= 'style' ( (lv_style_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleSprayStyleRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_style_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:282:28: ( (otherlv_0= 'style' ( (lv_style_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:283:1: (otherlv_0= 'style' ( (lv_style_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:283:1: (otherlv_0= 'style' ( (lv_style_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:283:3: otherlv_0= 'style' ( (lv_style_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleSprayStyleRef565); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSprayStyleRefAccess().getStyleKeyword_0());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:287:1: ( (lv_style_1_0= ruleJvmTypeReference ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:288:1: (lv_style_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:288:1: (lv_style_1_0= ruleJvmTypeReference )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:289:3: lv_style_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSprayStyleRefAccess().getStyleJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleSprayStyleRef586);
            lv_style_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSprayStyleRefRule());
              	        }
                     		set(
                     			current, 
                     			"style",
                      		lv_style_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSprayStyleRef"


    // $ANTLR start "entryRuleSprayElement"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:313:1: entryRuleSprayElement returns [EObject current=null] : iv_ruleSprayElement= ruleSprayElement EOF ;
    public final EObject entryRuleSprayElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSprayElement = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:314:2: (iv_ruleSprayElement= ruleSprayElement EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:315:2: iv_ruleSprayElement= ruleSprayElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSprayElementRule()); 
            }
            pushFollow(FOLLOW_ruleSprayElement_in_entryRuleSprayElement622);
            iv_ruleSprayElement=ruleSprayElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSprayElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSprayElement632); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSprayElement"


    // $ANTLR start "ruleSprayElement"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:322:1: ruleSprayElement returns [EObject current=null] : (this_NodeElement_0= ruleNodeElement | this_EdgeElement_1= ruleEdgeElement ) ;
    public final EObject ruleSprayElement() throws RecognitionException {
        EObject current = null;

        EObject this_NodeElement_0 = null;

        EObject this_EdgeElement_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:325:28: ( (this_NodeElement_0= ruleNodeElement | this_EdgeElement_1= ruleEdgeElement ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:326:1: (this_NodeElement_0= ruleNodeElement | this_EdgeElement_1= ruleEdgeElement )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:326:1: (this_NodeElement_0= ruleNodeElement | this_EdgeElement_1= ruleEdgeElement )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==20) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:327:5: this_NodeElement_0= ruleNodeElement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSprayElementAccess().getNodeElementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNodeElement_in_ruleSprayElement679);
                    this_NodeElement_0=ruleNodeElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NodeElement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:337:5: this_EdgeElement_1= ruleEdgeElement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSprayElementAccess().getEdgeElementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEdgeElement_in_ruleSprayElement706);
                    this_EdgeElement_1=ruleEdgeElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EdgeElement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSprayElement"


    // $ANTLR start "entryRuleNodeElement"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:353:1: entryRuleNodeElement returns [EObject current=null] : iv_ruleNodeElement= ruleNodeElement EOF ;
    public final EObject entryRuleNodeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeElement = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:354:2: (iv_ruleNodeElement= ruleNodeElement EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:355:2: iv_ruleNodeElement= ruleNodeElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeElementRule()); 
            }
            pushFollow(FOLLOW_ruleNodeElement_in_entryRuleNodeElement741);
            iv_ruleNodeElement=ruleNodeElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeElement751); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeElement"


    // $ANTLR start "ruleNodeElement"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:362:1: ruleNodeElement returns [EObject current=null] : (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( ( ruleQualifiedName ) ) ( (lv_style_4_0= ruleSprayStyleRef ) )? otherlv_5= '{' ( (lv_figure_6_0= ruleNodeFigureSection ) )? ( (lv_tooling_7_0= ruleToolingSection ) )? ( (lv_behavior_8_0= ruleBehaviorSection ) )? otherlv_9= '}' ) ;
    public final EObject ruleNodeElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        EObject lv_style_4_0 = null;

        EObject lv_figure_6_0 = null;

        AntlrDatatypeRuleToken lv_tooling_7_0 = null;

        AntlrDatatypeRuleToken lv_behavior_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:365:28: ( (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( ( ruleQualifiedName ) ) ( (lv_style_4_0= ruleSprayStyleRef ) )? otherlv_5= '{' ( (lv_figure_6_0= ruleNodeFigureSection ) )? ( (lv_tooling_7_0= ruleToolingSection ) )? ( (lv_behavior_8_0= ruleBehaviorSection ) )? otherlv_9= '}' ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:366:1: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( ( ruleQualifiedName ) ) ( (lv_style_4_0= ruleSprayStyleRef ) )? otherlv_5= '{' ( (lv_figure_6_0= ruleNodeFigureSection ) )? ( (lv_tooling_7_0= ruleToolingSection ) )? ( (lv_behavior_8_0= ruleBehaviorSection ) )? otherlv_9= '}' )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:366:1: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( ( ruleQualifiedName ) ) ( (lv_style_4_0= ruleSprayStyleRef ) )? otherlv_5= '{' ( (lv_figure_6_0= ruleNodeFigureSection ) )? ( (lv_tooling_7_0= ruleToolingSection ) )? ( (lv_behavior_8_0= ruleBehaviorSection ) )? otherlv_9= '}' )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:366:3: otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( ( ruleQualifiedName ) ) ( (lv_style_4_0= ruleSprayStyleRef ) )? otherlv_5= '{' ( (lv_figure_6_0= ruleNodeFigureSection ) )? ( (lv_tooling_7_0= ruleToolingSection ) )? ( (lv_behavior_8_0= ruleBehaviorSection ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleNodeElement788); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNodeElementAccess().getNodeKeyword_0());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:370:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:371:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:371:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:372:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeElement805); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getNodeElementAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNodeElementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleNodeElement822); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNodeElementAccess().getForKeyword_2());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:392:1: ( ( ruleQualifiedName ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:393:1: ( ruleQualifiedName )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:393:1: ( ruleQualifiedName )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:394:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNodeElementRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNodeElementAccess().getTypeEClassCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNodeElement845);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:407:2: ( (lv_style_4_0= ruleSprayStyleRef ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:408:1: (lv_style_4_0= ruleSprayStyleRef )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:408:1: (lv_style_4_0= ruleSprayStyleRef )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:409:3: lv_style_4_0= ruleSprayStyleRef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeElementAccess().getStyleSprayStyleRefParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSprayStyleRef_in_ruleNodeElement866);
                    lv_style_4_0=ruleSprayStyleRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNodeElementRule());
                      	        }
                             		set(
                             			current, 
                             			"style",
                              		lv_style_4_0, 
                              		"SprayStyleRef");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleNodeElement879); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getNodeElementAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:429:1: ( (lv_figure_6_0= ruleNodeFigureSection ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:430:1: (lv_figure_6_0= ruleNodeFigureSection )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:430:1: (lv_figure_6_0= ruleNodeFigureSection )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:431:3: lv_figure_6_0= ruleNodeFigureSection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeElementAccess().getFigureNodeFigureSectionParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNodeFigureSection_in_ruleNodeElement900);
                    lv_figure_6_0=ruleNodeFigureSection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNodeElementRule());
                      	        }
                             		set(
                             			current, 
                             			"figure",
                              		lv_figure_6_0, 
                              		"NodeFigureSection");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:447:3: ( (lv_tooling_7_0= ruleToolingSection ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:448:1: (lv_tooling_7_0= ruleToolingSection )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:448:1: (lv_tooling_7_0= ruleToolingSection )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:449:3: lv_tooling_7_0= ruleToolingSection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeElementAccess().getToolingToolingSectionParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleToolingSection_in_ruleNodeElement922);
                    lv_tooling_7_0=ruleToolingSection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNodeElementRule());
                      	        }
                             		set(
                             			current, 
                             			"tooling",
                              		lv_tooling_7_0, 
                              		"ToolingSection");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:465:3: ( (lv_behavior_8_0= ruleBehaviorSection ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:466:1: (lv_behavior_8_0= ruleBehaviorSection )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:466:1: (lv_behavior_8_0= ruleBehaviorSection )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:467:3: lv_behavior_8_0= ruleBehaviorSection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeElementAccess().getBehaviorBehaviorSectionParserRuleCall_8_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBehaviorSection_in_ruleNodeElement944);
                    lv_behavior_8_0=ruleBehaviorSection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNodeElementRule());
                      	        }
                             		set(
                             			current, 
                             			"behavior",
                              		lv_behavior_8_0, 
                              		"BehaviorSection");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleNodeElement957); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getNodeElementAccess().getRightCurlyBracketKeyword_9());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeElement"


    // $ANTLR start "entryRuleEdgeElement"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:495:1: entryRuleEdgeElement returns [EObject current=null] : iv_ruleEdgeElement= ruleEdgeElement EOF ;
    public final EObject entryRuleEdgeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeElement = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:496:2: (iv_ruleEdgeElement= ruleEdgeElement EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:497:2: iv_ruleEdgeElement= ruleEdgeElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeElementRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeElement_in_entryRuleEdgeElement993);
            iv_ruleEdgeElement=ruleEdgeElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeElement1003); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEdgeElement"


    // $ANTLR start "ruleEdgeElement"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:504:1: ruleEdgeElement returns [EObject current=null] : (otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( ( ruleQualifiedName ) ) ( (lv_style_4_0= ruleSprayStyleRef ) )? otherlv_5= '{' ( (lv_figure_6_0= ruleEdgeFigureSection ) )? ( (lv_tooling_7_0= ruleToolingSection ) )? ( (lv_behavior_8_0= ruleBehaviorSection ) )? otherlv_9= '}' ) ;
    public final EObject ruleEdgeElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        EObject lv_style_4_0 = null;

        EObject lv_figure_6_0 = null;

        AntlrDatatypeRuleToken lv_tooling_7_0 = null;

        AntlrDatatypeRuleToken lv_behavior_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:507:28: ( (otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( ( ruleQualifiedName ) ) ( (lv_style_4_0= ruleSprayStyleRef ) )? otherlv_5= '{' ( (lv_figure_6_0= ruleEdgeFigureSection ) )? ( (lv_tooling_7_0= ruleToolingSection ) )? ( (lv_behavior_8_0= ruleBehaviorSection ) )? otherlv_9= '}' ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:508:1: (otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( ( ruleQualifiedName ) ) ( (lv_style_4_0= ruleSprayStyleRef ) )? otherlv_5= '{' ( (lv_figure_6_0= ruleEdgeFigureSection ) )? ( (lv_tooling_7_0= ruleToolingSection ) )? ( (lv_behavior_8_0= ruleBehaviorSection ) )? otherlv_9= '}' )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:508:1: (otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( ( ruleQualifiedName ) ) ( (lv_style_4_0= ruleSprayStyleRef ) )? otherlv_5= '{' ( (lv_figure_6_0= ruleEdgeFigureSection ) )? ( (lv_tooling_7_0= ruleToolingSection ) )? ( (lv_behavior_8_0= ruleBehaviorSection ) )? otherlv_9= '}' )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:508:3: otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( ( ruleQualifiedName ) ) ( (lv_style_4_0= ruleSprayStyleRef ) )? otherlv_5= '{' ( (lv_figure_6_0= ruleEdgeFigureSection ) )? ( (lv_tooling_7_0= ruleToolingSection ) )? ( (lv_behavior_8_0= ruleBehaviorSection ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleEdgeElement1040); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEdgeElementAccess().getEdgeKeyword_0());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:512:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:513:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:513:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:514:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEdgeElement1057); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getEdgeElementAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEdgeElementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEdgeElement1074); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEdgeElementAccess().getForKeyword_2());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:534:1: ( ( ruleQualifiedName ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:535:1: ( ruleQualifiedName )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:535:1: ( ruleQualifiedName )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:536:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEdgeElementRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeElementAccess().getTypeEClassCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEdgeElement1097);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:549:2: ( (lv_style_4_0= ruleSprayStyleRef ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:550:1: (lv_style_4_0= ruleSprayStyleRef )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:550:1: (lv_style_4_0= ruleSprayStyleRef )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:551:3: lv_style_4_0= ruleSprayStyleRef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeElementAccess().getStyleSprayStyleRefParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSprayStyleRef_in_ruleEdgeElement1118);
                    lv_style_4_0=ruleSprayStyleRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEdgeElementRule());
                      	        }
                             		set(
                             			current, 
                             			"style",
                              		lv_style_4_0, 
                              		"SprayStyleRef");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleEdgeElement1131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEdgeElementAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:571:1: ( (lv_figure_6_0= ruleEdgeFigureSection ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:572:1: (lv_figure_6_0= ruleEdgeFigureSection )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:572:1: (lv_figure_6_0= ruleEdgeFigureSection )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:573:3: lv_figure_6_0= ruleEdgeFigureSection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeElementAccess().getFigureEdgeFigureSectionParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEdgeFigureSection_in_ruleEdgeElement1152);
                    lv_figure_6_0=ruleEdgeFigureSection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEdgeElementRule());
                      	        }
                             		set(
                             			current, 
                             			"figure",
                              		lv_figure_6_0, 
                              		"EdgeFigureSection");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:589:3: ( (lv_tooling_7_0= ruleToolingSection ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:590:1: (lv_tooling_7_0= ruleToolingSection )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:590:1: (lv_tooling_7_0= ruleToolingSection )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:591:3: lv_tooling_7_0= ruleToolingSection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeElementAccess().getToolingToolingSectionParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleToolingSection_in_ruleEdgeElement1174);
                    lv_tooling_7_0=ruleToolingSection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEdgeElementRule());
                      	        }
                             		set(
                             			current, 
                             			"tooling",
                              		lv_tooling_7_0, 
                              		"ToolingSection");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:607:3: ( (lv_behavior_8_0= ruleBehaviorSection ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:608:1: (lv_behavior_8_0= ruleBehaviorSection )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:608:1: (lv_behavior_8_0= ruleBehaviorSection )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:609:3: lv_behavior_8_0= ruleBehaviorSection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeElementAccess().getBehaviorBehaviorSectionParserRuleCall_8_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBehaviorSection_in_ruleEdgeElement1196);
                    lv_behavior_8_0=ruleBehaviorSection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEdgeElementRule());
                      	        }
                             		set(
                             			current, 
                             			"behavior",
                              		lv_behavior_8_0, 
                              		"BehaviorSection");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleEdgeElement1209); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getEdgeElementAccess().getRightCurlyBracketKeyword_9());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEdgeElement"


    // $ANTLR start "entryRuleNodeFigureSection"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:637:1: entryRuleNodeFigureSection returns [EObject current=null] : iv_ruleNodeFigureSection= ruleNodeFigureSection EOF ;
    public final EObject entryRuleNodeFigureSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeFigureSection = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:638:2: (iv_ruleNodeFigureSection= ruleNodeFigureSection EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:639:2: iv_ruleNodeFigureSection= ruleNodeFigureSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeFigureSectionRule()); 
            }
            pushFollow(FOLLOW_ruleNodeFigureSection_in_entryRuleNodeFigureSection1245);
            iv_ruleNodeFigureSection=ruleNodeFigureSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeFigureSection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeFigureSection1255); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeFigureSection"


    // $ANTLR start "ruleNodeFigureSection"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:646:1: ruleNodeFigureSection returns [EObject current=null] : (otherlv_0= 'figure' ( (lv_shapeRef_1_0= ruleJvmTypeReference ) ) (otherlv_2= '{' ( (lv_textProperties_3_0= ruleTextPropertyAssignment ) )* ( (lv_compartmentProperties_4_0= ruleCompartmentPropertyAssignment ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleNodeFigureSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_shapeRef_1_0 = null;

        EObject lv_textProperties_3_0 = null;

        EObject lv_compartmentProperties_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:649:28: ( (otherlv_0= 'figure' ( (lv_shapeRef_1_0= ruleJvmTypeReference ) ) (otherlv_2= '{' ( (lv_textProperties_3_0= ruleTextPropertyAssignment ) )* ( (lv_compartmentProperties_4_0= ruleCompartmentPropertyAssignment ) )* otherlv_5= '}' )? ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:650:1: (otherlv_0= 'figure' ( (lv_shapeRef_1_0= ruleJvmTypeReference ) ) (otherlv_2= '{' ( (lv_textProperties_3_0= ruleTextPropertyAssignment ) )* ( (lv_compartmentProperties_4_0= ruleCompartmentPropertyAssignment ) )* otherlv_5= '}' )? )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:650:1: (otherlv_0= 'figure' ( (lv_shapeRef_1_0= ruleJvmTypeReference ) ) (otherlv_2= '{' ( (lv_textProperties_3_0= ruleTextPropertyAssignment ) )* ( (lv_compartmentProperties_4_0= ruleCompartmentPropertyAssignment ) )* otherlv_5= '}' )? )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:650:3: otherlv_0= 'figure' ( (lv_shapeRef_1_0= ruleJvmTypeReference ) ) (otherlv_2= '{' ( (lv_textProperties_3_0= ruleTextPropertyAssignment ) )* ( (lv_compartmentProperties_4_0= ruleCompartmentPropertyAssignment ) )* otherlv_5= '}' )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleNodeFigureSection1292); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNodeFigureSectionAccess().getFigureKeyword_0());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:654:1: ( (lv_shapeRef_1_0= ruleJvmTypeReference ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:655:1: (lv_shapeRef_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:655:1: (lv_shapeRef_1_0= ruleJvmTypeReference )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:656:3: lv_shapeRef_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNodeFigureSectionAccess().getShapeRefJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleNodeFigureSection1313);
            lv_shapeRef_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNodeFigureSectionRule());
              	        }
                     		set(
                     			current, 
                     			"shapeRef",
                      		lv_shapeRef_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:672:2: (otherlv_2= '{' ( (lv_textProperties_3_0= ruleTextPropertyAssignment ) )* ( (lv_compartmentProperties_4_0= ruleCompartmentPropertyAssignment ) )* otherlv_5= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==18) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:672:4: otherlv_2= '{' ( (lv_textProperties_3_0= ruleTextPropertyAssignment ) )* ( (lv_compartmentProperties_4_0= ruleCompartmentPropertyAssignment ) )* otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleNodeFigureSection1326); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNodeFigureSectionAccess().getLeftCurlyBracketKeyword_2_0());
                          
                    }
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:676:1: ( (lv_textProperties_3_0= ruleTextPropertyAssignment ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==24) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:677:1: (lv_textProperties_3_0= ruleTextPropertyAssignment )
                    	    {
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:677:1: (lv_textProperties_3_0= ruleTextPropertyAssignment )
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:678:3: lv_textProperties_3_0= ruleTextPropertyAssignment
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNodeFigureSectionAccess().getTextPropertiesTextPropertyAssignmentParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTextPropertyAssignment_in_ruleNodeFigureSection1347);
                    	    lv_textProperties_3_0=ruleTextPropertyAssignment();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getNodeFigureSectionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"textProperties",
                    	              		lv_textProperties_3_0, 
                    	              		"TextPropertyAssignment");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:694:3: ( (lv_compartmentProperties_4_0= ruleCompartmentPropertyAssignment ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==30) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:695:1: (lv_compartmentProperties_4_0= ruleCompartmentPropertyAssignment )
                    	    {
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:695:1: (lv_compartmentProperties_4_0= ruleCompartmentPropertyAssignment )
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:696:3: lv_compartmentProperties_4_0= ruleCompartmentPropertyAssignment
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNodeFigureSectionAccess().getCompartmentPropertiesCompartmentPropertyAssignmentParserRuleCall_2_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCompartmentPropertyAssignment_in_ruleNodeFigureSection1369);
                    	    lv_compartmentProperties_4_0=ruleCompartmentPropertyAssignment();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getNodeFigureSectionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"compartmentProperties",
                    	              		lv_compartmentProperties_4_0, 
                    	              		"CompartmentPropertyAssignment");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleNodeFigureSection1382); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getNodeFigureSectionAccess().getRightCurlyBracketKeyword_2_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeFigureSection"


    // $ANTLR start "entryRuleEdgeFigureSection"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:724:1: entryRuleEdgeFigureSection returns [EObject current=null] : iv_ruleEdgeFigureSection= ruleEdgeFigureSection EOF ;
    public final EObject entryRuleEdgeFigureSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeFigureSection = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:725:2: (iv_ruleEdgeFigureSection= ruleEdgeFigureSection EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:726:2: iv_ruleEdgeFigureSection= ruleEdgeFigureSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeFigureSectionRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeFigureSection_in_entryRuleEdgeFigureSection1420);
            iv_ruleEdgeFigureSection=ruleEdgeFigureSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeFigureSection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeFigureSection1430); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEdgeFigureSection"


    // $ANTLR start "ruleEdgeFigureSection"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:733:1: ruleEdgeFigureSection returns [EObject current=null] : (otherlv_0= 'figure' ( (lv_shapeRef_1_0= ruleJvmTypeReference ) ) (otherlv_2= '{' ( (lv_textProperties_3_0= ruleTextPropertyAssignment ) )* otherlv_4= '}' )? ) ;
    public final EObject ruleEdgeFigureSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_shapeRef_1_0 = null;

        EObject lv_textProperties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:736:28: ( (otherlv_0= 'figure' ( (lv_shapeRef_1_0= ruleJvmTypeReference ) ) (otherlv_2= '{' ( (lv_textProperties_3_0= ruleTextPropertyAssignment ) )* otherlv_4= '}' )? ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:737:1: (otherlv_0= 'figure' ( (lv_shapeRef_1_0= ruleJvmTypeReference ) ) (otherlv_2= '{' ( (lv_textProperties_3_0= ruleTextPropertyAssignment ) )* otherlv_4= '}' )? )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:737:1: (otherlv_0= 'figure' ( (lv_shapeRef_1_0= ruleJvmTypeReference ) ) (otherlv_2= '{' ( (lv_textProperties_3_0= ruleTextPropertyAssignment ) )* otherlv_4= '}' )? )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:737:3: otherlv_0= 'figure' ( (lv_shapeRef_1_0= ruleJvmTypeReference ) ) (otherlv_2= '{' ( (lv_textProperties_3_0= ruleTextPropertyAssignment ) )* otherlv_4= '}' )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleEdgeFigureSection1467); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEdgeFigureSectionAccess().getFigureKeyword_0());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:741:1: ( (lv_shapeRef_1_0= ruleJvmTypeReference ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:742:1: (lv_shapeRef_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:742:1: (lv_shapeRef_1_0= ruleJvmTypeReference )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:743:3: lv_shapeRef_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeFigureSectionAccess().getShapeRefJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleEdgeFigureSection1488);
            lv_shapeRef_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEdgeFigureSectionRule());
              	        }
                     		set(
                     			current, 
                     			"shapeRef",
                      		lv_shapeRef_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:759:2: (otherlv_2= '{' ( (lv_textProperties_3_0= ruleTextPropertyAssignment ) )* otherlv_4= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==18) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:759:4: otherlv_2= '{' ( (lv_textProperties_3_0= ruleTextPropertyAssignment ) )* otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleEdgeFigureSection1501); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEdgeFigureSectionAccess().getLeftCurlyBracketKeyword_2_0());
                          
                    }
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:763:1: ( (lv_textProperties_3_0= ruleTextPropertyAssignment ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==24) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:764:1: (lv_textProperties_3_0= ruleTextPropertyAssignment )
                    	    {
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:764:1: (lv_textProperties_3_0= ruleTextPropertyAssignment )
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:765:3: lv_textProperties_3_0= ruleTextPropertyAssignment
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEdgeFigureSectionAccess().getTextPropertiesTextPropertyAssignmentParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTextPropertyAssignment_in_ruleEdgeFigureSection1522);
                    	    lv_textProperties_3_0=ruleTextPropertyAssignment();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEdgeFigureSectionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"textProperties",
                    	              		lv_textProperties_3_0, 
                    	              		"TextPropertyAssignment");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleEdgeFigureSection1535); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEdgeFigureSectionAccess().getRightCurlyBracketKeyword_2_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEdgeFigureSection"


    // $ANTLR start "entryRuleToolingSection"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:793:1: entryRuleToolingSection returns [String current=null] : iv_ruleToolingSection= ruleToolingSection EOF ;
    public final String entryRuleToolingSection() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleToolingSection = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:794:2: (iv_ruleToolingSection= ruleToolingSection EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:795:2: iv_ruleToolingSection= ruleToolingSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getToolingSectionRule()); 
            }
            pushFollow(FOLLOW_ruleToolingSection_in_entryRuleToolingSection1574);
            iv_ruleToolingSection=ruleToolingSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleToolingSection.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleToolingSection1585); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleToolingSection"


    // $ANTLR start "ruleToolingSection"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:802:1: ruleToolingSection returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'tooling' ;
    public final AntlrDatatypeRuleToken ruleToolingSection() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:805:28: (kw= 'tooling' )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:807:2: kw= 'tooling'
            {
            kw=(Token)match(input,22,FOLLOW_22_in_ruleToolingSection1622); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getToolingSectionAccess().getToolingKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleToolingSection"


    // $ANTLR start "entryRuleBehaviorSection"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:820:1: entryRuleBehaviorSection returns [String current=null] : iv_ruleBehaviorSection= ruleBehaviorSection EOF ;
    public final String entryRuleBehaviorSection() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBehaviorSection = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:821:2: (iv_ruleBehaviorSection= ruleBehaviorSection EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:822:2: iv_ruleBehaviorSection= ruleBehaviorSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBehaviorSectionRule()); 
            }
            pushFollow(FOLLOW_ruleBehaviorSection_in_entryRuleBehaviorSection1662);
            iv_ruleBehaviorSection=ruleBehaviorSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBehaviorSection.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBehaviorSection1673); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehaviorSection"


    // $ANTLR start "ruleBehaviorSection"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:829:1: ruleBehaviorSection returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'behavior' ;
    public final AntlrDatatypeRuleToken ruleBehaviorSection() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:832:28: (kw= 'behavior' )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:834:2: kw= 'behavior'
            {
            kw=(Token)match(input,23,FOLLOW_23_in_ruleBehaviorSection1710); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getBehaviorSectionAccess().getBehaviorKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehaviorSection"


    // $ANTLR start "entryRuleTextPropertyAssignment"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:847:1: entryRuleTextPropertyAssignment returns [EObject current=null] : iv_ruleTextPropertyAssignment= ruleTextPropertyAssignment EOF ;
    public final EObject entryRuleTextPropertyAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextPropertyAssignment = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:848:2: (iv_ruleTextPropertyAssignment= ruleTextPropertyAssignment EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:849:2: iv_ruleTextPropertyAssignment= ruleTextPropertyAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextPropertyAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleTextPropertyAssignment_in_entryRuleTextPropertyAssignment1749);
            iv_ruleTextPropertyAssignment=ruleTextPropertyAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextPropertyAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextPropertyAssignment1759); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextPropertyAssignment"


    // $ANTLR start "ruleTextPropertyAssignment"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:856:1: ruleTextPropertyAssignment returns [EObject current=null] : (otherlv_0= 'text' ( ( ruleQualifiedName ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' (otherlv_5= 'editable' otherlv_6= '=' ( (lv_editable_7_0= ruleXBooleanLiteral ) ) )? (otherlv_8= 'format' otherlv_9= '=' ( (lv_format_10_0= ruleXBlockExpression ) ) )? otherlv_11= ')' )? ) ;
    public final EObject ruleTextPropertyAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_editable_7_0 = null;

        EObject lv_format_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:859:28: ( (otherlv_0= 'text' ( ( ruleQualifiedName ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' (otherlv_5= 'editable' otherlv_6= '=' ( (lv_editable_7_0= ruleXBooleanLiteral ) ) )? (otherlv_8= 'format' otherlv_9= '=' ( (lv_format_10_0= ruleXBlockExpression ) ) )? otherlv_11= ')' )? ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:860:1: (otherlv_0= 'text' ( ( ruleQualifiedName ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' (otherlv_5= 'editable' otherlv_6= '=' ( (lv_editable_7_0= ruleXBooleanLiteral ) ) )? (otherlv_8= 'format' otherlv_9= '=' ( (lv_format_10_0= ruleXBlockExpression ) ) )? otherlv_11= ')' )? )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:860:1: (otherlv_0= 'text' ( ( ruleQualifiedName ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' (otherlv_5= 'editable' otherlv_6= '=' ( (lv_editable_7_0= ruleXBooleanLiteral ) ) )? (otherlv_8= 'format' otherlv_9= '=' ( (lv_format_10_0= ruleXBlockExpression ) ) )? otherlv_11= ')' )? )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:860:3: otherlv_0= 'text' ( ( ruleQualifiedName ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' (otherlv_5= 'editable' otherlv_6= '=' ( (lv_editable_7_0= ruleXBooleanLiteral ) ) )? (otherlv_8= 'format' otherlv_9= '=' ( (lv_format_10_0= ruleXBlockExpression ) ) )? otherlv_11= ')' )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleTextPropertyAssignment1796); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTextPropertyAssignmentAccess().getTextKeyword_0());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:864:1: ( ( ruleQualifiedName ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:865:1: ( ruleQualifiedName )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:865:1: ( ruleQualifiedName )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:866:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTextPropertyAssignmentRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTextPropertyAssignmentAccess().getKeyJvmEnumerationLiteralCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTextPropertyAssignment1819);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleTextPropertyAssignment1831); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTextPropertyAssignmentAccess().getForKeyword_2());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:883:1: ( (otherlv_3= RULE_ID ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:884:1: (otherlv_3= RULE_ID )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:884:1: (otherlv_3= RULE_ID )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:885:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTextPropertyAssignmentRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTextPropertyAssignment1851); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getTextPropertyAssignmentAccess().getAttributeEAttributeCrossReference_3_0()); 
              	
            }

            }


            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:896:2: (otherlv_4= '(' (otherlv_5= 'editable' otherlv_6= '=' ( (lv_editable_7_0= ruleXBooleanLiteral ) ) )? (otherlv_8= 'format' otherlv_9= '=' ( (lv_format_10_0= ruleXBlockExpression ) ) )? otherlv_11= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:896:4: otherlv_4= '(' (otherlv_5= 'editable' otherlv_6= '=' ( (lv_editable_7_0= ruleXBooleanLiteral ) ) )? (otherlv_8= 'format' otherlv_9= '=' ( (lv_format_10_0= ruleXBlockExpression ) ) )? otherlv_11= ')'
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleTextPropertyAssignment1864); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTextPropertyAssignmentAccess().getLeftParenthesisKeyword_4_0());
                          
                    }
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:900:1: (otherlv_5= 'editable' otherlv_6= '=' ( (lv_editable_7_0= ruleXBooleanLiteral ) ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==26) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:900:3: otherlv_5= 'editable' otherlv_6= '=' ( (lv_editable_7_0= ruleXBooleanLiteral ) )
                            {
                            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleTextPropertyAssignment1877); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getTextPropertyAssignmentAccess().getEditableKeyword_4_1_0());
                                  
                            }
                            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleTextPropertyAssignment1889); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getTextPropertyAssignmentAccess().getEqualsSignKeyword_4_1_1());
                                  
                            }
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:908:1: ( (lv_editable_7_0= ruleXBooleanLiteral ) )
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:909:1: (lv_editable_7_0= ruleXBooleanLiteral )
                            {
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:909:1: (lv_editable_7_0= ruleXBooleanLiteral )
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:910:3: lv_editable_7_0= ruleXBooleanLiteral
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTextPropertyAssignmentAccess().getEditableXBooleanLiteralParserRuleCall_4_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleTextPropertyAssignment1910);
                            lv_editable_7_0=ruleXBooleanLiteral();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTextPropertyAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"editable",
                                      		lv_editable_7_0, 
                                      		"XBooleanLiteral");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:926:4: (otherlv_8= 'format' otherlv_9= '=' ( (lv_format_10_0= ruleXBlockExpression ) ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==28) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:926:6: otherlv_8= 'format' otherlv_9= '=' ( (lv_format_10_0= ruleXBlockExpression ) )
                            {
                            otherlv_8=(Token)match(input,28,FOLLOW_28_in_ruleTextPropertyAssignment1925); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getTextPropertyAssignmentAccess().getFormatKeyword_4_2_0());
                                  
                            }
                            otherlv_9=(Token)match(input,27,FOLLOW_27_in_ruleTextPropertyAssignment1937); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getTextPropertyAssignmentAccess().getEqualsSignKeyword_4_2_1());
                                  
                            }
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:934:1: ( (lv_format_10_0= ruleXBlockExpression ) )
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:935:1: (lv_format_10_0= ruleXBlockExpression )
                            {
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:935:1: (lv_format_10_0= ruleXBlockExpression )
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:936:3: lv_format_10_0= ruleXBlockExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTextPropertyAssignmentAccess().getFormatXBlockExpressionParserRuleCall_4_2_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXBlockExpression_in_ruleTextPropertyAssignment1958);
                            lv_format_10_0=ruleXBlockExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTextPropertyAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"format",
                                      		lv_format_10_0, 
                                      		"XBlockExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleTextPropertyAssignment1972); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getTextPropertyAssignmentAccess().getRightParenthesisKeyword_4_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextPropertyAssignment"


    // $ANTLR start "entryRuleCompartmentPropertyAssignment"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:964:1: entryRuleCompartmentPropertyAssignment returns [EObject current=null] : iv_ruleCompartmentPropertyAssignment= ruleCompartmentPropertyAssignment EOF ;
    public final EObject entryRuleCompartmentPropertyAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompartmentPropertyAssignment = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:965:2: (iv_ruleCompartmentPropertyAssignment= ruleCompartmentPropertyAssignment EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:966:2: iv_ruleCompartmentPropertyAssignment= ruleCompartmentPropertyAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompartmentPropertyAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleCompartmentPropertyAssignment_in_entryRuleCompartmentPropertyAssignment2010);
            iv_ruleCompartmentPropertyAssignment=ruleCompartmentPropertyAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompartmentPropertyAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompartmentPropertyAssignment2020); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompartmentPropertyAssignment"


    // $ANTLR start "ruleCompartmentPropertyAssignment"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:973:1: ruleCompartmentPropertyAssignment returns [EObject current=null] : (otherlv_0= 'compartment' ( ( ruleQualifiedName ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleCompartmentPropertyAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:976:28: ( (otherlv_0= 'compartment' ( ( ruleQualifiedName ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:977:1: (otherlv_0= 'compartment' ( ( ruleQualifiedName ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:977:1: (otherlv_0= 'compartment' ( ( ruleQualifiedName ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:977:3: otherlv_0= 'compartment' ( ( ruleQualifiedName ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleCompartmentPropertyAssignment2057); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCompartmentPropertyAssignmentAccess().getCompartmentKeyword_0());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:981:1: ( ( ruleQualifiedName ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:982:1: ( ruleQualifiedName )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:982:1: ( ruleQualifiedName )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:983:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCompartmentPropertyAssignmentRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompartmentPropertyAssignmentAccess().getKeyJvmEnumerationLiteralCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCompartmentPropertyAssignment2080);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCompartmentPropertyAssignment2092); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCompartmentPropertyAssignmentAccess().getForKeyword_2());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1000:1: ( (otherlv_3= RULE_ID ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1001:1: (otherlv_3= RULE_ID )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1001:1: (otherlv_3= RULE_ID )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1002:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCompartmentPropertyAssignmentRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompartmentPropertyAssignment2112); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getCompartmentPropertyAssignmentAccess().getAttributeEAttributeCrossReference_3_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompartmentPropertyAssignment"


    // $ANTLR start "entryRuleXExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1021:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1022:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1023:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression2148);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression2158); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1030:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1033:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1035:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression2204);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1051:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1052:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1053:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment2238);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment2248); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1060:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1063:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1064:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1064:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==EOF||(LA23_1>=RULE_ID && LA23_1<=RULE_STRING)||LA23_1==12||(LA23_1>=14 && LA23_1<=15)||(LA23_1>=18 && LA23_1<=19)||LA23_1==25||LA23_1==29||(LA23_1>=31 && LA23_1<=53)||(LA23_1>=55 && LA23_1<=79)) ) {
                    alt23=2;
                }
                else if ( (LA23_1==27) ) {
                    alt23=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA23_0>=RULE_INT && LA23_0<=RULE_STRING)||LA23_0==12||LA23_0==18||LA23_0==25||LA23_0==40||(LA23_0>=43 && LA23_0<=44)||LA23_0==48||LA23_0==53||LA23_0==57||LA23_0==59||(LA23_0>=63 && LA23_0<=64)||LA23_0==67||(LA23_0>=69 && LA23_0<=76)) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1064:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1064:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1064:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1064:3: ()
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1065:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1070:2: ( ( ruleValidID ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1071:1: ( ruleValidID )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1071:1: ( ruleValidID )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1072:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment2306);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment2322);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1093:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1094:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1094:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1095:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment2342);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1112:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1112:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1113:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment2372);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1121:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==31) ) {
                        int LA22_1 = input.LA(2);

                        if ( (synpred1_InternalSpray2()) ) {
                            alt22=1;
                        }
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1121:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1121:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1121:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1126:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1126:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1126:7: ()
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1127:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1132:2: ( ( ruleOpMultiAssign ) )
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1133:1: ( ruleOpMultiAssign )
                            {
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1133:1: ( ruleOpMultiAssign )
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1134:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment2425);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1147:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1148:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1148:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1149:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment2448);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1173:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1174:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1175:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2488);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign2499); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1182:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1185:28: (kw= '=' )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1187:2: kw= '='
            {
            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpSingleAssign2536); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1200:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1201:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1202:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2576);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign2587); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1209:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1212:28: (kw= '+=' )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1214:2: kw= '+='
            {
            kw=(Token)match(input,31,FOLLOW_31_in_ruleOpMultiAssign2624); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1227:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1228:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1229:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2663);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression2673); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1236:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1239:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1240:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1240:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1241:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2720);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1249:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==32) ) {
                    int LA24_2 = input.LA(2);

                    if ( (synpred2_InternalSpray2()) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1249:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1249:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1249:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1254:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1254:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1254:7: ()
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1255:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1260:2: ( ( ruleOpOr ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1261:1: ( ruleOpOr )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1261:1: ( ruleOpOr )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1262:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression2773);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1275:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1276:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1276:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1277:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2796);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1301:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1302:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1303:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr2835);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr2846); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1310:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1313:28: (kw= '||' )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1315:2: kw= '||'
            {
            kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOr2883); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1328:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1329:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1330:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2922);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression2932); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1337:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1340:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1341:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1341:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1342:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2979);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1350:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==33) ) {
                    int LA25_2 = input.LA(2);

                    if ( (synpred3_InternalSpray2()) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1350:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1350:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1350:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1355:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1355:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1355:7: ()
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1356:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1361:2: ( ( ruleOpAnd ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1362:1: ( ruleOpAnd )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1362:1: ( ruleOpAnd )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1363:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression3032);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1376:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1377:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1377:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1378:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3055);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1402:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1403:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1404:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd3094);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd3105); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1411:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1414:28: (kw= '&&' )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1416:2: kw= '&&'
            {
            kw=(Token)match(input,33,FOLLOW_33_in_ruleOpAnd3142); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1429:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1430:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1431:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression3181);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression3191); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1438:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1441:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1442:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1442:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1443:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3238);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1451:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==34) ) {
                    int LA26_2 = input.LA(2);

                    if ( (synpred4_InternalSpray2()) ) {
                        alt26=1;
                    }


                }
                else if ( (LA26_0==35) ) {
                    int LA26_3 = input.LA(2);

                    if ( (synpred4_InternalSpray2()) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1451:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1451:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1451:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1456:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1456:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1456:7: ()
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1457:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1462:2: ( ( ruleOpEquality ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1463:1: ( ruleOpEquality )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1463:1: ( ruleOpEquality )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1464:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression3291);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1477:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1478:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1478:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1479:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3314);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1503:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1504:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1505:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality3353);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality3364); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1512:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1515:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1516:1: (kw= '==' | kw= '!=' )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1516:1: (kw= '==' | kw= '!=' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            else if ( (LA27_0==35) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1517:2: kw= '=='
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpEquality3402); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1524:2: kw= '!='
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpEquality3421); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1537:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1538:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1539:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression3461);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression3471); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1546:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1549:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1550:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1550:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1551:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3518);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1559:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop28:
            do {
                int alt28=3;
                switch ( input.LA(1) ) {
                case 36:
                    {
                    int LA28_2 = input.LA(2);

                    if ( (synpred5_InternalSpray2()) ) {
                        alt28=1;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA28_3 = input.LA(2);

                    if ( (synpred6_InternalSpray2()) ) {
                        alt28=2;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA28_4 = input.LA(2);

                    if ( (synpred6_InternalSpray2()) ) {
                        alt28=2;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA28_5 = input.LA(2);

                    if ( (synpred6_InternalSpray2()) ) {
                        alt28=2;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA28_6 = input.LA(2);

                    if ( (synpred6_InternalSpray2()) ) {
                        alt28=2;
                    }


                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1559:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1559:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1559:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1559:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1559:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1561:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1561:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1561:6: ()
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1562:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleXRelationalExpression3554); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1571:3: ( ( ruleQualifiedName ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1572:1: ( ruleQualifiedName )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1572:1: ( ruleQualifiedName )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1573:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression3579);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1587:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1587:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1587:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1587:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1587:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1592:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1592:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1592:7: ()
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1593:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1598:2: ( ( ruleOpCompare ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1599:1: ( ruleOpCompare )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1599:1: ( ruleOpCompare )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1600:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3640);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1613:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1614:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1614:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1615:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3663);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1639:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1640:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1641:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare3703);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare3714); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1648:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1651:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1652:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1652:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt29=1;
                }
                break;
            case 38:
                {
                alt29=2;
                }
                break;
            case 39:
                {
                alt29=3;
                }
                break;
            case 40:
                {
                alt29=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1653:2: kw= '>='
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpCompare3752); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1660:2: kw= '<='
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpCompare3771); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1667:2: kw= '>'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpCompare3790); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1674:2: kw= '<'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpCompare3809); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1687:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1688:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1689:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3849);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3859); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1696:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1699:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1700:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1700:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1701:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3906);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1709:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==41) ) {
                    int LA30_2 = input.LA(2);

                    if ( (synpred7_InternalSpray2()) ) {
                        alt30=1;
                    }


                }
                else if ( (LA30_0==42) ) {
                    int LA30_3 = input.LA(2);

                    if ( (synpred7_InternalSpray2()) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1709:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1709:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1709:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1714:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1714:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1714:7: ()
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1715:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1720:2: ( ( ruleOpOther ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1721:1: ( ruleOpOther )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1721:1: ( ruleOpOther )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1722:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3959);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1735:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1736:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1736:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1737:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3982);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1761:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1762:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1763:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther4021);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther4032); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1770:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1773:28: ( (kw= '->' | kw= '..' ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1774:1: (kw= '->' | kw= '..' )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1774:1: (kw= '->' | kw= '..' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==41) ) {
                alt31=1;
            }
            else if ( (LA31_0==42) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1775:2: kw= '->'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpOther4070); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1782:2: kw= '..'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpOther4089); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1795:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1796:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1797:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression4129);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression4139); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1804:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1807:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1808:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1808:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1809:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4186);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1817:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==43) ) {
                    int LA32_2 = input.LA(2);

                    if ( (synpred8_InternalSpray2()) ) {
                        alt32=1;
                    }


                }
                else if ( (LA32_0==44) ) {
                    int LA32_3 = input.LA(2);

                    if ( (synpred8_InternalSpray2()) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1817:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1817:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1817:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1822:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1822:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1822:7: ()
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1823:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1828:2: ( ( ruleOpAdd ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1829:1: ( ruleOpAdd )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1829:1: ( ruleOpAdd )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1830:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression4239);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1843:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1844:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1844:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1845:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4262);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1869:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1870:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1871:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd4301);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd4312); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1878:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1881:28: ( (kw= '+' | kw= '-' ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1882:1: (kw= '+' | kw= '-' )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1882:1: (kw= '+' | kw= '-' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==43) ) {
                alt33=1;
            }
            else if ( (LA33_0==44) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1883:2: kw= '+'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpAdd4350); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1890:2: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpAdd4369); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1903:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1904:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1905:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4409);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4419); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1912:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1915:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1916:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1916:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1917:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4466);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1925:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop34:
            do {
                int alt34=2;
                switch ( input.LA(1) ) {
                case 15:
                    {
                    int LA34_2 = input.LA(2);

                    if ( (synpred9_InternalSpray2()) ) {
                        alt34=1;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA34_3 = input.LA(2);

                    if ( (synpred9_InternalSpray2()) ) {
                        alt34=1;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA34_4 = input.LA(2);

                    if ( (synpred9_InternalSpray2()) ) {
                        alt34=1;
                    }


                    }
                    break;
                case 47:
                    {
                    int LA34_5 = input.LA(2);

                    if ( (synpred9_InternalSpray2()) ) {
                        alt34=1;
                    }


                    }
                    break;

                }

                switch (alt34) {
            	case 1 :
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1925:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1925:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1925:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1930:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1930:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1930:7: ()
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1931:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1936:2: ( ( ruleOpMulti ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1937:1: ( ruleOpMulti )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1937:1: ( ruleOpMulti )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1938:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4519);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1951:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1952:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1952:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1953:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4542);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1977:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1978:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1979:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti4581);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti4592); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1986:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1989:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1990:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1990:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt35=1;
                }
                break;
            case 45:
                {
                alt35=2;
                }
                break;
            case 46:
                {
                alt35=3;
                }
                break;
            case 47:
                {
                alt35=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1991:2: kw= '*'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleOpMulti4630); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1998:2: kw= '**'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpMulti4649); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2005:2: kw= '/'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleOpMulti4668); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2012:2: kw= '%'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleOpMulti4687); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2025:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2026:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2027:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4727);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation4737); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2034:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2037:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2038:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2038:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=43 && LA36_0<=44)||LA36_0==48) ) {
                alt36=1;
            }
            else if ( ((LA36_0>=RULE_ID && LA36_0<=RULE_STRING)||LA36_0==12||LA36_0==18||LA36_0==25||LA36_0==40||LA36_0==53||LA36_0==57||LA36_0==59||(LA36_0>=63 && LA36_0<=64)||LA36_0==67||(LA36_0>=69 && LA36_0<=76)) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2038:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2038:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2038:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2038:3: ()
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2039:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2044:2: ( ( ruleOpUnary ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2045:1: ( ruleOpUnary )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2045:1: ( ruleOpUnary )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2046:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4795);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2059:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2060:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2060:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2061:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4816);
                    lv_operand_2_0=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XCastedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2079:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4845);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2095:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2096:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2097:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary4881);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary4892); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2104:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2107:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2108:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2108:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt37=1;
                }
                break;
            case 44:
                {
                alt37=2;
                }
                break;
            case 43:
                {
                alt37=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2109:2: kw= '!'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleOpUnary4930); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2116:2: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpUnary4949); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2123:2: kw= '+'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpUnary4968); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2136:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2137:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2138:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression5008);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression5018); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2145:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2148:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2149:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2149:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2150:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression5065);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2158:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==49) ) {
                    int LA38_2 = input.LA(2);

                    if ( (synpred10_InternalSpray2()) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2158:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2158:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2158:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2160:5: ( () otherlv_2= 'as' )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2160:6: () otherlv_2= 'as'
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2160:6: ()
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2161:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXCastedExpression5100); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2170:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2171:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2171:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2172:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression5123);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2196:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2197:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2198:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall5161);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall5171); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2205:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;

        EObject lv_memberCallArguments_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2208:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2209:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2209:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2210:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall5218);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2218:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop46:
            do {
                int alt46=3;
                switch ( input.LA(1) ) {
                case 14:
                    {
                    int LA46_2 = input.LA(2);

                    if ( (synpred11_InternalSpray2()) ) {
                        alt46=1;
                    }
                    else if ( (synpred12_InternalSpray2()) ) {
                        alt46=2;
                    }


                    }
                    break;
                case 50:
                    {
                    int LA46_3 = input.LA(2);

                    if ( (synpred12_InternalSpray2()) ) {
                        alt46=2;
                    }


                    }
                    break;
                case 51:
                    {
                    int LA46_4 = input.LA(2);

                    if ( (synpred12_InternalSpray2()) ) {
                        alt46=2;
                    }


                    }
                    break;

                }

                switch (alt46) {
            	case 1 :
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2218:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2218:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2218:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2218:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2218:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2224:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2224:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2224:26: ()
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2225:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleXMemberFeatureCall5267); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2234:1: ( ( ruleValidID ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2235:1: ( ruleValidID )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2235:1: ( ruleValidID )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2236:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5290);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall5306);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2257:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2258:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2258:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2259:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall5328);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2276:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2276:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2276:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2276:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2276:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2292:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2292:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2292:8: ()
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2293:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2298:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt39=3;
            	    switch ( input.LA(1) ) {
            	    case 14:
            	        {
            	        alt39=1;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt39=2;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt39=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 39, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt39) {
            	        case 1 :
            	            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2298:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleXMemberFeatureCall5414); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2303:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2303:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2304:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2304:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2305:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,50,FOLLOW_50_in_ruleXMemberFeatureCall5438); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2319:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2319:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2320:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2320:1: (lv_spreading_9_0= '*.' )
            	            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2321:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,51,FOLLOW_51_in_ruleXMemberFeatureCall5475); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2334:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==40) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2334:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall5504); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2338:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2339:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2339:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2340:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5525);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2356:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop40:
            	            do {
            	                int alt40=2;
            	                int LA40_0 = input.LA(1);

            	                if ( (LA40_0==52) ) {
            	                    alt40=1;
            	                }


            	                switch (alt40) {
            	            	case 1 :
            	            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2356:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,52,FOLLOW_52_in_ruleXMemberFeatureCall5538); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2360:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2361:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2361:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2362:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5559);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop40;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,39,FOLLOW_39_in_ruleXMemberFeatureCall5573); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2382:3: ( ( ruleValidID ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2383:1: ( ruleValidID )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2383:1: ( ruleValidID )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2384:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5598);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2397:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt44=2;
            	    alt44 = dfa44.predict(input);
            	    switch (alt44) {
            	        case 1 :
            	            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2397:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2397:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2397:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2404:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2405:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,25,FOLLOW_25_in_ruleXMemberFeatureCall5632); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2418:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt43=3;
            	            alt43 = dfa43.predict(input);
            	            switch (alt43) {
            	                case 1 :
            	                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2418:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2418:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2418:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2435:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2436:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5717);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2453:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2453:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2453:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2453:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2454:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2454:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2455:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5745);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2471:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop42:
            	                    do {
            	                        int alt42=2;
            	                        int LA42_0 = input.LA(1);

            	                        if ( (LA42_0==52) ) {
            	                            alt42=1;
            	                        }


            	                        switch (alt42) {
            	                    	case 1 :
            	                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2471:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,52,FOLLOW_52_in_ruleXMemberFeatureCall5758); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2475:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2476:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2476:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2477:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5779);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop42;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,29,FOLLOW_29_in_ruleXMemberFeatureCall5796); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2497:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt45=2;
            	    alt45 = dfa45.predict(input);
            	    switch (alt45) {
            	        case 1 :
            	            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2497:4: ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2502:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2503:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5829);
            	            lv_memberCallArguments_22_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_22_0, 
            	                      		"XClosure");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2527:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2528:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2529:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5869);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression5879); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2536:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2539:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2540:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2540:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt47=13;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt47=1;
                }
                break;
            case 18:
                {
                alt47=2;
                }
                break;
            case 59:
                {
                alt47=3;
                }
                break;
            case RULE_ID:
            case 40:
            case 67:
                {
                alt47=4;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 53:
            case 70:
            case 71:
            case 72:
            case 73:
                {
                alt47=5;
                }
                break;
            case 57:
                {
                alt47=6;
                }
                break;
            case 12:
                {
                alt47=7;
                }
                break;
            case 63:
                {
                alt47=8;
                }
                break;
            case 64:
                {
                alt47=9;
                }
                break;
            case 74:
                {
                alt47=10;
                }
                break;
            case 75:
                {
                alt47=11;
                }
                break;
            case 76:
                {
                alt47=12;
                }
                break;
            case 25:
                {
                alt47=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2541:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5926);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2551:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5953);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2561:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5980);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2571:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression6007);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2581:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression6034);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2591:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression6061);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2601:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression6088);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2611:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression6115);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2621:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression6142);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2631:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression6169);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2641:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression6196);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2651:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression6223);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2661:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression6250);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2677:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2678:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2679:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral6285);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral6295); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2686:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XIntLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2689:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2690:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2690:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt48=6;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt48=1;
                }
                break;
            case 70:
            case 71:
                {
                alt48=2;
                }
                break;
            case RULE_INT:
                {
                alt48=3;
                }
                break;
            case 72:
                {
                alt48=4;
                }
                break;
            case RULE_STRING:
                {
                alt48=5;
                }
                break;
            case 73:
                {
                alt48=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2691:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral6342);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2701:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral6369);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2711:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral6396);
                    this_XIntLiteral_2=ruleXIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIntLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2721:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral6423);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2731:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral6450);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2741:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral6477);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2757:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2758:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2759:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure6512);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure6522); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2766:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2769:28: ( ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2770:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2770:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2770:2: () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2770:2: ()
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2771:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXClosure6568); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2780:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt51=2;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2780:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2795:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2795:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2795:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==RULE_ID||LA50_0==25||LA50_0==79) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2795:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2795:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2796:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2796:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2797:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6639);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"declaredFormalParameters",
                                      		lv_declaredFormalParameters_2_0, 
                                      		"JvmFormalParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2813:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop49:
                            do {
                                int alt49=2;
                                int LA49_0 = input.LA(1);

                                if ( (LA49_0==52) ) {
                                    alt49=1;
                                }


                                switch (alt49) {
                            	case 1 :
                            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2813:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleXClosure6652); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2817:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2818:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2818:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2819:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6673);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"declaredFormalParameters",
                            	              		lv_declaredFormalParameters_4_0, 
                            	              		"JvmFormalParameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop49;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2835:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2836:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2836:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2837:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,54,FOLLOW_54_in_ruleXClosure6695); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_2_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXClosureRule());
                      	        }
                             		setWithLastConsumed(current, "explicitSyntax", true, "|");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2850:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2851:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2851:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2852:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6732);
            lv_expression_6_0=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpressionInClosure");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,55,FOLLOW_55_in_ruleXClosure6744); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXExpressionInClosure"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2880:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2881:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2882:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6780);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure6790); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2889:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2892:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2893:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2893:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2893:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2893:2: ()
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2894:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2899:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=RULE_ID && LA53_0<=RULE_STRING)||LA53_0==12||LA53_0==18||LA53_0==25||LA53_0==40||(LA53_0>=43 && LA53_0<=44)||LA53_0==48||LA53_0==53||LA53_0==57||LA53_0==59||(LA53_0>=63 && LA53_0<=67)||(LA53_0>=69 && LA53_0<=76)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2899:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2899:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2900:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2900:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2901:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6846);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2917:2: (otherlv_2= ';' )?
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==56) ) {
            	        alt52=1;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2917:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleXExpressionInClosure6859); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2929:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2930:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2931:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6899);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure6909); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2938:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2941:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2942:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2942:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2942:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2942:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2942:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2958:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2958:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2958:7: ()
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2959:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2964:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID||LA55_0==25||LA55_0==79) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2964:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2964:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2965:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2965:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2966:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7017);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"declaredFormalParameters",
                              		lv_declaredFormalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2982:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==52) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2982:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleXShortClosure7030); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2986:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2987:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2987:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2988:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7051);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declaredFormalParameters",
                    	              		lv_declaredFormalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3004:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3005:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3005:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3006:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,54,FOLLOW_54_in_ruleXShortClosure7073); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXShortClosureRule());
              	        }
                     		setWithLastConsumed(current, "explicitSyntax", true, "|");
              	    
            }

            }


            }


            }


            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3019:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3020:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3020:1: (lv_expression_5_0= ruleXExpression )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3021:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure7109);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3045:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3046:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3047:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression7145);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression7155); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3054:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3057:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3058:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3058:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3058:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleXParenthesizedExpression7192); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression7214);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleXParenthesizedExpression7225); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3083:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3084:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3085:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression7261);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression7271); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3092:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3095:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3096:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3096:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3096:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3096:2: ()
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3097:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXIfExpression7317); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleXIfExpression7329); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3110:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3111:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3111:1: (lv_if_3_0= ruleXExpression )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3112:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7350);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleXIfExpression7362); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3132:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3133:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3133:1: (lv_then_5_0= ruleXExpression )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3134:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7383);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3150:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==58) ) {
                int LA56_1 = input.LA(2);

                if ( (synpred18_InternalSpray2()) ) {
                    alt56=1;
                }
            }
            switch (alt56) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3150:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3150:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3150:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,58,FOLLOW_58_in_ruleXIfExpression7404); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3155:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3156:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3156:1: (lv_else_7_0= ruleXExpression )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3157:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7426);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3181:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3182:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3183:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression7464);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression7474); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3190:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        EObject lv_cases_6_0 = null;

        EObject lv_default_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3193:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3194:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3194:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3194:2: () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3194:2: ()
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3195:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXSwitchExpression7520); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3204:1: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==60) && (synpred19_InternalSpray2())) {
                    alt57=1;
                }
            }
            switch (alt57) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3204:2: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3209:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3209:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3209:6: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3210:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3210:1: (lv_localVarName_2_0= ruleValidID )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3211:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression7561);
                    lv_localVarName_2_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_2_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,60,FOLLOW_60_in_ruleXSwitchExpression7573); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_1());
                          
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3231:4: ( (lv_switch_4_0= ruleXExpression ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3232:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3232:1: (lv_switch_4_0= ruleXExpression )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3233:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7597);
            lv_switch_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"switch",
                      		lv_switch_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleXSwitchExpression7609); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3253:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_ID||LA58_0==25||LA58_0==60||LA58_0==62||LA58_0==79) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3254:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3254:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3255:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7630);
            	    lv_cases_6_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_6_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
            } while (true);

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3271:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==61) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3271:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,61,FOLLOW_61_in_ruleXSwitchExpression7644); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,60,FOLLOW_60_in_ruleXSwitchExpression7656); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3279:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3280:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3280:1: (lv_default_9_0= ruleXExpression )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3281:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7677);
                    lv_default_9_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_9_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleXSwitchExpression7691); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3309:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3310:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3311:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart7727);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart7737); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3318:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3321:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3322:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3322:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3322:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3322:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID||LA60_0==25||LA60_0==79) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3323:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3323:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3324:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7783);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3340:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==62) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3340:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXCasePart7797); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3344:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3345:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3345:1: (lv_case_2_0= ruleXExpression )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3346:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7818);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,60,FOLLOW_60_in_ruleXCasePart7832); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3366:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3367:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3367:1: (lv_then_4_0= ruleXExpression )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3368:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7853);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3392:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3393:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3394:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7889);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression7899); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3401:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3404:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3405:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3405:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3405:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3405:2: ()
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3406:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleXForLoopExpression7945); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleXForLoopExpression7957); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3419:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3420:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3420:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3421:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7978);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,60,FOLLOW_60_in_ruleXForLoopExpression7990); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3441:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3442:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3442:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3443:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression8011);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleXForLoopExpression8023); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3463:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3464:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3464:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3465:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression8044);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3489:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3490:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3491:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression8080);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression8090); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3498:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3501:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3502:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3502:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3502:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3502:2: ()
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3503:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXWhileExpression8136); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleXWhileExpression8148); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3516:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3517:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3517:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3518:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression8169);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleXWhileExpression8181); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3538:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3539:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3539:1: (lv_body_5_0= ruleXExpression )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3540:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression8202);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3564:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3565:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3566:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression8238);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression8248); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3573:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3576:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3577:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3577:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3577:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3577:2: ()
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3578:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXDoWhileExpression8294); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3587:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3588:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3588:1: (lv_body_2_0= ruleXExpression )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3589:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8315);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,63,FOLLOW_63_in_ruleXDoWhileExpression8327); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleXDoWhileExpression8339); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3613:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3614:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3614:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3615:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8360);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleXDoWhileExpression8372); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3643:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3644:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3645:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8408);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression8418); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3652:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3655:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3656:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3656:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3656:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3656:2: ()
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3657:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleXBlockExpression8464); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3666:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0>=RULE_ID && LA63_0<=RULE_STRING)||LA63_0==12||LA63_0==18||LA63_0==25||LA63_0==40||(LA63_0>=43 && LA63_0<=44)||LA63_0==48||LA63_0==53||LA63_0==57||LA63_0==59||(LA63_0>=63 && LA63_0<=67)||(LA63_0>=69 && LA63_0<=76)) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3666:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3666:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3667:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3667:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3668:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8486);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3684:2: (otherlv_3= ';' )?
            	    int alt62=2;
            	    int LA62_0 = input.LA(1);

            	    if ( (LA62_0==56) ) {
            	        alt62=1;
            	    }
            	    switch (alt62) {
            	        case 1 :
            	            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3684:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleXBlockExpression8499); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleXBlockExpression8515); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3700:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3701:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3702:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8551);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8561); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3709:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3712:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3713:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3713:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=65 && LA64_0<=66)) ) {
                alt64=1;
            }
            else if ( ((LA64_0>=RULE_ID && LA64_0<=RULE_STRING)||LA64_0==12||LA64_0==18||LA64_0==25||LA64_0==40||(LA64_0>=43 && LA64_0<=44)||LA64_0==48||LA64_0==53||LA64_0==57||LA64_0==59||(LA64_0>=63 && LA64_0<=64)||LA64_0==67||(LA64_0>=69 && LA64_0<=76)) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3714:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8608);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3724:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8635);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3740:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3741:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3742:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8670);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration8680); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3749:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3752:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3753:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3753:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3753:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3753:2: ()
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3754:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3759:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==65) ) {
                alt65=1;
            }
            else if ( (LA65_0==66) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3759:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3759:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3760:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3760:1: (lv_writeable_1_0= 'var' )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3761:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,65,FOLLOW_65_in_ruleXVariableDeclaration8733); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3775:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,66,FOLLOW_66_in_ruleXVariableDeclaration8764); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3779:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID) ) {
                int LA66_1 = input.LA(2);

                if ( (synpred20_InternalSpray2()) ) {
                    alt66=1;
                }
                else if ( (true) ) {
                    alt66=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA66_0==25) && (synpred20_InternalSpray2())) {
                alt66=1;
            }
            else if ( (LA66_0==79) && (synpred20_InternalSpray2())) {
                alt66=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3779:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3779:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3779:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3787:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3787:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3787:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3788:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3788:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3789:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8812);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3805:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3806:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3806:1: (lv_name_4_0= ruleValidID )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3807:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8833);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3824:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3824:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3825:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3825:1: (lv_name_5_0= ruleValidID )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3826:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8862);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3842:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==27) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3842:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleXVariableDeclaration8876); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3846:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3847:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3847:1: (lv_right_7_0= ruleXExpression )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3848:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8897);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3872:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3873:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3874:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8935);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter8945); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3881:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3884:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3885:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3885:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3885:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3885:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID) ) {
                int LA68_1 = input.LA(2);

                if ( (LA68_1==RULE_ID||LA68_1==14||LA68_1==40||LA68_1==53) ) {
                    alt68=1;
                }
            }
            else if ( (LA68_0==25||LA68_0==79) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3886:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3886:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3887:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8991);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3903:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3904:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3904:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3905:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter9013);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3929:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3930:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3931:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter9049);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter9059); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3938:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3941:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3942:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3942:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3942:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3942:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3943:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3943:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3944:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter9105);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"parameterType",
                      		lv_parameterType_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3960:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3961:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3961:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3962:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter9126);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3986:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3987:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3988:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall9162);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall9172); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3995:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;

        EObject lv_featureCallArguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3998:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3999:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3999:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3999:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3999:2: ()
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4000:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4005:2: ( ( ruleStaticQualifier ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_ID) ) {
                int LA69_1 = input.LA(2);

                if ( (LA69_1==68) ) {
                    alt69=1;
                }
            }
            switch (alt69) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4006:1: ( ruleStaticQualifier )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4006:1: ( ruleStaticQualifier )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4007:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall9229);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4020:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==40) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4020:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXFeatureCall9243); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4024:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4025:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4025:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4026:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9264);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4042:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==52) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4042:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,52,FOLLOW_52_in_ruleXFeatureCall9277); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4046:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4047:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4047:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4048:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9298);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,39,FOLLOW_39_in_ruleXFeatureCall9312); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4068:3: ( ( ruleIdOrSuper ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4069:1: ( ruleIdOrSuper )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4069:1: ( ruleIdOrSuper )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4070:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall9337);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4083:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4083:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4083:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4083:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4090:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4091:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,25,FOLLOW_25_in_ruleXFeatureCall9371); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4104:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt73=3;
                    alt73 = dfa73.predict(input);
                    switch (alt73) {
                        case 1 :
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4104:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4104:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4104:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4121:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4122:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall9456);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4139:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4139:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4139:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4139:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4140:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4140:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4141:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall9484);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4157:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop72:
                            do {
                                int alt72=2;
                                int LA72_0 = input.LA(1);

                                if ( (LA72_0==52) ) {
                                    alt72=1;
                                }


                                switch (alt72) {
                            	case 1 :
                            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4157:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,52,FOLLOW_52_in_ruleXFeatureCall9497); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4161:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4162:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4162:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4163:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall9518);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop72;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,29,FOLLOW_29_in_ruleXFeatureCall9535); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4183:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt75=2;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4183:4: ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4188:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4189:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall9568);
                    lv_featureCallArguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4213:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4214:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4215:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper9606);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper9617); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4222:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4225:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4226:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4226:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_ID) ) {
                alt76=1;
            }
            else if ( (LA76_0==67) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4227:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper9664);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4239:2: kw= 'super'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleIdOrSuper9688); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4252:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4253:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4254:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9729);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier9740); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4261:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4264:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4265:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4265:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt77=0;
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==RULE_ID) ) {
                    int LA77_2 = input.LA(2);

                    if ( (LA77_2==68) ) {
                        alt77=1;
                    }


                }


                switch (alt77) {
            	case 1 :
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4266:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier9787);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,68,FOLLOW_68_in_ruleStaticQualifier9805); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt77 >= 1 ) break loop77;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(77, input);
                        throw eee;
                }
                cnt77++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4290:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4291:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4292:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9846);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall9856); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4299:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4302:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4303:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4303:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4303:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4303:2: ()
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4304:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXConstructorCall9902); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4313:1: ( ( ruleQualifiedName ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4314:1: ( ruleQualifiedName )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4314:1: ( ruleQualifiedName )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4315:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9925);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4328:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==40) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4328:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleXConstructorCall9938); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4332:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4333:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4333:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4334:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9959);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4350:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==52) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4350:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,52,FOLLOW_52_in_ruleXConstructorCall9972); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4354:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4355:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4355:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4356:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9993);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,39,FOLLOW_39_in_ruleXConstructorCall10007); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleXConstructorCall10021); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4380:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt81=3;
            alt81 = dfa81.predict(input);
            switch (alt81) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4380:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4380:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4380:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4397:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4398:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall10093);
                    lv_arguments_9_0=ruleXShortClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_9_0, 
                              		"XShortClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4415:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4415:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4415:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4415:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4416:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4416:1: (lv_arguments_10_0= ruleXExpression )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4417:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall10121);
                    lv_arguments_10_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_10_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4433:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==52) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4433:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,52,FOLLOW_52_in_ruleXConstructorCall10134); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4437:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4438:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4438:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4439:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall10155);
                    	    lv_arguments_12_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_12_0, 
                    	              		"XExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,29,FOLLOW_29_in_ruleXConstructorCall10172); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4459:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt82=2;
            alt82 = dfa82.predict(input);
            switch (alt82) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4459:2: ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4464:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4465:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall10203);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4489:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4490:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4491:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral10240);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral10250); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4498:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4501:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4502:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4502:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4502:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4502:2: ()
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4503:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4508:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==70) ) {
                alt83=1;
            }
            else if ( (LA83_0==71) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4508:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXBooleanLiteral10297); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4513:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4513:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4514:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4514:1: (lv_isTrue_2_0= 'true' )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4515:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,71,FOLLOW_71_in_ruleXBooleanLiteral10321); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4536:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4537:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4538:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral10371);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral10381); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4545:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4548:28: ( ( () otherlv_1= 'null' ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4549:1: ( () otherlv_1= 'null' )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4549:1: ( () otherlv_1= 'null' )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4549:2: () otherlv_1= 'null'
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4549:2: ()
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4550:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXNullLiteral10427); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXIntLiteral"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4567:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4568:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4569:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral10463);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral10473); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXIntLiteral"


    // $ANTLR start "ruleXIntLiteral"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4576:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4579:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4580:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4580:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4580:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4580:2: ()
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4581:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4586:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4587:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4587:1: (lv_value_1_0= RULE_INT )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4588:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral10524); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXIntLiteralAccess().getValueINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXIntLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"INT");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXIntLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4612:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4613:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4614:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10565);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral10575); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4621:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4624:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4625:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4625:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4625:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4625:2: ()
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4626:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4631:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4632:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4632:1: (lv_value_1_0= RULE_STRING )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4633:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral10626); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4657:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4658:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4659:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10667);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral10677); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4666:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4669:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4670:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4670:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4670:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4670:2: ()
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4671:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXTypeLiteral10723); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleXTypeLiteral10735); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4684:1: ( ( ruleQualifiedName ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4685:1: ( ruleQualifiedName )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4685:1: ( ruleQualifiedName )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4686:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10758);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleXTypeLiteral10770); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4711:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4712:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4713:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10806);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression10816); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4720:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4723:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4724:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4724:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4724:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4724:2: ()
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4725:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleXThrowExpression10862); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4734:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4735:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4735:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4736:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression10883);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4760:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4761:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4762:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10919);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression10929); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4769:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4772:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4773:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4773:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4773:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4773:2: ()
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4774:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleXReturnExpression10975); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4783:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt84=2;
            alt84 = dfa84.predict(input);
            switch (alt84) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4783:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4788:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4789:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression11006);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4813:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4814:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4815:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression11043);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression11053); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4822:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4825:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4826:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4826:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4826:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4826:2: ()
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4827:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleXTryCatchFinallyExpression11099); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4836:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4837:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4837:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4838:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11120);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4854:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==78) ) {
                alt87=1;
            }
            else if ( (LA87_0==77) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4854:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4854:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4854:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4854:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt85=0;
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==78) ) {
                            int LA85_2 = input.LA(2);

                            if ( (synpred27_InternalSpray2()) ) {
                                alt85=1;
                            }


                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4854:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4856:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4857:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression11150);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt85 >= 1 ) break loop85;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(85, input);
                                throw eee;
                        }
                        cnt85++;
                    } while (true);

                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4873:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==77) ) {
                        int LA86_1 = input.LA(2);

                        if ( (synpred28_InternalSpray2()) ) {
                            alt86=1;
                        }
                    }
                    switch (alt86) {
                        case 1 :
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4873:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4873:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4873:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,77,FOLLOW_77_in_ruleXTryCatchFinallyExpression11172); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4878:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4879:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4879:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4880:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11194);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4897:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4897:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4897:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,77,FOLLOW_77_in_ruleXTryCatchFinallyExpression11216); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4901:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4902:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4902:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4903:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11237);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4927:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4928:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4929:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause11275);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause11285); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4936:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4939:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4940:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4940:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4940:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4940:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4940:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleXCatchClause11330); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleXCatchClause11343); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4949:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4950:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4950:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4951:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause11364);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"FullJvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleXCatchClause11376); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4971:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4972:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4972:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4973:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause11397);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4997:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4998:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4999:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11434);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName11445); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5006:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5009:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5010:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5010:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5011:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName11492);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5021:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==14) ) {
                    int LA88_2 = input.LA(2);

                    if ( (LA88_2==RULE_ID) ) {
                        int LA88_3 = input.LA(3);

                        if ( (synpred30_InternalSpray2()) ) {
                            alt88=1;
                        }


                    }


                }


                switch (alt88) {
            	case 1 :
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5021:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5021:2: ( ( '.' )=>kw= '.' )
            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5021:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedName11520); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName11543);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5048:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5049:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5050:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11590);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference11600); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5057:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5060:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5061:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5061:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_ID) ) {
                alt90=1;
            }
            else if ( (LA90_0==25||LA90_0==79) ) {
                alt90=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5061:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5061:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5062:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11648);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5070:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==53) ) {
                            int LA89_2 = input.LA(2);

                            if ( (LA89_2==55) ) {
                                int LA89_3 = input.LA(3);

                                if ( (synpred31_InternalSpray2()) ) {
                                    alt89=1;
                                }


                            }


                        }


                        switch (alt89) {
                    	case 1 :
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5070:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5073:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5073:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5073:6: ()
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5074:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleJvmTypeReference11686); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,55,FOLLOW_55_in_ruleJvmTypeReference11698); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5089:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11730);
                    this_XFunctionTypeRef_4=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5105:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5106:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5107:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11765);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef11775); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5114:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5117:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5118:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5118:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5118:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5118:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==25) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5118:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleXFunctionTypeRef11813); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5122:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==RULE_ID||LA92_0==25||LA92_0==79) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5122:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5122:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5123:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5123:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5124:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11835);
                            lv_paramTypes_1_0=ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"paramTypes",
                                      		lv_paramTypes_1_0, 
                                      		"JvmTypeReference");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5140:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop91:
                            do {
                                int alt91=2;
                                int LA91_0 = input.LA(1);

                                if ( (LA91_0==52) ) {
                                    alt91=1;
                                }


                                switch (alt91) {
                            	case 1 :
                            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5140:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleXFunctionTypeRef11848); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5144:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5145:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5145:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5146:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11869);
                            	    lv_paramTypes_3_0=ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"paramTypes",
                            	              		lv_paramTypes_3_0, 
                            	              		"JvmTypeReference");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop91;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleXFunctionTypeRef11885); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,79,FOLLOW_79_in_ruleXFunctionTypeRef11899); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5170:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5171:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5171:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5172:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11920);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5196:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5197:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5198:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11956);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11966); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5205:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5208:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5209:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5209:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5209:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5209:2: ( ( ruleQualifiedName ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5210:1: ( ruleQualifiedName )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5210:1: ( ruleQualifiedName )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5211:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference12014);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5224:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt95=2;
            alt95 = dfa95.predict(input);
            switch (alt95) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5224:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5224:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5224:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleJvmParameterizedTypeReference12035); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5229:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5230:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5230:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5231:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12057);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5247:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==52) ) {
                            alt94=1;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5247:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleJvmParameterizedTypeReference12070); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5251:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5252:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5252:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5253:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12091);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop94;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleJvmParameterizedTypeReference12105); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5281:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5282:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5283:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12143);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12153); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5290:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5293:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5294:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5294:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==RULE_ID||LA96_0==25||LA96_0==79) ) {
                alt96=1;
            }
            else if ( (LA96_0==80) ) {
                alt96=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5295:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12200);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5305:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12227);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5321:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5322:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5323:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12262);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12272); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5330:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5333:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5334:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5334:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5334:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5334:2: ()
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5335:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,80,FOLLOW_80_in_ruleJvmWildcardTypeReference12318); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5344:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt97=3;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==81) ) {
                alt97=1;
            }
            else if ( (LA97_0==67) ) {
                alt97=2;
            }
            switch (alt97) {
                case 1 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5344:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5344:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5345:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5345:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5346:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12340);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5363:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5363:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5364:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5364:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5365:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12367);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5389:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5390:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5391:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12405);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound12415); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5398:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5401:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5402:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5402:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5402:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_81_in_ruleJvmUpperBound12452); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5406:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5407:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5407:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5408:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12473);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5432:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5433:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5434:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12509);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12519); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5441:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5444:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5445:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5445:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5445:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,82,FOLLOW_82_in_ruleJvmUpperBoundAnded12556); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5449:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5450:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5450:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5451:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12577);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5475:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5476:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5477:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12613);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound12623); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5484:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5487:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5488:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5488:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5488:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleJvmLowerBound12660); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5492:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5493:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5493:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5494:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12681);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleValidID"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5520:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5521:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5522:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID12720);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID12731); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5529:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5532:28: (this_ID_0= RULE_ID )
            // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5533:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID12770); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"

    // $ANTLR start synpred1_InternalSpray2
    public final void synpred1_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1121:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1121:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1121:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1121:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1121:5: ()
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1122:1: 
        {
        }

        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1122:2: ( ( ruleOpMultiAssign ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1123:1: ( ruleOpMultiAssign )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1123:1: ( ruleOpMultiAssign )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1124:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalSpray22393);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalSpray2

    // $ANTLR start synpred2_InternalSpray2
    public final void synpred2_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1249:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1249:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1249:4: ( () ( ( ruleOpOr ) ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1249:5: () ( ( ruleOpOr ) )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1249:5: ()
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1250:1: 
        {
        }

        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1250:2: ( ( ruleOpOr ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1251:1: ( ruleOpOr )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1251:1: ( ruleOpOr )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1252:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalSpray22741);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalSpray2

    // $ANTLR start synpred3_InternalSpray2
    public final void synpred3_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1350:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1350:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1350:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1350:5: () ( ( ruleOpAnd ) )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1350:5: ()
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1351:1: 
        {
        }

        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1351:2: ( ( ruleOpAnd ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1352:1: ( ruleOpAnd )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1352:1: ( ruleOpAnd )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1353:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalSpray23000);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalSpray2

    // $ANTLR start synpred4_InternalSpray2
    public final void synpred4_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1451:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1451:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1451:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1451:5: () ( ( ruleOpEquality ) )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1451:5: ()
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1452:1: 
        {
        }

        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1452:2: ( ( ruleOpEquality ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1453:1: ( ruleOpEquality )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1453:1: ( ruleOpEquality )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1454:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalSpray23259);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalSpray2

    // $ANTLR start synpred5_InternalSpray2
    public final void synpred5_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1559:4: ( ( () 'instanceof' ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1559:5: ( () 'instanceof' )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1559:5: ( () 'instanceof' )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1559:6: () 'instanceof'
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1559:6: ()
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1560:1: 
        {
        }

        match(input,36,FOLLOW_36_in_synpred5_InternalSpray23535); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalSpray2

    // $ANTLR start synpred6_InternalSpray2
    public final void synpred6_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1587:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1587:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1587:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1587:10: () ( ( ruleOpCompare ) )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1587:10: ()
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1588:1: 
        {
        }

        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1588:2: ( ( ruleOpCompare ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1589:1: ( ruleOpCompare )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1589:1: ( ruleOpCompare )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1590:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalSpray23608);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalSpray2

    // $ANTLR start synpred7_InternalSpray2
    public final void synpred7_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1709:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1709:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1709:4: ( () ( ( ruleOpOther ) ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1709:5: () ( ( ruleOpOther ) )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1709:5: ()
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1710:1: 
        {
        }

        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1710:2: ( ( ruleOpOther ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1711:1: ( ruleOpOther )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1711:1: ( ruleOpOther )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1712:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalSpray23927);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalSpray2

    // $ANTLR start synpred8_InternalSpray2
    public final void synpred8_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1817:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1817:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1817:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1817:5: () ( ( ruleOpAdd ) )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1817:5: ()
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1818:1: 
        {
        }

        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1818:2: ( ( ruleOpAdd ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1819:1: ( ruleOpAdd )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1819:1: ( ruleOpAdd )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1820:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalSpray24207);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalSpray2

    // $ANTLR start synpred9_InternalSpray2
    public final void synpred9_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1925:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1925:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1925:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1925:5: () ( ( ruleOpMulti ) )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1925:5: ()
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1926:1: 
        {
        }

        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1926:2: ( ( ruleOpMulti ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1927:1: ( ruleOpMulti )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1927:1: ( ruleOpMulti )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:1928:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalSpray24487);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalSpray2

    // $ANTLR start synpred10_InternalSpray2
    public final void synpred10_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2158:3: ( ( () 'as' ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2158:4: ( () 'as' )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2158:4: ( () 'as' )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2158:5: () 'as'
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2158:5: ()
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2159:1: 
        {
        }

        match(input,49,FOLLOW_49_in_synpred10_InternalSpray25081); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalSpray2

    // $ANTLR start synpred11_InternalSpray2
    public final void synpred11_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2218:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2218:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2218:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2218:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2218:6: ()
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2219:1: 
        {
        }

        match(input,14,FOLLOW_14_in_synpred11_InternalSpray25235); if (state.failed) return ;
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2220:1: ( ( ruleValidID ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2221:1: ( ruleValidID )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2221:1: ( ruleValidID )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2222:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalSpray25244);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalSpray25250);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalSpray2

    // $ANTLR start synpred12_InternalSpray2
    public final void synpred12_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2276:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2276:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2276:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2276:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2276:10: ()
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2277:1: 
        {
        }

        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2277:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt98=3;
        switch ( input.LA(1) ) {
        case 14:
            {
            alt98=1;
            }
            break;
        case 50:
            {
            alt98=2;
            }
            break;
        case 51:
            {
            alt98=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 98, 0, input);

            throw nvae;
        }

        switch (alt98) {
            case 1 :
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2277:4: '.'
                {
                match(input,14,FOLLOW_14_in_synpred12_InternalSpray25353); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2279:6: ( ( '?.' ) )
                {
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2279:6: ( ( '?.' ) )
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2280:1: ( '?.' )
                {
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2280:1: ( '?.' )
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2281:2: '?.'
                {
                match(input,50,FOLLOW_50_in_synpred12_InternalSpray25367); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2286:6: ( ( '*.' ) )
                {
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2286:6: ( ( '*.' ) )
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2287:1: ( '*.' )
                {
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2287:1: ( '*.' )
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2288:2: '*.'
                {
                match(input,51,FOLLOW_51_in_synpred12_InternalSpray25387); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalSpray2

    // $ANTLR start synpred13_InternalSpray2
    public final void synpred13_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2397:4: ( ( '(' ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2398:1: ( '(' )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2398:1: ( '(' )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2399:2: '('
        {
        match(input,25,FOLLOW_25_in_synpred13_InternalSpray25614); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalSpray2

    // $ANTLR start synpred14_InternalSpray2
    public final void synpred14_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2418:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2418:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2418:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2418:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2418:6: ()
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2419:1: 
        {
        }

        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2419:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt100=2;
        int LA100_0 = input.LA(1);

        if ( (LA100_0==RULE_ID||LA100_0==25||LA100_0==79) ) {
            alt100=1;
        }
        switch (alt100) {
            case 1 :
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2419:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2419:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2420:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2420:1: ( ruleJvmFormalParameter )
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2421:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalSpray25666);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2423:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop99:
                do {
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==52) ) {
                        alt99=1;
                    }


                    switch (alt99) {
                	case 1 :
                	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2423:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,52,FOLLOW_52_in_synpred14_InternalSpray25673); if (state.failed) return ;
                	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2424:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2425:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2425:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2426:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalSpray25680);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop99;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2428:6: ( ( '|' ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2429:1: ( '|' )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2429:1: ( '|' )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2430:2: '|'
        {
        match(input,54,FOLLOW_54_in_synpred14_InternalSpray25694); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalSpray2

    // $ANTLR start synpred15_InternalSpray2
    public final void synpred15_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2497:4: ( ( ruleXClosure ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2498:1: ( ruleXClosure )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2498:1: ( ruleXClosure )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2499:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred15_InternalSpray25812);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalSpray2

    // $ANTLR start synpred16_InternalSpray2
    public final void synpred16_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2780:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2780:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2780:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2780:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2780:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt102=2;
        int LA102_0 = input.LA(1);

        if ( (LA102_0==RULE_ID||LA102_0==25||LA102_0==79) ) {
            alt102=1;
        }
        switch (alt102) {
            case 1 :
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2780:5: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2780:5: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2781:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2781:1: ( ruleJvmFormalParameter )
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2782:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalSpray26585);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2784:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop101:
                do {
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==52) ) {
                        alt101=1;
                    }


                    switch (alt101) {
                	case 1 :
                	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2784:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,52,FOLLOW_52_in_synpred16_InternalSpray26592); if (state.failed) return ;
                	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2785:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2786:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2786:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2787:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalSpray26599);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop101;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2789:6: ( ( '|' ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2790:1: ( '|' )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2790:1: ( '|' )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:2791:2: '|'
        {
        match(input,54,FOLLOW_54_in_synpred16_InternalSpray26613); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalSpray2

    // $ANTLR start synpred18_InternalSpray2
    public final void synpred18_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3150:4: ( 'else' )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3150:6: 'else'
        {
        match(input,58,FOLLOW_58_in_synpred18_InternalSpray27396); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalSpray2

    // $ANTLR start synpred19_InternalSpray2
    public final void synpred19_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3204:2: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3204:3: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3204:3: ( ( ( ruleValidID ) ) ':' )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3204:4: ( ( ruleValidID ) ) ':'
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3204:4: ( ( ruleValidID ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3205:1: ( ruleValidID )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3205:1: ( ruleValidID )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3206:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred19_InternalSpray27536);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,60,FOLLOW_60_in_synpred19_InternalSpray27542); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalSpray2

    // $ANTLR start synpred20_InternalSpray2
    public final void synpred20_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3779:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3779:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3779:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3779:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3779:6: ( ( ruleJvmTypeReference ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3780:1: ( ruleJvmTypeReference )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3780:1: ( ruleJvmTypeReference )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3781:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred20_InternalSpray28782);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3783:2: ( ( ruleValidID ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3784:1: ( ruleValidID )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3784:1: ( ruleValidID )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:3785:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred20_InternalSpray28791);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalSpray2

    // $ANTLR start synpred21_InternalSpray2
    public final void synpred21_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4083:4: ( ( '(' ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4084:1: ( '(' )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4084:1: ( '(' )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4085:2: '('
        {
        match(input,25,FOLLOW_25_in_synpred21_InternalSpray29353); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalSpray2

    // $ANTLR start synpred22_InternalSpray2
    public final void synpred22_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4104:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4104:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4104:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4104:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4104:6: ()
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4105:1: 
        {
        }

        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4105:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt106=2;
        int LA106_0 = input.LA(1);

        if ( (LA106_0==RULE_ID||LA106_0==25||LA106_0==79) ) {
            alt106=1;
        }
        switch (alt106) {
            case 1 :
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4105:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4105:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4106:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4106:1: ( ruleJvmFormalParameter )
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4107:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalSpray29405);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4109:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop105:
                do {
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==52) ) {
                        alt105=1;
                    }


                    switch (alt105) {
                	case 1 :
                	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4109:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,52,FOLLOW_52_in_synpred22_InternalSpray29412); if (state.failed) return ;
                	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4110:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4111:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4111:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4112:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalSpray29419);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop105;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4114:6: ( ( '|' ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4115:1: ( '|' )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4115:1: ( '|' )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4116:2: '|'
        {
        match(input,54,FOLLOW_54_in_synpred22_InternalSpray29433); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred22_InternalSpray2

    // $ANTLR start synpred23_InternalSpray2
    public final void synpred23_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4183:4: ( ( ruleXClosure ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4184:1: ( ruleXClosure )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4184:1: ( ruleXClosure )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4185:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred23_InternalSpray29551);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalSpray2

    // $ANTLR start synpred24_InternalSpray2
    public final void synpred24_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4380:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4380:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4380:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4380:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4380:5: ()
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4381:1: 
        {
        }

        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4381:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt108=2;
        int LA108_0 = input.LA(1);

        if ( (LA108_0==RULE_ID||LA108_0==25||LA108_0==79) ) {
            alt108=1;
        }
        switch (alt108) {
            case 1 :
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4381:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4381:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4382:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4382:1: ( ruleJvmFormalParameter )
                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4383:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalSpray210042);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4385:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop107:
                do {
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==52) ) {
                        alt107=1;
                    }


                    switch (alt107) {
                	case 1 :
                	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4385:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,52,FOLLOW_52_in_synpred24_InternalSpray210049); if (state.failed) return ;
                	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4386:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4387:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4387:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4388:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalSpray210056);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop107;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4390:6: ( ( '|' ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4391:1: ( '|' )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4391:1: ( '|' )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4392:2: '|'
        {
        match(input,54,FOLLOW_54_in_synpred24_InternalSpray210070); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred24_InternalSpray2

    // $ANTLR start synpred25_InternalSpray2
    public final void synpred25_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4459:2: ( ( ruleXClosure ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4460:1: ( ruleXClosure )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4460:1: ( ruleXClosure )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4461:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred25_InternalSpray210186);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalSpray2

    // $ANTLR start synpred26_InternalSpray2
    public final void synpred26_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4783:2: ( ( ruleXExpression ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4784:1: ( ruleXExpression )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4784:1: ( ruleXExpression )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4785:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred26_InternalSpray210989);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalSpray2

    // $ANTLR start synpred27_InternalSpray2
    public final void synpred27_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4854:5: ( 'catch' )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4854:7: 'catch'
        {
        match(input,78,FOLLOW_78_in_synpred27_InternalSpray211134); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalSpray2

    // $ANTLR start synpred28_InternalSpray2
    public final void synpred28_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4873:5: ( 'finally' )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:4873:7: 'finally'
        {
        match(input,77,FOLLOW_77_in_synpred28_InternalSpray211164); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalSpray2

    // $ANTLR start synpred30_InternalSpray2
    public final void synpred30_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5021:3: ( '.' )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5022:2: '.'
        {
        match(input,14,FOLLOW_14_in_synpred30_InternalSpray211511); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalSpray2

    // $ANTLR start synpred31_InternalSpray2
    public final void synpred31_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5070:2: ( ( () '[' ']' ) )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5070:3: ( () '[' ']' )
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5070:3: ( () '[' ']' )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5070:4: () '[' ']'
        {
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5070:4: ()
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5071:1: 
        {
        }

        match(input,53,FOLLOW_53_in_synpred31_InternalSpray211663); if (state.failed) return ;
        match(input,55,FOLLOW_55_in_synpred31_InternalSpray211667); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred31_InternalSpray2

    // $ANTLR start synpred32_InternalSpray2
    public final void synpred32_InternalSpray2_fragment() throws RecognitionException {   
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5224:4: ( '<' )
        // ../org.eclipselabs.spray2.xtext/src-gen/org/eclipselabs/spray2/xtext/parser/antlr/internal/InternalSpray2.g:5224:6: '<'
        {
        match(input,40,FOLLOW_40_in_synpred32_InternalSpray212027); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalSpray2

    // Delegated rules

    public final boolean synpred14_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalSpray2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalSpray2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA44 dfa44 = new DFA44(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA81 dfa81 = new DFA81(this);
    protected DFA82 dfa82 = new DFA82(this);
    protected DFA84 dfa84 = new DFA84(this);
    protected DFA95 dfa95 = new DFA95(this);
    static final String DFA44_eotS =
        "\74\uffff";
    static final String DFA44_eofS =
        "\1\2\73\uffff";
    static final String DFA44_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA44_maxS =
        "\1\117\1\0\72\uffff";
    static final String DFA44_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA44_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA44_transitionS = {
            "\3\2\5\uffff\1\2\1\uffff\2\2\2\uffff\2\2\5\uffff\1\1\3\uffff"+
            "\1\2\1\uffff\27\2\1\uffff\15\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "2397:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_1 = input.LA(1);

                         
                        int index44_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalSpray2()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA43_eotS =
        "\34\uffff";
    static final String DFA43_eofS =
        "\34\uffff";
    static final String DFA43_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA43_maxS =
        "\1\117\2\0\31\uffff";
    static final String DFA43_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA43_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\1\2\5\5\uffff\1\5\5\uffff\1\5\6\uffff\1\2\3\uffff\1\33\12"+
            "\uffff\1\5\2\uffff\2\5\3\uffff\1\5\4\uffff\1\5\1\4\2\uffff\1"+
            "\5\1\uffff\1\5\3\uffff\2\5\2\uffff\1\5\1\uffff\10\5\2\uffff"+
            "\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "2418:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_0 = input.LA(1);

                         
                        int index43_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA43_0==RULE_ID) ) {s = 1;}

                        else if ( (LA43_0==25) ) {s = 2;}

                        else if ( (LA43_0==79) && (synpred14_InternalSpray2())) {s = 3;}

                        else if ( (LA43_0==54) && (synpred14_InternalSpray2())) {s = 4;}

                        else if ( ((LA43_0>=RULE_INT && LA43_0<=RULE_STRING)||LA43_0==12||LA43_0==18||LA43_0==40||(LA43_0>=43 && LA43_0<=44)||LA43_0==48||LA43_0==53||LA43_0==57||LA43_0==59||(LA43_0>=63 && LA43_0<=64)||LA43_0==67||(LA43_0>=69 && LA43_0<=76)) ) {s = 5;}

                        else if ( (LA43_0==29) ) {s = 27;}

                         
                        input.seek(index43_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA43_1 = input.LA(1);

                         
                        int index43_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSpray2()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index43_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA43_2 = input.LA(1);

                         
                        int index43_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSpray2()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index43_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA45_eotS =
        "\74\uffff";
    static final String DFA45_eofS =
        "\1\2\73\uffff";
    static final String DFA45_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA45_maxS =
        "\1\117\1\0\72\uffff";
    static final String DFA45_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA45_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA45_transitionS = {
            "\3\2\5\uffff\1\2\1\uffff\2\2\2\uffff\2\2\5\uffff\1\2\3\uffff"+
            "\1\2\1\uffff\26\2\1\1\1\uffff\15\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "2497:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_1 = input.LA(1);

                         
                        int index45_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalSpray2()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index45_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA51_eotS =
        "\36\uffff";
    static final String DFA51_eofS =
        "\36\uffff";
    static final String DFA51_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA51_maxS =
        "\1\117\2\0\33\uffff";
    static final String DFA51_acceptS =
        "\3\uffff\2\1\1\2\30\uffff";
    static final String DFA51_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA51_transitionS = {
            "\1\1\2\5\5\uffff\1\5\5\uffff\1\5\6\uffff\1\2\16\uffff\1\5\2"+
            "\uffff\2\5\3\uffff\1\5\4\uffff\1\5\1\4\1\5\1\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\5\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "2780:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_0 = input.LA(1);

                         
                        int index51_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA51_0==RULE_ID) ) {s = 1;}

                        else if ( (LA51_0==25) ) {s = 2;}

                        else if ( (LA51_0==79) && (synpred16_InternalSpray2())) {s = 3;}

                        else if ( (LA51_0==54) && (synpred16_InternalSpray2())) {s = 4;}

                        else if ( ((LA51_0>=RULE_INT && LA51_0<=RULE_STRING)||LA51_0==12||LA51_0==18||LA51_0==40||(LA51_0>=43 && LA51_0<=44)||LA51_0==48||LA51_0==53||LA51_0==55||LA51_0==57||LA51_0==59||(LA51_0>=63 && LA51_0<=67)||(LA51_0>=69 && LA51_0<=76)) ) {s = 5;}

                         
                        input.seek(index51_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA51_1 = input.LA(1);

                         
                        int index51_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalSpray2()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index51_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA51_2 = input.LA(1);

                         
                        int index51_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalSpray2()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index51_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 51, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA74_eotS =
        "\74\uffff";
    static final String DFA74_eofS =
        "\1\2\73\uffff";
    static final String DFA74_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA74_maxS =
        "\1\117\1\0\72\uffff";
    static final String DFA74_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA74_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA74_transitionS = {
            "\3\2\5\uffff\1\2\1\uffff\2\2\2\uffff\2\2\5\uffff\1\1\3\uffff"+
            "\1\2\1\uffff\27\2\1\uffff\15\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = DFA74_eot;
            this.eof = DFA74_eof;
            this.min = DFA74_min;
            this.max = DFA74_max;
            this.accept = DFA74_accept;
            this.special = DFA74_special;
            this.transition = DFA74_transition;
        }
        public String getDescription() {
            return "4083:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA74_1 = input.LA(1);

                         
                        int index74_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalSpray2()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index74_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 74, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA73_eotS =
        "\34\uffff";
    static final String DFA73_eofS =
        "\34\uffff";
    static final String DFA73_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA73_maxS =
        "\1\117\2\0\31\uffff";
    static final String DFA73_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA73_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA73_transitionS = {
            "\1\1\2\5\5\uffff\1\5\5\uffff\1\5\6\uffff\1\2\3\uffff\1\33\12"+
            "\uffff\1\5\2\uffff\2\5\3\uffff\1\5\4\uffff\1\5\1\4\2\uffff\1"+
            "\5\1\uffff\1\5\3\uffff\2\5\2\uffff\1\5\1\uffff\10\5\2\uffff"+
            "\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = DFA73_eot;
            this.eof = DFA73_eof;
            this.min = DFA73_min;
            this.max = DFA73_max;
            this.accept = DFA73_accept;
            this.special = DFA73_special;
            this.transition = DFA73_transition;
        }
        public String getDescription() {
            return "4104:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_0 = input.LA(1);

                         
                        int index73_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA73_0==RULE_ID) ) {s = 1;}

                        else if ( (LA73_0==25) ) {s = 2;}

                        else if ( (LA73_0==79) && (synpred22_InternalSpray2())) {s = 3;}

                        else if ( (LA73_0==54) && (synpred22_InternalSpray2())) {s = 4;}

                        else if ( ((LA73_0>=RULE_INT && LA73_0<=RULE_STRING)||LA73_0==12||LA73_0==18||LA73_0==40||(LA73_0>=43 && LA73_0<=44)||LA73_0==48||LA73_0==53||LA73_0==57||LA73_0==59||(LA73_0>=63 && LA73_0<=64)||LA73_0==67||(LA73_0>=69 && LA73_0<=76)) ) {s = 5;}

                        else if ( (LA73_0==29) ) {s = 27;}

                         
                        input.seek(index73_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA73_1 = input.LA(1);

                         
                        int index73_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalSpray2()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA73_2 = input.LA(1);

                         
                        int index73_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalSpray2()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index73_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA75_eotS =
        "\74\uffff";
    static final String DFA75_eofS =
        "\1\2\73\uffff";
    static final String DFA75_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA75_maxS =
        "\1\117\1\0\72\uffff";
    static final String DFA75_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA75_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA75_transitionS = {
            "\3\2\5\uffff\1\2\1\uffff\2\2\2\uffff\2\2\5\uffff\1\2\3\uffff"+
            "\1\2\1\uffff\26\2\1\1\1\uffff\15\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA75_eot = DFA.unpackEncodedString(DFA75_eotS);
    static final short[] DFA75_eof = DFA.unpackEncodedString(DFA75_eofS);
    static final char[] DFA75_min = DFA.unpackEncodedStringToUnsignedChars(DFA75_minS);
    static final char[] DFA75_max = DFA.unpackEncodedStringToUnsignedChars(DFA75_maxS);
    static final short[] DFA75_accept = DFA.unpackEncodedString(DFA75_acceptS);
    static final short[] DFA75_special = DFA.unpackEncodedString(DFA75_specialS);
    static final short[][] DFA75_transition;

    static {
        int numStates = DFA75_transitionS.length;
        DFA75_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA75_transition[i] = DFA.unpackEncodedString(DFA75_transitionS[i]);
        }
    }

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = DFA75_eot;
            this.eof = DFA75_eof;
            this.min = DFA75_min;
            this.max = DFA75_max;
            this.accept = DFA75_accept;
            this.special = DFA75_special;
            this.transition = DFA75_transition;
        }
        public String getDescription() {
            return "4183:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA75_1 = input.LA(1);

                         
                        int index75_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalSpray2()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index75_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 75, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA81_eotS =
        "\34\uffff";
    static final String DFA81_eofS =
        "\34\uffff";
    static final String DFA81_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA81_maxS =
        "\1\117\2\0\31\uffff";
    static final String DFA81_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA81_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA81_transitionS = {
            "\1\1\2\5\5\uffff\1\5\5\uffff\1\5\6\uffff\1\2\3\uffff\1\33\12"+
            "\uffff\1\5\2\uffff\2\5\3\uffff\1\5\4\uffff\1\5\1\4\2\uffff\1"+
            "\5\1\uffff\1\5\3\uffff\2\5\2\uffff\1\5\1\uffff\10\5\2\uffff"+
            "\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA81_eot = DFA.unpackEncodedString(DFA81_eotS);
    static final short[] DFA81_eof = DFA.unpackEncodedString(DFA81_eofS);
    static final char[] DFA81_min = DFA.unpackEncodedStringToUnsignedChars(DFA81_minS);
    static final char[] DFA81_max = DFA.unpackEncodedStringToUnsignedChars(DFA81_maxS);
    static final short[] DFA81_accept = DFA.unpackEncodedString(DFA81_acceptS);
    static final short[] DFA81_special = DFA.unpackEncodedString(DFA81_specialS);
    static final short[][] DFA81_transition;

    static {
        int numStates = DFA81_transitionS.length;
        DFA81_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA81_transition[i] = DFA.unpackEncodedString(DFA81_transitionS[i]);
        }
    }

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = DFA81_eot;
            this.eof = DFA81_eof;
            this.min = DFA81_min;
            this.max = DFA81_max;
            this.accept = DFA81_accept;
            this.special = DFA81_special;
            this.transition = DFA81_transition;
        }
        public String getDescription() {
            return "4380:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA81_0 = input.LA(1);

                         
                        int index81_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA81_0==RULE_ID) ) {s = 1;}

                        else if ( (LA81_0==25) ) {s = 2;}

                        else if ( (LA81_0==79) && (synpred24_InternalSpray2())) {s = 3;}

                        else if ( (LA81_0==54) && (synpred24_InternalSpray2())) {s = 4;}

                        else if ( ((LA81_0>=RULE_INT && LA81_0<=RULE_STRING)||LA81_0==12||LA81_0==18||LA81_0==40||(LA81_0>=43 && LA81_0<=44)||LA81_0==48||LA81_0==53||LA81_0==57||LA81_0==59||(LA81_0>=63 && LA81_0<=64)||LA81_0==67||(LA81_0>=69 && LA81_0<=76)) ) {s = 5;}

                        else if ( (LA81_0==29) ) {s = 27;}

                         
                        input.seek(index81_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA81_1 = input.LA(1);

                         
                        int index81_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalSpray2()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index81_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA81_2 = input.LA(1);

                         
                        int index81_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalSpray2()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index81_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 81, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA82_eotS =
        "\74\uffff";
    static final String DFA82_eofS =
        "\1\2\73\uffff";
    static final String DFA82_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA82_maxS =
        "\1\117\1\0\72\uffff";
    static final String DFA82_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA82_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA82_transitionS = {
            "\3\2\5\uffff\1\2\1\uffff\2\2\2\uffff\2\2\5\uffff\1\2\3\uffff"+
            "\1\2\1\uffff\26\2\1\1\1\uffff\15\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA82_eot = DFA.unpackEncodedString(DFA82_eotS);
    static final short[] DFA82_eof = DFA.unpackEncodedString(DFA82_eofS);
    static final char[] DFA82_min = DFA.unpackEncodedStringToUnsignedChars(DFA82_minS);
    static final char[] DFA82_max = DFA.unpackEncodedStringToUnsignedChars(DFA82_maxS);
    static final short[] DFA82_accept = DFA.unpackEncodedString(DFA82_acceptS);
    static final short[] DFA82_special = DFA.unpackEncodedString(DFA82_specialS);
    static final short[][] DFA82_transition;

    static {
        int numStates = DFA82_transitionS.length;
        DFA82_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA82_transition[i] = DFA.unpackEncodedString(DFA82_transitionS[i]);
        }
    }

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = DFA82_eot;
            this.eof = DFA82_eof;
            this.min = DFA82_min;
            this.max = DFA82_max;
            this.accept = DFA82_accept;
            this.special = DFA82_special;
            this.transition = DFA82_transition;
        }
        public String getDescription() {
            return "4459:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA82_1 = input.LA(1);

                         
                        int index82_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalSpray2()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index82_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 82, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA84_eotS =
        "\74\uffff";
    static final String DFA84_eofS =
        "\1\31\73\uffff";
    static final String DFA84_minS =
        "\1\4\30\0\43\uffff";
    static final String DFA84_maxS =
        "\1\117\30\0\43\uffff";
    static final String DFA84_acceptS =
        "\31\uffff\1\2\41\uffff\1\1";
    static final String DFA84_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\43\uffff}>";
    static final String[] DFA84_transitionS = {
            "\1\1\1\15\1\17\5\uffff\1\22\1\uffff\2\31\2\uffff\1\6\1\31\5"+
            "\uffff\1\30\3\uffff\1\31\1\uffff\11\31\1\10\2\31\1\4\1\3\3\31"+
            "\1\2\4\31\1\12\1\uffff\2\31\1\21\1\31\1\7\3\31\1\23\1\24\2\31"+
            "\1\11\1\uffff\1\5\1\13\1\14\1\16\1\20\1\25\1\26\1\27\3\31",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA84_eot = DFA.unpackEncodedString(DFA84_eotS);
    static final short[] DFA84_eof = DFA.unpackEncodedString(DFA84_eofS);
    static final char[] DFA84_min = DFA.unpackEncodedStringToUnsignedChars(DFA84_minS);
    static final char[] DFA84_max = DFA.unpackEncodedStringToUnsignedChars(DFA84_maxS);
    static final short[] DFA84_accept = DFA.unpackEncodedString(DFA84_acceptS);
    static final short[] DFA84_special = DFA.unpackEncodedString(DFA84_specialS);
    static final short[][] DFA84_transition;

    static {
        int numStates = DFA84_transitionS.length;
        DFA84_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA84_transition[i] = DFA.unpackEncodedString(DFA84_transitionS[i]);
        }
    }

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = DFA84_eot;
            this.eof = DFA84_eof;
            this.min = DFA84_min;
            this.max = DFA84_max;
            this.accept = DFA84_accept;
            this.special = DFA84_special;
            this.transition = DFA84_transition;
        }
        public String getDescription() {
            return "4783:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA84_1 = input.LA(1);

                         
                        int index84_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpray2()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA84_2 = input.LA(1);

                         
                        int index84_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpray2()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA84_3 = input.LA(1);

                         
                        int index84_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpray2()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA84_4 = input.LA(1);

                         
                        int index84_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpray2()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA84_5 = input.LA(1);

                         
                        int index84_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpray2()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA84_6 = input.LA(1);

                         
                        int index84_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpray2()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA84_7 = input.LA(1);

                         
                        int index84_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpray2()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA84_8 = input.LA(1);

                         
                        int index84_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpray2()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA84_9 = input.LA(1);

                         
                        int index84_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpray2()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA84_10 = input.LA(1);

                         
                        int index84_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpray2()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA84_11 = input.LA(1);

                         
                        int index84_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpray2()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA84_12 = input.LA(1);

                         
                        int index84_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpray2()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA84_13 = input.LA(1);

                         
                        int index84_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpray2()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA84_14 = input.LA(1);

                         
                        int index84_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpray2()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA84_15 = input.LA(1);

                         
                        int index84_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpray2()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA84_16 = input.LA(1);

                         
                        int index84_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpray2()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA84_17 = input.LA(1);

                         
                        int index84_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpray2()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA84_18 = input.LA(1);

                         
                        int index84_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpray2()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA84_19 = input.LA(1);

                         
                        int index84_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpray2()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA84_20 = input.LA(1);

                         
                        int index84_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpray2()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA84_21 = input.LA(1);

                         
                        int index84_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpray2()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA84_22 = input.LA(1);

                         
                        int index84_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpray2()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA84_23 = input.LA(1);

                         
                        int index84_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpray2()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA84_24 = input.LA(1);

                         
                        int index84_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSpray2()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index84_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 84, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA95_eotS =
        "\100\uffff";
    static final String DFA95_eofS =
        "\1\2\77\uffff";
    static final String DFA95_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA95_maxS =
        "\1\117\1\0\76\uffff";
    static final String DFA95_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA95_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA95_transitionS = {
            "\3\2\5\uffff\1\2\1\uffff\2\2\1\uffff\4\2\1\uffff\2\2\1\uffff"+
            "\1\2\3\uffff\1\2\1\uffff\11\2\1\1\15\2\1\uffff\15\2\1\uffff"+
            "\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA95_eot = DFA.unpackEncodedString(DFA95_eotS);
    static final short[] DFA95_eof = DFA.unpackEncodedString(DFA95_eofS);
    static final char[] DFA95_min = DFA.unpackEncodedStringToUnsignedChars(DFA95_minS);
    static final char[] DFA95_max = DFA.unpackEncodedStringToUnsignedChars(DFA95_maxS);
    static final short[] DFA95_accept = DFA.unpackEncodedString(DFA95_acceptS);
    static final short[] DFA95_special = DFA.unpackEncodedString(DFA95_specialS);
    static final short[][] DFA95_transition;

    static {
        int numStates = DFA95_transitionS.length;
        DFA95_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA95_transition[i] = DFA.unpackEncodedString(DFA95_transitionS[i]);
        }
    }

    class DFA95 extends DFA {

        public DFA95(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 95;
            this.eot = DFA95_eot;
            this.eof = DFA95_eof;
            this.min = DFA95_min;
            this.max = DFA95_max;
            this.accept = DFA95_accept;
            this.special = DFA95_special;
            this.transition = DFA95_transition;
        }
        public String getDescription() {
            return "5224:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA95_1 = input.LA(1);

                         
                        int index95_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalSpray2()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index95_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 95, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleDiagram_in_entryRuleDiagram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleDiagram131 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_11_in_ruleDiagram144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDiagram161 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDiagram178 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDiagram201 = new BitSet(new long[]{0x0000000000130002L});
    public static final BitSet FOLLOW_ruleSprayStyleRef_in_ruleDiagram222 = new BitSet(new long[]{0x0000000000120002L});
    public static final BitSet FOLLOW_ruleSprayElement_in_ruleDiagram244 = new BitSet(new long[]{0x0000000000120002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImport328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard444 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedNameWithWildCard463 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedNameWithWildCard476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSprayStyleRef_in_entryRuleSprayStyleRef518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSprayStyleRef528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSprayStyleRef565 = new BitSet(new long[]{0x0000000002000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleSprayStyleRef586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSprayElement_in_entryRuleSprayElement622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSprayElement632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeElement_in_ruleSprayElement679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeElement_in_ruleSprayElement706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeElement_in_entryRuleNodeElement741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeElement751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleNodeElement788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeElement805 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNodeElement822 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNodeElement845 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_ruleSprayStyleRef_in_ruleNodeElement866 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNodeElement879 = new BitSet(new long[]{0x0000000000E80000L});
    public static final BitSet FOLLOW_ruleNodeFigureSection_in_ruleNodeElement900 = new BitSet(new long[]{0x0000000000C80000L});
    public static final BitSet FOLLOW_ruleToolingSection_in_ruleNodeElement922 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_ruleBehaviorSection_in_ruleNodeElement944 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleNodeElement957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeElement_in_entryRuleEdgeElement993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeElement1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleEdgeElement1040 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEdgeElement1057 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEdgeElement1074 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEdgeElement1097 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_ruleSprayStyleRef_in_ruleEdgeElement1118 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEdgeElement1131 = new BitSet(new long[]{0x0000000000E80000L});
    public static final BitSet FOLLOW_ruleEdgeFigureSection_in_ruleEdgeElement1152 = new BitSet(new long[]{0x0000000000C80000L});
    public static final BitSet FOLLOW_ruleToolingSection_in_ruleEdgeElement1174 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_ruleBehaviorSection_in_ruleEdgeElement1196 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEdgeElement1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeFigureSection_in_entryRuleNodeFigureSection1245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeFigureSection1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleNodeFigureSection1292 = new BitSet(new long[]{0x0000000002000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleNodeFigureSection1313 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleNodeFigureSection1326 = new BitSet(new long[]{0x0000000041080000L});
    public static final BitSet FOLLOW_ruleTextPropertyAssignment_in_ruleNodeFigureSection1347 = new BitSet(new long[]{0x0000000041080000L});
    public static final BitSet FOLLOW_ruleCompartmentPropertyAssignment_in_ruleNodeFigureSection1369 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_19_in_ruleNodeFigureSection1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeFigureSection_in_entryRuleEdgeFigureSection1420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeFigureSection1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleEdgeFigureSection1467 = new BitSet(new long[]{0x0000000002000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleEdgeFigureSection1488 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleEdgeFigureSection1501 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_ruleTextPropertyAssignment_in_ruleEdgeFigureSection1522 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_19_in_ruleEdgeFigureSection1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToolingSection_in_entryRuleToolingSection1574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToolingSection1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleToolingSection1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBehaviorSection_in_entryRuleBehaviorSection1662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBehaviorSection1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleBehaviorSection1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPropertyAssignment_in_entryRuleTextPropertyAssignment1749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextPropertyAssignment1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTextPropertyAssignment1796 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTextPropertyAssignment1819 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTextPropertyAssignment1831 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTextPropertyAssignment1851 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleTextPropertyAssignment1864 = new BitSet(new long[]{0x0000000034000000L});
    public static final BitSet FOLLOW_26_in_ruleTextPropertyAssignment1877 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTextPropertyAssignment1889 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleTextPropertyAssignment1910 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleTextPropertyAssignment1925 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTextPropertyAssignment1937 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleTextPropertyAssignment1958 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleTextPropertyAssignment1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompartmentPropertyAssignment_in_entryRuleCompartmentPropertyAssignment2010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompartmentPropertyAssignment2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleCompartmentPropertyAssignment2057 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCompartmentPropertyAssignment2080 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCompartmentPropertyAssignment2092 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompartmentPropertyAssignment2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression2148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment2238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment2306 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment2322 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment2372 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment2425 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpSingleAssign2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpMultiAssign2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2720 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression2773 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2796 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr2835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOr2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2979 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression3032 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3055 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd3094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpAnd3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression3181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3238 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression3291 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3314 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality3353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpEquality3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpEquality3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression3461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3518 = new BitSet(new long[]{0x000001F000000002L});
    public static final BitSet FOLLOW_36_in_ruleXRelationalExpression3554 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression3579 = new BitSet(new long[]{0x000001F000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3640 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3663 = new BitSet(new long[]{0x000001F000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare3703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpCompare3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpCompare3771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpCompare3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpCompare3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3906 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3959 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3982 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther4021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpOther4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpOther4089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression4129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4186 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression4239 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4262 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd4301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd4312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpAdd4350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpAdd4369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4466 = new BitSet(new long[]{0x0000E00000008002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4519 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4542 = new BitSet(new long[]{0x0000E00000008002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti4581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti4592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleOpMulti4630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpMulti4649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOpMulti4668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOpMulti4687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation4737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4795 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary4881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOpUnary4930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpUnary4949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpUnary4968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression5008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression5018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression5065 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXCastedExpression5100 = new BitSet(new long[]{0x0000000002000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression5123 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall5161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall5171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall5218 = new BitSet(new long[]{0x000C000000004002L});
    public static final BitSet FOLLOW_14_in_ruleXMemberFeatureCall5267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5290 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall5306 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall5328 = new BitSet(new long[]{0x000C000000004002L});
    public static final BitSet FOLLOW_14_in_ruleXMemberFeatureCall5414 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_50_in_ruleXMemberFeatureCall5438 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_51_in_ruleXMemberFeatureCall5475 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall5504 = new BitSet(new long[]{0x0000000002000010L,0x0000000000018000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5525 = new BitSet(new long[]{0x0010008000000000L});
    public static final BitSet FOLLOW_52_in_ruleXMemberFeatureCall5538 = new BitSet(new long[]{0x0000000002000010L,0x0000000000018000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5559 = new BitSet(new long[]{0x0010008000000000L});
    public static final BitSet FOLLOW_39_in_ruleXMemberFeatureCall5573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5598 = new BitSet(new long[]{0x002C000002004002L});
    public static final BitSet FOLLOW_25_in_ruleXMemberFeatureCall5632 = new BitSet(new long[]{0x8A61190022041070L,0x0000000000009FE9L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5717 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5745 = new BitSet(new long[]{0x0010000020000000L});
    public static final BitSet FOLLOW_52_in_ruleXMemberFeatureCall5758 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5779 = new BitSet(new long[]{0x0010000020000000L});
    public static final BitSet FOLLOW_29_in_ruleXMemberFeatureCall5796 = new BitSet(new long[]{0x002C000000004002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5829 = new BitSet(new long[]{0x000C000000004002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression5879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression6007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression6034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression6061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression6088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression6115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression6142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression6169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression6196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression6223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression6250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral6285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral6295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral6342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral6369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral6396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral6423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral6450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral6477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure6512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure6522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXClosure6568 = new BitSet(new long[]{0x8AE1190002041070L,0x0000000000009FEFL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6639 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXClosure6652 = new BitSet(new long[]{0x0000000002000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6673 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXClosure6695 = new BitSet(new long[]{0x8AA1190002041070L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6732 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXClosure6744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure6790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6846 = new BitSet(new long[]{0x8B21190002041072L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_56_in_ruleXExpressionInClosure6859 = new BitSet(new long[]{0x8A21190002041072L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure6909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7017 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXShortClosure7030 = new BitSet(new long[]{0x0000000002000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7051 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXShortClosure7073 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure7109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression7145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression7155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleXParenthesizedExpression7192 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression7214 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleXParenthesizedExpression7225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression7261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression7271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXIfExpression7317 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXIfExpression7329 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7350 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleXIfExpression7362 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7383 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXIfExpression7404 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression7464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression7474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXSwitchExpression7520 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression7561 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXSwitchExpression7573 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7597 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXSwitchExpression7609 = new BitSet(new long[]{0x5000000002000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7630 = new BitSet(new long[]{0x7000000002080010L,0x0000000000008000L});
    public static final BitSet FOLLOW_61_in_ruleXSwitchExpression7644 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXSwitchExpression7656 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7677 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXSwitchExpression7691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart7727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart7737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7783 = new BitSet(new long[]{0x5000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleXCasePart7797 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7818 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXCasePart7832 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression7899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleXForLoopExpression7945 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXForLoopExpression7957 = new BitSet(new long[]{0x0000000002000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7978 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXForLoopExpression7990 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression8011 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleXForLoopExpression8023 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression8044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression8080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression8090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXWhileExpression8136 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXWhileExpression8148 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression8169 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleXWhileExpression8181 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression8202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression8238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression8248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXDoWhileExpression8294 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8315 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleXDoWhileExpression8327 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXDoWhileExpression8339 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8360 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleXDoWhileExpression8372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression8418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleXBlockExpression8464 = new BitSet(new long[]{0x8A211900020C1070L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8486 = new BitSet(new long[]{0x8B211900020C1070L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_56_in_ruleXBlockExpression8499 = new BitSet(new long[]{0x8A211900020C1070L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_19_in_ruleXBlockExpression8515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration8680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXVariableDeclaration8733 = new BitSet(new long[]{0x0000000002000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_66_in_ruleXVariableDeclaration8764 = new BitSet(new long[]{0x0000000002000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8812 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8833 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8862 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleXVariableDeclaration8876 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter8945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8991 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter9013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter9049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter9059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter9105 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter9126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall9162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall9172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall9229 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_40_in_ruleXFeatureCall9243 = new BitSet(new long[]{0x0000000002000010L,0x0000000000018000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9264 = new BitSet(new long[]{0x0010008000000000L});
    public static final BitSet FOLLOW_52_in_ruleXFeatureCall9277 = new BitSet(new long[]{0x0000000002000010L,0x0000000000018000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9298 = new BitSet(new long[]{0x0010008000000000L});
    public static final BitSet FOLLOW_39_in_ruleXFeatureCall9312 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall9337 = new BitSet(new long[]{0x0020000002000002L});
    public static final BitSet FOLLOW_25_in_ruleXFeatureCall9371 = new BitSet(new long[]{0x8A61190022041070L,0x0000000000009FE9L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall9456 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall9484 = new BitSet(new long[]{0x0010000020000000L});
    public static final BitSet FOLLOW_52_in_ruleXFeatureCall9497 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall9518 = new BitSet(new long[]{0x0010000020000000L});
    public static final BitSet FOLLOW_29_in_ruleXFeatureCall9535 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall9568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper9606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper9617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper9664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleIdOrSuper9688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier9740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier9787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleStaticQualifier9805 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall9856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXConstructorCall9902 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9925 = new BitSet(new long[]{0x0000010002000000L});
    public static final BitSet FOLLOW_40_in_ruleXConstructorCall9938 = new BitSet(new long[]{0x0000000002000010L,0x0000000000018000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9959 = new BitSet(new long[]{0x0010008000000000L});
    public static final BitSet FOLLOW_52_in_ruleXConstructorCall9972 = new BitSet(new long[]{0x0000000002000010L,0x0000000000018000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9993 = new BitSet(new long[]{0x0010008000000000L});
    public static final BitSet FOLLOW_39_in_ruleXConstructorCall10007 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXConstructorCall10021 = new BitSet(new long[]{0x8A61190022041070L,0x0000000000009FE9L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall10093 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall10121 = new BitSet(new long[]{0x0010000020000000L});
    public static final BitSet FOLLOW_52_in_ruleXConstructorCall10134 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall10155 = new BitSet(new long[]{0x0010000020000000L});
    public static final BitSet FOLLOW_29_in_ruleXConstructorCall10172 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall10203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral10240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral10250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXBooleanLiteral10297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXBooleanLiteral10321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral10371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral10381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXNullLiteral10427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral10463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral10473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral10524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral10575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral10626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral10677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXTypeLiteral10723 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXTypeLiteral10735 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10758 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleXTypeLiteral10770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression10816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXThrowExpression10862 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression10883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression10929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXReturnExpression10975 = new BitSet(new long[]{0x8A21190002041072L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression11006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression11043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression11053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXTryCatchFinallyExpression11099 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression11150 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_77_in_ruleXTryCatchFinallyExpression11172 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleXTryCatchFinallyExpression11216 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause11275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause11285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleXCatchClause11330 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXCatchClause11343 = new BitSet(new long[]{0x0000000002000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause11364 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleXCatchClause11376 = new BitSet(new long[]{0x8A21190002041070L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause11397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName11445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName11492 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedName11520 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName11543 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference11600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11648 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleJvmTypeReference11686 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleJvmTypeReference11698 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef11775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleXFunctionTypeRef11813 = new BitSet(new long[]{0x0000000022000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11835 = new BitSet(new long[]{0x0010000020000000L});
    public static final BitSet FOLLOW_52_in_ruleXFunctionTypeRef11848 = new BitSet(new long[]{0x0000000002000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11869 = new BitSet(new long[]{0x0010000020000000L});
    public static final BitSet FOLLOW_29_in_ruleXFunctionTypeRef11885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleXFunctionTypeRef11899 = new BitSet(new long[]{0x0000000002000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference12014 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleJvmParameterizedTypeReference12035 = new BitSet(new long[]{0x0000000002000010L,0x0000000000018000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12057 = new BitSet(new long[]{0x0010008000000000L});
    public static final BitSet FOLLOW_52_in_ruleJvmParameterizedTypeReference12070 = new BitSet(new long[]{0x0000000002000010L,0x0000000000018000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12091 = new BitSet(new long[]{0x0010008000000000L});
    public static final BitSet FOLLOW_39_in_ruleJvmParameterizedTypeReference12105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleJvmWildcardTypeReference12318 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020008L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound12415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleJvmUpperBound12452 = new BitSet(new long[]{0x0000000002000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleJvmUpperBoundAnded12556 = new BitSet(new long[]{0x0000000002000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound12623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleJvmLowerBound12660 = new BitSet(new long[]{0x0000000002000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID12720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID12731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID12770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalSpray22393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalSpray22741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalSpray23000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalSpray23259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred5_InternalSpray23535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalSpray23608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalSpray23927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalSpray24207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalSpray24487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred10_InternalSpray25081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred11_InternalSpray25235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalSpray25244 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalSpray25250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred12_InternalSpray25353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred12_InternalSpray25367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred12_InternalSpray25387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred13_InternalSpray25614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalSpray25666 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_52_in_synpred14_InternalSpray25673 = new BitSet(new long[]{0x0000000002000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalSpray25680 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_54_in_synpred14_InternalSpray25694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred15_InternalSpray25812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalSpray26585 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_52_in_synpred16_InternalSpray26592 = new BitSet(new long[]{0x0000000002000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalSpray26599 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_54_in_synpred16_InternalSpray26613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_synpred18_InternalSpray27396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred19_InternalSpray27536 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_synpred19_InternalSpray27542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred20_InternalSpray28782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred20_InternalSpray28791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred21_InternalSpray29353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalSpray29405 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_52_in_synpred22_InternalSpray29412 = new BitSet(new long[]{0x0000000002000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalSpray29419 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_54_in_synpred22_InternalSpray29433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred23_InternalSpray29551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalSpray210042 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_52_in_synpred24_InternalSpray210049 = new BitSet(new long[]{0x0000000002000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalSpray210056 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_54_in_synpred24_InternalSpray210070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred25_InternalSpray210186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred26_InternalSpray210989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_synpred27_InternalSpray211134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_synpred28_InternalSpray211164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred30_InternalSpray211511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred31_InternalSpray211663 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_synpred31_InternalSpray211667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred32_InternalSpray212027 = new BitSet(new long[]{0x0000000000000002L});

}