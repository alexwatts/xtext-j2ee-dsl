package jpadsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import jpadsl.services.JPADslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJPADslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'public'", "'private'", "'protected'", "'import'", "'package'", "'{'", "'}'", "'datatype'", "'databaseMode'", "'entity'", "'extends'", "'read only'", "'cacheable'", "'unique id'", "'embedded id'", "'staticAttribute'", "':'", "'attribute'", "'transient'", "'id attribute'", "'one to one join column'", "'one to one mapped by'", "'one to many using join table'", "'one to many using join column'", "'one to many mapped by'", "'many to one using join column'", "'many to one using join table'", "'many to one mapped by'", "'many to many join table'", "'many to many mapped by'", "'ref'", "'opposite'", "'op'", "'('", "')'", "','", "'.*'", "'.'", "'*'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalJPADslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJPADslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJPADslParser.tokenNames; }
    public String getGrammarFileName() { return "../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g"; }


     
     	private JPADslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(JPADslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:61:1: ( ruleModel EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:69:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:73:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:74:1: ( ( rule__Model__ElementsAssignment )* )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:74:1: ( ( rule__Model__ElementsAssignment )* )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:75:1: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:76:1: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)||LA1_0==18||LA1_0==20||(LA1_0>=31 && LA1_0<=40)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:76:2: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__ElementsAssignment_in_ruleModel94);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAbstractElement"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:88:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:89:1: ( ruleAbstractElement EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:90:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement122);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:97:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:101:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:102:1: ( ( rule__AbstractElement__Alternatives ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:102:1: ( ( rule__AbstractElement__Alternatives ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:103:1: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:104:1: ( rule__AbstractElement__Alternatives )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:104:2: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement155);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleImport"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:116:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:117:1: ( ruleImport EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:118:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport182);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:125:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:129:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:130:1: ( ( rule__Import__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:130:1: ( ( rule__Import__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:131:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:132:1: ( rule__Import__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:132:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport215);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRulePackageDeclaration"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:144:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:145:1: ( rulePackageDeclaration EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:146:1: rulePackageDeclaration EOF
            {
             before(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration242);
            rulePackageDeclaration();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:153:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:157:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:158:1: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:158:1: ( ( rule__PackageDeclaration__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:159:1: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:160:1: ( rule__PackageDeclaration__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:160:2: rule__PackageDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration275);
            rule__PackageDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleType"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:172:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:173:1: ( ruleType EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:174:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType302);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:181:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:185:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:186:1: ( ( rule__Type__Alternatives ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:186:1: ( ( rule__Type__Alternatives ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:187:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:188:1: ( rule__Type__Alternatives )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:188:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType335);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:200:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:201:1: ( ruleDataType EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:202:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType362);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:209:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:213:2: ( ( ( rule__DataType__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:214:1: ( ( rule__DataType__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:214:1: ( ( rule__DataType__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:215:1: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:216:1: ( rule__DataType__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:216:2: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_rule__DataType__Group__0_in_ruleDataType395);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleDatabaseMode"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:228:1: entryRuleDatabaseMode : ruleDatabaseMode EOF ;
    public final void entryRuleDatabaseMode() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:229:1: ( ruleDatabaseMode EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:230:1: ruleDatabaseMode EOF
            {
             before(grammarAccess.getDatabaseModeRule()); 
            pushFollow(FOLLOW_ruleDatabaseMode_in_entryRuleDatabaseMode422);
            ruleDatabaseMode();

            state._fsp--;

             after(grammarAccess.getDatabaseModeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatabaseMode429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDatabaseMode"


    // $ANTLR start "ruleDatabaseMode"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:237:1: ruleDatabaseMode : ( ( rule__DatabaseMode__Group__0 ) ) ;
    public final void ruleDatabaseMode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:241:2: ( ( ( rule__DatabaseMode__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:242:1: ( ( rule__DatabaseMode__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:242:1: ( ( rule__DatabaseMode__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:243:1: ( rule__DatabaseMode__Group__0 )
            {
             before(grammarAccess.getDatabaseModeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:244:1: ( rule__DatabaseMode__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:244:2: rule__DatabaseMode__Group__0
            {
            pushFollow(FOLLOW_rule__DatabaseMode__Group__0_in_ruleDatabaseMode455);
            rule__DatabaseMode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseModeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatabaseMode"


    // $ANTLR start "entryRuleEntity"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:256:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:257:1: ( ruleEntity EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:258:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity482);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:265:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:269:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:270:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:270:1: ( ( rule__Entity__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:271:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:272:1: ( rule__Entity__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:272:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity515);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleReadOnly"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:284:1: entryRuleReadOnly : ruleReadOnly EOF ;
    public final void entryRuleReadOnly() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:285:1: ( ruleReadOnly EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:286:1: ruleReadOnly EOF
            {
             before(grammarAccess.getReadOnlyRule()); 
            pushFollow(FOLLOW_ruleReadOnly_in_entryRuleReadOnly542);
            ruleReadOnly();

            state._fsp--;

             after(grammarAccess.getReadOnlyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReadOnly549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReadOnly"


    // $ANTLR start "ruleReadOnly"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:293:1: ruleReadOnly : ( ( rule__ReadOnly__Group__0 ) ) ;
    public final void ruleReadOnly() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:297:2: ( ( ( rule__ReadOnly__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:298:1: ( ( rule__ReadOnly__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:298:1: ( ( rule__ReadOnly__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:299:1: ( rule__ReadOnly__Group__0 )
            {
             before(grammarAccess.getReadOnlyAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:300:1: ( rule__ReadOnly__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:300:2: rule__ReadOnly__Group__0
            {
            pushFollow(FOLLOW_rule__ReadOnly__Group__0_in_ruleReadOnly575);
            rule__ReadOnly__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReadOnlyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReadOnly"


    // $ANTLR start "entryRuleCacheable"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:312:1: entryRuleCacheable : ruleCacheable EOF ;
    public final void entryRuleCacheable() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:313:1: ( ruleCacheable EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:314:1: ruleCacheable EOF
            {
             before(grammarAccess.getCacheableRule()); 
            pushFollow(FOLLOW_ruleCacheable_in_entryRuleCacheable602);
            ruleCacheable();

            state._fsp--;

             after(grammarAccess.getCacheableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCacheable609); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCacheable"


    // $ANTLR start "ruleCacheable"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:321:1: ruleCacheable : ( ( rule__Cacheable__Group__0 ) ) ;
    public final void ruleCacheable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:325:2: ( ( ( rule__Cacheable__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:326:1: ( ( rule__Cacheable__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:326:1: ( ( rule__Cacheable__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:327:1: ( rule__Cacheable__Group__0 )
            {
             before(grammarAccess.getCacheableAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:328:1: ( rule__Cacheable__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:328:2: rule__Cacheable__Group__0
            {
            pushFollow(FOLLOW_rule__Cacheable__Group__0_in_ruleCacheable635);
            rule__Cacheable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCacheableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCacheable"


    // $ANTLR start "entryRuleIdentifier"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:340:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:341:1: ( ruleIdentifier EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:342:1: ruleIdentifier EOF
            {
             before(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier662);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getIdentifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier669); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:349:1: ruleIdentifier : ( ( rule__Identifier__Alternatives ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:353:2: ( ( ( rule__Identifier__Alternatives ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:354:1: ( ( rule__Identifier__Alternatives ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:354:1: ( ( rule__Identifier__Alternatives ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:355:1: ( rule__Identifier__Alternatives )
            {
             before(grammarAccess.getIdentifierAccess().getAlternatives()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:356:1: ( rule__Identifier__Alternatives )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:356:2: rule__Identifier__Alternatives
            {
            pushFollow(FOLLOW_rule__Identifier__Alternatives_in_ruleIdentifier695);
            rule__Identifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIdentifierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleUniqueIdentiferColumn"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:368:1: entryRuleUniqueIdentiferColumn : ruleUniqueIdentiferColumn EOF ;
    public final void entryRuleUniqueIdentiferColumn() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:369:1: ( ruleUniqueIdentiferColumn EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:370:1: ruleUniqueIdentiferColumn EOF
            {
             before(grammarAccess.getUniqueIdentiferColumnRule()); 
            pushFollow(FOLLOW_ruleUniqueIdentiferColumn_in_entryRuleUniqueIdentiferColumn722);
            ruleUniqueIdentiferColumn();

            state._fsp--;

             after(grammarAccess.getUniqueIdentiferColumnRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniqueIdentiferColumn729); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUniqueIdentiferColumn"


    // $ANTLR start "ruleUniqueIdentiferColumn"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:377:1: ruleUniqueIdentiferColumn : ( ( rule__UniqueIdentiferColumn__Group__0 ) ) ;
    public final void ruleUniqueIdentiferColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:381:2: ( ( ( rule__UniqueIdentiferColumn__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:382:1: ( ( rule__UniqueIdentiferColumn__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:382:1: ( ( rule__UniqueIdentiferColumn__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:383:1: ( rule__UniqueIdentiferColumn__Group__0 )
            {
             before(grammarAccess.getUniqueIdentiferColumnAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:384:1: ( rule__UniqueIdentiferColumn__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:384:2: rule__UniqueIdentiferColumn__Group__0
            {
            pushFollow(FOLLOW_rule__UniqueIdentiferColumn__Group__0_in_ruleUniqueIdentiferColumn755);
            rule__UniqueIdentiferColumn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUniqueIdentiferColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUniqueIdentiferColumn"


    // $ANTLR start "entryRuleEmbeddedUniqueIdentifer"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:396:1: entryRuleEmbeddedUniqueIdentifer : ruleEmbeddedUniqueIdentifer EOF ;
    public final void entryRuleEmbeddedUniqueIdentifer() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:397:1: ( ruleEmbeddedUniqueIdentifer EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:398:1: ruleEmbeddedUniqueIdentifer EOF
            {
             before(grammarAccess.getEmbeddedUniqueIdentiferRule()); 
            pushFollow(FOLLOW_ruleEmbeddedUniqueIdentifer_in_entryRuleEmbeddedUniqueIdentifer782);
            ruleEmbeddedUniqueIdentifer();

            state._fsp--;

             after(grammarAccess.getEmbeddedUniqueIdentiferRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmbeddedUniqueIdentifer789); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEmbeddedUniqueIdentifer"


    // $ANTLR start "ruleEmbeddedUniqueIdentifer"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:405:1: ruleEmbeddedUniqueIdentifer : ( ( rule__EmbeddedUniqueIdentifer__Group__0 ) ) ;
    public final void ruleEmbeddedUniqueIdentifer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:409:2: ( ( ( rule__EmbeddedUniqueIdentifer__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:410:1: ( ( rule__EmbeddedUniqueIdentifer__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:410:1: ( ( rule__EmbeddedUniqueIdentifer__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:411:1: ( rule__EmbeddedUniqueIdentifer__Group__0 )
            {
             before(grammarAccess.getEmbeddedUniqueIdentiferAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:412:1: ( rule__EmbeddedUniqueIdentifer__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:412:2: rule__EmbeddedUniqueIdentifer__Group__0
            {
            pushFollow(FOLLOW_rule__EmbeddedUniqueIdentifer__Group__0_in_ruleEmbeddedUniqueIdentifer815);
            rule__EmbeddedUniqueIdentifer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmbeddedUniqueIdentiferAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmbeddedUniqueIdentifer"


    // $ANTLR start "entryRuleFeature"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:424:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:425:1: ( ruleFeature EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:426:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature842);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature849); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:433:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:437:2: ( ( ( rule__Feature__Alternatives ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:438:1: ( ( rule__Feature__Alternatives ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:438:1: ( ( rule__Feature__Alternatives ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:439:1: ( rule__Feature__Alternatives )
            {
             before(grammarAccess.getFeatureAccess().getAlternatives()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:440:1: ( rule__Feature__Alternatives )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:440:2: rule__Feature__Alternatives
            {
            pushFollow(FOLLOW_rule__Feature__Alternatives_in_ruleFeature875);
            rule__Feature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleStructuralFeature"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:452:1: entryRuleStructuralFeature : ruleStructuralFeature EOF ;
    public final void entryRuleStructuralFeature() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:453:1: ( ruleStructuralFeature EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:454:1: ruleStructuralFeature EOF
            {
             before(grammarAccess.getStructuralFeatureRule()); 
            pushFollow(FOLLOW_ruleStructuralFeature_in_entryRuleStructuralFeature902);
            ruleStructuralFeature();

            state._fsp--;

             after(grammarAccess.getStructuralFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructuralFeature909); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStructuralFeature"


    // $ANTLR start "ruleStructuralFeature"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:461:1: ruleStructuralFeature : ( ( rule__StructuralFeature__Alternatives ) ) ;
    public final void ruleStructuralFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:465:2: ( ( ( rule__StructuralFeature__Alternatives ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:466:1: ( ( rule__StructuralFeature__Alternatives ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:466:1: ( ( rule__StructuralFeature__Alternatives ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:467:1: ( rule__StructuralFeature__Alternatives )
            {
             before(grammarAccess.getStructuralFeatureAccess().getAlternatives()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:468:1: ( rule__StructuralFeature__Alternatives )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:468:2: rule__StructuralFeature__Alternatives
            {
            pushFollow(FOLLOW_rule__StructuralFeature__Alternatives_in_ruleStructuralFeature935);
            rule__StructuralFeature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStructuralFeatureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStructuralFeature"


    // $ANTLR start "entryRuleAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:480:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:481:1: ( ruleAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:482:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute962);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute969); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:489:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:493:2: ( ( ( rule__Attribute__Alternatives ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:494:1: ( ( rule__Attribute__Alternatives ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:494:1: ( ( rule__Attribute__Alternatives ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:495:1: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:496:1: ( rule__Attribute__Alternatives )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:496:2: rule__Attribute__Alternatives
            {
            pushFollow(FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute995);
            rule__Attribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleStaticAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:508:1: entryRuleStaticAttribute : ruleStaticAttribute EOF ;
    public final void entryRuleStaticAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:509:1: ( ruleStaticAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:510:1: ruleStaticAttribute EOF
            {
             before(grammarAccess.getStaticAttributeRule()); 
            pushFollow(FOLLOW_ruleStaticAttribute_in_entryRuleStaticAttribute1022);
            ruleStaticAttribute();

            state._fsp--;

             after(grammarAccess.getStaticAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticAttribute1029); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStaticAttribute"


    // $ANTLR start "ruleStaticAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:517:1: ruleStaticAttribute : ( ( rule__StaticAttribute__Group__0 ) ) ;
    public final void ruleStaticAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:521:2: ( ( ( rule__StaticAttribute__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:522:1: ( ( rule__StaticAttribute__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:522:1: ( ( rule__StaticAttribute__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:523:1: ( rule__StaticAttribute__Group__0 )
            {
             before(grammarAccess.getStaticAttributeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:524:1: ( rule__StaticAttribute__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:524:2: rule__StaticAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__StaticAttribute__Group__0_in_ruleStaticAttribute1055);
            rule__StaticAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStaticAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStaticAttribute"


    // $ANTLR start "entryRuleInternalAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:536:1: entryRuleInternalAttribute : ruleInternalAttribute EOF ;
    public final void entryRuleInternalAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:537:1: ( ruleInternalAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:538:1: ruleInternalAttribute EOF
            {
             before(grammarAccess.getInternalAttributeRule()); 
            pushFollow(FOLLOW_ruleInternalAttribute_in_entryRuleInternalAttribute1082);
            ruleInternalAttribute();

            state._fsp--;

             after(grammarAccess.getInternalAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalAttribute1089); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInternalAttribute"


    // $ANTLR start "ruleInternalAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:545:1: ruleInternalAttribute : ( ( rule__InternalAttribute__Alternatives ) ) ;
    public final void ruleInternalAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:549:2: ( ( ( rule__InternalAttribute__Alternatives ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:550:1: ( ( rule__InternalAttribute__Alternatives ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:550:1: ( ( rule__InternalAttribute__Alternatives ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:551:1: ( rule__InternalAttribute__Alternatives )
            {
             before(grammarAccess.getInternalAttributeAccess().getAlternatives()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:552:1: ( rule__InternalAttribute__Alternatives )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:552:2: rule__InternalAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__InternalAttribute__Alternatives_in_ruleInternalAttribute1115);
            rule__InternalAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInternalAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInternalAttribute"


    // $ANTLR start "entryRuleRelationshipAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:564:1: entryRuleRelationshipAttribute : ruleRelationshipAttribute EOF ;
    public final void entryRuleRelationshipAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:565:1: ( ruleRelationshipAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:566:1: ruleRelationshipAttribute EOF
            {
             before(grammarAccess.getRelationshipAttributeRule()); 
            pushFollow(FOLLOW_ruleRelationshipAttribute_in_entryRuleRelationshipAttribute1142);
            ruleRelationshipAttribute();

            state._fsp--;

             after(grammarAccess.getRelationshipAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationshipAttribute1149); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationshipAttribute"


    // $ANTLR start "ruleRelationshipAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:573:1: ruleRelationshipAttribute : ( ( rule__RelationshipAttribute__Alternatives ) ) ;
    public final void ruleRelationshipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:577:2: ( ( ( rule__RelationshipAttribute__Alternatives ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:578:1: ( ( rule__RelationshipAttribute__Alternatives ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:578:1: ( ( rule__RelationshipAttribute__Alternatives ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:579:1: ( rule__RelationshipAttribute__Alternatives )
            {
             before(grammarAccess.getRelationshipAttributeAccess().getAlternatives()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:580:1: ( rule__RelationshipAttribute__Alternatives )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:580:2: rule__RelationshipAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__RelationshipAttribute__Alternatives_in_ruleRelationshipAttribute1175);
            rule__RelationshipAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationshipAttribute"


    // $ANTLR start "entryRuleSingularRelationshipAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:592:1: entryRuleSingularRelationshipAttribute : ruleSingularRelationshipAttribute EOF ;
    public final void entryRuleSingularRelationshipAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:593:1: ( ruleSingularRelationshipAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:594:1: ruleSingularRelationshipAttribute EOF
            {
             before(grammarAccess.getSingularRelationshipAttributeRule()); 
            pushFollow(FOLLOW_ruleSingularRelationshipAttribute_in_entryRuleSingularRelationshipAttribute1202);
            ruleSingularRelationshipAttribute();

            state._fsp--;

             after(grammarAccess.getSingularRelationshipAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingularRelationshipAttribute1209); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingularRelationshipAttribute"


    // $ANTLR start "ruleSingularRelationshipAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:601:1: ruleSingularRelationshipAttribute : ( ( rule__SingularRelationshipAttribute__Alternatives ) ) ;
    public final void ruleSingularRelationshipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:605:2: ( ( ( rule__SingularRelationshipAttribute__Alternatives ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:606:1: ( ( rule__SingularRelationshipAttribute__Alternatives ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:606:1: ( ( rule__SingularRelationshipAttribute__Alternatives ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:607:1: ( rule__SingularRelationshipAttribute__Alternatives )
            {
             before(grammarAccess.getSingularRelationshipAttributeAccess().getAlternatives()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:608:1: ( rule__SingularRelationshipAttribute__Alternatives )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:608:2: rule__SingularRelationshipAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__SingularRelationshipAttribute__Alternatives_in_ruleSingularRelationshipAttribute1235);
            rule__SingularRelationshipAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSingularRelationshipAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingularRelationshipAttribute"


    // $ANTLR start "entryRuleMultipleRelationshipAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:620:1: entryRuleMultipleRelationshipAttribute : ruleMultipleRelationshipAttribute EOF ;
    public final void entryRuleMultipleRelationshipAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:621:1: ( ruleMultipleRelationshipAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:622:1: ruleMultipleRelationshipAttribute EOF
            {
             before(grammarAccess.getMultipleRelationshipAttributeRule()); 
            pushFollow(FOLLOW_ruleMultipleRelationshipAttribute_in_entryRuleMultipleRelationshipAttribute1262);
            ruleMultipleRelationshipAttribute();

            state._fsp--;

             after(grammarAccess.getMultipleRelationshipAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultipleRelationshipAttribute1269); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultipleRelationshipAttribute"


    // $ANTLR start "ruleMultipleRelationshipAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:629:1: ruleMultipleRelationshipAttribute : ( ( rule__MultipleRelationshipAttribute__Alternatives ) ) ;
    public final void ruleMultipleRelationshipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:633:2: ( ( ( rule__MultipleRelationshipAttribute__Alternatives ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:634:1: ( ( rule__MultipleRelationshipAttribute__Alternatives ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:634:1: ( ( rule__MultipleRelationshipAttribute__Alternatives ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:635:1: ( rule__MultipleRelationshipAttribute__Alternatives )
            {
             before(grammarAccess.getMultipleRelationshipAttributeAccess().getAlternatives()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:636:1: ( rule__MultipleRelationshipAttribute__Alternatives )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:636:2: rule__MultipleRelationshipAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__MultipleRelationshipAttribute__Alternatives_in_ruleMultipleRelationshipAttribute1295);
            rule__MultipleRelationshipAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultipleRelationshipAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultipleRelationshipAttribute"


    // $ANTLR start "entryRuleReadOnlyInternalAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:648:1: entryRuleReadOnlyInternalAttribute : ruleReadOnlyInternalAttribute EOF ;
    public final void entryRuleReadOnlyInternalAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:649:1: ( ruleReadOnlyInternalAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:650:1: ruleReadOnlyInternalAttribute EOF
            {
             before(grammarAccess.getReadOnlyInternalAttributeRule()); 
            pushFollow(FOLLOW_ruleReadOnlyInternalAttribute_in_entryRuleReadOnlyInternalAttribute1322);
            ruleReadOnlyInternalAttribute();

            state._fsp--;

             after(grammarAccess.getReadOnlyInternalAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReadOnlyInternalAttribute1329); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReadOnlyInternalAttribute"


    // $ANTLR start "ruleReadOnlyInternalAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:657:1: ruleReadOnlyInternalAttribute : ( ( rule__ReadOnlyInternalAttribute__Group__0 ) ) ;
    public final void ruleReadOnlyInternalAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:661:2: ( ( ( rule__ReadOnlyInternalAttribute__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:662:1: ( ( rule__ReadOnlyInternalAttribute__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:662:1: ( ( rule__ReadOnlyInternalAttribute__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:663:1: ( rule__ReadOnlyInternalAttribute__Group__0 )
            {
             before(grammarAccess.getReadOnlyInternalAttributeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:664:1: ( rule__ReadOnlyInternalAttribute__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:664:2: rule__ReadOnlyInternalAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ReadOnlyInternalAttribute__Group__0_in_ruleReadOnlyInternalAttribute1355);
            rule__ReadOnlyInternalAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReadOnlyInternalAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReadOnlyInternalAttribute"


    // $ANTLR start "entryRuleUpdatableInternalAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:676:1: entryRuleUpdatableInternalAttribute : ruleUpdatableInternalAttribute EOF ;
    public final void entryRuleUpdatableInternalAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:677:1: ( ruleUpdatableInternalAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:678:1: ruleUpdatableInternalAttribute EOF
            {
             before(grammarAccess.getUpdatableInternalAttributeRule()); 
            pushFollow(FOLLOW_ruleUpdatableInternalAttribute_in_entryRuleUpdatableInternalAttribute1382);
            ruleUpdatableInternalAttribute();

            state._fsp--;

             after(grammarAccess.getUpdatableInternalAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdatableInternalAttribute1389); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUpdatableInternalAttribute"


    // $ANTLR start "ruleUpdatableInternalAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:685:1: ruleUpdatableInternalAttribute : ( ( rule__UpdatableInternalAttribute__Group__0 ) ) ;
    public final void ruleUpdatableInternalAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:689:2: ( ( ( rule__UpdatableInternalAttribute__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:690:1: ( ( rule__UpdatableInternalAttribute__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:690:1: ( ( rule__UpdatableInternalAttribute__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:691:1: ( rule__UpdatableInternalAttribute__Group__0 )
            {
             before(grammarAccess.getUpdatableInternalAttributeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:692:1: ( rule__UpdatableInternalAttribute__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:692:2: rule__UpdatableInternalAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__UpdatableInternalAttribute__Group__0_in_ruleUpdatableInternalAttribute1415);
            rule__UpdatableInternalAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpdatableInternalAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUpdatableInternalAttribute"


    // $ANTLR start "entryRuleTransientAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:704:1: entryRuleTransientAttribute : ruleTransientAttribute EOF ;
    public final void entryRuleTransientAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:705:1: ( ruleTransientAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:706:1: ruleTransientAttribute EOF
            {
             before(grammarAccess.getTransientAttributeRule()); 
            pushFollow(FOLLOW_ruleTransientAttribute_in_entryRuleTransientAttribute1442);
            ruleTransientAttribute();

            state._fsp--;

             after(grammarAccess.getTransientAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransientAttribute1449); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransientAttribute"


    // $ANTLR start "ruleTransientAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:713:1: ruleTransientAttribute : ( ( rule__TransientAttribute__Group__0 ) ) ;
    public final void ruleTransientAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:717:2: ( ( ( rule__TransientAttribute__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:718:1: ( ( rule__TransientAttribute__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:718:1: ( ( rule__TransientAttribute__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:719:1: ( rule__TransientAttribute__Group__0 )
            {
             before(grammarAccess.getTransientAttributeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:720:1: ( rule__TransientAttribute__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:720:2: rule__TransientAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__TransientAttribute__Group__0_in_ruleTransientAttribute1475);
            rule__TransientAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransientAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransientAttribute"


    // $ANTLR start "entryRuleIdAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:732:1: entryRuleIdAttribute : ruleIdAttribute EOF ;
    public final void entryRuleIdAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:733:1: ( ruleIdAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:734:1: ruleIdAttribute EOF
            {
             before(grammarAccess.getIdAttributeRule()); 
            pushFollow(FOLLOW_ruleIdAttribute_in_entryRuleIdAttribute1502);
            ruleIdAttribute();

            state._fsp--;

             after(grammarAccess.getIdAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdAttribute1509); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIdAttribute"


    // $ANTLR start "ruleIdAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:741:1: ruleIdAttribute : ( ( rule__IdAttribute__Group__0 ) ) ;
    public final void ruleIdAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:745:2: ( ( ( rule__IdAttribute__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:746:1: ( ( rule__IdAttribute__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:746:1: ( ( rule__IdAttribute__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:747:1: ( rule__IdAttribute__Group__0 )
            {
             before(grammarAccess.getIdAttributeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:748:1: ( rule__IdAttribute__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:748:2: rule__IdAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__IdAttribute__Group__0_in_ruleIdAttribute1535);
            rule__IdAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIdAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdAttribute"


    // $ANTLR start "entryRuleOneToOneRelationshipAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:760:1: entryRuleOneToOneRelationshipAttribute : ruleOneToOneRelationshipAttribute EOF ;
    public final void entryRuleOneToOneRelationshipAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:761:1: ( ruleOneToOneRelationshipAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:762:1: ruleOneToOneRelationshipAttribute EOF
            {
             before(grammarAccess.getOneToOneRelationshipAttributeRule()); 
            pushFollow(FOLLOW_ruleOneToOneRelationshipAttribute_in_entryRuleOneToOneRelationshipAttribute1562);
            ruleOneToOneRelationshipAttribute();

            state._fsp--;

             after(grammarAccess.getOneToOneRelationshipAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneToOneRelationshipAttribute1569); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOneToOneRelationshipAttribute"


    // $ANTLR start "ruleOneToOneRelationshipAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:769:1: ruleOneToOneRelationshipAttribute : ( ( rule__OneToOneRelationshipAttribute__Group__0 ) ) ;
    public final void ruleOneToOneRelationshipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:773:2: ( ( ( rule__OneToOneRelationshipAttribute__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:774:1: ( ( rule__OneToOneRelationshipAttribute__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:774:1: ( ( rule__OneToOneRelationshipAttribute__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:775:1: ( rule__OneToOneRelationshipAttribute__Group__0 )
            {
             before(grammarAccess.getOneToOneRelationshipAttributeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:776:1: ( rule__OneToOneRelationshipAttribute__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:776:2: rule__OneToOneRelationshipAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__OneToOneRelationshipAttribute__Group__0_in_ruleOneToOneRelationshipAttribute1595);
            rule__OneToOneRelationshipAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOneToOneRelationshipAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOneToOneRelationshipAttribute"


    // $ANTLR start "entryRuleOneToOneMappedByRelationshipAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:788:1: entryRuleOneToOneMappedByRelationshipAttribute : ruleOneToOneMappedByRelationshipAttribute EOF ;
    public final void entryRuleOneToOneMappedByRelationshipAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:789:1: ( ruleOneToOneMappedByRelationshipAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:790:1: ruleOneToOneMappedByRelationshipAttribute EOF
            {
             before(grammarAccess.getOneToOneMappedByRelationshipAttributeRule()); 
            pushFollow(FOLLOW_ruleOneToOneMappedByRelationshipAttribute_in_entryRuleOneToOneMappedByRelationshipAttribute1622);
            ruleOneToOneMappedByRelationshipAttribute();

            state._fsp--;

             after(grammarAccess.getOneToOneMappedByRelationshipAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneToOneMappedByRelationshipAttribute1629); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOneToOneMappedByRelationshipAttribute"


    // $ANTLR start "ruleOneToOneMappedByRelationshipAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:797:1: ruleOneToOneMappedByRelationshipAttribute : ( ( rule__OneToOneMappedByRelationshipAttribute__Group__0 ) ) ;
    public final void ruleOneToOneMappedByRelationshipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:801:2: ( ( ( rule__OneToOneMappedByRelationshipAttribute__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:802:1: ( ( rule__OneToOneMappedByRelationshipAttribute__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:802:1: ( ( rule__OneToOneMappedByRelationshipAttribute__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:803:1: ( rule__OneToOneMappedByRelationshipAttribute__Group__0 )
            {
             before(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:804:1: ( rule__OneToOneMappedByRelationshipAttribute__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:804:2: rule__OneToOneMappedByRelationshipAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__0_in_ruleOneToOneMappedByRelationshipAttribute1655);
            rule__OneToOneMappedByRelationshipAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOneToOneMappedByRelationshipAttribute"


    // $ANTLR start "entryRuleOneToManyJoinTableRelationshipAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:816:1: entryRuleOneToManyJoinTableRelationshipAttribute : ruleOneToManyJoinTableRelationshipAttribute EOF ;
    public final void entryRuleOneToManyJoinTableRelationshipAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:817:1: ( ruleOneToManyJoinTableRelationshipAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:818:1: ruleOneToManyJoinTableRelationshipAttribute EOF
            {
             before(grammarAccess.getOneToManyJoinTableRelationshipAttributeRule()); 
            pushFollow(FOLLOW_ruleOneToManyJoinTableRelationshipAttribute_in_entryRuleOneToManyJoinTableRelationshipAttribute1682);
            ruleOneToManyJoinTableRelationshipAttribute();

            state._fsp--;

             after(grammarAccess.getOneToManyJoinTableRelationshipAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneToManyJoinTableRelationshipAttribute1689); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOneToManyJoinTableRelationshipAttribute"


    // $ANTLR start "ruleOneToManyJoinTableRelationshipAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:825:1: ruleOneToManyJoinTableRelationshipAttribute : ( ( rule__OneToManyJoinTableRelationshipAttribute__Group__0 ) ) ;
    public final void ruleOneToManyJoinTableRelationshipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:829:2: ( ( ( rule__OneToManyJoinTableRelationshipAttribute__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:830:1: ( ( rule__OneToManyJoinTableRelationshipAttribute__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:830:1: ( ( rule__OneToManyJoinTableRelationshipAttribute__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:831:1: ( rule__OneToManyJoinTableRelationshipAttribute__Group__0 )
            {
             before(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:832:1: ( rule__OneToManyJoinTableRelationshipAttribute__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:832:2: rule__OneToManyJoinTableRelationshipAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__0_in_ruleOneToManyJoinTableRelationshipAttribute1715);
            rule__OneToManyJoinTableRelationshipAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOneToManyJoinTableRelationshipAttribute"


    // $ANTLR start "entryRuleOneToManyJoinColumnRelationshipAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:844:1: entryRuleOneToManyJoinColumnRelationshipAttribute : ruleOneToManyJoinColumnRelationshipAttribute EOF ;
    public final void entryRuleOneToManyJoinColumnRelationshipAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:845:1: ( ruleOneToManyJoinColumnRelationshipAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:846:1: ruleOneToManyJoinColumnRelationshipAttribute EOF
            {
             before(grammarAccess.getOneToManyJoinColumnRelationshipAttributeRule()); 
            pushFollow(FOLLOW_ruleOneToManyJoinColumnRelationshipAttribute_in_entryRuleOneToManyJoinColumnRelationshipAttribute1742);
            ruleOneToManyJoinColumnRelationshipAttribute();

            state._fsp--;

             after(grammarAccess.getOneToManyJoinColumnRelationshipAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneToManyJoinColumnRelationshipAttribute1749); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOneToManyJoinColumnRelationshipAttribute"


    // $ANTLR start "ruleOneToManyJoinColumnRelationshipAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:853:1: ruleOneToManyJoinColumnRelationshipAttribute : ( ( rule__OneToManyJoinColumnRelationshipAttribute__Group__0 ) ) ;
    public final void ruleOneToManyJoinColumnRelationshipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:857:2: ( ( ( rule__OneToManyJoinColumnRelationshipAttribute__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:858:1: ( ( rule__OneToManyJoinColumnRelationshipAttribute__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:858:1: ( ( rule__OneToManyJoinColumnRelationshipAttribute__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:859:1: ( rule__OneToManyJoinColumnRelationshipAttribute__Group__0 )
            {
             before(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:860:1: ( rule__OneToManyJoinColumnRelationshipAttribute__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:860:2: rule__OneToManyJoinColumnRelationshipAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__0_in_ruleOneToManyJoinColumnRelationshipAttribute1775);
            rule__OneToManyJoinColumnRelationshipAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOneToManyJoinColumnRelationshipAttribute"


    // $ANTLR start "entryRuleOneToManyMappedByRelationshipAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:872:1: entryRuleOneToManyMappedByRelationshipAttribute : ruleOneToManyMappedByRelationshipAttribute EOF ;
    public final void entryRuleOneToManyMappedByRelationshipAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:873:1: ( ruleOneToManyMappedByRelationshipAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:874:1: ruleOneToManyMappedByRelationshipAttribute EOF
            {
             before(grammarAccess.getOneToManyMappedByRelationshipAttributeRule()); 
            pushFollow(FOLLOW_ruleOneToManyMappedByRelationshipAttribute_in_entryRuleOneToManyMappedByRelationshipAttribute1802);
            ruleOneToManyMappedByRelationshipAttribute();

            state._fsp--;

             after(grammarAccess.getOneToManyMappedByRelationshipAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneToManyMappedByRelationshipAttribute1809); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOneToManyMappedByRelationshipAttribute"


    // $ANTLR start "ruleOneToManyMappedByRelationshipAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:881:1: ruleOneToManyMappedByRelationshipAttribute : ( ( rule__OneToManyMappedByRelationshipAttribute__Group__0 ) ) ;
    public final void ruleOneToManyMappedByRelationshipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:885:2: ( ( ( rule__OneToManyMappedByRelationshipAttribute__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:886:1: ( ( rule__OneToManyMappedByRelationshipAttribute__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:886:1: ( ( rule__OneToManyMappedByRelationshipAttribute__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:887:1: ( rule__OneToManyMappedByRelationshipAttribute__Group__0 )
            {
             before(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:888:1: ( rule__OneToManyMappedByRelationshipAttribute__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:888:2: rule__OneToManyMappedByRelationshipAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__0_in_ruleOneToManyMappedByRelationshipAttribute1835);
            rule__OneToManyMappedByRelationshipAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOneToManyMappedByRelationshipAttribute"


    // $ANTLR start "entryRuleManyToOneJoinColumnRelationShipAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:900:1: entryRuleManyToOneJoinColumnRelationShipAttribute : ruleManyToOneJoinColumnRelationShipAttribute EOF ;
    public final void entryRuleManyToOneJoinColumnRelationShipAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:901:1: ( ruleManyToOneJoinColumnRelationShipAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:902:1: ruleManyToOneJoinColumnRelationShipAttribute EOF
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeRule()); 
            pushFollow(FOLLOW_ruleManyToOneJoinColumnRelationShipAttribute_in_entryRuleManyToOneJoinColumnRelationShipAttribute1862);
            ruleManyToOneJoinColumnRelationShipAttribute();

            state._fsp--;

             after(grammarAccess.getManyToOneJoinColumnRelationShipAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleManyToOneJoinColumnRelationShipAttribute1869); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleManyToOneJoinColumnRelationShipAttribute"


    // $ANTLR start "ruleManyToOneJoinColumnRelationShipAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:909:1: ruleManyToOneJoinColumnRelationShipAttribute : ( ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__0 ) ) ;
    public final void ruleManyToOneJoinColumnRelationShipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:913:2: ( ( ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:914:1: ( ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:914:1: ( ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:915:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__0 )
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:916:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:916:2: rule__ManyToOneJoinColumnRelationShipAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__0_in_ruleManyToOneJoinColumnRelationShipAttribute1895);
            rule__ManyToOneJoinColumnRelationShipAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleManyToOneJoinColumnRelationShipAttribute"


    // $ANTLR start "entryRuleManyToOneJoinTableRelationShipAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:928:1: entryRuleManyToOneJoinTableRelationShipAttribute : ruleManyToOneJoinTableRelationShipAttribute EOF ;
    public final void entryRuleManyToOneJoinTableRelationShipAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:929:1: ( ruleManyToOneJoinTableRelationShipAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:930:1: ruleManyToOneJoinTableRelationShipAttribute EOF
            {
             before(grammarAccess.getManyToOneJoinTableRelationShipAttributeRule()); 
            pushFollow(FOLLOW_ruleManyToOneJoinTableRelationShipAttribute_in_entryRuleManyToOneJoinTableRelationShipAttribute1922);
            ruleManyToOneJoinTableRelationShipAttribute();

            state._fsp--;

             after(grammarAccess.getManyToOneJoinTableRelationShipAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleManyToOneJoinTableRelationShipAttribute1929); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleManyToOneJoinTableRelationShipAttribute"


    // $ANTLR start "ruleManyToOneJoinTableRelationShipAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:937:1: ruleManyToOneJoinTableRelationShipAttribute : ( ( rule__ManyToOneJoinTableRelationShipAttribute__Group__0 ) ) ;
    public final void ruleManyToOneJoinTableRelationShipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:941:2: ( ( ( rule__ManyToOneJoinTableRelationShipAttribute__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:942:1: ( ( rule__ManyToOneJoinTableRelationShipAttribute__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:942:1: ( ( rule__ManyToOneJoinTableRelationShipAttribute__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:943:1: ( rule__ManyToOneJoinTableRelationShipAttribute__Group__0 )
            {
             before(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:944:1: ( rule__ManyToOneJoinTableRelationShipAttribute__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:944:2: rule__ManyToOneJoinTableRelationShipAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__0_in_ruleManyToOneJoinTableRelationShipAttribute1955);
            rule__ManyToOneJoinTableRelationShipAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleManyToOneJoinTableRelationShipAttribute"


    // $ANTLR start "entryRuleManyToOneMappedByRelationShipAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:956:1: entryRuleManyToOneMappedByRelationShipAttribute : ruleManyToOneMappedByRelationShipAttribute EOF ;
    public final void entryRuleManyToOneMappedByRelationShipAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:957:1: ( ruleManyToOneMappedByRelationShipAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:958:1: ruleManyToOneMappedByRelationShipAttribute EOF
            {
             before(grammarAccess.getManyToOneMappedByRelationShipAttributeRule()); 
            pushFollow(FOLLOW_ruleManyToOneMappedByRelationShipAttribute_in_entryRuleManyToOneMappedByRelationShipAttribute1982);
            ruleManyToOneMappedByRelationShipAttribute();

            state._fsp--;

             after(grammarAccess.getManyToOneMappedByRelationShipAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleManyToOneMappedByRelationShipAttribute1989); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleManyToOneMappedByRelationShipAttribute"


    // $ANTLR start "ruleManyToOneMappedByRelationShipAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:965:1: ruleManyToOneMappedByRelationShipAttribute : ( ( rule__ManyToOneMappedByRelationShipAttribute__Group__0 ) ) ;
    public final void ruleManyToOneMappedByRelationShipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:969:2: ( ( ( rule__ManyToOneMappedByRelationShipAttribute__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:970:1: ( ( rule__ManyToOneMappedByRelationShipAttribute__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:970:1: ( ( rule__ManyToOneMappedByRelationShipAttribute__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:971:1: ( rule__ManyToOneMappedByRelationShipAttribute__Group__0 )
            {
             before(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:972:1: ( rule__ManyToOneMappedByRelationShipAttribute__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:972:2: rule__ManyToOneMappedByRelationShipAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__0_in_ruleManyToOneMappedByRelationShipAttribute2015);
            rule__ManyToOneMappedByRelationShipAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleManyToOneMappedByRelationShipAttribute"


    // $ANTLR start "entryRuleManyToManyRelationshipAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:984:1: entryRuleManyToManyRelationshipAttribute : ruleManyToManyRelationshipAttribute EOF ;
    public final void entryRuleManyToManyRelationshipAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:985:1: ( ruleManyToManyRelationshipAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:986:1: ruleManyToManyRelationshipAttribute EOF
            {
             before(grammarAccess.getManyToManyRelationshipAttributeRule()); 
            pushFollow(FOLLOW_ruleManyToManyRelationshipAttribute_in_entryRuleManyToManyRelationshipAttribute2042);
            ruleManyToManyRelationshipAttribute();

            state._fsp--;

             after(grammarAccess.getManyToManyRelationshipAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleManyToManyRelationshipAttribute2049); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleManyToManyRelationshipAttribute"


    // $ANTLR start "ruleManyToManyRelationshipAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:993:1: ruleManyToManyRelationshipAttribute : ( ( rule__ManyToManyRelationshipAttribute__Group__0 ) ) ;
    public final void ruleManyToManyRelationshipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:997:2: ( ( ( rule__ManyToManyRelationshipAttribute__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:998:1: ( ( rule__ManyToManyRelationshipAttribute__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:998:1: ( ( rule__ManyToManyRelationshipAttribute__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:999:1: ( rule__ManyToManyRelationshipAttribute__Group__0 )
            {
             before(grammarAccess.getManyToManyRelationshipAttributeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1000:1: ( rule__ManyToManyRelationshipAttribute__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1000:2: rule__ManyToManyRelationshipAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ManyToManyRelationshipAttribute__Group__0_in_ruleManyToManyRelationshipAttribute2075);
            rule__ManyToManyRelationshipAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getManyToManyRelationshipAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleManyToManyRelationshipAttribute"


    // $ANTLR start "entryRuleManyToManyMappedByRelationshipAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1012:1: entryRuleManyToManyMappedByRelationshipAttribute : ruleManyToManyMappedByRelationshipAttribute EOF ;
    public final void entryRuleManyToManyMappedByRelationshipAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1013:1: ( ruleManyToManyMappedByRelationshipAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1014:1: ruleManyToManyMappedByRelationshipAttribute EOF
            {
             before(grammarAccess.getManyToManyMappedByRelationshipAttributeRule()); 
            pushFollow(FOLLOW_ruleManyToManyMappedByRelationshipAttribute_in_entryRuleManyToManyMappedByRelationshipAttribute2102);
            ruleManyToManyMappedByRelationshipAttribute();

            state._fsp--;

             after(grammarAccess.getManyToManyMappedByRelationshipAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleManyToManyMappedByRelationshipAttribute2109); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleManyToManyMappedByRelationshipAttribute"


    // $ANTLR start "ruleManyToManyMappedByRelationshipAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1021:1: ruleManyToManyMappedByRelationshipAttribute : ( ( rule__ManyToManyMappedByRelationshipAttribute__Group__0 ) ) ;
    public final void ruleManyToManyMappedByRelationshipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1025:2: ( ( ( rule__ManyToManyMappedByRelationshipAttribute__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1026:1: ( ( rule__ManyToManyMappedByRelationshipAttribute__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1026:1: ( ( rule__ManyToManyMappedByRelationshipAttribute__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1027:1: ( rule__ManyToManyMappedByRelationshipAttribute__Group__0 )
            {
             before(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1028:1: ( rule__ManyToManyMappedByRelationshipAttribute__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1028:2: rule__ManyToManyMappedByRelationshipAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__0_in_ruleManyToManyMappedByRelationshipAttribute2135);
            rule__ManyToManyMappedByRelationshipAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleManyToManyMappedByRelationshipAttribute"


    // $ANTLR start "entryRuleReference"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1040:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1041:1: ( ruleReference EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1042:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference2162);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference2169); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1049:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1053:2: ( ( ( rule__Reference__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1054:1: ( ( rule__Reference__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1054:1: ( ( rule__Reference__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1055:1: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1056:1: ( rule__Reference__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1056:2: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_rule__Reference__Group__0_in_ruleReference2195);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleOperation"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1068:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1069:1: ( ruleOperation EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1070:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation2222);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation2229); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1077:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1081:2: ( ( ( rule__Operation__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1082:1: ( ( rule__Operation__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1082:1: ( ( rule__Operation__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1083:1: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1084:1: ( rule__Operation__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1084:2: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_rule__Operation__Group__0_in_ruleOperation2255);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleParameter"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1096:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1097:1: ( ruleParameter EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1098:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter2282);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter2289); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1105:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1109:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1110:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1110:1: ( ( rule__Parameter__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1111:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1112:1: ( rule__Parameter__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1112:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter2315);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleTypeRef"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1126:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1127:1: ( ruleTypeRef EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1128:1: ruleTypeRef EOF
            {
             before(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef2344);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getTypeRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef2351); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1135:1: ruleTypeRef : ( ( rule__TypeRef__Group__0 ) ) ;
    public final void ruleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1139:2: ( ( ( rule__TypeRef__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1140:1: ( ( rule__TypeRef__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1140:1: ( ( rule__TypeRef__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1141:1: ( rule__TypeRef__Group__0 )
            {
             before(grammarAccess.getTypeRefAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1142:1: ( rule__TypeRef__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1142:2: rule__TypeRef__Group__0
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef2377);
            rule__TypeRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1154:1: entryRuleQualifiedNameWithWildCard : ruleQualifiedNameWithWildCard EOF ;
    public final void entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1155:1: ( ruleQualifiedNameWithWildCard EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1156:1: ruleQualifiedNameWithWildCard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard2404);
            ruleQualifiedNameWithWildCard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildCardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard2411); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1163:1: ruleQualifiedNameWithWildCard : ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1167:2: ( ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1168:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1168:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1169:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1170:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1170:2: rule__QualifiedNameWithWildCard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard2437);
            rule__QualifiedNameWithWildCard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRuleQualifiedName"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1182:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1183:1: ( ruleQualifiedName EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1184:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2464);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2471); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1191:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1195:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1196:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1196:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1197:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1198:1: ( rule__QualifiedName__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1198:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName2497);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleVisibility"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1211:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1215:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1216:1: ( ( rule__Visibility__Alternatives ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1216:1: ( ( rule__Visibility__Alternatives ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1217:1: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1218:1: ( rule__Visibility__Alternatives )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1218:2: rule__Visibility__Alternatives
            {
            pushFollow(FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility2534);
            rule__Visibility__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVisibilityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1229:1: rule__AbstractElement__Alternatives : ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) | ( ruleRelationshipAttribute ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1233:1: ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) | ( ruleRelationshipAttribute ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 18:
            case 20:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1234:1: ( rulePackageDeclaration )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1234:1: ( rulePackageDeclaration )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1235:1: rulePackageDeclaration
                    {
                     before(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePackageDeclaration_in_rule__AbstractElement__Alternatives2569);
                    rulePackageDeclaration();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1240:6: ( ruleType )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1240:6: ( ruleType )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1241:1: ruleType
                    {
                     before(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleType_in_rule__AbstractElement__Alternatives2586);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1246:6: ( ruleImport )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1246:6: ( ruleImport )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1247:1: ruleImport
                    {
                     before(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleImport_in_rule__AbstractElement__Alternatives2603);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1252:6: ( ruleRelationshipAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1252:6: ( ruleRelationshipAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1253:1: ruleRelationshipAttribute
                    {
                     before(grammarAccess.getAbstractElementAccess().getRelationshipAttributeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleRelationshipAttribute_in_rule__AbstractElement__Alternatives2620);
                    ruleRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getRelationshipAttributeParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1263:1: rule__Type__Alternatives : ( ( ruleEntity ) | ( ruleDataType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1267:1: ( ( ruleEntity ) | ( ruleDataType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1268:1: ( ruleEntity )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1268:1: ( ruleEntity )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1269:1: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Type__Alternatives2652);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1274:6: ( ruleDataType )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1274:6: ( ruleDataType )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1275:1: ruleDataType
                    {
                     before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDataType_in_rule__Type__Alternatives2669);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Identifier__Alternatives"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1285:1: rule__Identifier__Alternatives : ( ( ruleUniqueIdentiferColumn ) | ( ruleEmbeddedUniqueIdentifer ) );
    public final void rule__Identifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1289:1: ( ( ruleUniqueIdentiferColumn ) | ( ruleEmbeddedUniqueIdentifer ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            else if ( (LA4_0==25) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1290:1: ( ruleUniqueIdentiferColumn )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1290:1: ( ruleUniqueIdentiferColumn )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1291:1: ruleUniqueIdentiferColumn
                    {
                     before(grammarAccess.getIdentifierAccess().getUniqueIdentiferColumnParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUniqueIdentiferColumn_in_rule__Identifier__Alternatives2701);
                    ruleUniqueIdentiferColumn();

                    state._fsp--;

                     after(grammarAccess.getIdentifierAccess().getUniqueIdentiferColumnParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1296:6: ( ruleEmbeddedUniqueIdentifer )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1296:6: ( ruleEmbeddedUniqueIdentifer )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1297:1: ruleEmbeddedUniqueIdentifer
                    {
                     before(grammarAccess.getIdentifierAccess().getEmbeddedUniqueIdentiferParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEmbeddedUniqueIdentifer_in_rule__Identifier__Alternatives2718);
                    ruleEmbeddedUniqueIdentifer();

                    state._fsp--;

                     after(grammarAccess.getIdentifierAccess().getEmbeddedUniqueIdentiferParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Alternatives"


    // $ANTLR start "rule__Feature__Alternatives"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1307:1: rule__Feature__Alternatives : ( ( ruleStructuralFeature ) | ( ruleOperation ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1311:1: ( ( ruleStructuralFeature ) | ( ruleOperation ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||LA5_0==26||(LA5_0>=28 && LA5_0<=41)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=11 && LA5_0<=13)||LA5_0==43) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1312:1: ( ruleStructuralFeature )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1312:1: ( ruleStructuralFeature )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1313:1: ruleStructuralFeature
                    {
                     before(grammarAccess.getFeatureAccess().getStructuralFeatureParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStructuralFeature_in_rule__Feature__Alternatives2750);
                    ruleStructuralFeature();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getStructuralFeatureParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1318:6: ( ruleOperation )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1318:6: ( ruleOperation )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1319:1: ruleOperation
                    {
                     before(grammarAccess.getFeatureAccess().getOperationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOperation_in_rule__Feature__Alternatives2767);
                    ruleOperation();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getOperationParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Alternatives"


    // $ANTLR start "rule__StructuralFeature__Alternatives"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1329:1: rule__StructuralFeature__Alternatives : ( ( ruleAttribute ) | ( ruleReference ) );
    public final void rule__StructuralFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1333:1: ( ( ruleAttribute ) | ( ruleReference ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||LA6_0==26||(LA6_0>=28 && LA6_0<=40)) ) {
                alt6=1;
            }
            else if ( (LA6_0==41) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1334:1: ( ruleAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1334:1: ( ruleAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1335:1: ruleAttribute
                    {
                     before(grammarAccess.getStructuralFeatureAccess().getAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAttribute_in_rule__StructuralFeature__Alternatives2799);
                    ruleAttribute();

                    state._fsp--;

                     after(grammarAccess.getStructuralFeatureAccess().getAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1340:6: ( ruleReference )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1340:6: ( ruleReference )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1341:1: ruleReference
                    {
                     before(grammarAccess.getStructuralFeatureAccess().getReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleReference_in_rule__StructuralFeature__Alternatives2816);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getStructuralFeatureAccess().getReferenceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralFeature__Alternatives"


    // $ANTLR start "rule__Attribute__Alternatives"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1351:1: rule__Attribute__Alternatives : ( ( ruleInternalAttribute ) | ( ruleRelationshipAttribute ) | ( ruleStaticAttribute ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1355:1: ( ( ruleInternalAttribute ) | ( ruleRelationshipAttribute ) | ( ruleStaticAttribute ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 28:
            case 29:
            case 30:
                {
                alt7=1;
                }
                break;
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
                {
                alt7=2;
                }
                break;
            case 26:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1356:1: ( ruleInternalAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1356:1: ( ruleInternalAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1357:1: ruleInternalAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getInternalAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInternalAttribute_in_rule__Attribute__Alternatives2848);
                    ruleInternalAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getInternalAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1362:6: ( ruleRelationshipAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1362:6: ( ruleRelationshipAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1363:1: ruleRelationshipAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getRelationshipAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRelationshipAttribute_in_rule__Attribute__Alternatives2865);
                    ruleRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getRelationshipAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1368:6: ( ruleStaticAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1368:6: ( ruleStaticAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1369:1: ruleStaticAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getStaticAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStaticAttribute_in_rule__Attribute__Alternatives2882);
                    ruleStaticAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getStaticAttributeParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Alternatives"


    // $ANTLR start "rule__InternalAttribute__Alternatives"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1379:1: rule__InternalAttribute__Alternatives : ( ( ruleReadOnlyInternalAttribute ) | ( ruleUpdatableInternalAttribute ) | ( ruleTransientAttribute ) | ( ruleIdAttribute ) );
    public final void rule__InternalAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1383:1: ( ( ruleReadOnlyInternalAttribute ) | ( ruleUpdatableInternalAttribute ) | ( ruleTransientAttribute ) | ( ruleIdAttribute ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case 28:
                {
                alt8=2;
                }
                break;
            case 29:
                {
                alt8=3;
                }
                break;
            case 30:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1384:1: ( ruleReadOnlyInternalAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1384:1: ( ruleReadOnlyInternalAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1385:1: ruleReadOnlyInternalAttribute
                    {
                     before(grammarAccess.getInternalAttributeAccess().getReadOnlyInternalAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleReadOnlyInternalAttribute_in_rule__InternalAttribute__Alternatives2914);
                    ruleReadOnlyInternalAttribute();

                    state._fsp--;

                     after(grammarAccess.getInternalAttributeAccess().getReadOnlyInternalAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1390:6: ( ruleUpdatableInternalAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1390:6: ( ruleUpdatableInternalAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1391:1: ruleUpdatableInternalAttribute
                    {
                     before(grammarAccess.getInternalAttributeAccess().getUpdatableInternalAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUpdatableInternalAttribute_in_rule__InternalAttribute__Alternatives2931);
                    ruleUpdatableInternalAttribute();

                    state._fsp--;

                     after(grammarAccess.getInternalAttributeAccess().getUpdatableInternalAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1396:6: ( ruleTransientAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1396:6: ( ruleTransientAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1397:1: ruleTransientAttribute
                    {
                     before(grammarAccess.getInternalAttributeAccess().getTransientAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleTransientAttribute_in_rule__InternalAttribute__Alternatives2948);
                    ruleTransientAttribute();

                    state._fsp--;

                     after(grammarAccess.getInternalAttributeAccess().getTransientAttributeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1402:6: ( ruleIdAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1402:6: ( ruleIdAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1403:1: ruleIdAttribute
                    {
                     before(grammarAccess.getInternalAttributeAccess().getIdAttributeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleIdAttribute_in_rule__InternalAttribute__Alternatives2965);
                    ruleIdAttribute();

                    state._fsp--;

                     after(grammarAccess.getInternalAttributeAccess().getIdAttributeParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalAttribute__Alternatives"


    // $ANTLR start "rule__RelationshipAttribute__Alternatives"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1413:1: rule__RelationshipAttribute__Alternatives : ( ( ruleSingularRelationshipAttribute ) | ( ruleMultipleRelationshipAttribute ) );
    public final void rule__RelationshipAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1417:1: ( ( ruleSingularRelationshipAttribute ) | ( ruleMultipleRelationshipAttribute ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=31 && LA9_0<=32)||(LA9_0>=36 && LA9_0<=38)) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=33 && LA9_0<=35)||(LA9_0>=39 && LA9_0<=40)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1418:1: ( ruleSingularRelationshipAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1418:1: ( ruleSingularRelationshipAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1419:1: ruleSingularRelationshipAttribute
                    {
                     before(grammarAccess.getRelationshipAttributeAccess().getSingularRelationshipAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSingularRelationshipAttribute_in_rule__RelationshipAttribute__Alternatives2997);
                    ruleSingularRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getRelationshipAttributeAccess().getSingularRelationshipAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1424:6: ( ruleMultipleRelationshipAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1424:6: ( ruleMultipleRelationshipAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1425:1: ruleMultipleRelationshipAttribute
                    {
                     before(grammarAccess.getRelationshipAttributeAccess().getMultipleRelationshipAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMultipleRelationshipAttribute_in_rule__RelationshipAttribute__Alternatives3014);
                    ruleMultipleRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getRelationshipAttributeAccess().getMultipleRelationshipAttributeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipAttribute__Alternatives"


    // $ANTLR start "rule__SingularRelationshipAttribute__Alternatives"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1435:1: rule__SingularRelationshipAttribute__Alternatives : ( ( ruleOneToOneRelationshipAttribute ) | ( ruleOneToOneMappedByRelationshipAttribute ) | ( ruleManyToOneJoinColumnRelationShipAttribute ) | ( ruleManyToOneJoinTableRelationShipAttribute ) | ( ruleManyToOneMappedByRelationShipAttribute ) );
    public final void rule__SingularRelationshipAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1439:1: ( ( ruleOneToOneRelationshipAttribute ) | ( ruleOneToOneMappedByRelationshipAttribute ) | ( ruleManyToOneJoinColumnRelationShipAttribute ) | ( ruleManyToOneJoinTableRelationShipAttribute ) | ( ruleManyToOneMappedByRelationShipAttribute ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt10=1;
                }
                break;
            case 32:
                {
                alt10=2;
                }
                break;
            case 36:
                {
                alt10=3;
                }
                break;
            case 37:
                {
                alt10=4;
                }
                break;
            case 38:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1440:1: ( ruleOneToOneRelationshipAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1440:1: ( ruleOneToOneRelationshipAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1441:1: ruleOneToOneRelationshipAttribute
                    {
                     before(grammarAccess.getSingularRelationshipAttributeAccess().getOneToOneRelationshipAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleOneToOneRelationshipAttribute_in_rule__SingularRelationshipAttribute__Alternatives3046);
                    ruleOneToOneRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getSingularRelationshipAttributeAccess().getOneToOneRelationshipAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1446:6: ( ruleOneToOneMappedByRelationshipAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1446:6: ( ruleOneToOneMappedByRelationshipAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1447:1: ruleOneToOneMappedByRelationshipAttribute
                    {
                     before(grammarAccess.getSingularRelationshipAttributeAccess().getOneToOneMappedByRelationshipAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOneToOneMappedByRelationshipAttribute_in_rule__SingularRelationshipAttribute__Alternatives3063);
                    ruleOneToOneMappedByRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getSingularRelationshipAttributeAccess().getOneToOneMappedByRelationshipAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1452:6: ( ruleManyToOneJoinColumnRelationShipAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1452:6: ( ruleManyToOneJoinColumnRelationShipAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1453:1: ruleManyToOneJoinColumnRelationShipAttribute
                    {
                     before(grammarAccess.getSingularRelationshipAttributeAccess().getManyToOneJoinColumnRelationShipAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleManyToOneJoinColumnRelationShipAttribute_in_rule__SingularRelationshipAttribute__Alternatives3080);
                    ruleManyToOneJoinColumnRelationShipAttribute();

                    state._fsp--;

                     after(grammarAccess.getSingularRelationshipAttributeAccess().getManyToOneJoinColumnRelationShipAttributeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1458:6: ( ruleManyToOneJoinTableRelationShipAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1458:6: ( ruleManyToOneJoinTableRelationShipAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1459:1: ruleManyToOneJoinTableRelationShipAttribute
                    {
                     before(grammarAccess.getSingularRelationshipAttributeAccess().getManyToOneJoinTableRelationShipAttributeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleManyToOneJoinTableRelationShipAttribute_in_rule__SingularRelationshipAttribute__Alternatives3097);
                    ruleManyToOneJoinTableRelationShipAttribute();

                    state._fsp--;

                     after(grammarAccess.getSingularRelationshipAttributeAccess().getManyToOneJoinTableRelationShipAttributeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1464:6: ( ruleManyToOneMappedByRelationShipAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1464:6: ( ruleManyToOneMappedByRelationShipAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1465:1: ruleManyToOneMappedByRelationShipAttribute
                    {
                     before(grammarAccess.getSingularRelationshipAttributeAccess().getManyToOneMappedByRelationShipAttributeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleManyToOneMappedByRelationShipAttribute_in_rule__SingularRelationshipAttribute__Alternatives3114);
                    ruleManyToOneMappedByRelationShipAttribute();

                    state._fsp--;

                     after(grammarAccess.getSingularRelationshipAttributeAccess().getManyToOneMappedByRelationShipAttributeParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingularRelationshipAttribute__Alternatives"


    // $ANTLR start "rule__MultipleRelationshipAttribute__Alternatives"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1475:1: rule__MultipleRelationshipAttribute__Alternatives : ( ( ruleOneToManyJoinTableRelationshipAttribute ) | ( ruleOneToManyMappedByRelationshipAttribute ) | ( ruleManyToManyRelationshipAttribute ) | ( ruleManyToManyMappedByRelationshipAttribute ) | ( ruleOneToManyJoinColumnRelationshipAttribute ) );
    public final void rule__MultipleRelationshipAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1479:1: ( ( ruleOneToManyJoinTableRelationshipAttribute ) | ( ruleOneToManyMappedByRelationshipAttribute ) | ( ruleManyToManyRelationshipAttribute ) | ( ruleManyToManyMappedByRelationshipAttribute ) | ( ruleOneToManyJoinColumnRelationshipAttribute ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt11=1;
                }
                break;
            case 35:
                {
                alt11=2;
                }
                break;
            case 39:
                {
                alt11=3;
                }
                break;
            case 40:
                {
                alt11=4;
                }
                break;
            case 34:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1480:1: ( ruleOneToManyJoinTableRelationshipAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1480:1: ( ruleOneToManyJoinTableRelationshipAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1481:1: ruleOneToManyJoinTableRelationshipAttribute
                    {
                     before(grammarAccess.getMultipleRelationshipAttributeAccess().getOneToManyJoinTableRelationshipAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleOneToManyJoinTableRelationshipAttribute_in_rule__MultipleRelationshipAttribute__Alternatives3146);
                    ruleOneToManyJoinTableRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getMultipleRelationshipAttributeAccess().getOneToManyJoinTableRelationshipAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1486:6: ( ruleOneToManyMappedByRelationshipAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1486:6: ( ruleOneToManyMappedByRelationshipAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1487:1: ruleOneToManyMappedByRelationshipAttribute
                    {
                     before(grammarAccess.getMultipleRelationshipAttributeAccess().getOneToManyMappedByRelationshipAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOneToManyMappedByRelationshipAttribute_in_rule__MultipleRelationshipAttribute__Alternatives3163);
                    ruleOneToManyMappedByRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getMultipleRelationshipAttributeAccess().getOneToManyMappedByRelationshipAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1492:6: ( ruleManyToManyRelationshipAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1492:6: ( ruleManyToManyRelationshipAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1493:1: ruleManyToManyRelationshipAttribute
                    {
                     before(grammarAccess.getMultipleRelationshipAttributeAccess().getManyToManyRelationshipAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleManyToManyRelationshipAttribute_in_rule__MultipleRelationshipAttribute__Alternatives3180);
                    ruleManyToManyRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getMultipleRelationshipAttributeAccess().getManyToManyRelationshipAttributeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1498:6: ( ruleManyToManyMappedByRelationshipAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1498:6: ( ruleManyToManyMappedByRelationshipAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1499:1: ruleManyToManyMappedByRelationshipAttribute
                    {
                     before(grammarAccess.getMultipleRelationshipAttributeAccess().getManyToManyMappedByRelationshipAttributeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleManyToManyMappedByRelationshipAttribute_in_rule__MultipleRelationshipAttribute__Alternatives3197);
                    ruleManyToManyMappedByRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getMultipleRelationshipAttributeAccess().getManyToManyMappedByRelationshipAttributeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1504:6: ( ruleOneToManyJoinColumnRelationshipAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1504:6: ( ruleOneToManyJoinColumnRelationshipAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1505:1: ruleOneToManyJoinColumnRelationshipAttribute
                    {
                     before(grammarAccess.getMultipleRelationshipAttributeAccess().getOneToManyJoinColumnRelationshipAttributeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleOneToManyJoinColumnRelationshipAttribute_in_rule__MultipleRelationshipAttribute__Alternatives3214);
                    ruleOneToManyJoinColumnRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getMultipleRelationshipAttributeAccess().getOneToManyJoinColumnRelationshipAttributeParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleRelationshipAttribute__Alternatives"


    // $ANTLR start "rule__Visibility__Alternatives"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1516:1: rule__Visibility__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1520:1: ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt12=1;
                }
                break;
            case 12:
                {
                alt12=2;
                }
                break;
            case 13:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1521:1: ( ( 'public' ) )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1521:1: ( ( 'public' ) )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1522:1: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1523:1: ( 'public' )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1523:3: 'public'
                    {
                    match(input,11,FOLLOW_11_in_rule__Visibility__Alternatives3248); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1528:6: ( ( 'private' ) )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1528:6: ( ( 'private' ) )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1529:1: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_1()); 
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1530:1: ( 'private' )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1530:3: 'private'
                    {
                    match(input,12,FOLLOW_12_in_rule__Visibility__Alternatives3269); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1535:6: ( ( 'protected' ) )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1535:6: ( ( 'protected' ) )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1536:1: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2()); 
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1537:1: ( 'protected' )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1537:3: 'protected'
                    {
                    match(input,13,FOLLOW_13_in_rule__Visibility__Alternatives3290); 

                    }

                     after(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visibility__Alternatives"


    // $ANTLR start "rule__Import__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1549:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1553:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1554:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03323);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03326);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1561:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1565:1: ( ( 'import' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1566:1: ( 'import' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1566:1: ( 'import' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1567:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Import__Group__0__Impl3354); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1580:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1584:1: ( rule__Import__Group__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1585:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13385);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1591:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1595:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1596:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1596:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1597:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1598:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1598:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl3412);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1612:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1616:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1617:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__03446);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__03449);
            rule__PackageDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0"


    // $ANTLR start "rule__PackageDeclaration__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1624:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1628:1: ( ( 'package' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1629:1: ( 'package' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1629:1: ( 'package' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1630:1: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__PackageDeclaration__Group__0__Impl3477); 
             after(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1643:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1647:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1648:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__13508);
            rule__PackageDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__13511);
            rule__PackageDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1"


    // $ANTLR start "rule__PackageDeclaration__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1655:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1659:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1660:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1660:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1661:1: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1662:1: ( rule__PackageDeclaration__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1662:2: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl3538);
            rule__PackageDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__2"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1672:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1676:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1677:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__23568);
            rule__PackageDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__23571);
            rule__PackageDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__2"


    // $ANTLR start "rule__PackageDeclaration__Group__2__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1684:1: rule__PackageDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1688:1: ( ( '{' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1689:1: ( '{' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1689:1: ( '{' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1690:1: '{'
            {
             before(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__PackageDeclaration__Group__2__Impl3599); 
             after(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__2__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1703:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1707:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1708:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__33630);
            rule__PackageDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__33633);
            rule__PackageDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__3"


    // $ANTLR start "rule__PackageDeclaration__Group__3__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1715:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__DatabaseModesAssignment_3 )* ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1719:1: ( ( ( rule__PackageDeclaration__DatabaseModesAssignment_3 )* ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1720:1: ( ( rule__PackageDeclaration__DatabaseModesAssignment_3 )* )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1720:1: ( ( rule__PackageDeclaration__DatabaseModesAssignment_3 )* )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1721:1: ( rule__PackageDeclaration__DatabaseModesAssignment_3 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getDatabaseModesAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1722:1: ( rule__PackageDeclaration__DatabaseModesAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1722:2: rule__PackageDeclaration__DatabaseModesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__PackageDeclaration__DatabaseModesAssignment_3_in_rule__PackageDeclaration__Group__3__Impl3660);
            	    rule__PackageDeclaration__DatabaseModesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getPackageDeclarationAccess().getDatabaseModesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__3__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__4"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1732:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1736:1: ( rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1737:2: rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__43691);
            rule__PackageDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__5_in_rule__PackageDeclaration__Group__43694);
            rule__PackageDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__4"


    // $ANTLR start "rule__PackageDeclaration__Group__4__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1744:1: rule__PackageDeclaration__Group__4__Impl : ( ( rule__PackageDeclaration__ElementsAssignment_4 )* ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1748:1: ( ( ( rule__PackageDeclaration__ElementsAssignment_4 )* ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1749:1: ( ( rule__PackageDeclaration__ElementsAssignment_4 )* )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1749:1: ( ( rule__PackageDeclaration__ElementsAssignment_4 )* )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1750:1: ( rule__PackageDeclaration__ElementsAssignment_4 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_4()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1751:1: ( rule__PackageDeclaration__ElementsAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=14 && LA14_0<=15)||LA14_0==18||LA14_0==20||(LA14_0>=31 && LA14_0<=40)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1751:2: rule__PackageDeclaration__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__PackageDeclaration__ElementsAssignment_4_in_rule__PackageDeclaration__Group__4__Impl3721);
            	    rule__PackageDeclaration__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__4__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__5"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1761:1: rule__PackageDeclaration__Group__5 : rule__PackageDeclaration__Group__5__Impl ;
    public final void rule__PackageDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1765:1: ( rule__PackageDeclaration__Group__5__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1766:2: rule__PackageDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__5__Impl_in_rule__PackageDeclaration__Group__53752);
            rule__PackageDeclaration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__5"


    // $ANTLR start "rule__PackageDeclaration__Group__5__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1772:1: rule__PackageDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__PackageDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1776:1: ( ( '}' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1777:1: ( '}' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1777:1: ( '}' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1778:1: '}'
            {
             before(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_17_in_rule__PackageDeclaration__Group__5__Impl3780); 
             after(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__5__Impl"


    // $ANTLR start "rule__DataType__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1803:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1807:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1808:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__03823);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__03826);
            rule__DataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1815:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1819:1: ( ( 'datatype' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1820:1: ( 'datatype' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1820:1: ( 'datatype' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1821:1: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__DataType__Group__0__Impl3854); 
             after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1834:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1838:1: ( rule__DataType__Group__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1839:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__13885);
            rule__DataType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1845:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1849:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1850:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1850:1: ( ( rule__DataType__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1851:1: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1852:1: ( rule__DataType__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1852:2: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl3912);
            rule__DataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__DatabaseMode__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1866:1: rule__DatabaseMode__Group__0 : rule__DatabaseMode__Group__0__Impl rule__DatabaseMode__Group__1 ;
    public final void rule__DatabaseMode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1870:1: ( rule__DatabaseMode__Group__0__Impl rule__DatabaseMode__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1871:2: rule__DatabaseMode__Group__0__Impl rule__DatabaseMode__Group__1
            {
            pushFollow(FOLLOW_rule__DatabaseMode__Group__0__Impl_in_rule__DatabaseMode__Group__03946);
            rule__DatabaseMode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DatabaseMode__Group__1_in_rule__DatabaseMode__Group__03949);
            rule__DatabaseMode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseMode__Group__0"


    // $ANTLR start "rule__DatabaseMode__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1878:1: rule__DatabaseMode__Group__0__Impl : ( 'databaseMode' ) ;
    public final void rule__DatabaseMode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1882:1: ( ( 'databaseMode' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1883:1: ( 'databaseMode' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1883:1: ( 'databaseMode' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1884:1: 'databaseMode'
            {
             before(grammarAccess.getDatabaseModeAccess().getDatabaseModeKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__DatabaseMode__Group__0__Impl3977); 
             after(grammarAccess.getDatabaseModeAccess().getDatabaseModeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseMode__Group__0__Impl"


    // $ANTLR start "rule__DatabaseMode__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1897:1: rule__DatabaseMode__Group__1 : rule__DatabaseMode__Group__1__Impl ;
    public final void rule__DatabaseMode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1901:1: ( rule__DatabaseMode__Group__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1902:2: rule__DatabaseMode__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DatabaseMode__Group__1__Impl_in_rule__DatabaseMode__Group__14008);
            rule__DatabaseMode__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseMode__Group__1"


    // $ANTLR start "rule__DatabaseMode__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1908:1: rule__DatabaseMode__Group__1__Impl : ( ( rule__DatabaseMode__NameAssignment_1 ) ) ;
    public final void rule__DatabaseMode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1912:1: ( ( ( rule__DatabaseMode__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1913:1: ( ( rule__DatabaseMode__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1913:1: ( ( rule__DatabaseMode__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1914:1: ( rule__DatabaseMode__NameAssignment_1 )
            {
             before(grammarAccess.getDatabaseModeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1915:1: ( rule__DatabaseMode__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1915:2: rule__DatabaseMode__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DatabaseMode__NameAssignment_1_in_rule__DatabaseMode__Group__1__Impl4035);
            rule__DatabaseMode__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseModeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseMode__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1929:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1933:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1934:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__04069);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__04072);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1941:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1945:1: ( ( 'entity' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1946:1: ( 'entity' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1946:1: ( 'entity' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1947:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Entity__Group__0__Impl4100); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1960:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1964:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1965:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__14131);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__14134);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1972:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1976:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1977:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1977:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1978:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1979:1: ( rule__Entity__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1979:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl4161);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1989:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1993:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1994:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__24191);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__24194);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2001:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__DatabaseVendorAssignment_2 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2005:1: ( ( ( rule__Entity__DatabaseVendorAssignment_2 )? ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2006:1: ( ( rule__Entity__DatabaseVendorAssignment_2 )? )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2006:1: ( ( rule__Entity__DatabaseVendorAssignment_2 )? )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2007:1: ( rule__Entity__DatabaseVendorAssignment_2 )?
            {
             before(grammarAccess.getEntityAccess().getDatabaseVendorAssignment_2()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2008:1: ( rule__Entity__DatabaseVendorAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2008:2: rule__Entity__DatabaseVendorAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Entity__DatabaseVendorAssignment_2_in_rule__Entity__Group__2__Impl4221);
                    rule__Entity__DatabaseVendorAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getDatabaseVendorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2018:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2022:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2023:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__34252);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__34255);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2030:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2034:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2035:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2035:1: ( ( rule__Entity__Group_3__0 )? )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2036:1: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2037:1: ( rule__Entity__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2037:2: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl4282);
                    rule__Entity__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2047:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2051:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2052:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__44313);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__44316);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2059:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__ReadOnlyAssignment_4 )? ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2063:1: ( ( ( rule__Entity__ReadOnlyAssignment_4 )? ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2064:1: ( ( rule__Entity__ReadOnlyAssignment_4 )? )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2064:1: ( ( rule__Entity__ReadOnlyAssignment_4 )? )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2065:1: ( rule__Entity__ReadOnlyAssignment_4 )?
            {
             before(grammarAccess.getEntityAccess().getReadOnlyAssignment_4()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2066:1: ( rule__Entity__ReadOnlyAssignment_4 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2066:2: rule__Entity__ReadOnlyAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Entity__ReadOnlyAssignment_4_in_rule__Entity__Group__4__Impl4343);
                    rule__Entity__ReadOnlyAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getReadOnlyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2076:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2080:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2081:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__54374);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__54377);
            rule__Entity__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2088:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__CacheableAssignment_5 )? ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2092:1: ( ( ( rule__Entity__CacheableAssignment_5 )? ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2093:1: ( ( rule__Entity__CacheableAssignment_5 )? )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2093:1: ( ( rule__Entity__CacheableAssignment_5 )? )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2094:1: ( rule__Entity__CacheableAssignment_5 )?
            {
             before(grammarAccess.getEntityAccess().getCacheableAssignment_5()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2095:1: ( rule__Entity__CacheableAssignment_5 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2095:2: rule__Entity__CacheableAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Entity__CacheableAssignment_5_in_rule__Entity__Group__5__Impl4404);
                    rule__Entity__CacheableAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getCacheableAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2105:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2109:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2110:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__64435);
            rule__Entity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__64438);
            rule__Entity__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2117:1: rule__Entity__Group__6__Impl : ( '{' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2121:1: ( ( '{' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2122:1: ( '{' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2122:1: ( '{' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2123:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_16_in_rule__Entity__Group__6__Impl4466); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group__7"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2136:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl rule__Entity__Group__8 ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2140:1: ( rule__Entity__Group__7__Impl rule__Entity__Group__8 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2141:2: rule__Entity__Group__7__Impl rule__Entity__Group__8
            {
            pushFollow(FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__74497);
            rule__Entity__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__74500);
            rule__Entity__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__7"


    // $ANTLR start "rule__Entity__Group__7__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2148:1: rule__Entity__Group__7__Impl : ( ( rule__Entity__IdentifierAssignment_7 ) ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2152:1: ( ( ( rule__Entity__IdentifierAssignment_7 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2153:1: ( ( rule__Entity__IdentifierAssignment_7 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2153:1: ( ( rule__Entity__IdentifierAssignment_7 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2154:1: ( rule__Entity__IdentifierAssignment_7 )
            {
             before(grammarAccess.getEntityAccess().getIdentifierAssignment_7()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2155:1: ( rule__Entity__IdentifierAssignment_7 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2155:2: rule__Entity__IdentifierAssignment_7
            {
            pushFollow(FOLLOW_rule__Entity__IdentifierAssignment_7_in_rule__Entity__Group__7__Impl4527);
            rule__Entity__IdentifierAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getIdentifierAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__7__Impl"


    // $ANTLR start "rule__Entity__Group__8"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2165:1: rule__Entity__Group__8 : rule__Entity__Group__8__Impl rule__Entity__Group__9 ;
    public final void rule__Entity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2169:1: ( rule__Entity__Group__8__Impl rule__Entity__Group__9 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2170:2: rule__Entity__Group__8__Impl rule__Entity__Group__9
            {
            pushFollow(FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__84557);
            rule__Entity__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__9_in_rule__Entity__Group__84560);
            rule__Entity__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__8"


    // $ANTLR start "rule__Entity__Group__8__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2177:1: rule__Entity__Group__8__Impl : ( ( rule__Entity__ImportsAssignment_8 )* ) ;
    public final void rule__Entity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2181:1: ( ( ( rule__Entity__ImportsAssignment_8 )* ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2182:1: ( ( rule__Entity__ImportsAssignment_8 )* )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2182:1: ( ( rule__Entity__ImportsAssignment_8 )* )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2183:1: ( rule__Entity__ImportsAssignment_8 )*
            {
             before(grammarAccess.getEntityAccess().getImportsAssignment_8()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2184:1: ( rule__Entity__ImportsAssignment_8 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==14) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2184:2: rule__Entity__ImportsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__Entity__ImportsAssignment_8_in_rule__Entity__Group__8__Impl4587);
            	    rule__Entity__ImportsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getImportsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__8__Impl"


    // $ANTLR start "rule__Entity__Group__9"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2194:1: rule__Entity__Group__9 : rule__Entity__Group__9__Impl rule__Entity__Group__10 ;
    public final void rule__Entity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2198:1: ( rule__Entity__Group__9__Impl rule__Entity__Group__10 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2199:2: rule__Entity__Group__9__Impl rule__Entity__Group__10
            {
            pushFollow(FOLLOW_rule__Entity__Group__9__Impl_in_rule__Entity__Group__94618);
            rule__Entity__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__10_in_rule__Entity__Group__94621);
            rule__Entity__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__9"


    // $ANTLR start "rule__Entity__Group__9__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2206:1: rule__Entity__Group__9__Impl : ( ( rule__Entity__FeaturesAssignment_9 )* ) ;
    public final void rule__Entity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2210:1: ( ( ( rule__Entity__FeaturesAssignment_9 )* ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2211:1: ( ( rule__Entity__FeaturesAssignment_9 )* )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2211:1: ( ( rule__Entity__FeaturesAssignment_9 )* )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2212:1: ( rule__Entity__FeaturesAssignment_9 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_9()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2213:1: ( rule__Entity__FeaturesAssignment_9 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||(LA20_0>=11 && LA20_0<=13)||LA20_0==26||(LA20_0>=28 && LA20_0<=41)||LA20_0==43) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2213:2: rule__Entity__FeaturesAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_9_in_rule__Entity__Group__9__Impl4648);
            	    rule__Entity__FeaturesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__9__Impl"


    // $ANTLR start "rule__Entity__Group__10"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2223:1: rule__Entity__Group__10 : rule__Entity__Group__10__Impl ;
    public final void rule__Entity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2227:1: ( rule__Entity__Group__10__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2228:2: rule__Entity__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__10__Impl_in_rule__Entity__Group__104679);
            rule__Entity__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__10"


    // $ANTLR start "rule__Entity__Group__10__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2234:1: rule__Entity__Group__10__Impl : ( '}' ) ;
    public final void rule__Entity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2238:1: ( ( '}' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2239:1: ( '}' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2239:1: ( '}' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2240:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_10()); 
            match(input,17,FOLLOW_17_in_rule__Entity__Group__10__Impl4707); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__10__Impl"


    // $ANTLR start "rule__Entity__Group_3__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2275:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2279:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2280:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__04760);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__04763);
            rule__Entity__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__0"


    // $ANTLR start "rule__Entity__Group_3__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2287:1: rule__Entity__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2291:1: ( ( 'extends' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2292:1: ( 'extends' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2292:1: ( 'extends' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2293:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__Entity__Group_3__0__Impl4791); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_3__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2306:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2310:1: ( rule__Entity__Group_3__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2311:2: rule__Entity__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__14822);
            rule__Entity__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__1"


    // $ANTLR start "rule__Entity__Group_3__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2317:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__SuperTypeAssignment_3_1 ) ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2321:1: ( ( ( rule__Entity__SuperTypeAssignment_3_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2322:1: ( ( rule__Entity__SuperTypeAssignment_3_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2322:1: ( ( rule__Entity__SuperTypeAssignment_3_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2323:1: ( rule__Entity__SuperTypeAssignment_3_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_3_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2324:1: ( rule__Entity__SuperTypeAssignment_3_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2324:2: rule__Entity__SuperTypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperTypeAssignment_3_1_in_rule__Entity__Group_3__1__Impl4849);
            rule__Entity__SuperTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__1__Impl"


    // $ANTLR start "rule__ReadOnly__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2338:1: rule__ReadOnly__Group__0 : rule__ReadOnly__Group__0__Impl rule__ReadOnly__Group__1 ;
    public final void rule__ReadOnly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2342:1: ( rule__ReadOnly__Group__0__Impl rule__ReadOnly__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2343:2: rule__ReadOnly__Group__0__Impl rule__ReadOnly__Group__1
            {
            pushFollow(FOLLOW_rule__ReadOnly__Group__0__Impl_in_rule__ReadOnly__Group__04883);
            rule__ReadOnly__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReadOnly__Group__1_in_rule__ReadOnly__Group__04886);
            rule__ReadOnly__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnly__Group__0"


    // $ANTLR start "rule__ReadOnly__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2350:1: rule__ReadOnly__Group__0__Impl : ( 'read only' ) ;
    public final void rule__ReadOnly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2354:1: ( ( 'read only' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2355:1: ( 'read only' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2355:1: ( 'read only' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2356:1: 'read only'
            {
             before(grammarAccess.getReadOnlyAccess().getReadOnlyKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__ReadOnly__Group__0__Impl4914); 
             after(grammarAccess.getReadOnlyAccess().getReadOnlyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnly__Group__0__Impl"


    // $ANTLR start "rule__ReadOnly__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2369:1: rule__ReadOnly__Group__1 : rule__ReadOnly__Group__1__Impl rule__ReadOnly__Group__2 ;
    public final void rule__ReadOnly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2373:1: ( rule__ReadOnly__Group__1__Impl rule__ReadOnly__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2374:2: rule__ReadOnly__Group__1__Impl rule__ReadOnly__Group__2
            {
            pushFollow(FOLLOW_rule__ReadOnly__Group__1__Impl_in_rule__ReadOnly__Group__14945);
            rule__ReadOnly__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReadOnly__Group__2_in_rule__ReadOnly__Group__14948);
            rule__ReadOnly__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnly__Group__1"


    // $ANTLR start "rule__ReadOnly__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2381:1: rule__ReadOnly__Group__1__Impl : ( ( rule__ReadOnly__TableNameAssignment_1 ) ) ;
    public final void rule__ReadOnly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2385:1: ( ( ( rule__ReadOnly__TableNameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2386:1: ( ( rule__ReadOnly__TableNameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2386:1: ( ( rule__ReadOnly__TableNameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2387:1: ( rule__ReadOnly__TableNameAssignment_1 )
            {
             before(grammarAccess.getReadOnlyAccess().getTableNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2388:1: ( rule__ReadOnly__TableNameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2388:2: rule__ReadOnly__TableNameAssignment_1
            {
            pushFollow(FOLLOW_rule__ReadOnly__TableNameAssignment_1_in_rule__ReadOnly__Group__1__Impl4975);
            rule__ReadOnly__TableNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReadOnlyAccess().getTableNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnly__Group__1__Impl"


    // $ANTLR start "rule__ReadOnly__Group__2"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2398:1: rule__ReadOnly__Group__2 : rule__ReadOnly__Group__2__Impl ;
    public final void rule__ReadOnly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2402:1: ( rule__ReadOnly__Group__2__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2403:2: rule__ReadOnly__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ReadOnly__Group__2__Impl_in_rule__ReadOnly__Group__25005);
            rule__ReadOnly__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnly__Group__2"


    // $ANTLR start "rule__ReadOnly__Group__2__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2409:1: rule__ReadOnly__Group__2__Impl : ( ( rule__ReadOnly__IdColumnAssignment_2 ) ) ;
    public final void rule__ReadOnly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2413:1: ( ( ( rule__ReadOnly__IdColumnAssignment_2 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2414:1: ( ( rule__ReadOnly__IdColumnAssignment_2 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2414:1: ( ( rule__ReadOnly__IdColumnAssignment_2 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2415:1: ( rule__ReadOnly__IdColumnAssignment_2 )
            {
             before(grammarAccess.getReadOnlyAccess().getIdColumnAssignment_2()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2416:1: ( rule__ReadOnly__IdColumnAssignment_2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2416:2: rule__ReadOnly__IdColumnAssignment_2
            {
            pushFollow(FOLLOW_rule__ReadOnly__IdColumnAssignment_2_in_rule__ReadOnly__Group__2__Impl5032);
            rule__ReadOnly__IdColumnAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReadOnlyAccess().getIdColumnAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnly__Group__2__Impl"


    // $ANTLR start "rule__Cacheable__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2432:1: rule__Cacheable__Group__0 : rule__Cacheable__Group__0__Impl rule__Cacheable__Group__1 ;
    public final void rule__Cacheable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2436:1: ( rule__Cacheable__Group__0__Impl rule__Cacheable__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2437:2: rule__Cacheable__Group__0__Impl rule__Cacheable__Group__1
            {
            pushFollow(FOLLOW_rule__Cacheable__Group__0__Impl_in_rule__Cacheable__Group__05068);
            rule__Cacheable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cacheable__Group__1_in_rule__Cacheable__Group__05071);
            rule__Cacheable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cacheable__Group__0"


    // $ANTLR start "rule__Cacheable__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2444:1: rule__Cacheable__Group__0__Impl : ( 'cacheable' ) ;
    public final void rule__Cacheable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2448:1: ( ( 'cacheable' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2449:1: ( 'cacheable' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2449:1: ( 'cacheable' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2450:1: 'cacheable'
            {
             before(grammarAccess.getCacheableAccess().getCacheableKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Cacheable__Group__0__Impl5099); 
             after(grammarAccess.getCacheableAccess().getCacheableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cacheable__Group__0__Impl"


    // $ANTLR start "rule__Cacheable__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2463:1: rule__Cacheable__Group__1 : rule__Cacheable__Group__1__Impl ;
    public final void rule__Cacheable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2467:1: ( rule__Cacheable__Group__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2468:2: rule__Cacheable__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Cacheable__Group__1__Impl_in_rule__Cacheable__Group__15130);
            rule__Cacheable__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cacheable__Group__1"


    // $ANTLR start "rule__Cacheable__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2474:1: rule__Cacheable__Group__1__Impl : ( () ) ;
    public final void rule__Cacheable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2478:1: ( ( () ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2479:1: ( () )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2479:1: ( () )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2480:1: ()
            {
             before(grammarAccess.getCacheableAccess().getCacheableAction_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2481:1: ()
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2483:1: 
            {
            }

             after(grammarAccess.getCacheableAccess().getCacheableAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cacheable__Group__1__Impl"


    // $ANTLR start "rule__UniqueIdentiferColumn__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2497:1: rule__UniqueIdentiferColumn__Group__0 : rule__UniqueIdentiferColumn__Group__0__Impl rule__UniqueIdentiferColumn__Group__1 ;
    public final void rule__UniqueIdentiferColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2501:1: ( rule__UniqueIdentiferColumn__Group__0__Impl rule__UniqueIdentiferColumn__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2502:2: rule__UniqueIdentiferColumn__Group__0__Impl rule__UniqueIdentiferColumn__Group__1
            {
            pushFollow(FOLLOW_rule__UniqueIdentiferColumn__Group__0__Impl_in_rule__UniqueIdentiferColumn__Group__05192);
            rule__UniqueIdentiferColumn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UniqueIdentiferColumn__Group__1_in_rule__UniqueIdentiferColumn__Group__05195);
            rule__UniqueIdentiferColumn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueIdentiferColumn__Group__0"


    // $ANTLR start "rule__UniqueIdentiferColumn__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2509:1: rule__UniqueIdentiferColumn__Group__0__Impl : ( 'unique id' ) ;
    public final void rule__UniqueIdentiferColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2513:1: ( ( 'unique id' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2514:1: ( 'unique id' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2514:1: ( 'unique id' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2515:1: 'unique id'
            {
             before(grammarAccess.getUniqueIdentiferColumnAccess().getUniqueIdKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__UniqueIdentiferColumn__Group__0__Impl5223); 
             after(grammarAccess.getUniqueIdentiferColumnAccess().getUniqueIdKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueIdentiferColumn__Group__0__Impl"


    // $ANTLR start "rule__UniqueIdentiferColumn__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2528:1: rule__UniqueIdentiferColumn__Group__1 : rule__UniqueIdentiferColumn__Group__1__Impl ;
    public final void rule__UniqueIdentiferColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2532:1: ( rule__UniqueIdentiferColumn__Group__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2533:2: rule__UniqueIdentiferColumn__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UniqueIdentiferColumn__Group__1__Impl_in_rule__UniqueIdentiferColumn__Group__15254);
            rule__UniqueIdentiferColumn__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueIdentiferColumn__Group__1"


    // $ANTLR start "rule__UniqueIdentiferColumn__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2539:1: rule__UniqueIdentiferColumn__Group__1__Impl : ( ( rule__UniqueIdentiferColumn__NameAssignment_1 ) ) ;
    public final void rule__UniqueIdentiferColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2543:1: ( ( ( rule__UniqueIdentiferColumn__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2544:1: ( ( rule__UniqueIdentiferColumn__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2544:1: ( ( rule__UniqueIdentiferColumn__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2545:1: ( rule__UniqueIdentiferColumn__NameAssignment_1 )
            {
             before(grammarAccess.getUniqueIdentiferColumnAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2546:1: ( rule__UniqueIdentiferColumn__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2546:2: rule__UniqueIdentiferColumn__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__UniqueIdentiferColumn__NameAssignment_1_in_rule__UniqueIdentiferColumn__Group__1__Impl5281);
            rule__UniqueIdentiferColumn__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUniqueIdentiferColumnAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueIdentiferColumn__Group__1__Impl"


    // $ANTLR start "rule__EmbeddedUniqueIdentifer__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2560:1: rule__EmbeddedUniqueIdentifer__Group__0 : rule__EmbeddedUniqueIdentifer__Group__0__Impl rule__EmbeddedUniqueIdentifer__Group__1 ;
    public final void rule__EmbeddedUniqueIdentifer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2564:1: ( rule__EmbeddedUniqueIdentifer__Group__0__Impl rule__EmbeddedUniqueIdentifer__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2565:2: rule__EmbeddedUniqueIdentifer__Group__0__Impl rule__EmbeddedUniqueIdentifer__Group__1
            {
            pushFollow(FOLLOW_rule__EmbeddedUniqueIdentifer__Group__0__Impl_in_rule__EmbeddedUniqueIdentifer__Group__05315);
            rule__EmbeddedUniqueIdentifer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EmbeddedUniqueIdentifer__Group__1_in_rule__EmbeddedUniqueIdentifer__Group__05318);
            rule__EmbeddedUniqueIdentifer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmbeddedUniqueIdentifer__Group__0"


    // $ANTLR start "rule__EmbeddedUniqueIdentifer__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2572:1: rule__EmbeddedUniqueIdentifer__Group__0__Impl : ( 'embedded id' ) ;
    public final void rule__EmbeddedUniqueIdentifer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2576:1: ( ( 'embedded id' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2577:1: ( 'embedded id' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2577:1: ( 'embedded id' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2578:1: 'embedded id'
            {
             before(grammarAccess.getEmbeddedUniqueIdentiferAccess().getEmbeddedIdKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__EmbeddedUniqueIdentifer__Group__0__Impl5346); 
             after(grammarAccess.getEmbeddedUniqueIdentiferAccess().getEmbeddedIdKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmbeddedUniqueIdentifer__Group__0__Impl"


    // $ANTLR start "rule__EmbeddedUniqueIdentifer__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2591:1: rule__EmbeddedUniqueIdentifer__Group__1 : rule__EmbeddedUniqueIdentifer__Group__1__Impl ;
    public final void rule__EmbeddedUniqueIdentifer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2595:1: ( rule__EmbeddedUniqueIdentifer__Group__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2596:2: rule__EmbeddedUniqueIdentifer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EmbeddedUniqueIdentifer__Group__1__Impl_in_rule__EmbeddedUniqueIdentifer__Group__15377);
            rule__EmbeddedUniqueIdentifer__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmbeddedUniqueIdentifer__Group__1"


    // $ANTLR start "rule__EmbeddedUniqueIdentifer__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2602:1: rule__EmbeddedUniqueIdentifer__Group__1__Impl : ( ( rule__EmbeddedUniqueIdentifer__NameAssignment_1 ) ) ;
    public final void rule__EmbeddedUniqueIdentifer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2606:1: ( ( ( rule__EmbeddedUniqueIdentifer__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2607:1: ( ( rule__EmbeddedUniqueIdentifer__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2607:1: ( ( rule__EmbeddedUniqueIdentifer__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2608:1: ( rule__EmbeddedUniqueIdentifer__NameAssignment_1 )
            {
             before(grammarAccess.getEmbeddedUniqueIdentiferAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2609:1: ( rule__EmbeddedUniqueIdentifer__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2609:2: rule__EmbeddedUniqueIdentifer__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EmbeddedUniqueIdentifer__NameAssignment_1_in_rule__EmbeddedUniqueIdentifer__Group__1__Impl5404);
            rule__EmbeddedUniqueIdentifer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEmbeddedUniqueIdentiferAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmbeddedUniqueIdentifer__Group__1__Impl"


    // $ANTLR start "rule__StaticAttribute__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2623:1: rule__StaticAttribute__Group__0 : rule__StaticAttribute__Group__0__Impl rule__StaticAttribute__Group__1 ;
    public final void rule__StaticAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2627:1: ( rule__StaticAttribute__Group__0__Impl rule__StaticAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2628:2: rule__StaticAttribute__Group__0__Impl rule__StaticAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__StaticAttribute__Group__0__Impl_in_rule__StaticAttribute__Group__05438);
            rule__StaticAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StaticAttribute__Group__1_in_rule__StaticAttribute__Group__05441);
            rule__StaticAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticAttribute__Group__0"


    // $ANTLR start "rule__StaticAttribute__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2635:1: rule__StaticAttribute__Group__0__Impl : ( 'staticAttribute' ) ;
    public final void rule__StaticAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2639:1: ( ( 'staticAttribute' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2640:1: ( 'staticAttribute' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2640:1: ( 'staticAttribute' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2641:1: 'staticAttribute'
            {
             before(grammarAccess.getStaticAttributeAccess().getStaticAttributeKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__StaticAttribute__Group__0__Impl5469); 
             after(grammarAccess.getStaticAttributeAccess().getStaticAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticAttribute__Group__0__Impl"


    // $ANTLR start "rule__StaticAttribute__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2654:1: rule__StaticAttribute__Group__1 : rule__StaticAttribute__Group__1__Impl rule__StaticAttribute__Group__2 ;
    public final void rule__StaticAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2658:1: ( rule__StaticAttribute__Group__1__Impl rule__StaticAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2659:2: rule__StaticAttribute__Group__1__Impl rule__StaticAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__StaticAttribute__Group__1__Impl_in_rule__StaticAttribute__Group__15500);
            rule__StaticAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StaticAttribute__Group__2_in_rule__StaticAttribute__Group__15503);
            rule__StaticAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticAttribute__Group__1"


    // $ANTLR start "rule__StaticAttribute__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2666:1: rule__StaticAttribute__Group__1__Impl : ( ( rule__StaticAttribute__NameAssignment_1 ) ) ;
    public final void rule__StaticAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2670:1: ( ( ( rule__StaticAttribute__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2671:1: ( ( rule__StaticAttribute__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2671:1: ( ( rule__StaticAttribute__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2672:1: ( rule__StaticAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getStaticAttributeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2673:1: ( rule__StaticAttribute__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2673:2: rule__StaticAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StaticAttribute__NameAssignment_1_in_rule__StaticAttribute__Group__1__Impl5530);
            rule__StaticAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStaticAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticAttribute__Group__1__Impl"


    // $ANTLR start "rule__StaticAttribute__Group__2"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2683:1: rule__StaticAttribute__Group__2 : rule__StaticAttribute__Group__2__Impl rule__StaticAttribute__Group__3 ;
    public final void rule__StaticAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2687:1: ( rule__StaticAttribute__Group__2__Impl rule__StaticAttribute__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2688:2: rule__StaticAttribute__Group__2__Impl rule__StaticAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__StaticAttribute__Group__2__Impl_in_rule__StaticAttribute__Group__25560);
            rule__StaticAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StaticAttribute__Group__3_in_rule__StaticAttribute__Group__25563);
            rule__StaticAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticAttribute__Group__2"


    // $ANTLR start "rule__StaticAttribute__Group__2__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2695:1: rule__StaticAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__StaticAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2699:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2700:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2700:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2701:1: ':'
            {
             before(grammarAccess.getStaticAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__StaticAttribute__Group__2__Impl5591); 
             after(grammarAccess.getStaticAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticAttribute__Group__2__Impl"


    // $ANTLR start "rule__StaticAttribute__Group__3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2714:1: rule__StaticAttribute__Group__3 : rule__StaticAttribute__Group__3__Impl ;
    public final void rule__StaticAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2718:1: ( rule__StaticAttribute__Group__3__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2719:2: rule__StaticAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StaticAttribute__Group__3__Impl_in_rule__StaticAttribute__Group__35622);
            rule__StaticAttribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticAttribute__Group__3"


    // $ANTLR start "rule__StaticAttribute__Group__3__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2725:1: rule__StaticAttribute__Group__3__Impl : ( ( rule__StaticAttribute__TypeAssignment_3 ) ) ;
    public final void rule__StaticAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2729:1: ( ( ( rule__StaticAttribute__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2730:1: ( ( rule__StaticAttribute__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2730:1: ( ( rule__StaticAttribute__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2731:1: ( rule__StaticAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getStaticAttributeAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2732:1: ( rule__StaticAttribute__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2732:2: rule__StaticAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__StaticAttribute__TypeAssignment_3_in_rule__StaticAttribute__Group__3__Impl5649);
            rule__StaticAttribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStaticAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticAttribute__Group__3__Impl"


    // $ANTLR start "rule__ReadOnlyInternalAttribute__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2750:1: rule__ReadOnlyInternalAttribute__Group__0 : rule__ReadOnlyInternalAttribute__Group__0__Impl rule__ReadOnlyInternalAttribute__Group__1 ;
    public final void rule__ReadOnlyInternalAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2754:1: ( rule__ReadOnlyInternalAttribute__Group__0__Impl rule__ReadOnlyInternalAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2755:2: rule__ReadOnlyInternalAttribute__Group__0__Impl rule__ReadOnlyInternalAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ReadOnlyInternalAttribute__Group__0__Impl_in_rule__ReadOnlyInternalAttribute__Group__05687);
            rule__ReadOnlyInternalAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReadOnlyInternalAttribute__Group__1_in_rule__ReadOnlyInternalAttribute__Group__05690);
            rule__ReadOnlyInternalAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnlyInternalAttribute__Group__0"


    // $ANTLR start "rule__ReadOnlyInternalAttribute__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2762:1: rule__ReadOnlyInternalAttribute__Group__0__Impl : ( ( rule__ReadOnlyInternalAttribute__NameAssignment_0 ) ) ;
    public final void rule__ReadOnlyInternalAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2766:1: ( ( ( rule__ReadOnlyInternalAttribute__NameAssignment_0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2767:1: ( ( rule__ReadOnlyInternalAttribute__NameAssignment_0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2767:1: ( ( rule__ReadOnlyInternalAttribute__NameAssignment_0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2768:1: ( rule__ReadOnlyInternalAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getReadOnlyInternalAttributeAccess().getNameAssignment_0()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2769:1: ( rule__ReadOnlyInternalAttribute__NameAssignment_0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2769:2: rule__ReadOnlyInternalAttribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ReadOnlyInternalAttribute__NameAssignment_0_in_rule__ReadOnlyInternalAttribute__Group__0__Impl5717);
            rule__ReadOnlyInternalAttribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getReadOnlyInternalAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnlyInternalAttribute__Group__0__Impl"


    // $ANTLR start "rule__ReadOnlyInternalAttribute__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2779:1: rule__ReadOnlyInternalAttribute__Group__1 : rule__ReadOnlyInternalAttribute__Group__1__Impl rule__ReadOnlyInternalAttribute__Group__2 ;
    public final void rule__ReadOnlyInternalAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2783:1: ( rule__ReadOnlyInternalAttribute__Group__1__Impl rule__ReadOnlyInternalAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2784:2: rule__ReadOnlyInternalAttribute__Group__1__Impl rule__ReadOnlyInternalAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__ReadOnlyInternalAttribute__Group__1__Impl_in_rule__ReadOnlyInternalAttribute__Group__15747);
            rule__ReadOnlyInternalAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReadOnlyInternalAttribute__Group__2_in_rule__ReadOnlyInternalAttribute__Group__15750);
            rule__ReadOnlyInternalAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnlyInternalAttribute__Group__1"


    // $ANTLR start "rule__ReadOnlyInternalAttribute__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2791:1: rule__ReadOnlyInternalAttribute__Group__1__Impl : ( ':' ) ;
    public final void rule__ReadOnlyInternalAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2795:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2796:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2796:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2797:1: ':'
            {
             before(grammarAccess.getReadOnlyInternalAttributeAccess().getColonKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__ReadOnlyInternalAttribute__Group__1__Impl5778); 
             after(grammarAccess.getReadOnlyInternalAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnlyInternalAttribute__Group__1__Impl"


    // $ANTLR start "rule__ReadOnlyInternalAttribute__Group__2"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2810:1: rule__ReadOnlyInternalAttribute__Group__2 : rule__ReadOnlyInternalAttribute__Group__2__Impl ;
    public final void rule__ReadOnlyInternalAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2814:1: ( rule__ReadOnlyInternalAttribute__Group__2__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2815:2: rule__ReadOnlyInternalAttribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ReadOnlyInternalAttribute__Group__2__Impl_in_rule__ReadOnlyInternalAttribute__Group__25809);
            rule__ReadOnlyInternalAttribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnlyInternalAttribute__Group__2"


    // $ANTLR start "rule__ReadOnlyInternalAttribute__Group__2__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2821:1: rule__ReadOnlyInternalAttribute__Group__2__Impl : ( ( rule__ReadOnlyInternalAttribute__TypeAssignment_2 ) ) ;
    public final void rule__ReadOnlyInternalAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2825:1: ( ( ( rule__ReadOnlyInternalAttribute__TypeAssignment_2 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2826:1: ( ( rule__ReadOnlyInternalAttribute__TypeAssignment_2 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2826:1: ( ( rule__ReadOnlyInternalAttribute__TypeAssignment_2 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2827:1: ( rule__ReadOnlyInternalAttribute__TypeAssignment_2 )
            {
             before(grammarAccess.getReadOnlyInternalAttributeAccess().getTypeAssignment_2()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2828:1: ( rule__ReadOnlyInternalAttribute__TypeAssignment_2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2828:2: rule__ReadOnlyInternalAttribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__ReadOnlyInternalAttribute__TypeAssignment_2_in_rule__ReadOnlyInternalAttribute__Group__2__Impl5836);
            rule__ReadOnlyInternalAttribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReadOnlyInternalAttributeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnlyInternalAttribute__Group__2__Impl"


    // $ANTLR start "rule__UpdatableInternalAttribute__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2844:1: rule__UpdatableInternalAttribute__Group__0 : rule__UpdatableInternalAttribute__Group__0__Impl rule__UpdatableInternalAttribute__Group__1 ;
    public final void rule__UpdatableInternalAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2848:1: ( rule__UpdatableInternalAttribute__Group__0__Impl rule__UpdatableInternalAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2849:2: rule__UpdatableInternalAttribute__Group__0__Impl rule__UpdatableInternalAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__UpdatableInternalAttribute__Group__0__Impl_in_rule__UpdatableInternalAttribute__Group__05872);
            rule__UpdatableInternalAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UpdatableInternalAttribute__Group__1_in_rule__UpdatableInternalAttribute__Group__05875);
            rule__UpdatableInternalAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdatableInternalAttribute__Group__0"


    // $ANTLR start "rule__UpdatableInternalAttribute__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2856:1: rule__UpdatableInternalAttribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__UpdatableInternalAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2860:1: ( ( 'attribute' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2861:1: ( 'attribute' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2861:1: ( 'attribute' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2862:1: 'attribute'
            {
             before(grammarAccess.getUpdatableInternalAttributeAccess().getAttributeKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__UpdatableInternalAttribute__Group__0__Impl5903); 
             after(grammarAccess.getUpdatableInternalAttributeAccess().getAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdatableInternalAttribute__Group__0__Impl"


    // $ANTLR start "rule__UpdatableInternalAttribute__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2875:1: rule__UpdatableInternalAttribute__Group__1 : rule__UpdatableInternalAttribute__Group__1__Impl rule__UpdatableInternalAttribute__Group__2 ;
    public final void rule__UpdatableInternalAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2879:1: ( rule__UpdatableInternalAttribute__Group__1__Impl rule__UpdatableInternalAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2880:2: rule__UpdatableInternalAttribute__Group__1__Impl rule__UpdatableInternalAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__UpdatableInternalAttribute__Group__1__Impl_in_rule__UpdatableInternalAttribute__Group__15934);
            rule__UpdatableInternalAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UpdatableInternalAttribute__Group__2_in_rule__UpdatableInternalAttribute__Group__15937);
            rule__UpdatableInternalAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdatableInternalAttribute__Group__1"


    // $ANTLR start "rule__UpdatableInternalAttribute__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2887:1: rule__UpdatableInternalAttribute__Group__1__Impl : ( ( rule__UpdatableInternalAttribute__NameAssignment_1 ) ) ;
    public final void rule__UpdatableInternalAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2891:1: ( ( ( rule__UpdatableInternalAttribute__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2892:1: ( ( rule__UpdatableInternalAttribute__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2892:1: ( ( rule__UpdatableInternalAttribute__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2893:1: ( rule__UpdatableInternalAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getUpdatableInternalAttributeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2894:1: ( rule__UpdatableInternalAttribute__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2894:2: rule__UpdatableInternalAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__UpdatableInternalAttribute__NameAssignment_1_in_rule__UpdatableInternalAttribute__Group__1__Impl5964);
            rule__UpdatableInternalAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUpdatableInternalAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdatableInternalAttribute__Group__1__Impl"


    // $ANTLR start "rule__UpdatableInternalAttribute__Group__2"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2904:1: rule__UpdatableInternalAttribute__Group__2 : rule__UpdatableInternalAttribute__Group__2__Impl rule__UpdatableInternalAttribute__Group__3 ;
    public final void rule__UpdatableInternalAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2908:1: ( rule__UpdatableInternalAttribute__Group__2__Impl rule__UpdatableInternalAttribute__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2909:2: rule__UpdatableInternalAttribute__Group__2__Impl rule__UpdatableInternalAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__UpdatableInternalAttribute__Group__2__Impl_in_rule__UpdatableInternalAttribute__Group__25994);
            rule__UpdatableInternalAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UpdatableInternalAttribute__Group__3_in_rule__UpdatableInternalAttribute__Group__25997);
            rule__UpdatableInternalAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdatableInternalAttribute__Group__2"


    // $ANTLR start "rule__UpdatableInternalAttribute__Group__2__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2916:1: rule__UpdatableInternalAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__UpdatableInternalAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2920:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2921:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2921:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2922:1: ':'
            {
             before(grammarAccess.getUpdatableInternalAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__UpdatableInternalAttribute__Group__2__Impl6025); 
             after(grammarAccess.getUpdatableInternalAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdatableInternalAttribute__Group__2__Impl"


    // $ANTLR start "rule__UpdatableInternalAttribute__Group__3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2935:1: rule__UpdatableInternalAttribute__Group__3 : rule__UpdatableInternalAttribute__Group__3__Impl ;
    public final void rule__UpdatableInternalAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2939:1: ( rule__UpdatableInternalAttribute__Group__3__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2940:2: rule__UpdatableInternalAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UpdatableInternalAttribute__Group__3__Impl_in_rule__UpdatableInternalAttribute__Group__36056);
            rule__UpdatableInternalAttribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdatableInternalAttribute__Group__3"


    // $ANTLR start "rule__UpdatableInternalAttribute__Group__3__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2946:1: rule__UpdatableInternalAttribute__Group__3__Impl : ( ( rule__UpdatableInternalAttribute__TypeAssignment_3 ) ) ;
    public final void rule__UpdatableInternalAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2950:1: ( ( ( rule__UpdatableInternalAttribute__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2951:1: ( ( rule__UpdatableInternalAttribute__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2951:1: ( ( rule__UpdatableInternalAttribute__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2952:1: ( rule__UpdatableInternalAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getUpdatableInternalAttributeAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2953:1: ( rule__UpdatableInternalAttribute__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2953:2: rule__UpdatableInternalAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__UpdatableInternalAttribute__TypeAssignment_3_in_rule__UpdatableInternalAttribute__Group__3__Impl6083);
            rule__UpdatableInternalAttribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUpdatableInternalAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdatableInternalAttribute__Group__3__Impl"


    // $ANTLR start "rule__TransientAttribute__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2971:1: rule__TransientAttribute__Group__0 : rule__TransientAttribute__Group__0__Impl rule__TransientAttribute__Group__1 ;
    public final void rule__TransientAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2975:1: ( rule__TransientAttribute__Group__0__Impl rule__TransientAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2976:2: rule__TransientAttribute__Group__0__Impl rule__TransientAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__TransientAttribute__Group__0__Impl_in_rule__TransientAttribute__Group__06121);
            rule__TransientAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TransientAttribute__Group__1_in_rule__TransientAttribute__Group__06124);
            rule__TransientAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransientAttribute__Group__0"


    // $ANTLR start "rule__TransientAttribute__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2983:1: rule__TransientAttribute__Group__0__Impl : ( 'transient' ) ;
    public final void rule__TransientAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2987:1: ( ( 'transient' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2988:1: ( 'transient' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2988:1: ( 'transient' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2989:1: 'transient'
            {
             before(grammarAccess.getTransientAttributeAccess().getTransientKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__TransientAttribute__Group__0__Impl6152); 
             after(grammarAccess.getTransientAttributeAccess().getTransientKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransientAttribute__Group__0__Impl"


    // $ANTLR start "rule__TransientAttribute__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3002:1: rule__TransientAttribute__Group__1 : rule__TransientAttribute__Group__1__Impl rule__TransientAttribute__Group__2 ;
    public final void rule__TransientAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3006:1: ( rule__TransientAttribute__Group__1__Impl rule__TransientAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3007:2: rule__TransientAttribute__Group__1__Impl rule__TransientAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__TransientAttribute__Group__1__Impl_in_rule__TransientAttribute__Group__16183);
            rule__TransientAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TransientAttribute__Group__2_in_rule__TransientAttribute__Group__16186);
            rule__TransientAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransientAttribute__Group__1"


    // $ANTLR start "rule__TransientAttribute__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3014:1: rule__TransientAttribute__Group__1__Impl : ( ( rule__TransientAttribute__NameAssignment_1 ) ) ;
    public final void rule__TransientAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3018:1: ( ( ( rule__TransientAttribute__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3019:1: ( ( rule__TransientAttribute__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3019:1: ( ( rule__TransientAttribute__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3020:1: ( rule__TransientAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getTransientAttributeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3021:1: ( rule__TransientAttribute__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3021:2: rule__TransientAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TransientAttribute__NameAssignment_1_in_rule__TransientAttribute__Group__1__Impl6213);
            rule__TransientAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransientAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransientAttribute__Group__1__Impl"


    // $ANTLR start "rule__TransientAttribute__Group__2"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3031:1: rule__TransientAttribute__Group__2 : rule__TransientAttribute__Group__2__Impl rule__TransientAttribute__Group__3 ;
    public final void rule__TransientAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3035:1: ( rule__TransientAttribute__Group__2__Impl rule__TransientAttribute__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3036:2: rule__TransientAttribute__Group__2__Impl rule__TransientAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__TransientAttribute__Group__2__Impl_in_rule__TransientAttribute__Group__26243);
            rule__TransientAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TransientAttribute__Group__3_in_rule__TransientAttribute__Group__26246);
            rule__TransientAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransientAttribute__Group__2"


    // $ANTLR start "rule__TransientAttribute__Group__2__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3043:1: rule__TransientAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__TransientAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3047:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3048:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3048:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3049:1: ':'
            {
             before(grammarAccess.getTransientAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__TransientAttribute__Group__2__Impl6274); 
             after(grammarAccess.getTransientAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransientAttribute__Group__2__Impl"


    // $ANTLR start "rule__TransientAttribute__Group__3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3062:1: rule__TransientAttribute__Group__3 : rule__TransientAttribute__Group__3__Impl ;
    public final void rule__TransientAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3066:1: ( rule__TransientAttribute__Group__3__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3067:2: rule__TransientAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TransientAttribute__Group__3__Impl_in_rule__TransientAttribute__Group__36305);
            rule__TransientAttribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransientAttribute__Group__3"


    // $ANTLR start "rule__TransientAttribute__Group__3__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3073:1: rule__TransientAttribute__Group__3__Impl : ( ( rule__TransientAttribute__TypeAssignment_3 ) ) ;
    public final void rule__TransientAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3077:1: ( ( ( rule__TransientAttribute__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3078:1: ( ( rule__TransientAttribute__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3078:1: ( ( rule__TransientAttribute__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3079:1: ( rule__TransientAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getTransientAttributeAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3080:1: ( rule__TransientAttribute__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3080:2: rule__TransientAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__TransientAttribute__TypeAssignment_3_in_rule__TransientAttribute__Group__3__Impl6332);
            rule__TransientAttribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTransientAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransientAttribute__Group__3__Impl"


    // $ANTLR start "rule__IdAttribute__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3098:1: rule__IdAttribute__Group__0 : rule__IdAttribute__Group__0__Impl rule__IdAttribute__Group__1 ;
    public final void rule__IdAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3102:1: ( rule__IdAttribute__Group__0__Impl rule__IdAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3103:2: rule__IdAttribute__Group__0__Impl rule__IdAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__IdAttribute__Group__0__Impl_in_rule__IdAttribute__Group__06370);
            rule__IdAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IdAttribute__Group__1_in_rule__IdAttribute__Group__06373);
            rule__IdAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdAttribute__Group__0"


    // $ANTLR start "rule__IdAttribute__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3110:1: rule__IdAttribute__Group__0__Impl : ( 'id attribute' ) ;
    public final void rule__IdAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3114:1: ( ( 'id attribute' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3115:1: ( 'id attribute' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3115:1: ( 'id attribute' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3116:1: 'id attribute'
            {
             before(grammarAccess.getIdAttributeAccess().getIdAttributeKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__IdAttribute__Group__0__Impl6401); 
             after(grammarAccess.getIdAttributeAccess().getIdAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdAttribute__Group__0__Impl"


    // $ANTLR start "rule__IdAttribute__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3129:1: rule__IdAttribute__Group__1 : rule__IdAttribute__Group__1__Impl rule__IdAttribute__Group__2 ;
    public final void rule__IdAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3133:1: ( rule__IdAttribute__Group__1__Impl rule__IdAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3134:2: rule__IdAttribute__Group__1__Impl rule__IdAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__IdAttribute__Group__1__Impl_in_rule__IdAttribute__Group__16432);
            rule__IdAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IdAttribute__Group__2_in_rule__IdAttribute__Group__16435);
            rule__IdAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdAttribute__Group__1"


    // $ANTLR start "rule__IdAttribute__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3141:1: rule__IdAttribute__Group__1__Impl : ( ( rule__IdAttribute__NameAssignment_1 ) ) ;
    public final void rule__IdAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3145:1: ( ( ( rule__IdAttribute__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3146:1: ( ( rule__IdAttribute__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3146:1: ( ( rule__IdAttribute__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3147:1: ( rule__IdAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getIdAttributeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3148:1: ( rule__IdAttribute__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3148:2: rule__IdAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__IdAttribute__NameAssignment_1_in_rule__IdAttribute__Group__1__Impl6462);
            rule__IdAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIdAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdAttribute__Group__1__Impl"


    // $ANTLR start "rule__IdAttribute__Group__2"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3158:1: rule__IdAttribute__Group__2 : rule__IdAttribute__Group__2__Impl rule__IdAttribute__Group__3 ;
    public final void rule__IdAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3162:1: ( rule__IdAttribute__Group__2__Impl rule__IdAttribute__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3163:2: rule__IdAttribute__Group__2__Impl rule__IdAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__IdAttribute__Group__2__Impl_in_rule__IdAttribute__Group__26492);
            rule__IdAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IdAttribute__Group__3_in_rule__IdAttribute__Group__26495);
            rule__IdAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdAttribute__Group__2"


    // $ANTLR start "rule__IdAttribute__Group__2__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3170:1: rule__IdAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__IdAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3174:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3175:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3175:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3176:1: ':'
            {
             before(grammarAccess.getIdAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__IdAttribute__Group__2__Impl6523); 
             after(grammarAccess.getIdAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdAttribute__Group__2__Impl"


    // $ANTLR start "rule__IdAttribute__Group__3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3189:1: rule__IdAttribute__Group__3 : rule__IdAttribute__Group__3__Impl ;
    public final void rule__IdAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3193:1: ( rule__IdAttribute__Group__3__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3194:2: rule__IdAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__IdAttribute__Group__3__Impl_in_rule__IdAttribute__Group__36554);
            rule__IdAttribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdAttribute__Group__3"


    // $ANTLR start "rule__IdAttribute__Group__3__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3200:1: rule__IdAttribute__Group__3__Impl : ( ( rule__IdAttribute__TypeAssignment_3 ) ) ;
    public final void rule__IdAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3204:1: ( ( ( rule__IdAttribute__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3205:1: ( ( rule__IdAttribute__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3205:1: ( ( rule__IdAttribute__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3206:1: ( rule__IdAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getIdAttributeAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3207:1: ( rule__IdAttribute__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3207:2: rule__IdAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__IdAttribute__TypeAssignment_3_in_rule__IdAttribute__Group__3__Impl6581);
            rule__IdAttribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIdAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdAttribute__Group__3__Impl"


    // $ANTLR start "rule__OneToOneRelationshipAttribute__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3225:1: rule__OneToOneRelationshipAttribute__Group__0 : rule__OneToOneRelationshipAttribute__Group__0__Impl rule__OneToOneRelationshipAttribute__Group__1 ;
    public final void rule__OneToOneRelationshipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3229:1: ( rule__OneToOneRelationshipAttribute__Group__0__Impl rule__OneToOneRelationshipAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3230:2: rule__OneToOneRelationshipAttribute__Group__0__Impl rule__OneToOneRelationshipAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__OneToOneRelationshipAttribute__Group__0__Impl_in_rule__OneToOneRelationshipAttribute__Group__06619);
            rule__OneToOneRelationshipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToOneRelationshipAttribute__Group__1_in_rule__OneToOneRelationshipAttribute__Group__06622);
            rule__OneToOneRelationshipAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneRelationshipAttribute__Group__0"


    // $ANTLR start "rule__OneToOneRelationshipAttribute__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3237:1: rule__OneToOneRelationshipAttribute__Group__0__Impl : ( 'one to one join column' ) ;
    public final void rule__OneToOneRelationshipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3241:1: ( ( 'one to one join column' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3242:1: ( 'one to one join column' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3242:1: ( 'one to one join column' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3243:1: 'one to one join column'
            {
             before(grammarAccess.getOneToOneRelationshipAttributeAccess().getOneToOneJoinColumnKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__OneToOneRelationshipAttribute__Group__0__Impl6650); 
             after(grammarAccess.getOneToOneRelationshipAttributeAccess().getOneToOneJoinColumnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneRelationshipAttribute__Group__0__Impl"


    // $ANTLR start "rule__OneToOneRelationshipAttribute__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3256:1: rule__OneToOneRelationshipAttribute__Group__1 : rule__OneToOneRelationshipAttribute__Group__1__Impl rule__OneToOneRelationshipAttribute__Group__2 ;
    public final void rule__OneToOneRelationshipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3260:1: ( rule__OneToOneRelationshipAttribute__Group__1__Impl rule__OneToOneRelationshipAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3261:2: rule__OneToOneRelationshipAttribute__Group__1__Impl rule__OneToOneRelationshipAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__OneToOneRelationshipAttribute__Group__1__Impl_in_rule__OneToOneRelationshipAttribute__Group__16681);
            rule__OneToOneRelationshipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToOneRelationshipAttribute__Group__2_in_rule__OneToOneRelationshipAttribute__Group__16684);
            rule__OneToOneRelationshipAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneRelationshipAttribute__Group__1"


    // $ANTLR start "rule__OneToOneRelationshipAttribute__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3268:1: rule__OneToOneRelationshipAttribute__Group__1__Impl : ( ( rule__OneToOneRelationshipAttribute__NameAssignment_1 ) ) ;
    public final void rule__OneToOneRelationshipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3272:1: ( ( ( rule__OneToOneRelationshipAttribute__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3273:1: ( ( rule__OneToOneRelationshipAttribute__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3273:1: ( ( rule__OneToOneRelationshipAttribute__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3274:1: ( rule__OneToOneRelationshipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getOneToOneRelationshipAttributeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3275:1: ( rule__OneToOneRelationshipAttribute__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3275:2: rule__OneToOneRelationshipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__OneToOneRelationshipAttribute__NameAssignment_1_in_rule__OneToOneRelationshipAttribute__Group__1__Impl6711);
            rule__OneToOneRelationshipAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOneToOneRelationshipAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneRelationshipAttribute__Group__1__Impl"


    // $ANTLR start "rule__OneToOneRelationshipAttribute__Group__2"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3285:1: rule__OneToOneRelationshipAttribute__Group__2 : rule__OneToOneRelationshipAttribute__Group__2__Impl rule__OneToOneRelationshipAttribute__Group__3 ;
    public final void rule__OneToOneRelationshipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3289:1: ( rule__OneToOneRelationshipAttribute__Group__2__Impl rule__OneToOneRelationshipAttribute__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3290:2: rule__OneToOneRelationshipAttribute__Group__2__Impl rule__OneToOneRelationshipAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__OneToOneRelationshipAttribute__Group__2__Impl_in_rule__OneToOneRelationshipAttribute__Group__26741);
            rule__OneToOneRelationshipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToOneRelationshipAttribute__Group__3_in_rule__OneToOneRelationshipAttribute__Group__26744);
            rule__OneToOneRelationshipAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneRelationshipAttribute__Group__2"


    // $ANTLR start "rule__OneToOneRelationshipAttribute__Group__2__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3297:1: rule__OneToOneRelationshipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__OneToOneRelationshipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3301:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3302:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3302:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3303:1: ':'
            {
             before(grammarAccess.getOneToOneRelationshipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__OneToOneRelationshipAttribute__Group__2__Impl6772); 
             after(grammarAccess.getOneToOneRelationshipAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneRelationshipAttribute__Group__2__Impl"


    // $ANTLR start "rule__OneToOneRelationshipAttribute__Group__3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3316:1: rule__OneToOneRelationshipAttribute__Group__3 : rule__OneToOneRelationshipAttribute__Group__3__Impl rule__OneToOneRelationshipAttribute__Group__4 ;
    public final void rule__OneToOneRelationshipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3320:1: ( rule__OneToOneRelationshipAttribute__Group__3__Impl rule__OneToOneRelationshipAttribute__Group__4 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3321:2: rule__OneToOneRelationshipAttribute__Group__3__Impl rule__OneToOneRelationshipAttribute__Group__4
            {
            pushFollow(FOLLOW_rule__OneToOneRelationshipAttribute__Group__3__Impl_in_rule__OneToOneRelationshipAttribute__Group__36803);
            rule__OneToOneRelationshipAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToOneRelationshipAttribute__Group__4_in_rule__OneToOneRelationshipAttribute__Group__36806);
            rule__OneToOneRelationshipAttribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneRelationshipAttribute__Group__3"


    // $ANTLR start "rule__OneToOneRelationshipAttribute__Group__3__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3328:1: rule__OneToOneRelationshipAttribute__Group__3__Impl : ( ( rule__OneToOneRelationshipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__OneToOneRelationshipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3332:1: ( ( ( rule__OneToOneRelationshipAttribute__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3333:1: ( ( rule__OneToOneRelationshipAttribute__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3333:1: ( ( rule__OneToOneRelationshipAttribute__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3334:1: ( rule__OneToOneRelationshipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getOneToOneRelationshipAttributeAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3335:1: ( rule__OneToOneRelationshipAttribute__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3335:2: rule__OneToOneRelationshipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__OneToOneRelationshipAttribute__TypeAssignment_3_in_rule__OneToOneRelationshipAttribute__Group__3__Impl6833);
            rule__OneToOneRelationshipAttribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOneToOneRelationshipAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneRelationshipAttribute__Group__3__Impl"


    // $ANTLR start "rule__OneToOneRelationshipAttribute__Group__4"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3345:1: rule__OneToOneRelationshipAttribute__Group__4 : rule__OneToOneRelationshipAttribute__Group__4__Impl ;
    public final void rule__OneToOneRelationshipAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3349:1: ( rule__OneToOneRelationshipAttribute__Group__4__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3350:2: rule__OneToOneRelationshipAttribute__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__OneToOneRelationshipAttribute__Group__4__Impl_in_rule__OneToOneRelationshipAttribute__Group__46863);
            rule__OneToOneRelationshipAttribute__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneRelationshipAttribute__Group__4"


    // $ANTLR start "rule__OneToOneRelationshipAttribute__Group__4__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3356:1: rule__OneToOneRelationshipAttribute__Group__4__Impl : ( ( rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4 )? ) ;
    public final void rule__OneToOneRelationshipAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3360:1: ( ( ( rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4 )? ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3361:1: ( ( rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4 )? )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3361:1: ( ( rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4 )? )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3362:1: ( rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4 )?
            {
             before(grammarAccess.getOneToOneRelationshipAttributeAccess().getJoinColumnOverrideAssignment_4()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3363:1: ( rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3363:2: rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4
                    {
                    pushFollow(FOLLOW_rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4_in_rule__OneToOneRelationshipAttribute__Group__4__Impl6890);
                    rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOneToOneRelationshipAttributeAccess().getJoinColumnOverrideAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneRelationshipAttribute__Group__4__Impl"


    // $ANTLR start "rule__OneToOneMappedByRelationshipAttribute__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3383:1: rule__OneToOneMappedByRelationshipAttribute__Group__0 : rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl rule__OneToOneMappedByRelationshipAttribute__Group__1 ;
    public final void rule__OneToOneMappedByRelationshipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3387:1: ( rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl rule__OneToOneMappedByRelationshipAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3388:2: rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl rule__OneToOneMappedByRelationshipAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl_in_rule__OneToOneMappedByRelationshipAttribute__Group__06931);
            rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__1_in_rule__OneToOneMappedByRelationshipAttribute__Group__06934);
            rule__OneToOneMappedByRelationshipAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneMappedByRelationshipAttribute__Group__0"


    // $ANTLR start "rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3395:1: rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl : ( 'one to one mapped by' ) ;
    public final void rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3399:1: ( ( 'one to one mapped by' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3400:1: ( 'one to one mapped by' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3400:1: ( 'one to one mapped by' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3401:1: 'one to one mapped by'
            {
             before(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getOneToOneMappedByKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl6962); 
             after(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getOneToOneMappedByKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl"


    // $ANTLR start "rule__OneToOneMappedByRelationshipAttribute__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3414:1: rule__OneToOneMappedByRelationshipAttribute__Group__1 : rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl rule__OneToOneMappedByRelationshipAttribute__Group__2 ;
    public final void rule__OneToOneMappedByRelationshipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3418:1: ( rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl rule__OneToOneMappedByRelationshipAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3419:2: rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl rule__OneToOneMappedByRelationshipAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl_in_rule__OneToOneMappedByRelationshipAttribute__Group__16993);
            rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__2_in_rule__OneToOneMappedByRelationshipAttribute__Group__16996);
            rule__OneToOneMappedByRelationshipAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneMappedByRelationshipAttribute__Group__1"


    // $ANTLR start "rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3426:1: rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl : ( ( rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1 ) ) ;
    public final void rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3430:1: ( ( ( rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3431:1: ( ( rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3431:1: ( ( rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3432:1: ( rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3433:1: ( rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3433:2: rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1_in_rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl7023);
            rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl"


    // $ANTLR start "rule__OneToOneMappedByRelationshipAttribute__Group__2"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3443:1: rule__OneToOneMappedByRelationshipAttribute__Group__2 : rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl rule__OneToOneMappedByRelationshipAttribute__Group__3 ;
    public final void rule__OneToOneMappedByRelationshipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3447:1: ( rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl rule__OneToOneMappedByRelationshipAttribute__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3448:2: rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl rule__OneToOneMappedByRelationshipAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl_in_rule__OneToOneMappedByRelationshipAttribute__Group__27053);
            rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__3_in_rule__OneToOneMappedByRelationshipAttribute__Group__27056);
            rule__OneToOneMappedByRelationshipAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneMappedByRelationshipAttribute__Group__2"


    // $ANTLR start "rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3455:1: rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3459:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3460:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3460:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3461:1: ':'
            {
             before(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl7084); 
             after(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl"


    // $ANTLR start "rule__OneToOneMappedByRelationshipAttribute__Group__3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3474:1: rule__OneToOneMappedByRelationshipAttribute__Group__3 : rule__OneToOneMappedByRelationshipAttribute__Group__3__Impl ;
    public final void rule__OneToOneMappedByRelationshipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3478:1: ( rule__OneToOneMappedByRelationshipAttribute__Group__3__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3479:2: rule__OneToOneMappedByRelationshipAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__3__Impl_in_rule__OneToOneMappedByRelationshipAttribute__Group__37115);
            rule__OneToOneMappedByRelationshipAttribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneMappedByRelationshipAttribute__Group__3"


    // $ANTLR start "rule__OneToOneMappedByRelationshipAttribute__Group__3__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3485:1: rule__OneToOneMappedByRelationshipAttribute__Group__3__Impl : ( ( rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__OneToOneMappedByRelationshipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3489:1: ( ( ( rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3490:1: ( ( rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3490:1: ( ( rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3491:1: ( rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3492:1: ( rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3492:2: rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3_in_rule__OneToOneMappedByRelationshipAttribute__Group__3__Impl7142);
            rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneMappedByRelationshipAttribute__Group__3__Impl"


    // $ANTLR start "rule__OneToManyJoinTableRelationshipAttribute__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3510:1: rule__OneToManyJoinTableRelationshipAttribute__Group__0 : rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl rule__OneToManyJoinTableRelationshipAttribute__Group__1 ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3514:1: ( rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl rule__OneToManyJoinTableRelationshipAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3515:2: rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl rule__OneToManyJoinTableRelationshipAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl_in_rule__OneToManyJoinTableRelationshipAttribute__Group__07180);
            rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__1_in_rule__OneToManyJoinTableRelationshipAttribute__Group__07183);
            rule__OneToManyJoinTableRelationshipAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinTableRelationshipAttribute__Group__0"


    // $ANTLR start "rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3522:1: rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl : ( 'one to many using join table' ) ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3526:1: ( ( 'one to many using join table' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3527:1: ( 'one to many using join table' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3527:1: ( 'one to many using join table' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3528:1: 'one to many using join table'
            {
             before(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getOneToManyUsingJoinTableKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl7211); 
             after(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getOneToManyUsingJoinTableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl"


    // $ANTLR start "rule__OneToManyJoinTableRelationshipAttribute__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3541:1: rule__OneToManyJoinTableRelationshipAttribute__Group__1 : rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl rule__OneToManyJoinTableRelationshipAttribute__Group__2 ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3545:1: ( rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl rule__OneToManyJoinTableRelationshipAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3546:2: rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl rule__OneToManyJoinTableRelationshipAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl_in_rule__OneToManyJoinTableRelationshipAttribute__Group__17242);
            rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__2_in_rule__OneToManyJoinTableRelationshipAttribute__Group__17245);
            rule__OneToManyJoinTableRelationshipAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinTableRelationshipAttribute__Group__1"


    // $ANTLR start "rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3553:1: rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl : ( ( rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1 ) ) ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3557:1: ( ( ( rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3558:1: ( ( rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3558:1: ( ( rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3559:1: ( rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3560:1: ( rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3560:2: rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1_in_rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl7272);
            rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl"


    // $ANTLR start "rule__OneToManyJoinTableRelationshipAttribute__Group__2"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3570:1: rule__OneToManyJoinTableRelationshipAttribute__Group__2 : rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl rule__OneToManyJoinTableRelationshipAttribute__Group__3 ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3574:1: ( rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl rule__OneToManyJoinTableRelationshipAttribute__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3575:2: rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl rule__OneToManyJoinTableRelationshipAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl_in_rule__OneToManyJoinTableRelationshipAttribute__Group__27302);
            rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__3_in_rule__OneToManyJoinTableRelationshipAttribute__Group__27305);
            rule__OneToManyJoinTableRelationshipAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinTableRelationshipAttribute__Group__2"


    // $ANTLR start "rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3582:1: rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3586:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3587:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3587:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3588:1: ':'
            {
             before(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl7333); 
             after(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl"


    // $ANTLR start "rule__OneToManyJoinTableRelationshipAttribute__Group__3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3601:1: rule__OneToManyJoinTableRelationshipAttribute__Group__3 : rule__OneToManyJoinTableRelationshipAttribute__Group__3__Impl ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3605:1: ( rule__OneToManyJoinTableRelationshipAttribute__Group__3__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3606:2: rule__OneToManyJoinTableRelationshipAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__3__Impl_in_rule__OneToManyJoinTableRelationshipAttribute__Group__37364);
            rule__OneToManyJoinTableRelationshipAttribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinTableRelationshipAttribute__Group__3"


    // $ANTLR start "rule__OneToManyJoinTableRelationshipAttribute__Group__3__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3612:1: rule__OneToManyJoinTableRelationshipAttribute__Group__3__Impl : ( ( rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3616:1: ( ( ( rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3617:1: ( ( rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3617:1: ( ( rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3618:1: ( rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3619:1: ( rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3619:2: rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3_in_rule__OneToManyJoinTableRelationshipAttribute__Group__3__Impl7391);
            rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinTableRelationshipAttribute__Group__3__Impl"


    // $ANTLR start "rule__OneToManyJoinColumnRelationshipAttribute__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3637:1: rule__OneToManyJoinColumnRelationshipAttribute__Group__0 : rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl rule__OneToManyJoinColumnRelationshipAttribute__Group__1 ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3641:1: ( rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl rule__OneToManyJoinColumnRelationshipAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3642:2: rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl rule__OneToManyJoinColumnRelationshipAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__07429);
            rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__1_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__07432);
            rule__OneToManyJoinColumnRelationshipAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinColumnRelationshipAttribute__Group__0"


    // $ANTLR start "rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3649:1: rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl : ( 'one to many using join column' ) ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3653:1: ( ( 'one to many using join column' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3654:1: ( 'one to many using join column' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3654:1: ( 'one to many using join column' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3655:1: 'one to many using join column'
            {
             before(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getOneToManyUsingJoinColumnKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl7460); 
             after(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getOneToManyUsingJoinColumnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl"


    // $ANTLR start "rule__OneToManyJoinColumnRelationshipAttribute__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3668:1: rule__OneToManyJoinColumnRelationshipAttribute__Group__1 : rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl rule__OneToManyJoinColumnRelationshipAttribute__Group__2 ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3672:1: ( rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl rule__OneToManyJoinColumnRelationshipAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3673:2: rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl rule__OneToManyJoinColumnRelationshipAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__17491);
            rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__2_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__17494);
            rule__OneToManyJoinColumnRelationshipAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinColumnRelationshipAttribute__Group__1"


    // $ANTLR start "rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3680:1: rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl : ( ( rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1 ) ) ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3684:1: ( ( ( rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3685:1: ( ( rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3685:1: ( ( rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3686:1: ( rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3687:1: ( rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3687:2: rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl7521);
            rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl"


    // $ANTLR start "rule__OneToManyJoinColumnRelationshipAttribute__Group__2"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3697:1: rule__OneToManyJoinColumnRelationshipAttribute__Group__2 : rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl rule__OneToManyJoinColumnRelationshipAttribute__Group__3 ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3701:1: ( rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl rule__OneToManyJoinColumnRelationshipAttribute__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3702:2: rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl rule__OneToManyJoinColumnRelationshipAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__27551);
            rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__3_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__27554);
            rule__OneToManyJoinColumnRelationshipAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinColumnRelationshipAttribute__Group__2"


    // $ANTLR start "rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3709:1: rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3713:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3714:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3714:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3715:1: ':'
            {
             before(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl7582); 
             after(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl"


    // $ANTLR start "rule__OneToManyJoinColumnRelationshipAttribute__Group__3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3728:1: rule__OneToManyJoinColumnRelationshipAttribute__Group__3 : rule__OneToManyJoinColumnRelationshipAttribute__Group__3__Impl ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3732:1: ( rule__OneToManyJoinColumnRelationshipAttribute__Group__3__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3733:2: rule__OneToManyJoinColumnRelationshipAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__3__Impl_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__37613);
            rule__OneToManyJoinColumnRelationshipAttribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinColumnRelationshipAttribute__Group__3"


    // $ANTLR start "rule__OneToManyJoinColumnRelationshipAttribute__Group__3__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3739:1: rule__OneToManyJoinColumnRelationshipAttribute__Group__3__Impl : ( ( rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3743:1: ( ( ( rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3744:1: ( ( rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3744:1: ( ( rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3745:1: ( rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3746:1: ( rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3746:2: rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__3__Impl7640);
            rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinColumnRelationshipAttribute__Group__3__Impl"


    // $ANTLR start "rule__OneToManyMappedByRelationshipAttribute__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3764:1: rule__OneToManyMappedByRelationshipAttribute__Group__0 : rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl rule__OneToManyMappedByRelationshipAttribute__Group__1 ;
    public final void rule__OneToManyMappedByRelationshipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3768:1: ( rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl rule__OneToManyMappedByRelationshipAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3769:2: rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl rule__OneToManyMappedByRelationshipAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl_in_rule__OneToManyMappedByRelationshipAttribute__Group__07678);
            rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__1_in_rule__OneToManyMappedByRelationshipAttribute__Group__07681);
            rule__OneToManyMappedByRelationshipAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyMappedByRelationshipAttribute__Group__0"


    // $ANTLR start "rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3776:1: rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl : ( 'one to many mapped by' ) ;
    public final void rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3780:1: ( ( 'one to many mapped by' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3781:1: ( 'one to many mapped by' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3781:1: ( 'one to many mapped by' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3782:1: 'one to many mapped by'
            {
             before(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getOneToManyMappedByKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl7709); 
             after(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getOneToManyMappedByKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl"


    // $ANTLR start "rule__OneToManyMappedByRelationshipAttribute__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3795:1: rule__OneToManyMappedByRelationshipAttribute__Group__1 : rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl rule__OneToManyMappedByRelationshipAttribute__Group__2 ;
    public final void rule__OneToManyMappedByRelationshipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3799:1: ( rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl rule__OneToManyMappedByRelationshipAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3800:2: rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl rule__OneToManyMappedByRelationshipAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl_in_rule__OneToManyMappedByRelationshipAttribute__Group__17740);
            rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__2_in_rule__OneToManyMappedByRelationshipAttribute__Group__17743);
            rule__OneToManyMappedByRelationshipAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyMappedByRelationshipAttribute__Group__1"


    // $ANTLR start "rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3807:1: rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl : ( ( rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1 ) ) ;
    public final void rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3811:1: ( ( ( rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3812:1: ( ( rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3812:1: ( ( rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3813:1: ( rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3814:1: ( rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3814:2: rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1_in_rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl7770);
            rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl"


    // $ANTLR start "rule__OneToManyMappedByRelationshipAttribute__Group__2"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3824:1: rule__OneToManyMappedByRelationshipAttribute__Group__2 : rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl rule__OneToManyMappedByRelationshipAttribute__Group__3 ;
    public final void rule__OneToManyMappedByRelationshipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3828:1: ( rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl rule__OneToManyMappedByRelationshipAttribute__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3829:2: rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl rule__OneToManyMappedByRelationshipAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl_in_rule__OneToManyMappedByRelationshipAttribute__Group__27800);
            rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__3_in_rule__OneToManyMappedByRelationshipAttribute__Group__27803);
            rule__OneToManyMappedByRelationshipAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyMappedByRelationshipAttribute__Group__2"


    // $ANTLR start "rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3836:1: rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3840:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3841:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3841:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3842:1: ':'
            {
             before(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl7831); 
             after(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl"


    // $ANTLR start "rule__OneToManyMappedByRelationshipAttribute__Group__3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3855:1: rule__OneToManyMappedByRelationshipAttribute__Group__3 : rule__OneToManyMappedByRelationshipAttribute__Group__3__Impl ;
    public final void rule__OneToManyMappedByRelationshipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3859:1: ( rule__OneToManyMappedByRelationshipAttribute__Group__3__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3860:2: rule__OneToManyMappedByRelationshipAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__3__Impl_in_rule__OneToManyMappedByRelationshipAttribute__Group__37862);
            rule__OneToManyMappedByRelationshipAttribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyMappedByRelationshipAttribute__Group__3"


    // $ANTLR start "rule__OneToManyMappedByRelationshipAttribute__Group__3__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3866:1: rule__OneToManyMappedByRelationshipAttribute__Group__3__Impl : ( ( rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__OneToManyMappedByRelationshipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3870:1: ( ( ( rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3871:1: ( ( rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3871:1: ( ( rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3872:1: ( rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3873:1: ( rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3873:2: rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3_in_rule__OneToManyMappedByRelationshipAttribute__Group__3__Impl7889);
            rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyMappedByRelationshipAttribute__Group__3__Impl"


    // $ANTLR start "rule__ManyToOneJoinColumnRelationShipAttribute__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3891:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__0 : rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__1 ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3895:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3896:2: rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__07927);
            rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__1_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__07930);
            rule__ManyToOneJoinColumnRelationShipAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinColumnRelationShipAttribute__Group__0"


    // $ANTLR start "rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3903:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl : ( 'many to one using join column' ) ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3907:1: ( ( 'many to one using join column' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3908:1: ( 'many to one using join column' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3908:1: ( 'many to one using join column' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3909:1: 'many to one using join column'
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getManyToOneUsingJoinColumnKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl7958); 
             after(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getManyToOneUsingJoinColumnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl"


    // $ANTLR start "rule__ManyToOneJoinColumnRelationShipAttribute__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3922:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__1 : rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__2 ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3926:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3927:2: rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__17989);
            rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__2_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__17992);
            rule__ManyToOneJoinColumnRelationShipAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinColumnRelationShipAttribute__Group__1"


    // $ANTLR start "rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3934:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl : ( ( rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1 ) ) ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3938:1: ( ( ( rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3939:1: ( ( rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3939:1: ( ( rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3940:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3941:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3941:2: rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl8019);
            rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl"


    // $ANTLR start "rule__ManyToOneJoinColumnRelationShipAttribute__Group__2"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3951:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__2 : rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__3 ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3955:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3956:2: rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__28049);
            rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__3_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__28052);
            rule__ManyToOneJoinColumnRelationShipAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinColumnRelationShipAttribute__Group__2"


    // $ANTLR start "rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3963:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3967:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3968:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3968:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3969:1: ':'
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl8080); 
             after(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl"


    // $ANTLR start "rule__ManyToOneJoinColumnRelationShipAttribute__Group__3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3982:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__3 : rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__4 ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3986:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__4 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3987:2: rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__4
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__38111);
            rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__4_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__38114);
            rule__ManyToOneJoinColumnRelationShipAttribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinColumnRelationShipAttribute__Group__3"


    // $ANTLR start "rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3994:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl : ( ( rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3998:1: ( ( ( rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3999:1: ( ( rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3999:1: ( ( rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4000:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4001:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4001:2: rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl8141);
            rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl"


    // $ANTLR start "rule__ManyToOneJoinColumnRelationShipAttribute__Group__4"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4011:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__4 : rule__ManyToOneJoinColumnRelationShipAttribute__Group__4__Impl ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4015:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__4__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4016:2: rule__ManyToOneJoinColumnRelationShipAttribute__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__4__Impl_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__48171);
            rule__ManyToOneJoinColumnRelationShipAttribute__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinColumnRelationShipAttribute__Group__4"


    // $ANTLR start "rule__ManyToOneJoinColumnRelationShipAttribute__Group__4__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4022:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__4__Impl : ( ( rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4 )? ) ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4026:1: ( ( ( rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4 )? ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4027:1: ( ( rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4 )? )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4027:1: ( ( rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4 )? )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4028:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4 )?
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getJoinColumnOverrideAssignment_4()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4029:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4029:2: rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4
                    {
                    pushFollow(FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__4__Impl8198);
                    rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getJoinColumnOverrideAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinColumnRelationShipAttribute__Group__4__Impl"


    // $ANTLR start "rule__ManyToOneJoinTableRelationShipAttribute__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4049:1: rule__ManyToOneJoinTableRelationShipAttribute__Group__0 : rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl rule__ManyToOneJoinTableRelationShipAttribute__Group__1 ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4053:1: ( rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl rule__ManyToOneJoinTableRelationShipAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4054:2: rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl rule__ManyToOneJoinTableRelationShipAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__08239);
            rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__1_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__08242);
            rule__ManyToOneJoinTableRelationShipAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinTableRelationShipAttribute__Group__0"


    // $ANTLR start "rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4061:1: rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl : ( 'many to one using join table' ) ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4065:1: ( ( 'many to one using join table' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4066:1: ( 'many to one using join table' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4066:1: ( 'many to one using join table' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4067:1: 'many to one using join table'
            {
             before(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getManyToOneUsingJoinTableKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl8270); 
             after(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getManyToOneUsingJoinTableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl"


    // $ANTLR start "rule__ManyToOneJoinTableRelationShipAttribute__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4080:1: rule__ManyToOneJoinTableRelationShipAttribute__Group__1 : rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl rule__ManyToOneJoinTableRelationShipAttribute__Group__2 ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4084:1: ( rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl rule__ManyToOneJoinTableRelationShipAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4085:2: rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl rule__ManyToOneJoinTableRelationShipAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__18301);
            rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__2_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__18304);
            rule__ManyToOneJoinTableRelationShipAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinTableRelationShipAttribute__Group__1"


    // $ANTLR start "rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4092:1: rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl : ( ( rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1 ) ) ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4096:1: ( ( ( rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4097:1: ( ( rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4097:1: ( ( rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4098:1: ( rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4099:1: ( rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4099:2: rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl8331);
            rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl"


    // $ANTLR start "rule__ManyToOneJoinTableRelationShipAttribute__Group__2"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4109:1: rule__ManyToOneJoinTableRelationShipAttribute__Group__2 : rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl rule__ManyToOneJoinTableRelationShipAttribute__Group__3 ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4113:1: ( rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl rule__ManyToOneJoinTableRelationShipAttribute__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4114:2: rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl rule__ManyToOneJoinTableRelationShipAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__28361);
            rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__3_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__28364);
            rule__ManyToOneJoinTableRelationShipAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinTableRelationShipAttribute__Group__2"


    // $ANTLR start "rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4121:1: rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4125:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4126:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4126:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4127:1: ':'
            {
             before(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl8392); 
             after(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl"


    // $ANTLR start "rule__ManyToOneJoinTableRelationShipAttribute__Group__3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4140:1: rule__ManyToOneJoinTableRelationShipAttribute__Group__3 : rule__ManyToOneJoinTableRelationShipAttribute__Group__3__Impl ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4144:1: ( rule__ManyToOneJoinTableRelationShipAttribute__Group__3__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4145:2: rule__ManyToOneJoinTableRelationShipAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__3__Impl_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__38423);
            rule__ManyToOneJoinTableRelationShipAttribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinTableRelationShipAttribute__Group__3"


    // $ANTLR start "rule__ManyToOneJoinTableRelationShipAttribute__Group__3__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4151:1: rule__ManyToOneJoinTableRelationShipAttribute__Group__3__Impl : ( ( rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4155:1: ( ( ( rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4156:1: ( ( rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4156:1: ( ( rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4157:1: ( rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4158:1: ( rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4158:2: rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__3__Impl8450);
            rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinTableRelationShipAttribute__Group__3__Impl"


    // $ANTLR start "rule__ManyToOneMappedByRelationShipAttribute__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4176:1: rule__ManyToOneMappedByRelationShipAttribute__Group__0 : rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl rule__ManyToOneMappedByRelationShipAttribute__Group__1 ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4180:1: ( rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl rule__ManyToOneMappedByRelationShipAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4181:2: rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl rule__ManyToOneMappedByRelationShipAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl_in_rule__ManyToOneMappedByRelationShipAttribute__Group__08488);
            rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__1_in_rule__ManyToOneMappedByRelationShipAttribute__Group__08491);
            rule__ManyToOneMappedByRelationShipAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneMappedByRelationShipAttribute__Group__0"


    // $ANTLR start "rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4188:1: rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl : ( 'many to one mapped by' ) ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4192:1: ( ( 'many to one mapped by' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4193:1: ( 'many to one mapped by' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4193:1: ( 'many to one mapped by' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4194:1: 'many to one mapped by'
            {
             before(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getManyToOneMappedByKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl8519); 
             after(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getManyToOneMappedByKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl"


    // $ANTLR start "rule__ManyToOneMappedByRelationShipAttribute__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4207:1: rule__ManyToOneMappedByRelationShipAttribute__Group__1 : rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl rule__ManyToOneMappedByRelationShipAttribute__Group__2 ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4211:1: ( rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl rule__ManyToOneMappedByRelationShipAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4212:2: rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl rule__ManyToOneMappedByRelationShipAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl_in_rule__ManyToOneMappedByRelationShipAttribute__Group__18550);
            rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__2_in_rule__ManyToOneMappedByRelationShipAttribute__Group__18553);
            rule__ManyToOneMappedByRelationShipAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneMappedByRelationShipAttribute__Group__1"


    // $ANTLR start "rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4219:1: rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl : ( ( rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1 ) ) ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4223:1: ( ( ( rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4224:1: ( ( rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4224:1: ( ( rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4225:1: ( rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4226:1: ( rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4226:2: rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1_in_rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl8580);
            rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl"


    // $ANTLR start "rule__ManyToOneMappedByRelationShipAttribute__Group__2"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4236:1: rule__ManyToOneMappedByRelationShipAttribute__Group__2 : rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl rule__ManyToOneMappedByRelationShipAttribute__Group__3 ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4240:1: ( rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl rule__ManyToOneMappedByRelationShipAttribute__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4241:2: rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl rule__ManyToOneMappedByRelationShipAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl_in_rule__ManyToOneMappedByRelationShipAttribute__Group__28610);
            rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__3_in_rule__ManyToOneMappedByRelationShipAttribute__Group__28613);
            rule__ManyToOneMappedByRelationShipAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneMappedByRelationShipAttribute__Group__2"


    // $ANTLR start "rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4248:1: rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4252:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4253:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4253:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4254:1: ':'
            {
             before(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl8641); 
             after(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl"


    // $ANTLR start "rule__ManyToOneMappedByRelationShipAttribute__Group__3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4267:1: rule__ManyToOneMappedByRelationShipAttribute__Group__3 : rule__ManyToOneMappedByRelationShipAttribute__Group__3__Impl ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4271:1: ( rule__ManyToOneMappedByRelationShipAttribute__Group__3__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4272:2: rule__ManyToOneMappedByRelationShipAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__3__Impl_in_rule__ManyToOneMappedByRelationShipAttribute__Group__38672);
            rule__ManyToOneMappedByRelationShipAttribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneMappedByRelationShipAttribute__Group__3"


    // $ANTLR start "rule__ManyToOneMappedByRelationShipAttribute__Group__3__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4278:1: rule__ManyToOneMappedByRelationShipAttribute__Group__3__Impl : ( ( rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4282:1: ( ( ( rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4283:1: ( ( rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4283:1: ( ( rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4284:1: ( rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4285:1: ( rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4285:2: rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3_in_rule__ManyToOneMappedByRelationShipAttribute__Group__3__Impl8699);
            rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneMappedByRelationShipAttribute__Group__3__Impl"


    // $ANTLR start "rule__ManyToManyRelationshipAttribute__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4303:1: rule__ManyToManyRelationshipAttribute__Group__0 : rule__ManyToManyRelationshipAttribute__Group__0__Impl rule__ManyToManyRelationshipAttribute__Group__1 ;
    public final void rule__ManyToManyRelationshipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4307:1: ( rule__ManyToManyRelationshipAttribute__Group__0__Impl rule__ManyToManyRelationshipAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4308:2: rule__ManyToManyRelationshipAttribute__Group__0__Impl rule__ManyToManyRelationshipAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ManyToManyRelationshipAttribute__Group__0__Impl_in_rule__ManyToManyRelationshipAttribute__Group__08737);
            rule__ManyToManyRelationshipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToManyRelationshipAttribute__Group__1_in_rule__ManyToManyRelationshipAttribute__Group__08740);
            rule__ManyToManyRelationshipAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyRelationshipAttribute__Group__0"


    // $ANTLR start "rule__ManyToManyRelationshipAttribute__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4315:1: rule__ManyToManyRelationshipAttribute__Group__0__Impl : ( 'many to many join table' ) ;
    public final void rule__ManyToManyRelationshipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4319:1: ( ( 'many to many join table' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4320:1: ( 'many to many join table' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4320:1: ( 'many to many join table' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4321:1: 'many to many join table'
            {
             before(grammarAccess.getManyToManyRelationshipAttributeAccess().getManyToManyJoinTableKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__ManyToManyRelationshipAttribute__Group__0__Impl8768); 
             after(grammarAccess.getManyToManyRelationshipAttributeAccess().getManyToManyJoinTableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyRelationshipAttribute__Group__0__Impl"


    // $ANTLR start "rule__ManyToManyRelationshipAttribute__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4334:1: rule__ManyToManyRelationshipAttribute__Group__1 : rule__ManyToManyRelationshipAttribute__Group__1__Impl rule__ManyToManyRelationshipAttribute__Group__2 ;
    public final void rule__ManyToManyRelationshipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4338:1: ( rule__ManyToManyRelationshipAttribute__Group__1__Impl rule__ManyToManyRelationshipAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4339:2: rule__ManyToManyRelationshipAttribute__Group__1__Impl rule__ManyToManyRelationshipAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__ManyToManyRelationshipAttribute__Group__1__Impl_in_rule__ManyToManyRelationshipAttribute__Group__18799);
            rule__ManyToManyRelationshipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToManyRelationshipAttribute__Group__2_in_rule__ManyToManyRelationshipAttribute__Group__18802);
            rule__ManyToManyRelationshipAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyRelationshipAttribute__Group__1"


    // $ANTLR start "rule__ManyToManyRelationshipAttribute__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4346:1: rule__ManyToManyRelationshipAttribute__Group__1__Impl : ( ( rule__ManyToManyRelationshipAttribute__NameAssignment_1 ) ) ;
    public final void rule__ManyToManyRelationshipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4350:1: ( ( ( rule__ManyToManyRelationshipAttribute__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4351:1: ( ( rule__ManyToManyRelationshipAttribute__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4351:1: ( ( rule__ManyToManyRelationshipAttribute__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4352:1: ( rule__ManyToManyRelationshipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getManyToManyRelationshipAttributeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4353:1: ( rule__ManyToManyRelationshipAttribute__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4353:2: rule__ManyToManyRelationshipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ManyToManyRelationshipAttribute__NameAssignment_1_in_rule__ManyToManyRelationshipAttribute__Group__1__Impl8829);
            rule__ManyToManyRelationshipAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getManyToManyRelationshipAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyRelationshipAttribute__Group__1__Impl"


    // $ANTLR start "rule__ManyToManyRelationshipAttribute__Group__2"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4363:1: rule__ManyToManyRelationshipAttribute__Group__2 : rule__ManyToManyRelationshipAttribute__Group__2__Impl rule__ManyToManyRelationshipAttribute__Group__3 ;
    public final void rule__ManyToManyRelationshipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4367:1: ( rule__ManyToManyRelationshipAttribute__Group__2__Impl rule__ManyToManyRelationshipAttribute__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4368:2: rule__ManyToManyRelationshipAttribute__Group__2__Impl rule__ManyToManyRelationshipAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__ManyToManyRelationshipAttribute__Group__2__Impl_in_rule__ManyToManyRelationshipAttribute__Group__28859);
            rule__ManyToManyRelationshipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToManyRelationshipAttribute__Group__3_in_rule__ManyToManyRelationshipAttribute__Group__28862);
            rule__ManyToManyRelationshipAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyRelationshipAttribute__Group__2"


    // $ANTLR start "rule__ManyToManyRelationshipAttribute__Group__2__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4375:1: rule__ManyToManyRelationshipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__ManyToManyRelationshipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4379:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4380:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4380:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4381:1: ':'
            {
             before(grammarAccess.getManyToManyRelationshipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__ManyToManyRelationshipAttribute__Group__2__Impl8890); 
             after(grammarAccess.getManyToManyRelationshipAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyRelationshipAttribute__Group__2__Impl"


    // $ANTLR start "rule__ManyToManyRelationshipAttribute__Group__3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4394:1: rule__ManyToManyRelationshipAttribute__Group__3 : rule__ManyToManyRelationshipAttribute__Group__3__Impl ;
    public final void rule__ManyToManyRelationshipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4398:1: ( rule__ManyToManyRelationshipAttribute__Group__3__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4399:2: rule__ManyToManyRelationshipAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ManyToManyRelationshipAttribute__Group__3__Impl_in_rule__ManyToManyRelationshipAttribute__Group__38921);
            rule__ManyToManyRelationshipAttribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyRelationshipAttribute__Group__3"


    // $ANTLR start "rule__ManyToManyRelationshipAttribute__Group__3__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4405:1: rule__ManyToManyRelationshipAttribute__Group__3__Impl : ( ( rule__ManyToManyRelationshipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__ManyToManyRelationshipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4409:1: ( ( ( rule__ManyToManyRelationshipAttribute__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4410:1: ( ( rule__ManyToManyRelationshipAttribute__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4410:1: ( ( rule__ManyToManyRelationshipAttribute__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4411:1: ( rule__ManyToManyRelationshipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getManyToManyRelationshipAttributeAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4412:1: ( rule__ManyToManyRelationshipAttribute__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4412:2: rule__ManyToManyRelationshipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__ManyToManyRelationshipAttribute__TypeAssignment_3_in_rule__ManyToManyRelationshipAttribute__Group__3__Impl8948);
            rule__ManyToManyRelationshipAttribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getManyToManyRelationshipAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyRelationshipAttribute__Group__3__Impl"


    // $ANTLR start "rule__ManyToManyMappedByRelationshipAttribute__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4430:1: rule__ManyToManyMappedByRelationshipAttribute__Group__0 : rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl rule__ManyToManyMappedByRelationshipAttribute__Group__1 ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4434:1: ( rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl rule__ManyToManyMappedByRelationshipAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4435:2: rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl rule__ManyToManyMappedByRelationshipAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl_in_rule__ManyToManyMappedByRelationshipAttribute__Group__08986);
            rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__1_in_rule__ManyToManyMappedByRelationshipAttribute__Group__08989);
            rule__ManyToManyMappedByRelationshipAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyMappedByRelationshipAttribute__Group__0"


    // $ANTLR start "rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4442:1: rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl : ( 'many to many mapped by' ) ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4446:1: ( ( 'many to many mapped by' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4447:1: ( 'many to many mapped by' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4447:1: ( 'many to many mapped by' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4448:1: 'many to many mapped by'
            {
             before(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getManyToManyMappedByKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl9017); 
             after(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getManyToManyMappedByKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl"


    // $ANTLR start "rule__ManyToManyMappedByRelationshipAttribute__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4461:1: rule__ManyToManyMappedByRelationshipAttribute__Group__1 : rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl rule__ManyToManyMappedByRelationshipAttribute__Group__2 ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4465:1: ( rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl rule__ManyToManyMappedByRelationshipAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4466:2: rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl rule__ManyToManyMappedByRelationshipAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl_in_rule__ManyToManyMappedByRelationshipAttribute__Group__19048);
            rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__2_in_rule__ManyToManyMappedByRelationshipAttribute__Group__19051);
            rule__ManyToManyMappedByRelationshipAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyMappedByRelationshipAttribute__Group__1"


    // $ANTLR start "rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4473:1: rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl : ( ( rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1 ) ) ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4477:1: ( ( ( rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4478:1: ( ( rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4478:1: ( ( rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4479:1: ( rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4480:1: ( rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4480:2: rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1_in_rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl9078);
            rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl"


    // $ANTLR start "rule__ManyToManyMappedByRelationshipAttribute__Group__2"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4490:1: rule__ManyToManyMappedByRelationshipAttribute__Group__2 : rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl rule__ManyToManyMappedByRelationshipAttribute__Group__3 ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4494:1: ( rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl rule__ManyToManyMappedByRelationshipAttribute__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4495:2: rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl rule__ManyToManyMappedByRelationshipAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl_in_rule__ManyToManyMappedByRelationshipAttribute__Group__29108);
            rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__3_in_rule__ManyToManyMappedByRelationshipAttribute__Group__29111);
            rule__ManyToManyMappedByRelationshipAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyMappedByRelationshipAttribute__Group__2"


    // $ANTLR start "rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4502:1: rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4506:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4507:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4507:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4508:1: ':'
            {
             before(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl9139); 
             after(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl"


    // $ANTLR start "rule__ManyToManyMappedByRelationshipAttribute__Group__3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4521:1: rule__ManyToManyMappedByRelationshipAttribute__Group__3 : rule__ManyToManyMappedByRelationshipAttribute__Group__3__Impl ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4525:1: ( rule__ManyToManyMappedByRelationshipAttribute__Group__3__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4526:2: rule__ManyToManyMappedByRelationshipAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__3__Impl_in_rule__ManyToManyMappedByRelationshipAttribute__Group__39170);
            rule__ManyToManyMappedByRelationshipAttribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyMappedByRelationshipAttribute__Group__3"


    // $ANTLR start "rule__ManyToManyMappedByRelationshipAttribute__Group__3__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4532:1: rule__ManyToManyMappedByRelationshipAttribute__Group__3__Impl : ( ( rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4536:1: ( ( ( rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4537:1: ( ( rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4537:1: ( ( rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4538:1: ( rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4539:1: ( rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4539:2: rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3_in_rule__ManyToManyMappedByRelationshipAttribute__Group__3__Impl9197);
            rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyMappedByRelationshipAttribute__Group__3__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4557:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4561:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4562:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__09235);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__09238);
            rule__Reference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4569:1: rule__Reference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4573:1: ( ( 'ref' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4574:1: ( 'ref' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4574:1: ( 'ref' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4575:1: 'ref'
            {
             before(grammarAccess.getReferenceAccess().getRefKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__Reference__Group__0__Impl9266); 
             after(grammarAccess.getReferenceAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4588:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4592:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4593:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__19297);
            rule__Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__19300);
            rule__Reference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4600:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__NameAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4604:1: ( ( ( rule__Reference__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4605:1: ( ( rule__Reference__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4605:1: ( ( rule__Reference__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4606:1: ( rule__Reference__NameAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4607:1: ( rule__Reference__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4607:2: rule__Reference__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Reference__NameAssignment_1_in_rule__Reference__Group__1__Impl9327);
            rule__Reference__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__2"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4617:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4621:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4622:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__29357);
            rule__Reference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__29360);
            rule__Reference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2"


    // $ANTLR start "rule__Reference__Group__2__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4629:1: rule__Reference__Group__2__Impl : ( ':' ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4633:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4634:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4634:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4635:1: ':'
            {
             before(grammarAccess.getReferenceAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__Reference__Group__2__Impl9388); 
             after(grammarAccess.getReferenceAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2__Impl"


    // $ANTLR start "rule__Reference__Group__3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4648:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4652:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4653:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__39419);
            rule__Reference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__39422);
            rule__Reference__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3"


    // $ANTLR start "rule__Reference__Group__3__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4660:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__TypeAssignment_3 ) ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4664:1: ( ( ( rule__Reference__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4665:1: ( ( rule__Reference__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4665:1: ( ( rule__Reference__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4666:1: ( rule__Reference__TypeAssignment_3 )
            {
             before(grammarAccess.getReferenceAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4667:1: ( rule__Reference__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4667:2: rule__Reference__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Reference__TypeAssignment_3_in_rule__Reference__Group__3__Impl9449);
            rule__Reference__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3__Impl"


    // $ANTLR start "rule__Reference__Group__4"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4677:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4681:1: ( rule__Reference__Group__4__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4682:2: rule__Reference__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__49479);
            rule__Reference__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__4"


    // $ANTLR start "rule__Reference__Group__4__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4688:1: rule__Reference__Group__4__Impl : ( ( rule__Reference__Group_4__0 )? ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4692:1: ( ( ( rule__Reference__Group_4__0 )? ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4693:1: ( ( rule__Reference__Group_4__0 )? )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4693:1: ( ( rule__Reference__Group_4__0 )? )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4694:1: ( rule__Reference__Group_4__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_4()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4695:1: ( rule__Reference__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4695:2: rule__Reference__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Reference__Group_4__0_in_rule__Reference__Group__4__Impl9506);
                    rule__Reference__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__4__Impl"


    // $ANTLR start "rule__Reference__Group_4__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4715:1: rule__Reference__Group_4__0 : rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1 ;
    public final void rule__Reference__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4719:1: ( rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4720:2: rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1
            {
            pushFollow(FOLLOW_rule__Reference__Group_4__0__Impl_in_rule__Reference__Group_4__09547);
            rule__Reference__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group_4__1_in_rule__Reference__Group_4__09550);
            rule__Reference__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4__0"


    // $ANTLR start "rule__Reference__Group_4__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4727:1: rule__Reference__Group_4__0__Impl : ( 'opposite' ) ;
    public final void rule__Reference__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4731:1: ( ( 'opposite' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4732:1: ( 'opposite' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4732:1: ( 'opposite' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4733:1: 'opposite'
            {
             before(grammarAccess.getReferenceAccess().getOppositeKeyword_4_0()); 
            match(input,42,FOLLOW_42_in_rule__Reference__Group_4__0__Impl9578); 
             after(grammarAccess.getReferenceAccess().getOppositeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4__0__Impl"


    // $ANTLR start "rule__Reference__Group_4__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4746:1: rule__Reference__Group_4__1 : rule__Reference__Group_4__1__Impl ;
    public final void rule__Reference__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4750:1: ( rule__Reference__Group_4__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4751:2: rule__Reference__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group_4__1__Impl_in_rule__Reference__Group_4__19609);
            rule__Reference__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4__1"


    // $ANTLR start "rule__Reference__Group_4__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4757:1: rule__Reference__Group_4__1__Impl : ( ( rule__Reference__OppositeAssignment_4_1 ) ) ;
    public final void rule__Reference__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4761:1: ( ( ( rule__Reference__OppositeAssignment_4_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4762:1: ( ( rule__Reference__OppositeAssignment_4_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4762:1: ( ( rule__Reference__OppositeAssignment_4_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4763:1: ( rule__Reference__OppositeAssignment_4_1 )
            {
             before(grammarAccess.getReferenceAccess().getOppositeAssignment_4_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4764:1: ( rule__Reference__OppositeAssignment_4_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4764:2: rule__Reference__OppositeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Reference__OppositeAssignment_4_1_in_rule__Reference__Group_4__1__Impl9636);
            rule__Reference__OppositeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getOppositeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4__1__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4778:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4782:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4783:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__09670);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__09673);
            rule__Operation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4790:1: rule__Operation__Group__0__Impl : ( ( rule__Operation__VisibilityAssignment_0 )? ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4794:1: ( ( ( rule__Operation__VisibilityAssignment_0 )? ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4795:1: ( ( rule__Operation__VisibilityAssignment_0 )? )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4795:1: ( ( rule__Operation__VisibilityAssignment_0 )? )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4796:1: ( rule__Operation__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getOperationAccess().getVisibilityAssignment_0()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4797:1: ( rule__Operation__VisibilityAssignment_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=11 && LA24_0<=13)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4797:2: rule__Operation__VisibilityAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Operation__VisibilityAssignment_0_in_rule__Operation__Group__0__Impl9700);
                    rule__Operation__VisibilityAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getVisibilityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4807:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4811:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4812:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__19731);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__19734);
            rule__Operation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4819:1: rule__Operation__Group__1__Impl : ( 'op' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4823:1: ( ( 'op' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4824:1: ( 'op' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4824:1: ( 'op' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4825:1: 'op'
            {
             before(grammarAccess.getOperationAccess().getOpKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__Operation__Group__1__Impl9762); 
             after(grammarAccess.getOperationAccess().getOpKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4838:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4842:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4843:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__29793);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__29796);
            rule__Operation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4850:1: rule__Operation__Group__2__Impl : ( ( rule__Operation__NameAssignment_2 ) ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4854:1: ( ( ( rule__Operation__NameAssignment_2 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4855:1: ( ( rule__Operation__NameAssignment_2 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4855:1: ( ( rule__Operation__NameAssignment_2 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4856:1: ( rule__Operation__NameAssignment_2 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_2()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4857:1: ( rule__Operation__NameAssignment_2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4857:2: rule__Operation__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Operation__NameAssignment_2_in_rule__Operation__Group__2__Impl9823);
            rule__Operation__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group__3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4867:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4871:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4872:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__39853);
            rule__Operation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__39856);
            rule__Operation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3"


    // $ANTLR start "rule__Operation__Group__3__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4879:1: rule__Operation__Group__3__Impl : ( '(' ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4883:1: ( ( '(' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4884:1: ( '(' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4884:1: ( '(' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4885:1: '('
            {
             before(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_3()); 
            match(input,44,FOLLOW_44_in_rule__Operation__Group__3__Impl9884); 
             after(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__4"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4898:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4902:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4903:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__49915);
            rule__Operation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__49918);
            rule__Operation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4"


    // $ANTLR start "rule__Operation__Group__4__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4910:1: rule__Operation__Group__4__Impl : ( ( rule__Operation__Group_4__0 )? ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4914:1: ( ( ( rule__Operation__Group_4__0 )? ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4915:1: ( ( rule__Operation__Group_4__0 )? )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4915:1: ( ( rule__Operation__Group_4__0 )? )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4916:1: ( rule__Operation__Group_4__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_4()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4917:1: ( rule__Operation__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4917:2: rule__Operation__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl9945);
                    rule__Operation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4__Impl"


    // $ANTLR start "rule__Operation__Group__5"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4927:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4931:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4932:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__59976);
            rule__Operation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__6_in_rule__Operation__Group__59979);
            rule__Operation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5"


    // $ANTLR start "rule__Operation__Group__5__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4939:1: rule__Operation__Group__5__Impl : ( ')' ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4943:1: ( ( ')' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4944:1: ( ')' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4944:1: ( ')' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4945:1: ')'
            {
             before(grammarAccess.getOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,45,FOLLOW_45_in_rule__Operation__Group__5__Impl10007); 
             after(grammarAccess.getOperationAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5__Impl"


    // $ANTLR start "rule__Operation__Group__6"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4958:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl rule__Operation__Group__7 ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4962:1: ( rule__Operation__Group__6__Impl rule__Operation__Group__7 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4963:2: rule__Operation__Group__6__Impl rule__Operation__Group__7
            {
            pushFollow(FOLLOW_rule__Operation__Group__6__Impl_in_rule__Operation__Group__610038);
            rule__Operation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__7_in_rule__Operation__Group__610041);
            rule__Operation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__6"


    // $ANTLR start "rule__Operation__Group__6__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4970:1: rule__Operation__Group__6__Impl : ( ':' ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4974:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4975:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4975:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4976:1: ':'
            {
             before(grammarAccess.getOperationAccess().getColonKeyword_6()); 
            match(input,27,FOLLOW_27_in_rule__Operation__Group__6__Impl10069); 
             after(grammarAccess.getOperationAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__6__Impl"


    // $ANTLR start "rule__Operation__Group__7"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4989:1: rule__Operation__Group__7 : rule__Operation__Group__7__Impl ;
    public final void rule__Operation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4993:1: ( rule__Operation__Group__7__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4994:2: rule__Operation__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group__7__Impl_in_rule__Operation__Group__710100);
            rule__Operation__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__7"


    // $ANTLR start "rule__Operation__Group__7__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5000:1: rule__Operation__Group__7__Impl : ( ( rule__Operation__TypeAssignment_7 ) ) ;
    public final void rule__Operation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5004:1: ( ( ( rule__Operation__TypeAssignment_7 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5005:1: ( ( rule__Operation__TypeAssignment_7 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5005:1: ( ( rule__Operation__TypeAssignment_7 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5006:1: ( rule__Operation__TypeAssignment_7 )
            {
             before(grammarAccess.getOperationAccess().getTypeAssignment_7()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5007:1: ( rule__Operation__TypeAssignment_7 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5007:2: rule__Operation__TypeAssignment_7
            {
            pushFollow(FOLLOW_rule__Operation__TypeAssignment_7_in_rule__Operation__Group__7__Impl10127);
            rule__Operation__TypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getTypeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__7__Impl"


    // $ANTLR start "rule__Operation__Group_4__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5033:1: rule__Operation__Group_4__0 : rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 ;
    public final void rule__Operation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5037:1: ( rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5038:2: rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__010173);
            rule__Operation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__010176);
            rule__Operation__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__0"


    // $ANTLR start "rule__Operation__Group_4__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5045:1: rule__Operation__Group_4__0__Impl : ( ( rule__Operation__ParamsAssignment_4_0 ) ) ;
    public final void rule__Operation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5049:1: ( ( ( rule__Operation__ParamsAssignment_4_0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5050:1: ( ( rule__Operation__ParamsAssignment_4_0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5050:1: ( ( rule__Operation__ParamsAssignment_4_0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5051:1: ( rule__Operation__ParamsAssignment_4_0 )
            {
             before(grammarAccess.getOperationAccess().getParamsAssignment_4_0()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5052:1: ( rule__Operation__ParamsAssignment_4_0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5052:2: rule__Operation__ParamsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Operation__ParamsAssignment_4_0_in_rule__Operation__Group_4__0__Impl10203);
            rule__Operation__ParamsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getParamsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__0__Impl"


    // $ANTLR start "rule__Operation__Group_4__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5062:1: rule__Operation__Group_4__1 : rule__Operation__Group_4__1__Impl ;
    public final void rule__Operation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5066:1: ( rule__Operation__Group_4__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5067:2: rule__Operation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__110233);
            rule__Operation__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__1"


    // $ANTLR start "rule__Operation__Group_4__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5073:1: rule__Operation__Group_4__1__Impl : ( ( rule__Operation__Group_4_1__0 )* ) ;
    public final void rule__Operation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5077:1: ( ( ( rule__Operation__Group_4_1__0 )* ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5078:1: ( ( rule__Operation__Group_4_1__0 )* )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5078:1: ( ( rule__Operation__Group_4_1__0 )* )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5079:1: ( rule__Operation__Group_4_1__0 )*
            {
             before(grammarAccess.getOperationAccess().getGroup_4_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5080:1: ( rule__Operation__Group_4_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==46) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5080:2: rule__Operation__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Operation__Group_4_1__0_in_rule__Operation__Group_4__1__Impl10260);
            	    rule__Operation__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getOperationAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__1__Impl"


    // $ANTLR start "rule__Operation__Group_4_1__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5094:1: rule__Operation__Group_4_1__0 : rule__Operation__Group_4_1__0__Impl rule__Operation__Group_4_1__1 ;
    public final void rule__Operation__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5098:1: ( rule__Operation__Group_4_1__0__Impl rule__Operation__Group_4_1__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5099:2: rule__Operation__Group_4_1__0__Impl rule__Operation__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_4_1__0__Impl_in_rule__Operation__Group_4_1__010295);
            rule__Operation__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4_1__1_in_rule__Operation__Group_4_1__010298);
            rule__Operation__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4_1__0"


    // $ANTLR start "rule__Operation__Group_4_1__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5106:1: rule__Operation__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Operation__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5110:1: ( ( ',' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5111:1: ( ',' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5111:1: ( ',' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5112:1: ','
            {
             before(grammarAccess.getOperationAccess().getCommaKeyword_4_1_0()); 
            match(input,46,FOLLOW_46_in_rule__Operation__Group_4_1__0__Impl10326); 
             after(grammarAccess.getOperationAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4_1__0__Impl"


    // $ANTLR start "rule__Operation__Group_4_1__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5125:1: rule__Operation__Group_4_1__1 : rule__Operation__Group_4_1__1__Impl ;
    public final void rule__Operation__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5129:1: ( rule__Operation__Group_4_1__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5130:2: rule__Operation__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_4_1__1__Impl_in_rule__Operation__Group_4_1__110357);
            rule__Operation__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4_1__1"


    // $ANTLR start "rule__Operation__Group_4_1__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5136:1: rule__Operation__Group_4_1__1__Impl : ( ( rule__Operation__ParamsAssignment_4_1_1 ) ) ;
    public final void rule__Operation__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5140:1: ( ( ( rule__Operation__ParamsAssignment_4_1_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5141:1: ( ( rule__Operation__ParamsAssignment_4_1_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5141:1: ( ( rule__Operation__ParamsAssignment_4_1_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5142:1: ( rule__Operation__ParamsAssignment_4_1_1 )
            {
             before(grammarAccess.getOperationAccess().getParamsAssignment_4_1_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5143:1: ( rule__Operation__ParamsAssignment_4_1_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5143:2: rule__Operation__ParamsAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__Operation__ParamsAssignment_4_1_1_in_rule__Operation__Group_4_1__1__Impl10384);
            rule__Operation__ParamsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getParamsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5157:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5161:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5162:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__010418);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__010421);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5169:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5173:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5174:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5174:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5175:1: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5176:1: ( rule__Parameter__NameAssignment_0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5176:2: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_0_in_rule__Parameter__Group__0__Impl10448);
            rule__Parameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5186:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5190:1: ( rule__Parameter__Group__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5191:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__110478);
            rule__Parameter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5197:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__TypeAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5201:1: ( ( ( rule__Parameter__TypeAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5202:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5202:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5203:1: ( rule__Parameter__TypeAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5204:1: ( rule__Parameter__TypeAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5204:2: rule__Parameter__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_1_in_rule__Parameter__Group__1__Impl10505);
            rule__Parameter__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__TypeRef__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5218:1: rule__TypeRef__Group__0 : rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 ;
    public final void rule__TypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5222:1: ( rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5223:2: rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__010539);
            rule__TypeRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__010542);
            rule__TypeRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group__0"


    // $ANTLR start "rule__TypeRef__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5230:1: rule__TypeRef__Group__0__Impl : ( ( rule__TypeRef__ReferencedAssignment_0 ) ) ;
    public final void rule__TypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5234:1: ( ( ( rule__TypeRef__ReferencedAssignment_0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5235:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5235:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5236:1: ( rule__TypeRef__ReferencedAssignment_0 )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5237:1: ( rule__TypeRef__ReferencedAssignment_0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5237:2: rule__TypeRef__ReferencedAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl10569);
            rule__TypeRef__ReferencedAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group__0__Impl"


    // $ANTLR start "rule__TypeRef__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5247:1: rule__TypeRef__Group__1 : rule__TypeRef__Group__1__Impl ;
    public final void rule__TypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5251:1: ( rule__TypeRef__Group__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5252:2: rule__TypeRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__110599);
            rule__TypeRef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group__1"


    // $ANTLR start "rule__TypeRef__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5258:1: rule__TypeRef__Group__1__Impl : ( ( rule__TypeRef__MultiAssignment_1 )? ) ;
    public final void rule__TypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5262:1: ( ( ( rule__TypeRef__MultiAssignment_1 )? ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5263:1: ( ( rule__TypeRef__MultiAssignment_1 )? )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5263:1: ( ( rule__TypeRef__MultiAssignment_1 )? )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5264:1: ( rule__TypeRef__MultiAssignment_1 )?
            {
             before(grammarAccess.getTypeRefAccess().getMultiAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5265:1: ( rule__TypeRef__MultiAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==49) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5265:2: rule__TypeRef__MultiAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeRef__MultiAssignment_1_in_rule__TypeRef__Group__1__Impl10626);
                    rule__TypeRef__MultiAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeRefAccess().getMultiAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5279:1: rule__QualifiedNameWithWildCard__Group__0 : rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 ;
    public final void rule__QualifiedNameWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5283:1: ( rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5284:2: rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__010661);
            rule__QualifiedNameWithWildCard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__010664);
            rule__QualifiedNameWithWildCard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5291:1: rule__QualifiedNameWithWildCard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5295:1: ( ( ruleQualifiedName ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5296:1: ( ruleQualifiedName )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5296:1: ( ruleQualifiedName )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5297:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl10691);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5308:1: rule__QualifiedNameWithWildCard__Group__1 : rule__QualifiedNameWithWildCard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5312:1: ( rule__QualifiedNameWithWildCard__Group__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5313:2: rule__QualifiedNameWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__110720);
            rule__QualifiedNameWithWildCard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5319:1: rule__QualifiedNameWithWildCard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5323:1: ( ( ( '.*' )? ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5324:1: ( ( '.*' )? )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5324:1: ( ( '.*' )? )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5325:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5326:1: ( '.*' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==47) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5327:2: '.*'
                    {
                    match(input,47,FOLLOW_47_in_rule__QualifiedNameWithWildCard__Group__1__Impl10749); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5342:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5346:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5347:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__010786);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__010789);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5354:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5358:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5359:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5359:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5360:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl10816); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5371:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5375:1: ( rule__QualifiedName__Group__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5376:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__110845);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5382:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5386:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5387:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5387:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5388:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5389:1: ( rule__QualifiedName__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==48) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5389:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl10872);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5403:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5407:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5408:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__010907);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__010910);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5415:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5419:1: ( ( '.' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5420:1: ( '.' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5420:1: ( '.' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5421:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,48,FOLLOW_48_in_rule__QualifiedName__Group_1__0__Impl10938); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5434:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5438:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5439:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__110969);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5445:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5449:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5450:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5450:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5451:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl10996); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5467:1: rule__Model__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5471:1: ( ( ruleAbstractElement ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5472:1: ( ruleAbstractElement )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5472:1: ( ruleAbstractElement )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5473:1: ruleAbstractElement
            {
             before(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__Model__ElementsAssignment11034);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5482:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5486:1: ( ( ruleQualifiedNameWithWildCard ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5487:1: ( ruleQualifiedNameWithWildCard )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5487:1: ( ruleQualifiedNameWithWildCard )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5488:1: ruleQualifiedNameWithWildCard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_111065);
            ruleQualifiedNameWithWildCard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__PackageDeclaration__NameAssignment_1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5497:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5501:1: ( ( ruleQualifiedName ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5502:1: ( ruleQualifiedName )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5502:1: ( ruleQualifiedName )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5503:1: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_111096);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__NameAssignment_1"


    // $ANTLR start "rule__PackageDeclaration__DatabaseModesAssignment_3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5512:1: rule__PackageDeclaration__DatabaseModesAssignment_3 : ( ruleDatabaseMode ) ;
    public final void rule__PackageDeclaration__DatabaseModesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5516:1: ( ( ruleDatabaseMode ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5517:1: ( ruleDatabaseMode )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5517:1: ( ruleDatabaseMode )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5518:1: ruleDatabaseMode
            {
             before(grammarAccess.getPackageDeclarationAccess().getDatabaseModesDatabaseModeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDatabaseMode_in_rule__PackageDeclaration__DatabaseModesAssignment_311127);
            ruleDatabaseMode();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getDatabaseModesDatabaseModeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__DatabaseModesAssignment_3"


    // $ANTLR start "rule__PackageDeclaration__ElementsAssignment_4"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5527:1: rule__PackageDeclaration__ElementsAssignment_4 : ( ruleAbstractElement ) ;
    public final void rule__PackageDeclaration__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5531:1: ( ( ruleAbstractElement ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5532:1: ( ruleAbstractElement )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5532:1: ( ruleAbstractElement )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5533:1: ruleAbstractElement
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__PackageDeclaration__ElementsAssignment_411158);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__ElementsAssignment_4"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5542:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5546:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5547:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5547:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5548:1: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_111189); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__NameAssignment_1"


    // $ANTLR start "rule__DatabaseMode__NameAssignment_1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5557:1: rule__DatabaseMode__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DatabaseMode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5561:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5562:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5562:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5563:1: RULE_ID
            {
             before(grammarAccess.getDatabaseModeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DatabaseMode__NameAssignment_111220); 
             after(grammarAccess.getDatabaseModeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseMode__NameAssignment_1"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5572:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5576:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5577:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5577:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5578:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_111251); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__DatabaseVendorAssignment_2"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5587:1: rule__Entity__DatabaseVendorAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__DatabaseVendorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5591:1: ( ( ( RULE_ID ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5592:1: ( ( RULE_ID ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5592:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5593:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getDatabaseVendorDatabaseModeCrossReference_2_0()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5594:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5595:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getDatabaseVendorDatabaseModeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__DatabaseVendorAssignment_211286); 
             after(grammarAccess.getEntityAccess().getDatabaseVendorDatabaseModeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getDatabaseVendorDatabaseModeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__DatabaseVendorAssignment_2"


    // $ANTLR start "rule__Entity__SuperTypeAssignment_3_1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5606:1: rule__Entity__SuperTypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5610:1: ( ( ( RULE_ID ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5611:1: ( ( RULE_ID ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5611:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5612:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5613:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5614:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_3_111325); 
             after(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SuperTypeAssignment_3_1"


    // $ANTLR start "rule__Entity__ReadOnlyAssignment_4"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5625:1: rule__Entity__ReadOnlyAssignment_4 : ( ruleReadOnly ) ;
    public final void rule__Entity__ReadOnlyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5629:1: ( ( ruleReadOnly ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5630:1: ( ruleReadOnly )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5630:1: ( ruleReadOnly )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5631:1: ruleReadOnly
            {
             before(grammarAccess.getEntityAccess().getReadOnlyReadOnlyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleReadOnly_in_rule__Entity__ReadOnlyAssignment_411360);
            ruleReadOnly();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getReadOnlyReadOnlyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__ReadOnlyAssignment_4"


    // $ANTLR start "rule__Entity__CacheableAssignment_5"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5640:1: rule__Entity__CacheableAssignment_5 : ( ruleCacheable ) ;
    public final void rule__Entity__CacheableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5644:1: ( ( ruleCacheable ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5645:1: ( ruleCacheable )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5645:1: ( ruleCacheable )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5646:1: ruleCacheable
            {
             before(grammarAccess.getEntityAccess().getCacheableCacheableParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleCacheable_in_rule__Entity__CacheableAssignment_511391);
            ruleCacheable();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getCacheableCacheableParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__CacheableAssignment_5"


    // $ANTLR start "rule__Entity__IdentifierAssignment_7"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5655:1: rule__Entity__IdentifierAssignment_7 : ( ruleIdentifier ) ;
    public final void rule__Entity__IdentifierAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5659:1: ( ( ruleIdentifier ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5660:1: ( ruleIdentifier )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5660:1: ( ruleIdentifier )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5661:1: ruleIdentifier
            {
             before(grammarAccess.getEntityAccess().getIdentifierIdentifierParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__Entity__IdentifierAssignment_711422);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getIdentifierIdentifierParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__IdentifierAssignment_7"


    // $ANTLR start "rule__Entity__ImportsAssignment_8"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5670:1: rule__Entity__ImportsAssignment_8 : ( ruleImport ) ;
    public final void rule__Entity__ImportsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5674:1: ( ( ruleImport ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5675:1: ( ruleImport )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5675:1: ( ruleImport )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5676:1: ruleImport
            {
             before(grammarAccess.getEntityAccess().getImportsImportParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Entity__ImportsAssignment_811453);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getImportsImportParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__ImportsAssignment_8"


    // $ANTLR start "rule__Entity__FeaturesAssignment_9"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5685:1: rule__Entity__FeaturesAssignment_9 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5689:1: ( ( ruleFeature ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5690:1: ( ruleFeature )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5690:1: ( ruleFeature )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5691:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_911484);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FeaturesAssignment_9"


    // $ANTLR start "rule__ReadOnly__TableNameAssignment_1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5700:1: rule__ReadOnly__TableNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ReadOnly__TableNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5704:1: ( ( RULE_STRING ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5705:1: ( RULE_STRING )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5705:1: ( RULE_STRING )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5706:1: RULE_STRING
            {
             before(grammarAccess.getReadOnlyAccess().getTableNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ReadOnly__TableNameAssignment_111515); 
             after(grammarAccess.getReadOnlyAccess().getTableNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnly__TableNameAssignment_1"


    // $ANTLR start "rule__ReadOnly__IdColumnAssignment_2"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5715:1: rule__ReadOnly__IdColumnAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ReadOnly__IdColumnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5719:1: ( ( RULE_STRING ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5720:1: ( RULE_STRING )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5720:1: ( RULE_STRING )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5721:1: RULE_STRING
            {
             before(grammarAccess.getReadOnlyAccess().getIdColumnSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ReadOnly__IdColumnAssignment_211546); 
             after(grammarAccess.getReadOnlyAccess().getIdColumnSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnly__IdColumnAssignment_2"


    // $ANTLR start "rule__UniqueIdentiferColumn__NameAssignment_1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5730:1: rule__UniqueIdentiferColumn__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__UniqueIdentiferColumn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5734:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5735:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5735:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5736:1: RULE_ID
            {
             before(grammarAccess.getUniqueIdentiferColumnAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UniqueIdentiferColumn__NameAssignment_111577); 
             after(grammarAccess.getUniqueIdentiferColumnAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueIdentiferColumn__NameAssignment_1"


    // $ANTLR start "rule__EmbeddedUniqueIdentifer__NameAssignment_1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5745:1: rule__EmbeddedUniqueIdentifer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EmbeddedUniqueIdentifer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5749:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5750:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5750:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5751:1: RULE_ID
            {
             before(grammarAccess.getEmbeddedUniqueIdentiferAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EmbeddedUniqueIdentifer__NameAssignment_111608); 
             after(grammarAccess.getEmbeddedUniqueIdentiferAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmbeddedUniqueIdentifer__NameAssignment_1"


    // $ANTLR start "rule__StaticAttribute__NameAssignment_1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5760:1: rule__StaticAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StaticAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5764:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5765:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5765:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5766:1: RULE_ID
            {
             before(grammarAccess.getStaticAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StaticAttribute__NameAssignment_111639); 
             after(grammarAccess.getStaticAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticAttribute__NameAssignment_1"


    // $ANTLR start "rule__StaticAttribute__TypeAssignment_3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5775:1: rule__StaticAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__StaticAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5779:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5780:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5780:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5781:1: ruleTypeRef
            {
             before(grammarAccess.getStaticAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__StaticAttribute__TypeAssignment_311670);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getStaticAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticAttribute__TypeAssignment_3"


    // $ANTLR start "rule__ReadOnlyInternalAttribute__NameAssignment_0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5790:1: rule__ReadOnlyInternalAttribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ReadOnlyInternalAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5794:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5795:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5795:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5796:1: RULE_ID
            {
             before(grammarAccess.getReadOnlyInternalAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ReadOnlyInternalAttribute__NameAssignment_011701); 
             after(grammarAccess.getReadOnlyInternalAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnlyInternalAttribute__NameAssignment_0"


    // $ANTLR start "rule__ReadOnlyInternalAttribute__TypeAssignment_2"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5805:1: rule__ReadOnlyInternalAttribute__TypeAssignment_2 : ( ruleTypeRef ) ;
    public final void rule__ReadOnlyInternalAttribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5809:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5810:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5810:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5811:1: ruleTypeRef
            {
             before(grammarAccess.getReadOnlyInternalAttributeAccess().getTypeTypeRefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__ReadOnlyInternalAttribute__TypeAssignment_211732);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getReadOnlyInternalAttributeAccess().getTypeTypeRefParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnlyInternalAttribute__TypeAssignment_2"


    // $ANTLR start "rule__UpdatableInternalAttribute__NameAssignment_1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5820:1: rule__UpdatableInternalAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__UpdatableInternalAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5824:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5825:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5825:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5826:1: RULE_ID
            {
             before(grammarAccess.getUpdatableInternalAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UpdatableInternalAttribute__NameAssignment_111763); 
             after(grammarAccess.getUpdatableInternalAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdatableInternalAttribute__NameAssignment_1"


    // $ANTLR start "rule__UpdatableInternalAttribute__TypeAssignment_3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5835:1: rule__UpdatableInternalAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__UpdatableInternalAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5839:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5840:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5840:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5841:1: ruleTypeRef
            {
             before(grammarAccess.getUpdatableInternalAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__UpdatableInternalAttribute__TypeAssignment_311794);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getUpdatableInternalAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdatableInternalAttribute__TypeAssignment_3"


    // $ANTLR start "rule__TransientAttribute__NameAssignment_1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5850:1: rule__TransientAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TransientAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5854:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5855:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5855:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5856:1: RULE_ID
            {
             before(grammarAccess.getTransientAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TransientAttribute__NameAssignment_111825); 
             after(grammarAccess.getTransientAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransientAttribute__NameAssignment_1"


    // $ANTLR start "rule__TransientAttribute__TypeAssignment_3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5865:1: rule__TransientAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__TransientAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5869:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5870:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5870:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5871:1: ruleTypeRef
            {
             before(grammarAccess.getTransientAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__TransientAttribute__TypeAssignment_311856);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getTransientAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransientAttribute__TypeAssignment_3"


    // $ANTLR start "rule__IdAttribute__NameAssignment_1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5880:1: rule__IdAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__IdAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5884:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5885:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5885:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5886:1: RULE_ID
            {
             before(grammarAccess.getIdAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IdAttribute__NameAssignment_111887); 
             after(grammarAccess.getIdAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdAttribute__NameAssignment_1"


    // $ANTLR start "rule__IdAttribute__TypeAssignment_3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5895:1: rule__IdAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__IdAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5899:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5900:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5900:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5901:1: ruleTypeRef
            {
             before(grammarAccess.getIdAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__IdAttribute__TypeAssignment_311918);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getIdAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdAttribute__TypeAssignment_3"


    // $ANTLR start "rule__OneToOneRelationshipAttribute__NameAssignment_1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5910:1: rule__OneToOneRelationshipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OneToOneRelationshipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5914:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5915:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5915:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5916:1: RULE_ID
            {
             before(grammarAccess.getOneToOneRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OneToOneRelationshipAttribute__NameAssignment_111949); 
             after(grammarAccess.getOneToOneRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneRelationshipAttribute__NameAssignment_1"


    // $ANTLR start "rule__OneToOneRelationshipAttribute__TypeAssignment_3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5925:1: rule__OneToOneRelationshipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__OneToOneRelationshipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5929:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5930:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5930:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5931:1: ruleTypeRef
            {
             before(grammarAccess.getOneToOneRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__OneToOneRelationshipAttribute__TypeAssignment_311980);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getOneToOneRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneRelationshipAttribute__TypeAssignment_3"


    // $ANTLR start "rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5940:1: rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4 : ( RULE_STRING ) ;
    public final void rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5944:1: ( ( RULE_STRING ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5945:1: ( RULE_STRING )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5945:1: ( RULE_STRING )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5946:1: RULE_STRING
            {
             before(grammarAccess.getOneToOneRelationshipAttributeAccess().getJoinColumnOverrideSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_412011); 
             after(grammarAccess.getOneToOneRelationshipAttributeAccess().getJoinColumnOverrideSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4"


    // $ANTLR start "rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5955:1: rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5959:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5960:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5960:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5961:1: RULE_ID
            {
             before(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OneToOneMappedByRelationshipAttribute__NameAssignment_112042); 
             after(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1"


    // $ANTLR start "rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5970:1: rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5974:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5975:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5975:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5976:1: ruleTypeRef
            {
             before(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_312073);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3"


    // $ANTLR start "rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5985:1: rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5989:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5990:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5990:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5991:1: RULE_ID
            {
             before(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_112104); 
             after(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1"


    // $ANTLR start "rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6000:1: rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6004:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6005:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6005:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6006:1: ruleTypeRef
            {
             before(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_312135);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3"


    // $ANTLR start "rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6015:1: rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6019:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6020:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6020:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6021:1: RULE_ID
            {
             before(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_112166); 
             after(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1"


    // $ANTLR start "rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6030:1: rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6034:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6035:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6035:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6036:1: ruleTypeRef
            {
             before(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_312197);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3"


    // $ANTLR start "rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6045:1: rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6049:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6050:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6050:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6051:1: RULE_ID
            {
             before(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OneToManyMappedByRelationshipAttribute__NameAssignment_112228); 
             after(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1"


    // $ANTLR start "rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6060:1: rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6064:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6065:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6065:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6066:1: ruleTypeRef
            {
             before(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_312259);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3"


    // $ANTLR start "rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6075:1: rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6079:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6080:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6080:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6081:1: RULE_ID
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_112290); 
             after(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1"


    // $ANTLR start "rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6090:1: rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6094:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6095:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6095:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6096:1: ruleTypeRef
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_312321);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3"


    // $ANTLR start "rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6105:1: rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6109:1: ( ( RULE_STRING ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6110:1: ( RULE_STRING )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6110:1: ( RULE_STRING )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6111:1: RULE_STRING
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getJoinColumnOverrideSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_412352); 
             after(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getJoinColumnOverrideSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4"


    // $ANTLR start "rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6120:1: rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6124:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6125:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6125:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6126:1: RULE_ID
            {
             before(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_112383); 
             after(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1"


    // $ANTLR start "rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6135:1: rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6139:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6140:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6140:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6141:1: ruleTypeRef
            {
             before(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_312414);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3"


    // $ANTLR start "rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6150:1: rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6154:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6155:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6155:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6156:1: RULE_ID
            {
             before(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_112445); 
             after(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1"


    // $ANTLR start "rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6165:1: rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6169:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6170:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6170:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6171:1: ruleTypeRef
            {
             before(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_312476);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3"


    // $ANTLR start "rule__ManyToManyRelationshipAttribute__NameAssignment_1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6180:1: rule__ManyToManyRelationshipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ManyToManyRelationshipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6184:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6185:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6185:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6186:1: RULE_ID
            {
             before(grammarAccess.getManyToManyRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ManyToManyRelationshipAttribute__NameAssignment_112507); 
             after(grammarAccess.getManyToManyRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyRelationshipAttribute__NameAssignment_1"


    // $ANTLR start "rule__ManyToManyRelationshipAttribute__TypeAssignment_3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6195:1: rule__ManyToManyRelationshipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__ManyToManyRelationshipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6199:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6200:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6200:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6201:1: ruleTypeRef
            {
             before(grammarAccess.getManyToManyRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__ManyToManyRelationshipAttribute__TypeAssignment_312538);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getManyToManyRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyRelationshipAttribute__TypeAssignment_3"


    // $ANTLR start "rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6210:1: rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6214:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6215:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6215:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6216:1: RULE_ID
            {
             before(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_112569); 
             after(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1"


    // $ANTLR start "rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6225:1: rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6229:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6230:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6230:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6231:1: ruleTypeRef
            {
             before(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_312600);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3"


    // $ANTLR start "rule__Reference__NameAssignment_1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6240:1: rule__Reference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Reference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6244:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6245:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6245:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6246:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_112631); 
             after(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__NameAssignment_1"


    // $ANTLR start "rule__Reference__TypeAssignment_3"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6255:1: rule__Reference__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__Reference__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6259:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6260:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6260:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6261:1: ruleTypeRef
            {
             before(grammarAccess.getReferenceAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Reference__TypeAssignment_312662);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__TypeAssignment_3"


    // $ANTLR start "rule__Reference__OppositeAssignment_4_1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6270:1: rule__Reference__OppositeAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__OppositeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6274:1: ( ( ( RULE_ID ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6275:1: ( ( RULE_ID ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6275:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6276:1: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getOppositeReferenceCrossReference_4_1_0()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6277:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6278:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getOppositeReferenceIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__OppositeAssignment_4_112697); 
             after(grammarAccess.getReferenceAccess().getOppositeReferenceIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getOppositeReferenceCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__OppositeAssignment_4_1"


    // $ANTLR start "rule__Operation__VisibilityAssignment_0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6289:1: rule__Operation__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Operation__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6293:1: ( ( ruleVisibility ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6294:1: ( ruleVisibility )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6294:1: ( ruleVisibility )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6295:1: ruleVisibility
            {
             before(grammarAccess.getOperationAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVisibility_in_rule__Operation__VisibilityAssignment_012732);
            ruleVisibility();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__VisibilityAssignment_0"


    // $ANTLR start "rule__Operation__NameAssignment_2"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6304:1: rule__Operation__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6308:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6309:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6309:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6310:1: RULE_ID
            {
             before(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_212763); 
             after(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__NameAssignment_2"


    // $ANTLR start "rule__Operation__ParamsAssignment_4_0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6319:1: rule__Operation__ParamsAssignment_4_0 : ( ruleParameter ) ;
    public final void rule__Operation__ParamsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6323:1: ( ( ruleParameter ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6324:1: ( ruleParameter )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6324:1: ( ruleParameter )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6325:1: ruleParameter
            {
             before(grammarAccess.getOperationAccess().getParamsParameterParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Operation__ParamsAssignment_4_012794);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getParamsParameterParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ParamsAssignment_4_0"


    // $ANTLR start "rule__Operation__ParamsAssignment_4_1_1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6334:1: rule__Operation__ParamsAssignment_4_1_1 : ( ruleParameter ) ;
    public final void rule__Operation__ParamsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6338:1: ( ( ruleParameter ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6339:1: ( ruleParameter )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6339:1: ( ruleParameter )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6340:1: ruleParameter
            {
             before(grammarAccess.getOperationAccess().getParamsParameterParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Operation__ParamsAssignment_4_1_112825);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getParamsParameterParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ParamsAssignment_4_1_1"


    // $ANTLR start "rule__Operation__TypeAssignment_7"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6349:1: rule__Operation__TypeAssignment_7 : ( ruleTypeRef ) ;
    public final void rule__Operation__TypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6353:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6354:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6354:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6355:1: ruleTypeRef
            {
             before(grammarAccess.getOperationAccess().getTypeTypeRefParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Operation__TypeAssignment_712856);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getTypeTypeRefParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__TypeAssignment_7"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6364:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6368:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6369:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6369:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6370:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_012887); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_0"


    // $ANTLR start "rule__Parameter__TypeAssignment_1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6379:1: rule__Parameter__TypeAssignment_1 : ( ruleTypeRef ) ;
    public final void rule__Parameter__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6383:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6384:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6384:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6385:1: ruleTypeRef
            {
             before(grammarAccess.getParameterAccess().getTypeTypeRefParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Parameter__TypeAssignment_112918);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeTypeRefParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_1"


    // $ANTLR start "rule__TypeRef__ReferencedAssignment_0"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6394:1: rule__TypeRef__ReferencedAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypeRef__ReferencedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6398:1: ( ( ( RULE_ID ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6399:1: ( ( RULE_ID ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6399:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6400:1: ( RULE_ID )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6401:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6402:1: RULE_ID
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeRef__ReferencedAssignment_012953); 
             after(grammarAccess.getTypeRefAccess().getReferencedTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__ReferencedAssignment_0"


    // $ANTLR start "rule__TypeRef__MultiAssignment_1"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6413:1: rule__TypeRef__MultiAssignment_1 : ( ( '*' ) ) ;
    public final void rule__TypeRef__MultiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6417:1: ( ( ( '*' ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6418:1: ( ( '*' ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6418:1: ( ( '*' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6419:1: ( '*' )
            {
             before(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6420:1: ( '*' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6421:1: '*'
            {
             before(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 
            match(input,49,FOLLOW_49_in_rule__TypeRef__MultiAssignment_112993); 
             after(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__MultiAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ElementsAssignment_in_ruleModel94 = new BitSet(new long[]{0x000001FF8014C002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0_in_ruleDataType395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatabaseMode_in_entryRuleDatabaseMode422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatabaseMode429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DatabaseMode__Group__0_in_ruleDatabaseMode455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadOnly_in_entryRuleReadOnly542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReadOnly549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadOnly__Group__0_in_ruleReadOnly575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCacheable_in_entryRuleCacheable602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCacheable609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cacheable__Group__0_in_ruleCacheable635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Alternatives_in_ruleIdentifier695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueIdentiferColumn_in_entryRuleUniqueIdentiferColumn722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniqueIdentiferColumn729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueIdentiferColumn__Group__0_in_ruleUniqueIdentiferColumn755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmbeddedUniqueIdentifer_in_entryRuleEmbeddedUniqueIdentifer782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmbeddedUniqueIdentifer789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmbeddedUniqueIdentifer__Group__0_in_ruleEmbeddedUniqueIdentifer815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Alternatives_in_ruleFeature875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralFeature_in_entryRuleStructuralFeature902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructuralFeature909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuralFeature__Alternatives_in_ruleStructuralFeature935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticAttribute_in_entryRuleStaticAttribute1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticAttribute1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticAttribute__Group__0_in_ruleStaticAttribute1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalAttribute_in_entryRuleInternalAttribute1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalAttribute1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalAttribute__Alternatives_in_ruleInternalAttribute1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipAttribute_in_entryRuleRelationshipAttribute1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationshipAttribute1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipAttribute__Alternatives_in_ruleRelationshipAttribute1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingularRelationshipAttribute_in_entryRuleSingularRelationshipAttribute1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingularRelationshipAttribute1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingularRelationshipAttribute__Alternatives_in_ruleSingularRelationshipAttribute1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultipleRelationshipAttribute_in_entryRuleMultipleRelationshipAttribute1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultipleRelationshipAttribute1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultipleRelationshipAttribute__Alternatives_in_ruleMultipleRelationshipAttribute1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadOnlyInternalAttribute_in_entryRuleReadOnlyInternalAttribute1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReadOnlyInternalAttribute1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadOnlyInternalAttribute__Group__0_in_ruleReadOnlyInternalAttribute1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdatableInternalAttribute_in_entryRuleUpdatableInternalAttribute1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdatableInternalAttribute1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdatableInternalAttribute__Group__0_in_ruleUpdatableInternalAttribute1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransientAttribute_in_entryRuleTransientAttribute1442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransientAttribute1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransientAttribute__Group__0_in_ruleTransientAttribute1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdAttribute_in_entryRuleIdAttribute1502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdAttribute1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdAttribute__Group__0_in_ruleIdAttribute1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneToOneRelationshipAttribute_in_entryRuleOneToOneRelationshipAttribute1562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneToOneRelationshipAttribute1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneRelationshipAttribute__Group__0_in_ruleOneToOneRelationshipAttribute1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneToOneMappedByRelationshipAttribute_in_entryRuleOneToOneMappedByRelationshipAttribute1622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneToOneMappedByRelationshipAttribute1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__0_in_ruleOneToOneMappedByRelationshipAttribute1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneToManyJoinTableRelationshipAttribute_in_entryRuleOneToManyJoinTableRelationshipAttribute1682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneToManyJoinTableRelationshipAttribute1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__0_in_ruleOneToManyJoinTableRelationshipAttribute1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneToManyJoinColumnRelationshipAttribute_in_entryRuleOneToManyJoinColumnRelationshipAttribute1742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneToManyJoinColumnRelationshipAttribute1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__0_in_ruleOneToManyJoinColumnRelationshipAttribute1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneToManyMappedByRelationshipAttribute_in_entryRuleOneToManyMappedByRelationshipAttribute1802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneToManyMappedByRelationshipAttribute1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__0_in_ruleOneToManyMappedByRelationshipAttribute1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManyToOneJoinColumnRelationShipAttribute_in_entryRuleManyToOneJoinColumnRelationShipAttribute1862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleManyToOneJoinColumnRelationShipAttribute1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__0_in_ruleManyToOneJoinColumnRelationShipAttribute1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManyToOneJoinTableRelationShipAttribute_in_entryRuleManyToOneJoinTableRelationShipAttribute1922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleManyToOneJoinTableRelationShipAttribute1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__0_in_ruleManyToOneJoinTableRelationShipAttribute1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManyToOneMappedByRelationShipAttribute_in_entryRuleManyToOneMappedByRelationShipAttribute1982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleManyToOneMappedByRelationShipAttribute1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__0_in_ruleManyToOneMappedByRelationShipAttribute2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManyToManyRelationshipAttribute_in_entryRuleManyToManyRelationshipAttribute2042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleManyToManyRelationshipAttribute2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToManyRelationshipAttribute__Group__0_in_ruleManyToManyRelationshipAttribute2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManyToManyMappedByRelationshipAttribute_in_entryRuleManyToManyMappedByRelationshipAttribute2102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleManyToManyMappedByRelationshipAttribute2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__0_in_ruleManyToManyMappedByRelationshipAttribute2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference2162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0_in_ruleReference2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation2222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0_in_ruleOperation2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter2282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef2344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard2404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__AbstractElement__Alternatives2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__AbstractElement__Alternatives2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__AbstractElement__Alternatives2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipAttribute_in_rule__AbstractElement__Alternatives2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__Type__Alternatives2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueIdentiferColumn_in_rule__Identifier__Alternatives2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmbeddedUniqueIdentifer_in_rule__Identifier__Alternatives2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralFeature_in_rule__Feature__Alternatives2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__Feature__Alternatives2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__StructuralFeature__Alternatives2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__StructuralFeature__Alternatives2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalAttribute_in_rule__Attribute__Alternatives2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipAttribute_in_rule__Attribute__Alternatives2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticAttribute_in_rule__Attribute__Alternatives2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadOnlyInternalAttribute_in_rule__InternalAttribute__Alternatives2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdatableInternalAttribute_in_rule__InternalAttribute__Alternatives2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransientAttribute_in_rule__InternalAttribute__Alternatives2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdAttribute_in_rule__InternalAttribute__Alternatives2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingularRelationshipAttribute_in_rule__RelationshipAttribute__Alternatives2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultipleRelationshipAttribute_in_rule__RelationshipAttribute__Alternatives3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneToOneRelationshipAttribute_in_rule__SingularRelationshipAttribute__Alternatives3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneToOneMappedByRelationshipAttribute_in_rule__SingularRelationshipAttribute__Alternatives3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManyToOneJoinColumnRelationShipAttribute_in_rule__SingularRelationshipAttribute__Alternatives3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManyToOneJoinTableRelationShipAttribute_in_rule__SingularRelationshipAttribute__Alternatives3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManyToOneMappedByRelationShipAttribute_in_rule__SingularRelationshipAttribute__Alternatives3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneToManyJoinTableRelationshipAttribute_in_rule__MultipleRelationshipAttribute__Alternatives3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneToManyMappedByRelationshipAttribute_in_rule__MultipleRelationshipAttribute__Alternatives3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManyToManyRelationshipAttribute_in_rule__MultipleRelationshipAttribute__Alternatives3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManyToManyMappedByRelationshipAttribute_in_rule__MultipleRelationshipAttribute__Alternatives3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneToManyJoinColumnRelationshipAttribute_in_rule__MultipleRelationshipAttribute__Alternatives3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Visibility__Alternatives3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Visibility__Alternatives3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Visibility__Alternatives3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Import__Group__0__Impl3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl3412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__03446 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__03449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PackageDeclaration__Group__0__Impl3477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__13508 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__13511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__23568 = new BitSet(new long[]{0x000001FF801EC000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__23571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PackageDeclaration__Group__2__Impl3599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__33630 = new BitSet(new long[]{0x000001FF801EC000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__33633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__DatabaseModesAssignment_3_in_rule__PackageDeclaration__Group__3__Impl3660 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__43691 = new BitSet(new long[]{0x000001FF801EC000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__5_in_rule__PackageDeclaration__Group__43694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__ElementsAssignment_4_in_rule__PackageDeclaration__Group__4__Impl3721 = new BitSet(new long[]{0x000001FF8014C002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__5__Impl_in_rule__PackageDeclaration__Group__53752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PackageDeclaration__Group__5__Impl3780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__03823 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__03826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DataType__Group__0__Impl3854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__13885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl3912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DatabaseMode__Group__0__Impl_in_rule__DatabaseMode__Group__03946 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DatabaseMode__Group__1_in_rule__DatabaseMode__Group__03949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DatabaseMode__Group__0__Impl3977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DatabaseMode__Group__1__Impl_in_rule__DatabaseMode__Group__14008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DatabaseMode__NameAssignment_1_in_rule__DatabaseMode__Group__1__Impl4035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__04069 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__04072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Entity__Group__0__Impl4100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__14131 = new BitSet(new long[]{0x0000000000E10010L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__14134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl4161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__24191 = new BitSet(new long[]{0x0000000000E10010L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__24194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__DatabaseVendorAssignment_2_in_rule__Entity__Group__2__Impl4221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__34252 = new BitSet(new long[]{0x0000000000E10010L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__34255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__44313 = new BitSet(new long[]{0x0000000000E10010L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__44316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__ReadOnlyAssignment_4_in_rule__Entity__Group__4__Impl4343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__54374 = new BitSet(new long[]{0x0000000000E10010L});
    public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__54377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__CacheableAssignment_5_in_rule__Entity__Group__5__Impl4404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__64435 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__64438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Entity__Group__6__Impl4466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__74497 = new BitSet(new long[]{0x00000BFFF416F810L});
    public static final BitSet FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__74500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__IdentifierAssignment_7_in_rule__Entity__Group__7__Impl4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__84557 = new BitSet(new long[]{0x00000BFFF416F810L});
    public static final BitSet FOLLOW_rule__Entity__Group__9_in_rule__Entity__Group__84560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__ImportsAssignment_8_in_rule__Entity__Group__8__Impl4587 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Entity__Group__9__Impl_in_rule__Entity__Group__94618 = new BitSet(new long[]{0x00000BFFF416F810L});
    public static final BitSet FOLLOW_rule__Entity__Group__10_in_rule__Entity__Group__94621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_9_in_rule__Entity__Group__9__Impl4648 = new BitSet(new long[]{0x00000BFFF414F812L});
    public static final BitSet FOLLOW_rule__Entity__Group__10__Impl_in_rule__Entity__Group__104679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Entity__Group__10__Impl4707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__04760 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__04763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Entity__Group_3__0__Impl4791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__14822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperTypeAssignment_3_1_in_rule__Entity__Group_3__1__Impl4849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadOnly__Group__0__Impl_in_rule__ReadOnly__Group__04883 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ReadOnly__Group__1_in_rule__ReadOnly__Group__04886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ReadOnly__Group__0__Impl4914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadOnly__Group__1__Impl_in_rule__ReadOnly__Group__14945 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ReadOnly__Group__2_in_rule__ReadOnly__Group__14948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadOnly__TableNameAssignment_1_in_rule__ReadOnly__Group__1__Impl4975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadOnly__Group__2__Impl_in_rule__ReadOnly__Group__25005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadOnly__IdColumnAssignment_2_in_rule__ReadOnly__Group__2__Impl5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cacheable__Group__0__Impl_in_rule__Cacheable__Group__05068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__Cacheable__Group__1_in_rule__Cacheable__Group__05071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Cacheable__Group__0__Impl5099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cacheable__Group__1__Impl_in_rule__Cacheable__Group__15130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueIdentiferColumn__Group__0__Impl_in_rule__UniqueIdentiferColumn__Group__05192 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UniqueIdentiferColumn__Group__1_in_rule__UniqueIdentiferColumn__Group__05195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__UniqueIdentiferColumn__Group__0__Impl5223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueIdentiferColumn__Group__1__Impl_in_rule__UniqueIdentiferColumn__Group__15254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueIdentiferColumn__NameAssignment_1_in_rule__UniqueIdentiferColumn__Group__1__Impl5281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmbeddedUniqueIdentifer__Group__0__Impl_in_rule__EmbeddedUniqueIdentifer__Group__05315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EmbeddedUniqueIdentifer__Group__1_in_rule__EmbeddedUniqueIdentifer__Group__05318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EmbeddedUniqueIdentifer__Group__0__Impl5346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmbeddedUniqueIdentifer__Group__1__Impl_in_rule__EmbeddedUniqueIdentifer__Group__15377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmbeddedUniqueIdentifer__NameAssignment_1_in_rule__EmbeddedUniqueIdentifer__Group__1__Impl5404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticAttribute__Group__0__Impl_in_rule__StaticAttribute__Group__05438 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StaticAttribute__Group__1_in_rule__StaticAttribute__Group__05441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__StaticAttribute__Group__0__Impl5469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticAttribute__Group__1__Impl_in_rule__StaticAttribute__Group__15500 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__StaticAttribute__Group__2_in_rule__StaticAttribute__Group__15503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticAttribute__NameAssignment_1_in_rule__StaticAttribute__Group__1__Impl5530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticAttribute__Group__2__Impl_in_rule__StaticAttribute__Group__25560 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StaticAttribute__Group__3_in_rule__StaticAttribute__Group__25563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__StaticAttribute__Group__2__Impl5591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticAttribute__Group__3__Impl_in_rule__StaticAttribute__Group__35622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticAttribute__TypeAssignment_3_in_rule__StaticAttribute__Group__3__Impl5649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadOnlyInternalAttribute__Group__0__Impl_in_rule__ReadOnlyInternalAttribute__Group__05687 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ReadOnlyInternalAttribute__Group__1_in_rule__ReadOnlyInternalAttribute__Group__05690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadOnlyInternalAttribute__NameAssignment_0_in_rule__ReadOnlyInternalAttribute__Group__0__Impl5717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadOnlyInternalAttribute__Group__1__Impl_in_rule__ReadOnlyInternalAttribute__Group__15747 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ReadOnlyInternalAttribute__Group__2_in_rule__ReadOnlyInternalAttribute__Group__15750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ReadOnlyInternalAttribute__Group__1__Impl5778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadOnlyInternalAttribute__Group__2__Impl_in_rule__ReadOnlyInternalAttribute__Group__25809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadOnlyInternalAttribute__TypeAssignment_2_in_rule__ReadOnlyInternalAttribute__Group__2__Impl5836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdatableInternalAttribute__Group__0__Impl_in_rule__UpdatableInternalAttribute__Group__05872 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UpdatableInternalAttribute__Group__1_in_rule__UpdatableInternalAttribute__Group__05875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__UpdatableInternalAttribute__Group__0__Impl5903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdatableInternalAttribute__Group__1__Impl_in_rule__UpdatableInternalAttribute__Group__15934 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__UpdatableInternalAttribute__Group__2_in_rule__UpdatableInternalAttribute__Group__15937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdatableInternalAttribute__NameAssignment_1_in_rule__UpdatableInternalAttribute__Group__1__Impl5964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdatableInternalAttribute__Group__2__Impl_in_rule__UpdatableInternalAttribute__Group__25994 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UpdatableInternalAttribute__Group__3_in_rule__UpdatableInternalAttribute__Group__25997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__UpdatableInternalAttribute__Group__2__Impl6025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdatableInternalAttribute__Group__3__Impl_in_rule__UpdatableInternalAttribute__Group__36056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdatableInternalAttribute__TypeAssignment_3_in_rule__UpdatableInternalAttribute__Group__3__Impl6083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransientAttribute__Group__0__Impl_in_rule__TransientAttribute__Group__06121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TransientAttribute__Group__1_in_rule__TransientAttribute__Group__06124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TransientAttribute__Group__0__Impl6152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransientAttribute__Group__1__Impl_in_rule__TransientAttribute__Group__16183 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__TransientAttribute__Group__2_in_rule__TransientAttribute__Group__16186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransientAttribute__NameAssignment_1_in_rule__TransientAttribute__Group__1__Impl6213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransientAttribute__Group__2__Impl_in_rule__TransientAttribute__Group__26243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TransientAttribute__Group__3_in_rule__TransientAttribute__Group__26246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TransientAttribute__Group__2__Impl6274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransientAttribute__Group__3__Impl_in_rule__TransientAttribute__Group__36305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransientAttribute__TypeAssignment_3_in_rule__TransientAttribute__Group__3__Impl6332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdAttribute__Group__0__Impl_in_rule__IdAttribute__Group__06370 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IdAttribute__Group__1_in_rule__IdAttribute__Group__06373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__IdAttribute__Group__0__Impl6401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdAttribute__Group__1__Impl_in_rule__IdAttribute__Group__16432 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__IdAttribute__Group__2_in_rule__IdAttribute__Group__16435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdAttribute__NameAssignment_1_in_rule__IdAttribute__Group__1__Impl6462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdAttribute__Group__2__Impl_in_rule__IdAttribute__Group__26492 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IdAttribute__Group__3_in_rule__IdAttribute__Group__26495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__IdAttribute__Group__2__Impl6523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdAttribute__Group__3__Impl_in_rule__IdAttribute__Group__36554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdAttribute__TypeAssignment_3_in_rule__IdAttribute__Group__3__Impl6581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneRelationshipAttribute__Group__0__Impl_in_rule__OneToOneRelationshipAttribute__Group__06619 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OneToOneRelationshipAttribute__Group__1_in_rule__OneToOneRelationshipAttribute__Group__06622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__OneToOneRelationshipAttribute__Group__0__Impl6650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneRelationshipAttribute__Group__1__Impl_in_rule__OneToOneRelationshipAttribute__Group__16681 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__OneToOneRelationshipAttribute__Group__2_in_rule__OneToOneRelationshipAttribute__Group__16684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneRelationshipAttribute__NameAssignment_1_in_rule__OneToOneRelationshipAttribute__Group__1__Impl6711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneRelationshipAttribute__Group__2__Impl_in_rule__OneToOneRelationshipAttribute__Group__26741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OneToOneRelationshipAttribute__Group__3_in_rule__OneToOneRelationshipAttribute__Group__26744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__OneToOneRelationshipAttribute__Group__2__Impl6772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneRelationshipAttribute__Group__3__Impl_in_rule__OneToOneRelationshipAttribute__Group__36803 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__OneToOneRelationshipAttribute__Group__4_in_rule__OneToOneRelationshipAttribute__Group__36806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneRelationshipAttribute__TypeAssignment_3_in_rule__OneToOneRelationshipAttribute__Group__3__Impl6833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneRelationshipAttribute__Group__4__Impl_in_rule__OneToOneRelationshipAttribute__Group__46863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4_in_rule__OneToOneRelationshipAttribute__Group__4__Impl6890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl_in_rule__OneToOneMappedByRelationshipAttribute__Group__06931 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__1_in_rule__OneToOneMappedByRelationshipAttribute__Group__06934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl6962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl_in_rule__OneToOneMappedByRelationshipAttribute__Group__16993 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__2_in_rule__OneToOneMappedByRelationshipAttribute__Group__16996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1_in_rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl7023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl_in_rule__OneToOneMappedByRelationshipAttribute__Group__27053 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__3_in_rule__OneToOneMappedByRelationshipAttribute__Group__27056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl7084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__3__Impl_in_rule__OneToOneMappedByRelationshipAttribute__Group__37115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3_in_rule__OneToOneMappedByRelationshipAttribute__Group__3__Impl7142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl_in_rule__OneToManyJoinTableRelationshipAttribute__Group__07180 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__1_in_rule__OneToManyJoinTableRelationshipAttribute__Group__07183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl7211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl_in_rule__OneToManyJoinTableRelationshipAttribute__Group__17242 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__2_in_rule__OneToManyJoinTableRelationshipAttribute__Group__17245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1_in_rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl7272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl_in_rule__OneToManyJoinTableRelationshipAttribute__Group__27302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__3_in_rule__OneToManyJoinTableRelationshipAttribute__Group__27305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl7333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__3__Impl_in_rule__OneToManyJoinTableRelationshipAttribute__Group__37364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3_in_rule__OneToManyJoinTableRelationshipAttribute__Group__3__Impl7391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__07429 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__1_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__07432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl7460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__17491 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__2_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__17494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl7521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__27551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__3_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__27554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl7582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__3__Impl_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__37613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__3__Impl7640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl_in_rule__OneToManyMappedByRelationshipAttribute__Group__07678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__1_in_rule__OneToManyMappedByRelationshipAttribute__Group__07681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl7709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl_in_rule__OneToManyMappedByRelationshipAttribute__Group__17740 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__2_in_rule__OneToManyMappedByRelationshipAttribute__Group__17743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1_in_rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl7770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl_in_rule__OneToManyMappedByRelationshipAttribute__Group__27800 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__3_in_rule__OneToManyMappedByRelationshipAttribute__Group__27803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl7831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__3__Impl_in_rule__OneToManyMappedByRelationshipAttribute__Group__37862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3_in_rule__OneToManyMappedByRelationshipAttribute__Group__3__Impl7889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__07927 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__1_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__07930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl7958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__17989 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__2_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__17992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl8019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__28049 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__3_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__28052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl8080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__38111 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__4_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__38114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl8141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__4__Impl_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__48171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__4__Impl8198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__08239 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__1_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__08242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl8270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__18301 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__2_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__18304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl8331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__28361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__3_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__28364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl8392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__3__Impl_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__38423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__3__Impl8450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl_in_rule__ManyToOneMappedByRelationShipAttribute__Group__08488 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__1_in_rule__ManyToOneMappedByRelationShipAttribute__Group__08491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl8519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl_in_rule__ManyToOneMappedByRelationShipAttribute__Group__18550 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__2_in_rule__ManyToOneMappedByRelationShipAttribute__Group__18553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1_in_rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl8580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl_in_rule__ManyToOneMappedByRelationShipAttribute__Group__28610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__3_in_rule__ManyToOneMappedByRelationShipAttribute__Group__28613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl8641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__3__Impl_in_rule__ManyToOneMappedByRelationShipAttribute__Group__38672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3_in_rule__ManyToOneMappedByRelationShipAttribute__Group__3__Impl8699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToManyRelationshipAttribute__Group__0__Impl_in_rule__ManyToManyRelationshipAttribute__Group__08737 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ManyToManyRelationshipAttribute__Group__1_in_rule__ManyToManyRelationshipAttribute__Group__08740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ManyToManyRelationshipAttribute__Group__0__Impl8768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToManyRelationshipAttribute__Group__1__Impl_in_rule__ManyToManyRelationshipAttribute__Group__18799 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ManyToManyRelationshipAttribute__Group__2_in_rule__ManyToManyRelationshipAttribute__Group__18802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToManyRelationshipAttribute__NameAssignment_1_in_rule__ManyToManyRelationshipAttribute__Group__1__Impl8829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToManyRelationshipAttribute__Group__2__Impl_in_rule__ManyToManyRelationshipAttribute__Group__28859 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ManyToManyRelationshipAttribute__Group__3_in_rule__ManyToManyRelationshipAttribute__Group__28862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ManyToManyRelationshipAttribute__Group__2__Impl8890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToManyRelationshipAttribute__Group__3__Impl_in_rule__ManyToManyRelationshipAttribute__Group__38921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToManyRelationshipAttribute__TypeAssignment_3_in_rule__ManyToManyRelationshipAttribute__Group__3__Impl8948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl_in_rule__ManyToManyMappedByRelationshipAttribute__Group__08986 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__1_in_rule__ManyToManyMappedByRelationshipAttribute__Group__08989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl9017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl_in_rule__ManyToManyMappedByRelationshipAttribute__Group__19048 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__2_in_rule__ManyToManyMappedByRelationshipAttribute__Group__19051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1_in_rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl9078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl_in_rule__ManyToManyMappedByRelationshipAttribute__Group__29108 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__3_in_rule__ManyToManyMappedByRelationshipAttribute__Group__29111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl9139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__3__Impl_in_rule__ManyToManyMappedByRelationshipAttribute__Group__39170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3_in_rule__ManyToManyMappedByRelationshipAttribute__Group__3__Impl9197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__09235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__09238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Reference__Group__0__Impl9266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__19297 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__19300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__NameAssignment_1_in_rule__Reference__Group__1__Impl9327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__29357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__29360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Reference__Group__2__Impl9388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__39419 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__39422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__TypeAssignment_3_in_rule__Reference__Group__3__Impl9449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__49479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__0_in_rule__Reference__Group__4__Impl9506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__0__Impl_in_rule__Reference__Group_4__09547 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__1_in_rule__Reference__Group_4__09550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Reference__Group_4__0__Impl9578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__1__Impl_in_rule__Reference__Group_4__19609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__OppositeAssignment_4_1_in_rule__Reference__Group_4__1__Impl9636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__09670 = new BitSet(new long[]{0x00000BFFF414F810L});
    public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__09673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__VisibilityAssignment_0_in_rule__Operation__Group__0__Impl9700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__19731 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__19734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Operation__Group__1__Impl9762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__29793 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__29796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__NameAssignment_2_in_rule__Operation__Group__2__Impl9823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__39853 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__39856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Operation__Group__3__Impl9884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__49915 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__49918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl9945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__59976 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__6_in_rule__Operation__Group__59979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Operation__Group__5__Impl10007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__6__Impl_in_rule__Operation__Group__610038 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group__7_in_rule__Operation__Group__610041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Operation__Group__6__Impl10069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__7__Impl_in_rule__Operation__Group__710100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__TypeAssignment_7_in_rule__Operation__Group__7__Impl10127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__010173 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__010176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ParamsAssignment_4_0_in_rule__Operation__Group_4__0__Impl10203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__110233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4_1__0_in_rule__Operation__Group_4__1__Impl10260 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4_1__0__Impl_in_rule__Operation__Group_4_1__010295 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group_4_1__1_in_rule__Operation__Group_4_1__010298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Operation__Group_4_1__0__Impl10326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4_1__1__Impl_in_rule__Operation__Group_4_1__110357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ParamsAssignment_4_1_1_in_rule__Operation__Group_4_1__1__Impl10384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__010418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__010421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_0_in_rule__Parameter__Group__0__Impl10448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__110478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_1_in_rule__Parameter__Group__1__Impl10505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__010539 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__010542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl10569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__110599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__MultiAssignment_1_in_rule__TypeRef__Group__1__Impl10626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__010661 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__010664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl10691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__110720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__QualifiedNameWithWildCard__Group__1__Impl10749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__010786 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__010789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl10816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__110845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl10872 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__010907 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__010910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__QualifiedName__Group_1__0__Impl10938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__110969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl10996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__Model__ElementsAssignment11034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_111065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_111096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatabaseMode_in_rule__PackageDeclaration__DatabaseModesAssignment_311127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__PackageDeclaration__ElementsAssignment_411158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_111189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DatabaseMode__NameAssignment_111220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_111251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__DatabaseVendorAssignment_211286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_3_111325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadOnly_in_rule__Entity__ReadOnlyAssignment_411360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCacheable_in_rule__Entity__CacheableAssignment_511391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__Entity__IdentifierAssignment_711422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Entity__ImportsAssignment_811453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_911484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ReadOnly__TableNameAssignment_111515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ReadOnly__IdColumnAssignment_211546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UniqueIdentiferColumn__NameAssignment_111577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EmbeddedUniqueIdentifer__NameAssignment_111608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StaticAttribute__NameAssignment_111639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__StaticAttribute__TypeAssignment_311670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ReadOnlyInternalAttribute__NameAssignment_011701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__ReadOnlyInternalAttribute__TypeAssignment_211732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UpdatableInternalAttribute__NameAssignment_111763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__UpdatableInternalAttribute__TypeAssignment_311794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TransientAttribute__NameAssignment_111825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__TransientAttribute__TypeAssignment_311856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IdAttribute__NameAssignment_111887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__IdAttribute__TypeAssignment_311918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OneToOneRelationshipAttribute__NameAssignment_111949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__OneToOneRelationshipAttribute__TypeAssignment_311980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_412011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OneToOneMappedByRelationshipAttribute__NameAssignment_112042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_312073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_112104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_312135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_112166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_312197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OneToManyMappedByRelationshipAttribute__NameAssignment_112228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_312259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_112290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_312321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_412352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_112383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_312414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_112445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_312476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ManyToManyRelationshipAttribute__NameAssignment_112507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__ManyToManyRelationshipAttribute__TypeAssignment_312538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_112569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_312600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_112631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Reference__TypeAssignment_312662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__OppositeAssignment_4_112697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_rule__Operation__VisibilityAssignment_012732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_212763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Operation__ParamsAssignment_4_012794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Operation__ParamsAssignment_4_1_112825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Operation__TypeAssignment_712856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_012887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Parameter__TypeAssignment_112918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeRef__ReferencedAssignment_012953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__TypeRef__MultiAssignment_112993 = new BitSet(new long[]{0x0000000000000002L});

}