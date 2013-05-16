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


    // $ANTLR start "entryRuleReadOnlyInternalAttribute"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:592:1: entryRuleReadOnlyInternalAttribute : ruleReadOnlyInternalAttribute EOF ;
    public final void entryRuleReadOnlyInternalAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:593:1: ( ruleReadOnlyInternalAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:594:1: ruleReadOnlyInternalAttribute EOF
            {
             before(grammarAccess.getReadOnlyInternalAttributeRule()); 
            pushFollow(FOLLOW_ruleReadOnlyInternalAttribute_in_entryRuleReadOnlyInternalAttribute1202);
            ruleReadOnlyInternalAttribute();

            state._fsp--;

             after(grammarAccess.getReadOnlyInternalAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReadOnlyInternalAttribute1209); 

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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:601:1: ruleReadOnlyInternalAttribute : ( ( rule__ReadOnlyInternalAttribute__Group__0 ) ) ;
    public final void ruleReadOnlyInternalAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:605:2: ( ( ( rule__ReadOnlyInternalAttribute__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:606:1: ( ( rule__ReadOnlyInternalAttribute__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:606:1: ( ( rule__ReadOnlyInternalAttribute__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:607:1: ( rule__ReadOnlyInternalAttribute__Group__0 )
            {
             before(grammarAccess.getReadOnlyInternalAttributeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:608:1: ( rule__ReadOnlyInternalAttribute__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:608:2: rule__ReadOnlyInternalAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ReadOnlyInternalAttribute__Group__0_in_ruleReadOnlyInternalAttribute1235);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:620:1: entryRuleUpdatableInternalAttribute : ruleUpdatableInternalAttribute EOF ;
    public final void entryRuleUpdatableInternalAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:621:1: ( ruleUpdatableInternalAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:622:1: ruleUpdatableInternalAttribute EOF
            {
             before(grammarAccess.getUpdatableInternalAttributeRule()); 
            pushFollow(FOLLOW_ruleUpdatableInternalAttribute_in_entryRuleUpdatableInternalAttribute1262);
            ruleUpdatableInternalAttribute();

            state._fsp--;

             after(grammarAccess.getUpdatableInternalAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdatableInternalAttribute1269); 

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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:629:1: ruleUpdatableInternalAttribute : ( ( rule__UpdatableInternalAttribute__Group__0 ) ) ;
    public final void ruleUpdatableInternalAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:633:2: ( ( ( rule__UpdatableInternalAttribute__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:634:1: ( ( rule__UpdatableInternalAttribute__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:634:1: ( ( rule__UpdatableInternalAttribute__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:635:1: ( rule__UpdatableInternalAttribute__Group__0 )
            {
             before(grammarAccess.getUpdatableInternalAttributeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:636:1: ( rule__UpdatableInternalAttribute__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:636:2: rule__UpdatableInternalAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__UpdatableInternalAttribute__Group__0_in_ruleUpdatableInternalAttribute1295);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:648:1: entryRuleTransientAttribute : ruleTransientAttribute EOF ;
    public final void entryRuleTransientAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:649:1: ( ruleTransientAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:650:1: ruleTransientAttribute EOF
            {
             before(grammarAccess.getTransientAttributeRule()); 
            pushFollow(FOLLOW_ruleTransientAttribute_in_entryRuleTransientAttribute1322);
            ruleTransientAttribute();

            state._fsp--;

             after(grammarAccess.getTransientAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransientAttribute1329); 

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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:657:1: ruleTransientAttribute : ( ( rule__TransientAttribute__Group__0 ) ) ;
    public final void ruleTransientAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:661:2: ( ( ( rule__TransientAttribute__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:662:1: ( ( rule__TransientAttribute__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:662:1: ( ( rule__TransientAttribute__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:663:1: ( rule__TransientAttribute__Group__0 )
            {
             before(grammarAccess.getTransientAttributeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:664:1: ( rule__TransientAttribute__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:664:2: rule__TransientAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__TransientAttribute__Group__0_in_ruleTransientAttribute1355);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:676:1: entryRuleIdAttribute : ruleIdAttribute EOF ;
    public final void entryRuleIdAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:677:1: ( ruleIdAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:678:1: ruleIdAttribute EOF
            {
             before(grammarAccess.getIdAttributeRule()); 
            pushFollow(FOLLOW_ruleIdAttribute_in_entryRuleIdAttribute1382);
            ruleIdAttribute();

            state._fsp--;

             after(grammarAccess.getIdAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdAttribute1389); 

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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:685:1: ruleIdAttribute : ( ( rule__IdAttribute__Group__0 ) ) ;
    public final void ruleIdAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:689:2: ( ( ( rule__IdAttribute__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:690:1: ( ( rule__IdAttribute__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:690:1: ( ( rule__IdAttribute__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:691:1: ( rule__IdAttribute__Group__0 )
            {
             before(grammarAccess.getIdAttributeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:692:1: ( rule__IdAttribute__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:692:2: rule__IdAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__IdAttribute__Group__0_in_ruleIdAttribute1415);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:704:1: entryRuleOneToOneRelationshipAttribute : ruleOneToOneRelationshipAttribute EOF ;
    public final void entryRuleOneToOneRelationshipAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:705:1: ( ruleOneToOneRelationshipAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:706:1: ruleOneToOneRelationshipAttribute EOF
            {
             before(grammarAccess.getOneToOneRelationshipAttributeRule()); 
            pushFollow(FOLLOW_ruleOneToOneRelationshipAttribute_in_entryRuleOneToOneRelationshipAttribute1442);
            ruleOneToOneRelationshipAttribute();

            state._fsp--;

             after(grammarAccess.getOneToOneRelationshipAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneToOneRelationshipAttribute1449); 

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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:713:1: ruleOneToOneRelationshipAttribute : ( ( rule__OneToOneRelationshipAttribute__Group__0 ) ) ;
    public final void ruleOneToOneRelationshipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:717:2: ( ( ( rule__OneToOneRelationshipAttribute__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:718:1: ( ( rule__OneToOneRelationshipAttribute__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:718:1: ( ( rule__OneToOneRelationshipAttribute__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:719:1: ( rule__OneToOneRelationshipAttribute__Group__0 )
            {
             before(grammarAccess.getOneToOneRelationshipAttributeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:720:1: ( rule__OneToOneRelationshipAttribute__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:720:2: rule__OneToOneRelationshipAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__OneToOneRelationshipAttribute__Group__0_in_ruleOneToOneRelationshipAttribute1475);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:732:1: entryRuleOneToOneMappedByRelationshipAttribute : ruleOneToOneMappedByRelationshipAttribute EOF ;
    public final void entryRuleOneToOneMappedByRelationshipAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:733:1: ( ruleOneToOneMappedByRelationshipAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:734:1: ruleOneToOneMappedByRelationshipAttribute EOF
            {
             before(grammarAccess.getOneToOneMappedByRelationshipAttributeRule()); 
            pushFollow(FOLLOW_ruleOneToOneMappedByRelationshipAttribute_in_entryRuleOneToOneMappedByRelationshipAttribute1502);
            ruleOneToOneMappedByRelationshipAttribute();

            state._fsp--;

             after(grammarAccess.getOneToOneMappedByRelationshipAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneToOneMappedByRelationshipAttribute1509); 

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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:741:1: ruleOneToOneMappedByRelationshipAttribute : ( ( rule__OneToOneMappedByRelationshipAttribute__Group__0 ) ) ;
    public final void ruleOneToOneMappedByRelationshipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:745:2: ( ( ( rule__OneToOneMappedByRelationshipAttribute__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:746:1: ( ( rule__OneToOneMappedByRelationshipAttribute__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:746:1: ( ( rule__OneToOneMappedByRelationshipAttribute__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:747:1: ( rule__OneToOneMappedByRelationshipAttribute__Group__0 )
            {
             before(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:748:1: ( rule__OneToOneMappedByRelationshipAttribute__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:748:2: rule__OneToOneMappedByRelationshipAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__0_in_ruleOneToOneMappedByRelationshipAttribute1535);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:760:1: entryRuleOneToManyJoinTableRelationshipAttribute : ruleOneToManyJoinTableRelationshipAttribute EOF ;
    public final void entryRuleOneToManyJoinTableRelationshipAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:761:1: ( ruleOneToManyJoinTableRelationshipAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:762:1: ruleOneToManyJoinTableRelationshipAttribute EOF
            {
             before(grammarAccess.getOneToManyJoinTableRelationshipAttributeRule()); 
            pushFollow(FOLLOW_ruleOneToManyJoinTableRelationshipAttribute_in_entryRuleOneToManyJoinTableRelationshipAttribute1562);
            ruleOneToManyJoinTableRelationshipAttribute();

            state._fsp--;

             after(grammarAccess.getOneToManyJoinTableRelationshipAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneToManyJoinTableRelationshipAttribute1569); 

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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:769:1: ruleOneToManyJoinTableRelationshipAttribute : ( ( rule__OneToManyJoinTableRelationshipAttribute__Group__0 ) ) ;
    public final void ruleOneToManyJoinTableRelationshipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:773:2: ( ( ( rule__OneToManyJoinTableRelationshipAttribute__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:774:1: ( ( rule__OneToManyJoinTableRelationshipAttribute__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:774:1: ( ( rule__OneToManyJoinTableRelationshipAttribute__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:775:1: ( rule__OneToManyJoinTableRelationshipAttribute__Group__0 )
            {
             before(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:776:1: ( rule__OneToManyJoinTableRelationshipAttribute__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:776:2: rule__OneToManyJoinTableRelationshipAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__0_in_ruleOneToManyJoinTableRelationshipAttribute1595);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:788:1: entryRuleOneToManyJoinColumnRelationshipAttribute : ruleOneToManyJoinColumnRelationshipAttribute EOF ;
    public final void entryRuleOneToManyJoinColumnRelationshipAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:789:1: ( ruleOneToManyJoinColumnRelationshipAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:790:1: ruleOneToManyJoinColumnRelationshipAttribute EOF
            {
             before(grammarAccess.getOneToManyJoinColumnRelationshipAttributeRule()); 
            pushFollow(FOLLOW_ruleOneToManyJoinColumnRelationshipAttribute_in_entryRuleOneToManyJoinColumnRelationshipAttribute1622);
            ruleOneToManyJoinColumnRelationshipAttribute();

            state._fsp--;

             after(grammarAccess.getOneToManyJoinColumnRelationshipAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneToManyJoinColumnRelationshipAttribute1629); 

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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:797:1: ruleOneToManyJoinColumnRelationshipAttribute : ( ( rule__OneToManyJoinColumnRelationshipAttribute__Group__0 ) ) ;
    public final void ruleOneToManyJoinColumnRelationshipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:801:2: ( ( ( rule__OneToManyJoinColumnRelationshipAttribute__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:802:1: ( ( rule__OneToManyJoinColumnRelationshipAttribute__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:802:1: ( ( rule__OneToManyJoinColumnRelationshipAttribute__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:803:1: ( rule__OneToManyJoinColumnRelationshipAttribute__Group__0 )
            {
             before(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:804:1: ( rule__OneToManyJoinColumnRelationshipAttribute__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:804:2: rule__OneToManyJoinColumnRelationshipAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__0_in_ruleOneToManyJoinColumnRelationshipAttribute1655);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:816:1: entryRuleOneToManyMappedByRelationshipAttribute : ruleOneToManyMappedByRelationshipAttribute EOF ;
    public final void entryRuleOneToManyMappedByRelationshipAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:817:1: ( ruleOneToManyMappedByRelationshipAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:818:1: ruleOneToManyMappedByRelationshipAttribute EOF
            {
             before(grammarAccess.getOneToManyMappedByRelationshipAttributeRule()); 
            pushFollow(FOLLOW_ruleOneToManyMappedByRelationshipAttribute_in_entryRuleOneToManyMappedByRelationshipAttribute1682);
            ruleOneToManyMappedByRelationshipAttribute();

            state._fsp--;

             after(grammarAccess.getOneToManyMappedByRelationshipAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneToManyMappedByRelationshipAttribute1689); 

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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:825:1: ruleOneToManyMappedByRelationshipAttribute : ( ( rule__OneToManyMappedByRelationshipAttribute__Group__0 ) ) ;
    public final void ruleOneToManyMappedByRelationshipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:829:2: ( ( ( rule__OneToManyMappedByRelationshipAttribute__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:830:1: ( ( rule__OneToManyMappedByRelationshipAttribute__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:830:1: ( ( rule__OneToManyMappedByRelationshipAttribute__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:831:1: ( rule__OneToManyMappedByRelationshipAttribute__Group__0 )
            {
             before(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:832:1: ( rule__OneToManyMappedByRelationshipAttribute__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:832:2: rule__OneToManyMappedByRelationshipAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__0_in_ruleOneToManyMappedByRelationshipAttribute1715);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:844:1: entryRuleManyToOneJoinColumnRelationShipAttribute : ruleManyToOneJoinColumnRelationShipAttribute EOF ;
    public final void entryRuleManyToOneJoinColumnRelationShipAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:845:1: ( ruleManyToOneJoinColumnRelationShipAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:846:1: ruleManyToOneJoinColumnRelationShipAttribute EOF
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeRule()); 
            pushFollow(FOLLOW_ruleManyToOneJoinColumnRelationShipAttribute_in_entryRuleManyToOneJoinColumnRelationShipAttribute1742);
            ruleManyToOneJoinColumnRelationShipAttribute();

            state._fsp--;

             after(grammarAccess.getManyToOneJoinColumnRelationShipAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleManyToOneJoinColumnRelationShipAttribute1749); 

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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:853:1: ruleManyToOneJoinColumnRelationShipAttribute : ( ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__0 ) ) ;
    public final void ruleManyToOneJoinColumnRelationShipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:857:2: ( ( ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:858:1: ( ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:858:1: ( ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:859:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__0 )
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:860:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:860:2: rule__ManyToOneJoinColumnRelationShipAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__0_in_ruleManyToOneJoinColumnRelationShipAttribute1775);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:872:1: entryRuleManyToOneJoinTableRelationShipAttribute : ruleManyToOneJoinTableRelationShipAttribute EOF ;
    public final void entryRuleManyToOneJoinTableRelationShipAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:873:1: ( ruleManyToOneJoinTableRelationShipAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:874:1: ruleManyToOneJoinTableRelationShipAttribute EOF
            {
             before(grammarAccess.getManyToOneJoinTableRelationShipAttributeRule()); 
            pushFollow(FOLLOW_ruleManyToOneJoinTableRelationShipAttribute_in_entryRuleManyToOneJoinTableRelationShipAttribute1802);
            ruleManyToOneJoinTableRelationShipAttribute();

            state._fsp--;

             after(grammarAccess.getManyToOneJoinTableRelationShipAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleManyToOneJoinTableRelationShipAttribute1809); 

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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:881:1: ruleManyToOneJoinTableRelationShipAttribute : ( ( rule__ManyToOneJoinTableRelationShipAttribute__Group__0 ) ) ;
    public final void ruleManyToOneJoinTableRelationShipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:885:2: ( ( ( rule__ManyToOneJoinTableRelationShipAttribute__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:886:1: ( ( rule__ManyToOneJoinTableRelationShipAttribute__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:886:1: ( ( rule__ManyToOneJoinTableRelationShipAttribute__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:887:1: ( rule__ManyToOneJoinTableRelationShipAttribute__Group__0 )
            {
             before(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:888:1: ( rule__ManyToOneJoinTableRelationShipAttribute__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:888:2: rule__ManyToOneJoinTableRelationShipAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__0_in_ruleManyToOneJoinTableRelationShipAttribute1835);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:900:1: entryRuleManyToOneMappedByRelationShipAttribute : ruleManyToOneMappedByRelationShipAttribute EOF ;
    public final void entryRuleManyToOneMappedByRelationShipAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:901:1: ( ruleManyToOneMappedByRelationShipAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:902:1: ruleManyToOneMappedByRelationShipAttribute EOF
            {
             before(grammarAccess.getManyToOneMappedByRelationShipAttributeRule()); 
            pushFollow(FOLLOW_ruleManyToOneMappedByRelationShipAttribute_in_entryRuleManyToOneMappedByRelationShipAttribute1862);
            ruleManyToOneMappedByRelationShipAttribute();

            state._fsp--;

             after(grammarAccess.getManyToOneMappedByRelationShipAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleManyToOneMappedByRelationShipAttribute1869); 

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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:909:1: ruleManyToOneMappedByRelationShipAttribute : ( ( rule__ManyToOneMappedByRelationShipAttribute__Group__0 ) ) ;
    public final void ruleManyToOneMappedByRelationShipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:913:2: ( ( ( rule__ManyToOneMappedByRelationShipAttribute__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:914:1: ( ( rule__ManyToOneMappedByRelationShipAttribute__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:914:1: ( ( rule__ManyToOneMappedByRelationShipAttribute__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:915:1: ( rule__ManyToOneMappedByRelationShipAttribute__Group__0 )
            {
             before(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:916:1: ( rule__ManyToOneMappedByRelationShipAttribute__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:916:2: rule__ManyToOneMappedByRelationShipAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__0_in_ruleManyToOneMappedByRelationShipAttribute1895);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:928:1: entryRuleManyToManyRelationshipAttribute : ruleManyToManyRelationshipAttribute EOF ;
    public final void entryRuleManyToManyRelationshipAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:929:1: ( ruleManyToManyRelationshipAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:930:1: ruleManyToManyRelationshipAttribute EOF
            {
             before(grammarAccess.getManyToManyRelationshipAttributeRule()); 
            pushFollow(FOLLOW_ruleManyToManyRelationshipAttribute_in_entryRuleManyToManyRelationshipAttribute1922);
            ruleManyToManyRelationshipAttribute();

            state._fsp--;

             after(grammarAccess.getManyToManyRelationshipAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleManyToManyRelationshipAttribute1929); 

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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:937:1: ruleManyToManyRelationshipAttribute : ( ( rule__ManyToManyRelationshipAttribute__Group__0 ) ) ;
    public final void ruleManyToManyRelationshipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:941:2: ( ( ( rule__ManyToManyRelationshipAttribute__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:942:1: ( ( rule__ManyToManyRelationshipAttribute__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:942:1: ( ( rule__ManyToManyRelationshipAttribute__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:943:1: ( rule__ManyToManyRelationshipAttribute__Group__0 )
            {
             before(grammarAccess.getManyToManyRelationshipAttributeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:944:1: ( rule__ManyToManyRelationshipAttribute__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:944:2: rule__ManyToManyRelationshipAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ManyToManyRelationshipAttribute__Group__0_in_ruleManyToManyRelationshipAttribute1955);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:956:1: entryRuleManyToManyMappedByRelationshipAttribute : ruleManyToManyMappedByRelationshipAttribute EOF ;
    public final void entryRuleManyToManyMappedByRelationshipAttribute() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:957:1: ( ruleManyToManyMappedByRelationshipAttribute EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:958:1: ruleManyToManyMappedByRelationshipAttribute EOF
            {
             before(grammarAccess.getManyToManyMappedByRelationshipAttributeRule()); 
            pushFollow(FOLLOW_ruleManyToManyMappedByRelationshipAttribute_in_entryRuleManyToManyMappedByRelationshipAttribute1982);
            ruleManyToManyMappedByRelationshipAttribute();

            state._fsp--;

             after(grammarAccess.getManyToManyMappedByRelationshipAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleManyToManyMappedByRelationshipAttribute1989); 

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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:965:1: ruleManyToManyMappedByRelationshipAttribute : ( ( rule__ManyToManyMappedByRelationshipAttribute__Group__0 ) ) ;
    public final void ruleManyToManyMappedByRelationshipAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:969:2: ( ( ( rule__ManyToManyMappedByRelationshipAttribute__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:970:1: ( ( rule__ManyToManyMappedByRelationshipAttribute__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:970:1: ( ( rule__ManyToManyMappedByRelationshipAttribute__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:971:1: ( rule__ManyToManyMappedByRelationshipAttribute__Group__0 )
            {
             before(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:972:1: ( rule__ManyToManyMappedByRelationshipAttribute__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:972:2: rule__ManyToManyMappedByRelationshipAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__0_in_ruleManyToManyMappedByRelationshipAttribute2015);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:984:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:985:1: ( ruleReference EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:986:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference2042);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference2049); 

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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:993:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:997:2: ( ( ( rule__Reference__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:998:1: ( ( rule__Reference__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:998:1: ( ( rule__Reference__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:999:1: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1000:1: ( rule__Reference__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1000:2: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_rule__Reference__Group__0_in_ruleReference2075);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1012:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1013:1: ( ruleOperation EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1014:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation2102);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation2109); 

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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1021:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1025:2: ( ( ( rule__Operation__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1026:1: ( ( rule__Operation__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1026:1: ( ( rule__Operation__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1027:1: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1028:1: ( rule__Operation__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1028:2: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_rule__Operation__Group__0_in_ruleOperation2135);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1040:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1041:1: ( ruleParameter EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1042:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter2162);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter2169); 

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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1049:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1053:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1054:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1054:1: ( ( rule__Parameter__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1055:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1056:1: ( rule__Parameter__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1056:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter2195);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1070:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1071:1: ( ruleTypeRef EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1072:1: ruleTypeRef EOF
            {
             before(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef2224);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getTypeRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef2231); 

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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1079:1: ruleTypeRef : ( ( rule__TypeRef__Group__0 ) ) ;
    public final void ruleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1083:2: ( ( ( rule__TypeRef__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1084:1: ( ( rule__TypeRef__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1084:1: ( ( rule__TypeRef__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1085:1: ( rule__TypeRef__Group__0 )
            {
             before(grammarAccess.getTypeRefAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1086:1: ( rule__TypeRef__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1086:2: rule__TypeRef__Group__0
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef2257);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1098:1: entryRuleQualifiedNameWithWildCard : ruleQualifiedNameWithWildCard EOF ;
    public final void entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1099:1: ( ruleQualifiedNameWithWildCard EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1100:1: ruleQualifiedNameWithWildCard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard2284);
            ruleQualifiedNameWithWildCard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildCardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard2291); 

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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1107:1: ruleQualifiedNameWithWildCard : ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1111:2: ( ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1112:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1112:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1113:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1114:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1114:2: rule__QualifiedNameWithWildCard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard2317);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1126:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1127:1: ( ruleQualifiedName EOF )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1128:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2344);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2351); 

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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1135:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1139:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1140:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1140:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1141:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1142:1: ( rule__QualifiedName__Group__0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1142:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName2377);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1155:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1159:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1160:1: ( ( rule__Visibility__Alternatives ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1160:1: ( ( rule__Visibility__Alternatives ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1161:1: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1162:1: ( rule__Visibility__Alternatives )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1162:2: rule__Visibility__Alternatives
            {
            pushFollow(FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility2414);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1173:1: rule__AbstractElement__Alternatives : ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) | ( ruleRelationshipAttribute ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1177:1: ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) | ( ruleRelationshipAttribute ) )
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
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1178:1: ( rulePackageDeclaration )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1178:1: ( rulePackageDeclaration )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1179:1: rulePackageDeclaration
                    {
                     before(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePackageDeclaration_in_rule__AbstractElement__Alternatives2449);
                    rulePackageDeclaration();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1184:6: ( ruleType )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1184:6: ( ruleType )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1185:1: ruleType
                    {
                     before(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleType_in_rule__AbstractElement__Alternatives2466);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1190:6: ( ruleImport )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1190:6: ( ruleImport )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1191:1: ruleImport
                    {
                     before(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleImport_in_rule__AbstractElement__Alternatives2483);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1196:6: ( ruleRelationshipAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1196:6: ( ruleRelationshipAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1197:1: ruleRelationshipAttribute
                    {
                     before(grammarAccess.getAbstractElementAccess().getRelationshipAttributeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleRelationshipAttribute_in_rule__AbstractElement__Alternatives2500);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1207:1: rule__Type__Alternatives : ( ( ruleEntity ) | ( ruleDataType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1211:1: ( ( ruleEntity ) | ( ruleDataType ) )
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
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1212:1: ( ruleEntity )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1212:1: ( ruleEntity )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1213:1: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Type__Alternatives2532);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1218:6: ( ruleDataType )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1218:6: ( ruleDataType )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1219:1: ruleDataType
                    {
                     before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDataType_in_rule__Type__Alternatives2549);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1229:1: rule__Identifier__Alternatives : ( ( ruleUniqueIdentiferColumn ) | ( ruleEmbeddedUniqueIdentifer ) );
    public final void rule__Identifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1233:1: ( ( ruleUniqueIdentiferColumn ) | ( ruleEmbeddedUniqueIdentifer ) )
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
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1234:1: ( ruleUniqueIdentiferColumn )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1234:1: ( ruleUniqueIdentiferColumn )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1235:1: ruleUniqueIdentiferColumn
                    {
                     before(grammarAccess.getIdentifierAccess().getUniqueIdentiferColumnParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUniqueIdentiferColumn_in_rule__Identifier__Alternatives2581);
                    ruleUniqueIdentiferColumn();

                    state._fsp--;

                     after(grammarAccess.getIdentifierAccess().getUniqueIdentiferColumnParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1240:6: ( ruleEmbeddedUniqueIdentifer )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1240:6: ( ruleEmbeddedUniqueIdentifer )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1241:1: ruleEmbeddedUniqueIdentifer
                    {
                     before(grammarAccess.getIdentifierAccess().getEmbeddedUniqueIdentiferParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEmbeddedUniqueIdentifer_in_rule__Identifier__Alternatives2598);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1251:1: rule__Feature__Alternatives : ( ( ruleStructuralFeature ) | ( ruleOperation ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1255:1: ( ( ruleStructuralFeature ) | ( ruleOperation ) )
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
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1256:1: ( ruleStructuralFeature )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1256:1: ( ruleStructuralFeature )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1257:1: ruleStructuralFeature
                    {
                     before(grammarAccess.getFeatureAccess().getStructuralFeatureParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStructuralFeature_in_rule__Feature__Alternatives2630);
                    ruleStructuralFeature();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getStructuralFeatureParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1262:6: ( ruleOperation )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1262:6: ( ruleOperation )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1263:1: ruleOperation
                    {
                     before(grammarAccess.getFeatureAccess().getOperationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOperation_in_rule__Feature__Alternatives2647);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1273:1: rule__StructuralFeature__Alternatives : ( ( ruleAttribute ) | ( ruleReference ) );
    public final void rule__StructuralFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1277:1: ( ( ruleAttribute ) | ( ruleReference ) )
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
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1278:1: ( ruleAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1278:1: ( ruleAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1279:1: ruleAttribute
                    {
                     before(grammarAccess.getStructuralFeatureAccess().getAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAttribute_in_rule__StructuralFeature__Alternatives2679);
                    ruleAttribute();

                    state._fsp--;

                     after(grammarAccess.getStructuralFeatureAccess().getAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1284:6: ( ruleReference )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1284:6: ( ruleReference )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1285:1: ruleReference
                    {
                     before(grammarAccess.getStructuralFeatureAccess().getReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleReference_in_rule__StructuralFeature__Alternatives2696);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1295:1: rule__Attribute__Alternatives : ( ( ruleInternalAttribute ) | ( ruleRelationshipAttribute ) | ( ruleStaticAttribute ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1299:1: ( ( ruleInternalAttribute ) | ( ruleRelationshipAttribute ) | ( ruleStaticAttribute ) )
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
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1300:1: ( ruleInternalAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1300:1: ( ruleInternalAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1301:1: ruleInternalAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getInternalAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInternalAttribute_in_rule__Attribute__Alternatives2728);
                    ruleInternalAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getInternalAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1306:6: ( ruleRelationshipAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1306:6: ( ruleRelationshipAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1307:1: ruleRelationshipAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getRelationshipAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRelationshipAttribute_in_rule__Attribute__Alternatives2745);
                    ruleRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getRelationshipAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1312:6: ( ruleStaticAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1312:6: ( ruleStaticAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1313:1: ruleStaticAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getStaticAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStaticAttribute_in_rule__Attribute__Alternatives2762);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1323:1: rule__InternalAttribute__Alternatives : ( ( ruleReadOnlyInternalAttribute ) | ( ruleUpdatableInternalAttribute ) | ( ruleTransientAttribute ) | ( ruleIdAttribute ) );
    public final void rule__InternalAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1327:1: ( ( ruleReadOnlyInternalAttribute ) | ( ruleUpdatableInternalAttribute ) | ( ruleTransientAttribute ) | ( ruleIdAttribute ) )
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
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1328:1: ( ruleReadOnlyInternalAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1328:1: ( ruleReadOnlyInternalAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1329:1: ruleReadOnlyInternalAttribute
                    {
                     before(grammarAccess.getInternalAttributeAccess().getReadOnlyInternalAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleReadOnlyInternalAttribute_in_rule__InternalAttribute__Alternatives2794);
                    ruleReadOnlyInternalAttribute();

                    state._fsp--;

                     after(grammarAccess.getInternalAttributeAccess().getReadOnlyInternalAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1334:6: ( ruleUpdatableInternalAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1334:6: ( ruleUpdatableInternalAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1335:1: ruleUpdatableInternalAttribute
                    {
                     before(grammarAccess.getInternalAttributeAccess().getUpdatableInternalAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUpdatableInternalAttribute_in_rule__InternalAttribute__Alternatives2811);
                    ruleUpdatableInternalAttribute();

                    state._fsp--;

                     after(grammarAccess.getInternalAttributeAccess().getUpdatableInternalAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1340:6: ( ruleTransientAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1340:6: ( ruleTransientAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1341:1: ruleTransientAttribute
                    {
                     before(grammarAccess.getInternalAttributeAccess().getTransientAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleTransientAttribute_in_rule__InternalAttribute__Alternatives2828);
                    ruleTransientAttribute();

                    state._fsp--;

                     after(grammarAccess.getInternalAttributeAccess().getTransientAttributeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1346:6: ( ruleIdAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1346:6: ( ruleIdAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1347:1: ruleIdAttribute
                    {
                     before(grammarAccess.getInternalAttributeAccess().getIdAttributeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleIdAttribute_in_rule__InternalAttribute__Alternatives2845);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1357:1: rule__RelationshipAttribute__Alternatives : ( ( ruleOneToOneRelationshipAttribute ) | ( ruleOneToOneMappedByRelationshipAttribute ) | ( ruleOneToManyJoinTableRelationshipAttribute ) | ( ruleOneToManyMappedByRelationshipAttribute ) | ( ruleManyToOneJoinColumnRelationShipAttribute ) | ( ruleManyToOneJoinTableRelationShipAttribute ) | ( ruleManyToOneMappedByRelationShipAttribute ) | ( ruleManyToManyRelationshipAttribute ) | ( ruleManyToManyMappedByRelationshipAttribute ) | ( ruleOneToManyJoinColumnRelationshipAttribute ) );
    public final void rule__RelationshipAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1361:1: ( ( ruleOneToOneRelationshipAttribute ) | ( ruleOneToOneMappedByRelationshipAttribute ) | ( ruleOneToManyJoinTableRelationshipAttribute ) | ( ruleOneToManyMappedByRelationshipAttribute ) | ( ruleManyToOneJoinColumnRelationShipAttribute ) | ( ruleManyToOneJoinTableRelationShipAttribute ) | ( ruleManyToOneMappedByRelationShipAttribute ) | ( ruleManyToManyRelationshipAttribute ) | ( ruleManyToManyMappedByRelationshipAttribute ) | ( ruleOneToManyJoinColumnRelationshipAttribute ) )
            int alt9=10;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt9=1;
                }
                break;
            case 32:
                {
                alt9=2;
                }
                break;
            case 33:
                {
                alt9=3;
                }
                break;
            case 35:
                {
                alt9=4;
                }
                break;
            case 36:
                {
                alt9=5;
                }
                break;
            case 37:
                {
                alt9=6;
                }
                break;
            case 38:
                {
                alt9=7;
                }
                break;
            case 39:
                {
                alt9=8;
                }
                break;
            case 40:
                {
                alt9=9;
                }
                break;
            case 34:
                {
                alt9=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1362:1: ( ruleOneToOneRelationshipAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1362:1: ( ruleOneToOneRelationshipAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1363:1: ruleOneToOneRelationshipAttribute
                    {
                     before(grammarAccess.getRelationshipAttributeAccess().getOneToOneRelationshipAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleOneToOneRelationshipAttribute_in_rule__RelationshipAttribute__Alternatives2877);
                    ruleOneToOneRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getRelationshipAttributeAccess().getOneToOneRelationshipAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1368:6: ( ruleOneToOneMappedByRelationshipAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1368:6: ( ruleOneToOneMappedByRelationshipAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1369:1: ruleOneToOneMappedByRelationshipAttribute
                    {
                     before(grammarAccess.getRelationshipAttributeAccess().getOneToOneMappedByRelationshipAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOneToOneMappedByRelationshipAttribute_in_rule__RelationshipAttribute__Alternatives2894);
                    ruleOneToOneMappedByRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getRelationshipAttributeAccess().getOneToOneMappedByRelationshipAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1374:6: ( ruleOneToManyJoinTableRelationshipAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1374:6: ( ruleOneToManyJoinTableRelationshipAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1375:1: ruleOneToManyJoinTableRelationshipAttribute
                    {
                     before(grammarAccess.getRelationshipAttributeAccess().getOneToManyJoinTableRelationshipAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleOneToManyJoinTableRelationshipAttribute_in_rule__RelationshipAttribute__Alternatives2911);
                    ruleOneToManyJoinTableRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getRelationshipAttributeAccess().getOneToManyJoinTableRelationshipAttributeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1380:6: ( ruleOneToManyMappedByRelationshipAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1380:6: ( ruleOneToManyMappedByRelationshipAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1381:1: ruleOneToManyMappedByRelationshipAttribute
                    {
                     before(grammarAccess.getRelationshipAttributeAccess().getOneToManyMappedByRelationshipAttributeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleOneToManyMappedByRelationshipAttribute_in_rule__RelationshipAttribute__Alternatives2928);
                    ruleOneToManyMappedByRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getRelationshipAttributeAccess().getOneToManyMappedByRelationshipAttributeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1386:6: ( ruleManyToOneJoinColumnRelationShipAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1386:6: ( ruleManyToOneJoinColumnRelationShipAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1387:1: ruleManyToOneJoinColumnRelationShipAttribute
                    {
                     before(grammarAccess.getRelationshipAttributeAccess().getManyToOneJoinColumnRelationShipAttributeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleManyToOneJoinColumnRelationShipAttribute_in_rule__RelationshipAttribute__Alternatives2945);
                    ruleManyToOneJoinColumnRelationShipAttribute();

                    state._fsp--;

                     after(grammarAccess.getRelationshipAttributeAccess().getManyToOneJoinColumnRelationShipAttributeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1392:6: ( ruleManyToOneJoinTableRelationShipAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1392:6: ( ruleManyToOneJoinTableRelationShipAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1393:1: ruleManyToOneJoinTableRelationShipAttribute
                    {
                     before(grammarAccess.getRelationshipAttributeAccess().getManyToOneJoinTableRelationShipAttributeParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleManyToOneJoinTableRelationShipAttribute_in_rule__RelationshipAttribute__Alternatives2962);
                    ruleManyToOneJoinTableRelationShipAttribute();

                    state._fsp--;

                     after(grammarAccess.getRelationshipAttributeAccess().getManyToOneJoinTableRelationShipAttributeParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1398:6: ( ruleManyToOneMappedByRelationShipAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1398:6: ( ruleManyToOneMappedByRelationShipAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1399:1: ruleManyToOneMappedByRelationShipAttribute
                    {
                     before(grammarAccess.getRelationshipAttributeAccess().getManyToOneMappedByRelationShipAttributeParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleManyToOneMappedByRelationShipAttribute_in_rule__RelationshipAttribute__Alternatives2979);
                    ruleManyToOneMappedByRelationShipAttribute();

                    state._fsp--;

                     after(grammarAccess.getRelationshipAttributeAccess().getManyToOneMappedByRelationShipAttributeParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1404:6: ( ruleManyToManyRelationshipAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1404:6: ( ruleManyToManyRelationshipAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1405:1: ruleManyToManyRelationshipAttribute
                    {
                     before(grammarAccess.getRelationshipAttributeAccess().getManyToManyRelationshipAttributeParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleManyToManyRelationshipAttribute_in_rule__RelationshipAttribute__Alternatives2996);
                    ruleManyToManyRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getRelationshipAttributeAccess().getManyToManyRelationshipAttributeParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1410:6: ( ruleManyToManyMappedByRelationshipAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1410:6: ( ruleManyToManyMappedByRelationshipAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1411:1: ruleManyToManyMappedByRelationshipAttribute
                    {
                     before(grammarAccess.getRelationshipAttributeAccess().getManyToManyMappedByRelationshipAttributeParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleManyToManyMappedByRelationshipAttribute_in_rule__RelationshipAttribute__Alternatives3013);
                    ruleManyToManyMappedByRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getRelationshipAttributeAccess().getManyToManyMappedByRelationshipAttributeParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1416:6: ( ruleOneToManyJoinColumnRelationshipAttribute )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1416:6: ( ruleOneToManyJoinColumnRelationshipAttribute )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1417:1: ruleOneToManyJoinColumnRelationshipAttribute
                    {
                     before(grammarAccess.getRelationshipAttributeAccess().getOneToManyJoinColumnRelationshipAttributeParserRuleCall_9()); 
                    pushFollow(FOLLOW_ruleOneToManyJoinColumnRelationshipAttribute_in_rule__RelationshipAttribute__Alternatives3030);
                    ruleOneToManyJoinColumnRelationshipAttribute();

                    state._fsp--;

                     after(grammarAccess.getRelationshipAttributeAccess().getOneToManyJoinColumnRelationshipAttributeParserRuleCall_9()); 

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


    // $ANTLR start "rule__Visibility__Alternatives"
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1428:1: rule__Visibility__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1432:1: ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt10=1;
                }
                break;
            case 12:
                {
                alt10=2;
                }
                break;
            case 13:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1433:1: ( ( 'public' ) )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1433:1: ( ( 'public' ) )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1434:1: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1435:1: ( 'public' )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1435:3: 'public'
                    {
                    match(input,11,FOLLOW_11_in_rule__Visibility__Alternatives3064); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1440:6: ( ( 'private' ) )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1440:6: ( ( 'private' ) )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1441:1: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_1()); 
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1442:1: ( 'private' )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1442:3: 'private'
                    {
                    match(input,12,FOLLOW_12_in_rule__Visibility__Alternatives3085); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1447:6: ( ( 'protected' ) )
                    {
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1447:6: ( ( 'protected' ) )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1448:1: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2()); 
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1449:1: ( 'protected' )
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1449:3: 'protected'
                    {
                    match(input,13,FOLLOW_13_in_rule__Visibility__Alternatives3106); 

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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1461:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1465:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1466:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03139);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03142);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1473:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1477:1: ( ( 'import' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1478:1: ( 'import' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1478:1: ( 'import' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1479:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Import__Group__0__Impl3170); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1492:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1496:1: ( rule__Import__Group__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1497:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13201);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1503:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1507:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1508:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1508:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1509:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1510:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1510:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl3228);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1524:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1528:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1529:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__03262);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__03265);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1536:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1540:1: ( ( 'package' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1541:1: ( 'package' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1541:1: ( 'package' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1542:1: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__PackageDeclaration__Group__0__Impl3293); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1555:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1559:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1560:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__13324);
            rule__PackageDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__13327);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1567:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1571:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1572:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1572:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1573:1: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1574:1: ( rule__PackageDeclaration__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1574:2: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl3354);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1584:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1588:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1589:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__23384);
            rule__PackageDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__23387);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1596:1: rule__PackageDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1600:1: ( ( '{' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1601:1: ( '{' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1601:1: ( '{' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1602:1: '{'
            {
             before(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__PackageDeclaration__Group__2__Impl3415); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1615:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1619:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1620:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__33446);
            rule__PackageDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__33449);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1627:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__DatabaseModesAssignment_3 )* ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1631:1: ( ( ( rule__PackageDeclaration__DatabaseModesAssignment_3 )* ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1632:1: ( ( rule__PackageDeclaration__DatabaseModesAssignment_3 )* )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1632:1: ( ( rule__PackageDeclaration__DatabaseModesAssignment_3 )* )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1633:1: ( rule__PackageDeclaration__DatabaseModesAssignment_3 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getDatabaseModesAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1634:1: ( rule__PackageDeclaration__DatabaseModesAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1634:2: rule__PackageDeclaration__DatabaseModesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__PackageDeclaration__DatabaseModesAssignment_3_in_rule__PackageDeclaration__Group__3__Impl3476);
            	    rule__PackageDeclaration__DatabaseModesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1644:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1648:1: ( rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1649:2: rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__43507);
            rule__PackageDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__5_in_rule__PackageDeclaration__Group__43510);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1656:1: rule__PackageDeclaration__Group__4__Impl : ( ( rule__PackageDeclaration__ElementsAssignment_4 )* ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1660:1: ( ( ( rule__PackageDeclaration__ElementsAssignment_4 )* ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1661:1: ( ( rule__PackageDeclaration__ElementsAssignment_4 )* )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1661:1: ( ( rule__PackageDeclaration__ElementsAssignment_4 )* )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1662:1: ( rule__PackageDeclaration__ElementsAssignment_4 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_4()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1663:1: ( rule__PackageDeclaration__ElementsAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=14 && LA12_0<=15)||LA12_0==18||LA12_0==20||(LA12_0>=31 && LA12_0<=40)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1663:2: rule__PackageDeclaration__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__PackageDeclaration__ElementsAssignment_4_in_rule__PackageDeclaration__Group__4__Impl3537);
            	    rule__PackageDeclaration__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1673:1: rule__PackageDeclaration__Group__5 : rule__PackageDeclaration__Group__5__Impl ;
    public final void rule__PackageDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1677:1: ( rule__PackageDeclaration__Group__5__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1678:2: rule__PackageDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__5__Impl_in_rule__PackageDeclaration__Group__53568);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1684:1: rule__PackageDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__PackageDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1688:1: ( ( '}' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1689:1: ( '}' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1689:1: ( '}' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1690:1: '}'
            {
             before(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_17_in_rule__PackageDeclaration__Group__5__Impl3596); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1715:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1719:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1720:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__03639);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__03642);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1727:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1731:1: ( ( 'datatype' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1732:1: ( 'datatype' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1732:1: ( 'datatype' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1733:1: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__DataType__Group__0__Impl3670); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1746:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1750:1: ( rule__DataType__Group__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1751:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__13701);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1757:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1761:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1762:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1762:1: ( ( rule__DataType__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1763:1: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1764:1: ( rule__DataType__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1764:2: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl3728);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1778:1: rule__DatabaseMode__Group__0 : rule__DatabaseMode__Group__0__Impl rule__DatabaseMode__Group__1 ;
    public final void rule__DatabaseMode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1782:1: ( rule__DatabaseMode__Group__0__Impl rule__DatabaseMode__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1783:2: rule__DatabaseMode__Group__0__Impl rule__DatabaseMode__Group__1
            {
            pushFollow(FOLLOW_rule__DatabaseMode__Group__0__Impl_in_rule__DatabaseMode__Group__03762);
            rule__DatabaseMode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DatabaseMode__Group__1_in_rule__DatabaseMode__Group__03765);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1790:1: rule__DatabaseMode__Group__0__Impl : ( 'databaseMode' ) ;
    public final void rule__DatabaseMode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1794:1: ( ( 'databaseMode' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1795:1: ( 'databaseMode' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1795:1: ( 'databaseMode' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1796:1: 'databaseMode'
            {
             before(grammarAccess.getDatabaseModeAccess().getDatabaseModeKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__DatabaseMode__Group__0__Impl3793); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1809:1: rule__DatabaseMode__Group__1 : rule__DatabaseMode__Group__1__Impl ;
    public final void rule__DatabaseMode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1813:1: ( rule__DatabaseMode__Group__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1814:2: rule__DatabaseMode__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DatabaseMode__Group__1__Impl_in_rule__DatabaseMode__Group__13824);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1820:1: rule__DatabaseMode__Group__1__Impl : ( ( rule__DatabaseMode__NameAssignment_1 ) ) ;
    public final void rule__DatabaseMode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1824:1: ( ( ( rule__DatabaseMode__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1825:1: ( ( rule__DatabaseMode__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1825:1: ( ( rule__DatabaseMode__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1826:1: ( rule__DatabaseMode__NameAssignment_1 )
            {
             before(grammarAccess.getDatabaseModeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1827:1: ( rule__DatabaseMode__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1827:2: rule__DatabaseMode__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DatabaseMode__NameAssignment_1_in_rule__DatabaseMode__Group__1__Impl3851);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1841:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1845:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1846:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03885);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03888);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1853:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1857:1: ( ( 'entity' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1858:1: ( 'entity' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1858:1: ( 'entity' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1859:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Entity__Group__0__Impl3916); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1872:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1876:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1877:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13947);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13950);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1884:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1888:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1889:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1889:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1890:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1891:1: ( rule__Entity__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1891:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl3977);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1901:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1905:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1906:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__24007);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__24010);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1913:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__DatabaseVendorAssignment_2 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1917:1: ( ( ( rule__Entity__DatabaseVendorAssignment_2 )? ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1918:1: ( ( rule__Entity__DatabaseVendorAssignment_2 )? )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1918:1: ( ( rule__Entity__DatabaseVendorAssignment_2 )? )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1919:1: ( rule__Entity__DatabaseVendorAssignment_2 )?
            {
             before(grammarAccess.getEntityAccess().getDatabaseVendorAssignment_2()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1920:1: ( rule__Entity__DatabaseVendorAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1920:2: rule__Entity__DatabaseVendorAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Entity__DatabaseVendorAssignment_2_in_rule__Entity__Group__2__Impl4037);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1930:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1934:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1935:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__34068);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__34071);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1942:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1946:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1947:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1947:1: ( ( rule__Entity__Group_3__0 )? )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1948:1: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1949:1: ( rule__Entity__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1949:2: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl4098);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1959:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1963:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1964:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__44129);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__44132);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1971:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__ReadOnlyAssignment_4 )? ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1975:1: ( ( ( rule__Entity__ReadOnlyAssignment_4 )? ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1976:1: ( ( rule__Entity__ReadOnlyAssignment_4 )? )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1976:1: ( ( rule__Entity__ReadOnlyAssignment_4 )? )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1977:1: ( rule__Entity__ReadOnlyAssignment_4 )?
            {
             before(grammarAccess.getEntityAccess().getReadOnlyAssignment_4()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1978:1: ( rule__Entity__ReadOnlyAssignment_4 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1978:2: rule__Entity__ReadOnlyAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Entity__ReadOnlyAssignment_4_in_rule__Entity__Group__4__Impl4159);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1988:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1992:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:1993:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__54190);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__54193);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2000:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__CacheableAssignment_5 )? ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2004:1: ( ( ( rule__Entity__CacheableAssignment_5 )? ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2005:1: ( ( rule__Entity__CacheableAssignment_5 )? )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2005:1: ( ( rule__Entity__CacheableAssignment_5 )? )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2006:1: ( rule__Entity__CacheableAssignment_5 )?
            {
             before(grammarAccess.getEntityAccess().getCacheableAssignment_5()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2007:1: ( rule__Entity__CacheableAssignment_5 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2007:2: rule__Entity__CacheableAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Entity__CacheableAssignment_5_in_rule__Entity__Group__5__Impl4220);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2017:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2021:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2022:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__64251);
            rule__Entity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__64254);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2029:1: rule__Entity__Group__6__Impl : ( '{' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2033:1: ( ( '{' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2034:1: ( '{' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2034:1: ( '{' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2035:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_16_in_rule__Entity__Group__6__Impl4282); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2048:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl rule__Entity__Group__8 ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2052:1: ( rule__Entity__Group__7__Impl rule__Entity__Group__8 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2053:2: rule__Entity__Group__7__Impl rule__Entity__Group__8
            {
            pushFollow(FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__74313);
            rule__Entity__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__74316);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2060:1: rule__Entity__Group__7__Impl : ( ( rule__Entity__IdentifierAssignment_7 ) ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2064:1: ( ( ( rule__Entity__IdentifierAssignment_7 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2065:1: ( ( rule__Entity__IdentifierAssignment_7 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2065:1: ( ( rule__Entity__IdentifierAssignment_7 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2066:1: ( rule__Entity__IdentifierAssignment_7 )
            {
             before(grammarAccess.getEntityAccess().getIdentifierAssignment_7()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2067:1: ( rule__Entity__IdentifierAssignment_7 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2067:2: rule__Entity__IdentifierAssignment_7
            {
            pushFollow(FOLLOW_rule__Entity__IdentifierAssignment_7_in_rule__Entity__Group__7__Impl4343);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2077:1: rule__Entity__Group__8 : rule__Entity__Group__8__Impl rule__Entity__Group__9 ;
    public final void rule__Entity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2081:1: ( rule__Entity__Group__8__Impl rule__Entity__Group__9 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2082:2: rule__Entity__Group__8__Impl rule__Entity__Group__9
            {
            pushFollow(FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__84373);
            rule__Entity__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__9_in_rule__Entity__Group__84376);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2089:1: rule__Entity__Group__8__Impl : ( ( rule__Entity__ImportsAssignment_8 )* ) ;
    public final void rule__Entity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2093:1: ( ( ( rule__Entity__ImportsAssignment_8 )* ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2094:1: ( ( rule__Entity__ImportsAssignment_8 )* )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2094:1: ( ( rule__Entity__ImportsAssignment_8 )* )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2095:1: ( rule__Entity__ImportsAssignment_8 )*
            {
             before(grammarAccess.getEntityAccess().getImportsAssignment_8()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2096:1: ( rule__Entity__ImportsAssignment_8 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==14) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2096:2: rule__Entity__ImportsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__Entity__ImportsAssignment_8_in_rule__Entity__Group__8__Impl4403);
            	    rule__Entity__ImportsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2106:1: rule__Entity__Group__9 : rule__Entity__Group__9__Impl rule__Entity__Group__10 ;
    public final void rule__Entity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2110:1: ( rule__Entity__Group__9__Impl rule__Entity__Group__10 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2111:2: rule__Entity__Group__9__Impl rule__Entity__Group__10
            {
            pushFollow(FOLLOW_rule__Entity__Group__9__Impl_in_rule__Entity__Group__94434);
            rule__Entity__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__10_in_rule__Entity__Group__94437);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2118:1: rule__Entity__Group__9__Impl : ( ( rule__Entity__FeaturesAssignment_9 )* ) ;
    public final void rule__Entity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2122:1: ( ( ( rule__Entity__FeaturesAssignment_9 )* ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2123:1: ( ( rule__Entity__FeaturesAssignment_9 )* )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2123:1: ( ( rule__Entity__FeaturesAssignment_9 )* )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2124:1: ( rule__Entity__FeaturesAssignment_9 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_9()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2125:1: ( rule__Entity__FeaturesAssignment_9 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||(LA18_0>=11 && LA18_0<=13)||LA18_0==26||(LA18_0>=28 && LA18_0<=41)||LA18_0==43) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2125:2: rule__Entity__FeaturesAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_9_in_rule__Entity__Group__9__Impl4464);
            	    rule__Entity__FeaturesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2135:1: rule__Entity__Group__10 : rule__Entity__Group__10__Impl ;
    public final void rule__Entity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2139:1: ( rule__Entity__Group__10__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2140:2: rule__Entity__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__10__Impl_in_rule__Entity__Group__104495);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2146:1: rule__Entity__Group__10__Impl : ( '}' ) ;
    public final void rule__Entity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2150:1: ( ( '}' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2151:1: ( '}' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2151:1: ( '}' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2152:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_10()); 
            match(input,17,FOLLOW_17_in_rule__Entity__Group__10__Impl4523); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2187:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2191:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2192:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__04576);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__04579);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2199:1: rule__Entity__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2203:1: ( ( 'extends' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2204:1: ( 'extends' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2204:1: ( 'extends' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2205:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__Entity__Group_3__0__Impl4607); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2218:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2222:1: ( rule__Entity__Group_3__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2223:2: rule__Entity__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__14638);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2229:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__SuperTypeAssignment_3_1 ) ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2233:1: ( ( ( rule__Entity__SuperTypeAssignment_3_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2234:1: ( ( rule__Entity__SuperTypeAssignment_3_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2234:1: ( ( rule__Entity__SuperTypeAssignment_3_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2235:1: ( rule__Entity__SuperTypeAssignment_3_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_3_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2236:1: ( rule__Entity__SuperTypeAssignment_3_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2236:2: rule__Entity__SuperTypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperTypeAssignment_3_1_in_rule__Entity__Group_3__1__Impl4665);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2250:1: rule__ReadOnly__Group__0 : rule__ReadOnly__Group__0__Impl rule__ReadOnly__Group__1 ;
    public final void rule__ReadOnly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2254:1: ( rule__ReadOnly__Group__0__Impl rule__ReadOnly__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2255:2: rule__ReadOnly__Group__0__Impl rule__ReadOnly__Group__1
            {
            pushFollow(FOLLOW_rule__ReadOnly__Group__0__Impl_in_rule__ReadOnly__Group__04699);
            rule__ReadOnly__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReadOnly__Group__1_in_rule__ReadOnly__Group__04702);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2262:1: rule__ReadOnly__Group__0__Impl : ( 'read only' ) ;
    public final void rule__ReadOnly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2266:1: ( ( 'read only' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2267:1: ( 'read only' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2267:1: ( 'read only' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2268:1: 'read only'
            {
             before(grammarAccess.getReadOnlyAccess().getReadOnlyKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__ReadOnly__Group__0__Impl4730); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2281:1: rule__ReadOnly__Group__1 : rule__ReadOnly__Group__1__Impl rule__ReadOnly__Group__2 ;
    public final void rule__ReadOnly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2285:1: ( rule__ReadOnly__Group__1__Impl rule__ReadOnly__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2286:2: rule__ReadOnly__Group__1__Impl rule__ReadOnly__Group__2
            {
            pushFollow(FOLLOW_rule__ReadOnly__Group__1__Impl_in_rule__ReadOnly__Group__14761);
            rule__ReadOnly__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReadOnly__Group__2_in_rule__ReadOnly__Group__14764);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2293:1: rule__ReadOnly__Group__1__Impl : ( ( rule__ReadOnly__TableNameAssignment_1 ) ) ;
    public final void rule__ReadOnly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2297:1: ( ( ( rule__ReadOnly__TableNameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2298:1: ( ( rule__ReadOnly__TableNameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2298:1: ( ( rule__ReadOnly__TableNameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2299:1: ( rule__ReadOnly__TableNameAssignment_1 )
            {
             before(grammarAccess.getReadOnlyAccess().getTableNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2300:1: ( rule__ReadOnly__TableNameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2300:2: rule__ReadOnly__TableNameAssignment_1
            {
            pushFollow(FOLLOW_rule__ReadOnly__TableNameAssignment_1_in_rule__ReadOnly__Group__1__Impl4791);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2310:1: rule__ReadOnly__Group__2 : rule__ReadOnly__Group__2__Impl ;
    public final void rule__ReadOnly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2314:1: ( rule__ReadOnly__Group__2__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2315:2: rule__ReadOnly__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ReadOnly__Group__2__Impl_in_rule__ReadOnly__Group__24821);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2321:1: rule__ReadOnly__Group__2__Impl : ( ( rule__ReadOnly__IdColumnAssignment_2 ) ) ;
    public final void rule__ReadOnly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2325:1: ( ( ( rule__ReadOnly__IdColumnAssignment_2 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2326:1: ( ( rule__ReadOnly__IdColumnAssignment_2 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2326:1: ( ( rule__ReadOnly__IdColumnAssignment_2 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2327:1: ( rule__ReadOnly__IdColumnAssignment_2 )
            {
             before(grammarAccess.getReadOnlyAccess().getIdColumnAssignment_2()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2328:1: ( rule__ReadOnly__IdColumnAssignment_2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2328:2: rule__ReadOnly__IdColumnAssignment_2
            {
            pushFollow(FOLLOW_rule__ReadOnly__IdColumnAssignment_2_in_rule__ReadOnly__Group__2__Impl4848);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2344:1: rule__Cacheable__Group__0 : rule__Cacheable__Group__0__Impl rule__Cacheable__Group__1 ;
    public final void rule__Cacheable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2348:1: ( rule__Cacheable__Group__0__Impl rule__Cacheable__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2349:2: rule__Cacheable__Group__0__Impl rule__Cacheable__Group__1
            {
            pushFollow(FOLLOW_rule__Cacheable__Group__0__Impl_in_rule__Cacheable__Group__04884);
            rule__Cacheable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cacheable__Group__1_in_rule__Cacheable__Group__04887);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2356:1: rule__Cacheable__Group__0__Impl : ( 'cacheable' ) ;
    public final void rule__Cacheable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2360:1: ( ( 'cacheable' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2361:1: ( 'cacheable' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2361:1: ( 'cacheable' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2362:1: 'cacheable'
            {
             before(grammarAccess.getCacheableAccess().getCacheableKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Cacheable__Group__0__Impl4915); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2375:1: rule__Cacheable__Group__1 : rule__Cacheable__Group__1__Impl ;
    public final void rule__Cacheable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2379:1: ( rule__Cacheable__Group__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2380:2: rule__Cacheable__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Cacheable__Group__1__Impl_in_rule__Cacheable__Group__14946);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2386:1: rule__Cacheable__Group__1__Impl : ( () ) ;
    public final void rule__Cacheable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2390:1: ( ( () ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2391:1: ( () )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2391:1: ( () )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2392:1: ()
            {
             before(grammarAccess.getCacheableAccess().getCacheableAction_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2393:1: ()
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2395:1: 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2409:1: rule__UniqueIdentiferColumn__Group__0 : rule__UniqueIdentiferColumn__Group__0__Impl rule__UniqueIdentiferColumn__Group__1 ;
    public final void rule__UniqueIdentiferColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2413:1: ( rule__UniqueIdentiferColumn__Group__0__Impl rule__UniqueIdentiferColumn__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2414:2: rule__UniqueIdentiferColumn__Group__0__Impl rule__UniqueIdentiferColumn__Group__1
            {
            pushFollow(FOLLOW_rule__UniqueIdentiferColumn__Group__0__Impl_in_rule__UniqueIdentiferColumn__Group__05008);
            rule__UniqueIdentiferColumn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UniqueIdentiferColumn__Group__1_in_rule__UniqueIdentiferColumn__Group__05011);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2421:1: rule__UniqueIdentiferColumn__Group__0__Impl : ( 'unique id' ) ;
    public final void rule__UniqueIdentiferColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2425:1: ( ( 'unique id' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2426:1: ( 'unique id' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2426:1: ( 'unique id' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2427:1: 'unique id'
            {
             before(grammarAccess.getUniqueIdentiferColumnAccess().getUniqueIdKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__UniqueIdentiferColumn__Group__0__Impl5039); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2440:1: rule__UniqueIdentiferColumn__Group__1 : rule__UniqueIdentiferColumn__Group__1__Impl ;
    public final void rule__UniqueIdentiferColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2444:1: ( rule__UniqueIdentiferColumn__Group__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2445:2: rule__UniqueIdentiferColumn__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UniqueIdentiferColumn__Group__1__Impl_in_rule__UniqueIdentiferColumn__Group__15070);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2451:1: rule__UniqueIdentiferColumn__Group__1__Impl : ( ( rule__UniqueIdentiferColumn__NameAssignment_1 ) ) ;
    public final void rule__UniqueIdentiferColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2455:1: ( ( ( rule__UniqueIdentiferColumn__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2456:1: ( ( rule__UniqueIdentiferColumn__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2456:1: ( ( rule__UniqueIdentiferColumn__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2457:1: ( rule__UniqueIdentiferColumn__NameAssignment_1 )
            {
             before(grammarAccess.getUniqueIdentiferColumnAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2458:1: ( rule__UniqueIdentiferColumn__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2458:2: rule__UniqueIdentiferColumn__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__UniqueIdentiferColumn__NameAssignment_1_in_rule__UniqueIdentiferColumn__Group__1__Impl5097);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2472:1: rule__EmbeddedUniqueIdentifer__Group__0 : rule__EmbeddedUniqueIdentifer__Group__0__Impl rule__EmbeddedUniqueIdentifer__Group__1 ;
    public final void rule__EmbeddedUniqueIdentifer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2476:1: ( rule__EmbeddedUniqueIdentifer__Group__0__Impl rule__EmbeddedUniqueIdentifer__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2477:2: rule__EmbeddedUniqueIdentifer__Group__0__Impl rule__EmbeddedUniqueIdentifer__Group__1
            {
            pushFollow(FOLLOW_rule__EmbeddedUniqueIdentifer__Group__0__Impl_in_rule__EmbeddedUniqueIdentifer__Group__05131);
            rule__EmbeddedUniqueIdentifer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EmbeddedUniqueIdentifer__Group__1_in_rule__EmbeddedUniqueIdentifer__Group__05134);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2484:1: rule__EmbeddedUniqueIdentifer__Group__0__Impl : ( 'embedded id' ) ;
    public final void rule__EmbeddedUniqueIdentifer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2488:1: ( ( 'embedded id' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2489:1: ( 'embedded id' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2489:1: ( 'embedded id' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2490:1: 'embedded id'
            {
             before(grammarAccess.getEmbeddedUniqueIdentiferAccess().getEmbeddedIdKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__EmbeddedUniqueIdentifer__Group__0__Impl5162); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2503:1: rule__EmbeddedUniqueIdentifer__Group__1 : rule__EmbeddedUniqueIdentifer__Group__1__Impl ;
    public final void rule__EmbeddedUniqueIdentifer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2507:1: ( rule__EmbeddedUniqueIdentifer__Group__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2508:2: rule__EmbeddedUniqueIdentifer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EmbeddedUniqueIdentifer__Group__1__Impl_in_rule__EmbeddedUniqueIdentifer__Group__15193);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2514:1: rule__EmbeddedUniqueIdentifer__Group__1__Impl : ( ( rule__EmbeddedUniqueIdentifer__NameAssignment_1 ) ) ;
    public final void rule__EmbeddedUniqueIdentifer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2518:1: ( ( ( rule__EmbeddedUniqueIdentifer__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2519:1: ( ( rule__EmbeddedUniqueIdentifer__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2519:1: ( ( rule__EmbeddedUniqueIdentifer__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2520:1: ( rule__EmbeddedUniqueIdentifer__NameAssignment_1 )
            {
             before(grammarAccess.getEmbeddedUniqueIdentiferAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2521:1: ( rule__EmbeddedUniqueIdentifer__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2521:2: rule__EmbeddedUniqueIdentifer__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EmbeddedUniqueIdentifer__NameAssignment_1_in_rule__EmbeddedUniqueIdentifer__Group__1__Impl5220);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2535:1: rule__StaticAttribute__Group__0 : rule__StaticAttribute__Group__0__Impl rule__StaticAttribute__Group__1 ;
    public final void rule__StaticAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2539:1: ( rule__StaticAttribute__Group__0__Impl rule__StaticAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2540:2: rule__StaticAttribute__Group__0__Impl rule__StaticAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__StaticAttribute__Group__0__Impl_in_rule__StaticAttribute__Group__05254);
            rule__StaticAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StaticAttribute__Group__1_in_rule__StaticAttribute__Group__05257);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2547:1: rule__StaticAttribute__Group__0__Impl : ( 'staticAttribute' ) ;
    public final void rule__StaticAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2551:1: ( ( 'staticAttribute' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2552:1: ( 'staticAttribute' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2552:1: ( 'staticAttribute' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2553:1: 'staticAttribute'
            {
             before(grammarAccess.getStaticAttributeAccess().getStaticAttributeKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__StaticAttribute__Group__0__Impl5285); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2566:1: rule__StaticAttribute__Group__1 : rule__StaticAttribute__Group__1__Impl rule__StaticAttribute__Group__2 ;
    public final void rule__StaticAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2570:1: ( rule__StaticAttribute__Group__1__Impl rule__StaticAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2571:2: rule__StaticAttribute__Group__1__Impl rule__StaticAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__StaticAttribute__Group__1__Impl_in_rule__StaticAttribute__Group__15316);
            rule__StaticAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StaticAttribute__Group__2_in_rule__StaticAttribute__Group__15319);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2578:1: rule__StaticAttribute__Group__1__Impl : ( ( rule__StaticAttribute__NameAssignment_1 ) ) ;
    public final void rule__StaticAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2582:1: ( ( ( rule__StaticAttribute__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2583:1: ( ( rule__StaticAttribute__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2583:1: ( ( rule__StaticAttribute__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2584:1: ( rule__StaticAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getStaticAttributeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2585:1: ( rule__StaticAttribute__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2585:2: rule__StaticAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StaticAttribute__NameAssignment_1_in_rule__StaticAttribute__Group__1__Impl5346);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2595:1: rule__StaticAttribute__Group__2 : rule__StaticAttribute__Group__2__Impl rule__StaticAttribute__Group__3 ;
    public final void rule__StaticAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2599:1: ( rule__StaticAttribute__Group__2__Impl rule__StaticAttribute__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2600:2: rule__StaticAttribute__Group__2__Impl rule__StaticAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__StaticAttribute__Group__2__Impl_in_rule__StaticAttribute__Group__25376);
            rule__StaticAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StaticAttribute__Group__3_in_rule__StaticAttribute__Group__25379);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2607:1: rule__StaticAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__StaticAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2611:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2612:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2612:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2613:1: ':'
            {
             before(grammarAccess.getStaticAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__StaticAttribute__Group__2__Impl5407); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2626:1: rule__StaticAttribute__Group__3 : rule__StaticAttribute__Group__3__Impl ;
    public final void rule__StaticAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2630:1: ( rule__StaticAttribute__Group__3__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2631:2: rule__StaticAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StaticAttribute__Group__3__Impl_in_rule__StaticAttribute__Group__35438);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2637:1: rule__StaticAttribute__Group__3__Impl : ( ( rule__StaticAttribute__TypeAssignment_3 ) ) ;
    public final void rule__StaticAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2641:1: ( ( ( rule__StaticAttribute__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2642:1: ( ( rule__StaticAttribute__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2642:1: ( ( rule__StaticAttribute__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2643:1: ( rule__StaticAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getStaticAttributeAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2644:1: ( rule__StaticAttribute__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2644:2: rule__StaticAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__StaticAttribute__TypeAssignment_3_in_rule__StaticAttribute__Group__3__Impl5465);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2662:1: rule__ReadOnlyInternalAttribute__Group__0 : rule__ReadOnlyInternalAttribute__Group__0__Impl rule__ReadOnlyInternalAttribute__Group__1 ;
    public final void rule__ReadOnlyInternalAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2666:1: ( rule__ReadOnlyInternalAttribute__Group__0__Impl rule__ReadOnlyInternalAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2667:2: rule__ReadOnlyInternalAttribute__Group__0__Impl rule__ReadOnlyInternalAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ReadOnlyInternalAttribute__Group__0__Impl_in_rule__ReadOnlyInternalAttribute__Group__05503);
            rule__ReadOnlyInternalAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReadOnlyInternalAttribute__Group__1_in_rule__ReadOnlyInternalAttribute__Group__05506);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2674:1: rule__ReadOnlyInternalAttribute__Group__0__Impl : ( ( rule__ReadOnlyInternalAttribute__NameAssignment_0 ) ) ;
    public final void rule__ReadOnlyInternalAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2678:1: ( ( ( rule__ReadOnlyInternalAttribute__NameAssignment_0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2679:1: ( ( rule__ReadOnlyInternalAttribute__NameAssignment_0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2679:1: ( ( rule__ReadOnlyInternalAttribute__NameAssignment_0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2680:1: ( rule__ReadOnlyInternalAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getReadOnlyInternalAttributeAccess().getNameAssignment_0()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2681:1: ( rule__ReadOnlyInternalAttribute__NameAssignment_0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2681:2: rule__ReadOnlyInternalAttribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ReadOnlyInternalAttribute__NameAssignment_0_in_rule__ReadOnlyInternalAttribute__Group__0__Impl5533);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2691:1: rule__ReadOnlyInternalAttribute__Group__1 : rule__ReadOnlyInternalAttribute__Group__1__Impl rule__ReadOnlyInternalAttribute__Group__2 ;
    public final void rule__ReadOnlyInternalAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2695:1: ( rule__ReadOnlyInternalAttribute__Group__1__Impl rule__ReadOnlyInternalAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2696:2: rule__ReadOnlyInternalAttribute__Group__1__Impl rule__ReadOnlyInternalAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__ReadOnlyInternalAttribute__Group__1__Impl_in_rule__ReadOnlyInternalAttribute__Group__15563);
            rule__ReadOnlyInternalAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReadOnlyInternalAttribute__Group__2_in_rule__ReadOnlyInternalAttribute__Group__15566);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2703:1: rule__ReadOnlyInternalAttribute__Group__1__Impl : ( ':' ) ;
    public final void rule__ReadOnlyInternalAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2707:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2708:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2708:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2709:1: ':'
            {
             before(grammarAccess.getReadOnlyInternalAttributeAccess().getColonKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__ReadOnlyInternalAttribute__Group__1__Impl5594); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2722:1: rule__ReadOnlyInternalAttribute__Group__2 : rule__ReadOnlyInternalAttribute__Group__2__Impl ;
    public final void rule__ReadOnlyInternalAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2726:1: ( rule__ReadOnlyInternalAttribute__Group__2__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2727:2: rule__ReadOnlyInternalAttribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ReadOnlyInternalAttribute__Group__2__Impl_in_rule__ReadOnlyInternalAttribute__Group__25625);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2733:1: rule__ReadOnlyInternalAttribute__Group__2__Impl : ( ( rule__ReadOnlyInternalAttribute__TypeAssignment_2 ) ) ;
    public final void rule__ReadOnlyInternalAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2737:1: ( ( ( rule__ReadOnlyInternalAttribute__TypeAssignment_2 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2738:1: ( ( rule__ReadOnlyInternalAttribute__TypeAssignment_2 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2738:1: ( ( rule__ReadOnlyInternalAttribute__TypeAssignment_2 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2739:1: ( rule__ReadOnlyInternalAttribute__TypeAssignment_2 )
            {
             before(grammarAccess.getReadOnlyInternalAttributeAccess().getTypeAssignment_2()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2740:1: ( rule__ReadOnlyInternalAttribute__TypeAssignment_2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2740:2: rule__ReadOnlyInternalAttribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__ReadOnlyInternalAttribute__TypeAssignment_2_in_rule__ReadOnlyInternalAttribute__Group__2__Impl5652);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2756:1: rule__UpdatableInternalAttribute__Group__0 : rule__UpdatableInternalAttribute__Group__0__Impl rule__UpdatableInternalAttribute__Group__1 ;
    public final void rule__UpdatableInternalAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2760:1: ( rule__UpdatableInternalAttribute__Group__0__Impl rule__UpdatableInternalAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2761:2: rule__UpdatableInternalAttribute__Group__0__Impl rule__UpdatableInternalAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__UpdatableInternalAttribute__Group__0__Impl_in_rule__UpdatableInternalAttribute__Group__05688);
            rule__UpdatableInternalAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UpdatableInternalAttribute__Group__1_in_rule__UpdatableInternalAttribute__Group__05691);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2768:1: rule__UpdatableInternalAttribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__UpdatableInternalAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2772:1: ( ( 'attribute' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2773:1: ( 'attribute' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2773:1: ( 'attribute' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2774:1: 'attribute'
            {
             before(grammarAccess.getUpdatableInternalAttributeAccess().getAttributeKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__UpdatableInternalAttribute__Group__0__Impl5719); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2787:1: rule__UpdatableInternalAttribute__Group__1 : rule__UpdatableInternalAttribute__Group__1__Impl rule__UpdatableInternalAttribute__Group__2 ;
    public final void rule__UpdatableInternalAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2791:1: ( rule__UpdatableInternalAttribute__Group__1__Impl rule__UpdatableInternalAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2792:2: rule__UpdatableInternalAttribute__Group__1__Impl rule__UpdatableInternalAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__UpdatableInternalAttribute__Group__1__Impl_in_rule__UpdatableInternalAttribute__Group__15750);
            rule__UpdatableInternalAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UpdatableInternalAttribute__Group__2_in_rule__UpdatableInternalAttribute__Group__15753);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2799:1: rule__UpdatableInternalAttribute__Group__1__Impl : ( ( rule__UpdatableInternalAttribute__NameAssignment_1 ) ) ;
    public final void rule__UpdatableInternalAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2803:1: ( ( ( rule__UpdatableInternalAttribute__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2804:1: ( ( rule__UpdatableInternalAttribute__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2804:1: ( ( rule__UpdatableInternalAttribute__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2805:1: ( rule__UpdatableInternalAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getUpdatableInternalAttributeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2806:1: ( rule__UpdatableInternalAttribute__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2806:2: rule__UpdatableInternalAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__UpdatableInternalAttribute__NameAssignment_1_in_rule__UpdatableInternalAttribute__Group__1__Impl5780);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2816:1: rule__UpdatableInternalAttribute__Group__2 : rule__UpdatableInternalAttribute__Group__2__Impl rule__UpdatableInternalAttribute__Group__3 ;
    public final void rule__UpdatableInternalAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2820:1: ( rule__UpdatableInternalAttribute__Group__2__Impl rule__UpdatableInternalAttribute__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2821:2: rule__UpdatableInternalAttribute__Group__2__Impl rule__UpdatableInternalAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__UpdatableInternalAttribute__Group__2__Impl_in_rule__UpdatableInternalAttribute__Group__25810);
            rule__UpdatableInternalAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UpdatableInternalAttribute__Group__3_in_rule__UpdatableInternalAttribute__Group__25813);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2828:1: rule__UpdatableInternalAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__UpdatableInternalAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2832:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2833:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2833:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2834:1: ':'
            {
             before(grammarAccess.getUpdatableInternalAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__UpdatableInternalAttribute__Group__2__Impl5841); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2847:1: rule__UpdatableInternalAttribute__Group__3 : rule__UpdatableInternalAttribute__Group__3__Impl ;
    public final void rule__UpdatableInternalAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2851:1: ( rule__UpdatableInternalAttribute__Group__3__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2852:2: rule__UpdatableInternalAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UpdatableInternalAttribute__Group__3__Impl_in_rule__UpdatableInternalAttribute__Group__35872);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2858:1: rule__UpdatableInternalAttribute__Group__3__Impl : ( ( rule__UpdatableInternalAttribute__TypeAssignment_3 ) ) ;
    public final void rule__UpdatableInternalAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2862:1: ( ( ( rule__UpdatableInternalAttribute__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2863:1: ( ( rule__UpdatableInternalAttribute__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2863:1: ( ( rule__UpdatableInternalAttribute__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2864:1: ( rule__UpdatableInternalAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getUpdatableInternalAttributeAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2865:1: ( rule__UpdatableInternalAttribute__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2865:2: rule__UpdatableInternalAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__UpdatableInternalAttribute__TypeAssignment_3_in_rule__UpdatableInternalAttribute__Group__3__Impl5899);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2883:1: rule__TransientAttribute__Group__0 : rule__TransientAttribute__Group__0__Impl rule__TransientAttribute__Group__1 ;
    public final void rule__TransientAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2887:1: ( rule__TransientAttribute__Group__0__Impl rule__TransientAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2888:2: rule__TransientAttribute__Group__0__Impl rule__TransientAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__TransientAttribute__Group__0__Impl_in_rule__TransientAttribute__Group__05937);
            rule__TransientAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TransientAttribute__Group__1_in_rule__TransientAttribute__Group__05940);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2895:1: rule__TransientAttribute__Group__0__Impl : ( 'transient' ) ;
    public final void rule__TransientAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2899:1: ( ( 'transient' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2900:1: ( 'transient' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2900:1: ( 'transient' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2901:1: 'transient'
            {
             before(grammarAccess.getTransientAttributeAccess().getTransientKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__TransientAttribute__Group__0__Impl5968); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2914:1: rule__TransientAttribute__Group__1 : rule__TransientAttribute__Group__1__Impl rule__TransientAttribute__Group__2 ;
    public final void rule__TransientAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2918:1: ( rule__TransientAttribute__Group__1__Impl rule__TransientAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2919:2: rule__TransientAttribute__Group__1__Impl rule__TransientAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__TransientAttribute__Group__1__Impl_in_rule__TransientAttribute__Group__15999);
            rule__TransientAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TransientAttribute__Group__2_in_rule__TransientAttribute__Group__16002);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2926:1: rule__TransientAttribute__Group__1__Impl : ( ( rule__TransientAttribute__NameAssignment_1 ) ) ;
    public final void rule__TransientAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2930:1: ( ( ( rule__TransientAttribute__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2931:1: ( ( rule__TransientAttribute__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2931:1: ( ( rule__TransientAttribute__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2932:1: ( rule__TransientAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getTransientAttributeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2933:1: ( rule__TransientAttribute__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2933:2: rule__TransientAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TransientAttribute__NameAssignment_1_in_rule__TransientAttribute__Group__1__Impl6029);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2943:1: rule__TransientAttribute__Group__2 : rule__TransientAttribute__Group__2__Impl rule__TransientAttribute__Group__3 ;
    public final void rule__TransientAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2947:1: ( rule__TransientAttribute__Group__2__Impl rule__TransientAttribute__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2948:2: rule__TransientAttribute__Group__2__Impl rule__TransientAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__TransientAttribute__Group__2__Impl_in_rule__TransientAttribute__Group__26059);
            rule__TransientAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TransientAttribute__Group__3_in_rule__TransientAttribute__Group__26062);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2955:1: rule__TransientAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__TransientAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2959:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2960:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2960:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2961:1: ':'
            {
             before(grammarAccess.getTransientAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__TransientAttribute__Group__2__Impl6090); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2974:1: rule__TransientAttribute__Group__3 : rule__TransientAttribute__Group__3__Impl ;
    public final void rule__TransientAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2978:1: ( rule__TransientAttribute__Group__3__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2979:2: rule__TransientAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TransientAttribute__Group__3__Impl_in_rule__TransientAttribute__Group__36121);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2985:1: rule__TransientAttribute__Group__3__Impl : ( ( rule__TransientAttribute__TypeAssignment_3 ) ) ;
    public final void rule__TransientAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2989:1: ( ( ( rule__TransientAttribute__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2990:1: ( ( rule__TransientAttribute__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2990:1: ( ( rule__TransientAttribute__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2991:1: ( rule__TransientAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getTransientAttributeAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2992:1: ( rule__TransientAttribute__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:2992:2: rule__TransientAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__TransientAttribute__TypeAssignment_3_in_rule__TransientAttribute__Group__3__Impl6148);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3010:1: rule__IdAttribute__Group__0 : rule__IdAttribute__Group__0__Impl rule__IdAttribute__Group__1 ;
    public final void rule__IdAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3014:1: ( rule__IdAttribute__Group__0__Impl rule__IdAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3015:2: rule__IdAttribute__Group__0__Impl rule__IdAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__IdAttribute__Group__0__Impl_in_rule__IdAttribute__Group__06186);
            rule__IdAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IdAttribute__Group__1_in_rule__IdAttribute__Group__06189);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3022:1: rule__IdAttribute__Group__0__Impl : ( 'id attribute' ) ;
    public final void rule__IdAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3026:1: ( ( 'id attribute' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3027:1: ( 'id attribute' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3027:1: ( 'id attribute' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3028:1: 'id attribute'
            {
             before(grammarAccess.getIdAttributeAccess().getIdAttributeKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__IdAttribute__Group__0__Impl6217); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3041:1: rule__IdAttribute__Group__1 : rule__IdAttribute__Group__1__Impl rule__IdAttribute__Group__2 ;
    public final void rule__IdAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3045:1: ( rule__IdAttribute__Group__1__Impl rule__IdAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3046:2: rule__IdAttribute__Group__1__Impl rule__IdAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__IdAttribute__Group__1__Impl_in_rule__IdAttribute__Group__16248);
            rule__IdAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IdAttribute__Group__2_in_rule__IdAttribute__Group__16251);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3053:1: rule__IdAttribute__Group__1__Impl : ( ( rule__IdAttribute__NameAssignment_1 ) ) ;
    public final void rule__IdAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3057:1: ( ( ( rule__IdAttribute__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3058:1: ( ( rule__IdAttribute__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3058:1: ( ( rule__IdAttribute__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3059:1: ( rule__IdAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getIdAttributeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3060:1: ( rule__IdAttribute__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3060:2: rule__IdAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__IdAttribute__NameAssignment_1_in_rule__IdAttribute__Group__1__Impl6278);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3070:1: rule__IdAttribute__Group__2 : rule__IdAttribute__Group__2__Impl rule__IdAttribute__Group__3 ;
    public final void rule__IdAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3074:1: ( rule__IdAttribute__Group__2__Impl rule__IdAttribute__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3075:2: rule__IdAttribute__Group__2__Impl rule__IdAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__IdAttribute__Group__2__Impl_in_rule__IdAttribute__Group__26308);
            rule__IdAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IdAttribute__Group__3_in_rule__IdAttribute__Group__26311);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3082:1: rule__IdAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__IdAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3086:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3087:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3087:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3088:1: ':'
            {
             before(grammarAccess.getIdAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__IdAttribute__Group__2__Impl6339); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3101:1: rule__IdAttribute__Group__3 : rule__IdAttribute__Group__3__Impl ;
    public final void rule__IdAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3105:1: ( rule__IdAttribute__Group__3__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3106:2: rule__IdAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__IdAttribute__Group__3__Impl_in_rule__IdAttribute__Group__36370);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3112:1: rule__IdAttribute__Group__3__Impl : ( ( rule__IdAttribute__TypeAssignment_3 ) ) ;
    public final void rule__IdAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3116:1: ( ( ( rule__IdAttribute__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3117:1: ( ( rule__IdAttribute__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3117:1: ( ( rule__IdAttribute__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3118:1: ( rule__IdAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getIdAttributeAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3119:1: ( rule__IdAttribute__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3119:2: rule__IdAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__IdAttribute__TypeAssignment_3_in_rule__IdAttribute__Group__3__Impl6397);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3137:1: rule__OneToOneRelationshipAttribute__Group__0 : rule__OneToOneRelationshipAttribute__Group__0__Impl rule__OneToOneRelationshipAttribute__Group__1 ;
    public final void rule__OneToOneRelationshipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3141:1: ( rule__OneToOneRelationshipAttribute__Group__0__Impl rule__OneToOneRelationshipAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3142:2: rule__OneToOneRelationshipAttribute__Group__0__Impl rule__OneToOneRelationshipAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__OneToOneRelationshipAttribute__Group__0__Impl_in_rule__OneToOneRelationshipAttribute__Group__06435);
            rule__OneToOneRelationshipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToOneRelationshipAttribute__Group__1_in_rule__OneToOneRelationshipAttribute__Group__06438);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3149:1: rule__OneToOneRelationshipAttribute__Group__0__Impl : ( 'one to one join column' ) ;
    public final void rule__OneToOneRelationshipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3153:1: ( ( 'one to one join column' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3154:1: ( 'one to one join column' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3154:1: ( 'one to one join column' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3155:1: 'one to one join column'
            {
             before(grammarAccess.getOneToOneRelationshipAttributeAccess().getOneToOneJoinColumnKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__OneToOneRelationshipAttribute__Group__0__Impl6466); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3168:1: rule__OneToOneRelationshipAttribute__Group__1 : rule__OneToOneRelationshipAttribute__Group__1__Impl rule__OneToOneRelationshipAttribute__Group__2 ;
    public final void rule__OneToOneRelationshipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3172:1: ( rule__OneToOneRelationshipAttribute__Group__1__Impl rule__OneToOneRelationshipAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3173:2: rule__OneToOneRelationshipAttribute__Group__1__Impl rule__OneToOneRelationshipAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__OneToOneRelationshipAttribute__Group__1__Impl_in_rule__OneToOneRelationshipAttribute__Group__16497);
            rule__OneToOneRelationshipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToOneRelationshipAttribute__Group__2_in_rule__OneToOneRelationshipAttribute__Group__16500);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3180:1: rule__OneToOneRelationshipAttribute__Group__1__Impl : ( ( rule__OneToOneRelationshipAttribute__NameAssignment_1 ) ) ;
    public final void rule__OneToOneRelationshipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3184:1: ( ( ( rule__OneToOneRelationshipAttribute__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3185:1: ( ( rule__OneToOneRelationshipAttribute__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3185:1: ( ( rule__OneToOneRelationshipAttribute__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3186:1: ( rule__OneToOneRelationshipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getOneToOneRelationshipAttributeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3187:1: ( rule__OneToOneRelationshipAttribute__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3187:2: rule__OneToOneRelationshipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__OneToOneRelationshipAttribute__NameAssignment_1_in_rule__OneToOneRelationshipAttribute__Group__1__Impl6527);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3197:1: rule__OneToOneRelationshipAttribute__Group__2 : rule__OneToOneRelationshipAttribute__Group__2__Impl rule__OneToOneRelationshipAttribute__Group__3 ;
    public final void rule__OneToOneRelationshipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3201:1: ( rule__OneToOneRelationshipAttribute__Group__2__Impl rule__OneToOneRelationshipAttribute__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3202:2: rule__OneToOneRelationshipAttribute__Group__2__Impl rule__OneToOneRelationshipAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__OneToOneRelationshipAttribute__Group__2__Impl_in_rule__OneToOneRelationshipAttribute__Group__26557);
            rule__OneToOneRelationshipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToOneRelationshipAttribute__Group__3_in_rule__OneToOneRelationshipAttribute__Group__26560);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3209:1: rule__OneToOneRelationshipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__OneToOneRelationshipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3213:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3214:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3214:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3215:1: ':'
            {
             before(grammarAccess.getOneToOneRelationshipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__OneToOneRelationshipAttribute__Group__2__Impl6588); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3228:1: rule__OneToOneRelationshipAttribute__Group__3 : rule__OneToOneRelationshipAttribute__Group__3__Impl rule__OneToOneRelationshipAttribute__Group__4 ;
    public final void rule__OneToOneRelationshipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3232:1: ( rule__OneToOneRelationshipAttribute__Group__3__Impl rule__OneToOneRelationshipAttribute__Group__4 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3233:2: rule__OneToOneRelationshipAttribute__Group__3__Impl rule__OneToOneRelationshipAttribute__Group__4
            {
            pushFollow(FOLLOW_rule__OneToOneRelationshipAttribute__Group__3__Impl_in_rule__OneToOneRelationshipAttribute__Group__36619);
            rule__OneToOneRelationshipAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToOneRelationshipAttribute__Group__4_in_rule__OneToOneRelationshipAttribute__Group__36622);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3240:1: rule__OneToOneRelationshipAttribute__Group__3__Impl : ( ( rule__OneToOneRelationshipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__OneToOneRelationshipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3244:1: ( ( ( rule__OneToOneRelationshipAttribute__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3245:1: ( ( rule__OneToOneRelationshipAttribute__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3245:1: ( ( rule__OneToOneRelationshipAttribute__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3246:1: ( rule__OneToOneRelationshipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getOneToOneRelationshipAttributeAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3247:1: ( rule__OneToOneRelationshipAttribute__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3247:2: rule__OneToOneRelationshipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__OneToOneRelationshipAttribute__TypeAssignment_3_in_rule__OneToOneRelationshipAttribute__Group__3__Impl6649);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3257:1: rule__OneToOneRelationshipAttribute__Group__4 : rule__OneToOneRelationshipAttribute__Group__4__Impl ;
    public final void rule__OneToOneRelationshipAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3261:1: ( rule__OneToOneRelationshipAttribute__Group__4__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3262:2: rule__OneToOneRelationshipAttribute__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__OneToOneRelationshipAttribute__Group__4__Impl_in_rule__OneToOneRelationshipAttribute__Group__46679);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3268:1: rule__OneToOneRelationshipAttribute__Group__4__Impl : ( ( rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4 )? ) ;
    public final void rule__OneToOneRelationshipAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3272:1: ( ( ( rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4 )? ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3273:1: ( ( rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4 )? )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3273:1: ( ( rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4 )? )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3274:1: ( rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4 )?
            {
             before(grammarAccess.getOneToOneRelationshipAttributeAccess().getJoinColumnOverrideAssignment_4()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3275:1: ( rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3275:2: rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4
                    {
                    pushFollow(FOLLOW_rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4_in_rule__OneToOneRelationshipAttribute__Group__4__Impl6706);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3295:1: rule__OneToOneMappedByRelationshipAttribute__Group__0 : rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl rule__OneToOneMappedByRelationshipAttribute__Group__1 ;
    public final void rule__OneToOneMappedByRelationshipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3299:1: ( rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl rule__OneToOneMappedByRelationshipAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3300:2: rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl rule__OneToOneMappedByRelationshipAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl_in_rule__OneToOneMappedByRelationshipAttribute__Group__06747);
            rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__1_in_rule__OneToOneMappedByRelationshipAttribute__Group__06750);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3307:1: rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl : ( 'one to one mapped by' ) ;
    public final void rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3311:1: ( ( 'one to one mapped by' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3312:1: ( 'one to one mapped by' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3312:1: ( 'one to one mapped by' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3313:1: 'one to one mapped by'
            {
             before(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getOneToOneMappedByKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl6778); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3326:1: rule__OneToOneMappedByRelationshipAttribute__Group__1 : rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl rule__OneToOneMappedByRelationshipAttribute__Group__2 ;
    public final void rule__OneToOneMappedByRelationshipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3330:1: ( rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl rule__OneToOneMappedByRelationshipAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3331:2: rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl rule__OneToOneMappedByRelationshipAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl_in_rule__OneToOneMappedByRelationshipAttribute__Group__16809);
            rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__2_in_rule__OneToOneMappedByRelationshipAttribute__Group__16812);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3338:1: rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl : ( ( rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1 ) ) ;
    public final void rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3342:1: ( ( ( rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3343:1: ( ( rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3343:1: ( ( rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3344:1: ( rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3345:1: ( rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3345:2: rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1_in_rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl6839);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3355:1: rule__OneToOneMappedByRelationshipAttribute__Group__2 : rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl rule__OneToOneMappedByRelationshipAttribute__Group__3 ;
    public final void rule__OneToOneMappedByRelationshipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3359:1: ( rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl rule__OneToOneMappedByRelationshipAttribute__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3360:2: rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl rule__OneToOneMappedByRelationshipAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl_in_rule__OneToOneMappedByRelationshipAttribute__Group__26869);
            rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__3_in_rule__OneToOneMappedByRelationshipAttribute__Group__26872);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3367:1: rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3371:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3372:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3372:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3373:1: ':'
            {
             before(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl6900); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3386:1: rule__OneToOneMappedByRelationshipAttribute__Group__3 : rule__OneToOneMappedByRelationshipAttribute__Group__3__Impl ;
    public final void rule__OneToOneMappedByRelationshipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3390:1: ( rule__OneToOneMappedByRelationshipAttribute__Group__3__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3391:2: rule__OneToOneMappedByRelationshipAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__3__Impl_in_rule__OneToOneMappedByRelationshipAttribute__Group__36931);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3397:1: rule__OneToOneMappedByRelationshipAttribute__Group__3__Impl : ( ( rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__OneToOneMappedByRelationshipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3401:1: ( ( ( rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3402:1: ( ( rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3402:1: ( ( rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3403:1: ( rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3404:1: ( rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3404:2: rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3_in_rule__OneToOneMappedByRelationshipAttribute__Group__3__Impl6958);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3422:1: rule__OneToManyJoinTableRelationshipAttribute__Group__0 : rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl rule__OneToManyJoinTableRelationshipAttribute__Group__1 ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3426:1: ( rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl rule__OneToManyJoinTableRelationshipAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3427:2: rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl rule__OneToManyJoinTableRelationshipAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl_in_rule__OneToManyJoinTableRelationshipAttribute__Group__06996);
            rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__1_in_rule__OneToManyJoinTableRelationshipAttribute__Group__06999);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3434:1: rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl : ( 'one to many using join table' ) ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3438:1: ( ( 'one to many using join table' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3439:1: ( 'one to many using join table' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3439:1: ( 'one to many using join table' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3440:1: 'one to many using join table'
            {
             before(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getOneToManyUsingJoinTableKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl7027); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3453:1: rule__OneToManyJoinTableRelationshipAttribute__Group__1 : rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl rule__OneToManyJoinTableRelationshipAttribute__Group__2 ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3457:1: ( rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl rule__OneToManyJoinTableRelationshipAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3458:2: rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl rule__OneToManyJoinTableRelationshipAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl_in_rule__OneToManyJoinTableRelationshipAttribute__Group__17058);
            rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__2_in_rule__OneToManyJoinTableRelationshipAttribute__Group__17061);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3465:1: rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl : ( ( rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1 ) ) ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3469:1: ( ( ( rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3470:1: ( ( rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3470:1: ( ( rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3471:1: ( rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3472:1: ( rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3472:2: rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1_in_rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl7088);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3482:1: rule__OneToManyJoinTableRelationshipAttribute__Group__2 : rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl rule__OneToManyJoinTableRelationshipAttribute__Group__3 ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3486:1: ( rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl rule__OneToManyJoinTableRelationshipAttribute__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3487:2: rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl rule__OneToManyJoinTableRelationshipAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl_in_rule__OneToManyJoinTableRelationshipAttribute__Group__27118);
            rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__3_in_rule__OneToManyJoinTableRelationshipAttribute__Group__27121);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3494:1: rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3498:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3499:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3499:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3500:1: ':'
            {
             before(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl7149); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3513:1: rule__OneToManyJoinTableRelationshipAttribute__Group__3 : rule__OneToManyJoinTableRelationshipAttribute__Group__3__Impl ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3517:1: ( rule__OneToManyJoinTableRelationshipAttribute__Group__3__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3518:2: rule__OneToManyJoinTableRelationshipAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__3__Impl_in_rule__OneToManyJoinTableRelationshipAttribute__Group__37180);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3524:1: rule__OneToManyJoinTableRelationshipAttribute__Group__3__Impl : ( ( rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3528:1: ( ( ( rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3529:1: ( ( rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3529:1: ( ( rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3530:1: ( rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3531:1: ( rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3531:2: rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3_in_rule__OneToManyJoinTableRelationshipAttribute__Group__3__Impl7207);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3549:1: rule__OneToManyJoinColumnRelationshipAttribute__Group__0 : rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl rule__OneToManyJoinColumnRelationshipAttribute__Group__1 ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3553:1: ( rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl rule__OneToManyJoinColumnRelationshipAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3554:2: rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl rule__OneToManyJoinColumnRelationshipAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__07245);
            rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__1_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__07248);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3561:1: rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl : ( 'one to many using join column' ) ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3565:1: ( ( 'one to many using join column' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3566:1: ( 'one to many using join column' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3566:1: ( 'one to many using join column' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3567:1: 'one to many using join column'
            {
             before(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getOneToManyUsingJoinColumnKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl7276); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3580:1: rule__OneToManyJoinColumnRelationshipAttribute__Group__1 : rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl rule__OneToManyJoinColumnRelationshipAttribute__Group__2 ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3584:1: ( rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl rule__OneToManyJoinColumnRelationshipAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3585:2: rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl rule__OneToManyJoinColumnRelationshipAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__17307);
            rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__2_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__17310);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3592:1: rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl : ( ( rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1 ) ) ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3596:1: ( ( ( rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3597:1: ( ( rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3597:1: ( ( rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3598:1: ( rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3599:1: ( rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3599:2: rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl7337);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3609:1: rule__OneToManyJoinColumnRelationshipAttribute__Group__2 : rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl rule__OneToManyJoinColumnRelationshipAttribute__Group__3 ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3613:1: ( rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl rule__OneToManyJoinColumnRelationshipAttribute__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3614:2: rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl rule__OneToManyJoinColumnRelationshipAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__27367);
            rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__3_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__27370);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3621:1: rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3625:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3626:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3626:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3627:1: ':'
            {
             before(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl7398); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3640:1: rule__OneToManyJoinColumnRelationshipAttribute__Group__3 : rule__OneToManyJoinColumnRelationshipAttribute__Group__3__Impl ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3644:1: ( rule__OneToManyJoinColumnRelationshipAttribute__Group__3__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3645:2: rule__OneToManyJoinColumnRelationshipAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__3__Impl_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__37429);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3651:1: rule__OneToManyJoinColumnRelationshipAttribute__Group__3__Impl : ( ( rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3655:1: ( ( ( rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3656:1: ( ( rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3656:1: ( ( rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3657:1: ( rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3658:1: ( rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3658:2: rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__3__Impl7456);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3676:1: rule__OneToManyMappedByRelationshipAttribute__Group__0 : rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl rule__OneToManyMappedByRelationshipAttribute__Group__1 ;
    public final void rule__OneToManyMappedByRelationshipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3680:1: ( rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl rule__OneToManyMappedByRelationshipAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3681:2: rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl rule__OneToManyMappedByRelationshipAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl_in_rule__OneToManyMappedByRelationshipAttribute__Group__07494);
            rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__1_in_rule__OneToManyMappedByRelationshipAttribute__Group__07497);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3688:1: rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl : ( 'one to many mapped by' ) ;
    public final void rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3692:1: ( ( 'one to many mapped by' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3693:1: ( 'one to many mapped by' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3693:1: ( 'one to many mapped by' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3694:1: 'one to many mapped by'
            {
             before(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getOneToManyMappedByKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl7525); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3707:1: rule__OneToManyMappedByRelationshipAttribute__Group__1 : rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl rule__OneToManyMappedByRelationshipAttribute__Group__2 ;
    public final void rule__OneToManyMappedByRelationshipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3711:1: ( rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl rule__OneToManyMappedByRelationshipAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3712:2: rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl rule__OneToManyMappedByRelationshipAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl_in_rule__OneToManyMappedByRelationshipAttribute__Group__17556);
            rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__2_in_rule__OneToManyMappedByRelationshipAttribute__Group__17559);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3719:1: rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl : ( ( rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1 ) ) ;
    public final void rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3723:1: ( ( ( rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3724:1: ( ( rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3724:1: ( ( rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3725:1: ( rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3726:1: ( rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3726:2: rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1_in_rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl7586);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3736:1: rule__OneToManyMappedByRelationshipAttribute__Group__2 : rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl rule__OneToManyMappedByRelationshipAttribute__Group__3 ;
    public final void rule__OneToManyMappedByRelationshipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3740:1: ( rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl rule__OneToManyMappedByRelationshipAttribute__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3741:2: rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl rule__OneToManyMappedByRelationshipAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl_in_rule__OneToManyMappedByRelationshipAttribute__Group__27616);
            rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__3_in_rule__OneToManyMappedByRelationshipAttribute__Group__27619);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3748:1: rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3752:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3753:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3753:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3754:1: ':'
            {
             before(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl7647); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3767:1: rule__OneToManyMappedByRelationshipAttribute__Group__3 : rule__OneToManyMappedByRelationshipAttribute__Group__3__Impl ;
    public final void rule__OneToManyMappedByRelationshipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3771:1: ( rule__OneToManyMappedByRelationshipAttribute__Group__3__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3772:2: rule__OneToManyMappedByRelationshipAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__3__Impl_in_rule__OneToManyMappedByRelationshipAttribute__Group__37678);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3778:1: rule__OneToManyMappedByRelationshipAttribute__Group__3__Impl : ( ( rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__OneToManyMappedByRelationshipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3782:1: ( ( ( rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3783:1: ( ( rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3783:1: ( ( rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3784:1: ( rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3785:1: ( rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3785:2: rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3_in_rule__OneToManyMappedByRelationshipAttribute__Group__3__Impl7705);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3803:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__0 : rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__1 ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3807:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3808:2: rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__07743);
            rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__1_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__07746);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3815:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl : ( 'many to one using join column' ) ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3819:1: ( ( 'many to one using join column' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3820:1: ( 'many to one using join column' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3820:1: ( 'many to one using join column' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3821:1: 'many to one using join column'
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getManyToOneUsingJoinColumnKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl7774); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3834:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__1 : rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__2 ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3838:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3839:2: rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__17805);
            rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__2_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__17808);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3846:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl : ( ( rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1 ) ) ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3850:1: ( ( ( rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3851:1: ( ( rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3851:1: ( ( rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3852:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3853:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3853:2: rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl7835);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3863:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__2 : rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__3 ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3867:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3868:2: rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__27865);
            rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__3_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__27868);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3875:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3879:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3880:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3880:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3881:1: ':'
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl7896); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3894:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__3 : rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__4 ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3898:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__4 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3899:2: rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl rule__ManyToOneJoinColumnRelationShipAttribute__Group__4
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__37927);
            rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__4_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__37930);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3906:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl : ( ( rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3910:1: ( ( ( rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3911:1: ( ( rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3911:1: ( ( rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3912:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3913:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3913:2: rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl7957);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3923:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__4 : rule__ManyToOneJoinColumnRelationShipAttribute__Group__4__Impl ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3927:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__Group__4__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3928:2: rule__ManyToOneJoinColumnRelationShipAttribute__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__4__Impl_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__47987);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3934:1: rule__ManyToOneJoinColumnRelationShipAttribute__Group__4__Impl : ( ( rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4 )? ) ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3938:1: ( ( ( rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4 )? ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3939:1: ( ( rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4 )? )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3939:1: ( ( rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4 )? )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3940:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4 )?
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getJoinColumnOverrideAssignment_4()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3941:1: ( rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3941:2: rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4
                    {
                    pushFollow(FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__4__Impl8014);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3961:1: rule__ManyToOneJoinTableRelationShipAttribute__Group__0 : rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl rule__ManyToOneJoinTableRelationShipAttribute__Group__1 ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3965:1: ( rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl rule__ManyToOneJoinTableRelationShipAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3966:2: rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl rule__ManyToOneJoinTableRelationShipAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__08055);
            rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__1_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__08058);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3973:1: rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl : ( 'many to one using join table' ) ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3977:1: ( ( 'many to one using join table' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3978:1: ( 'many to one using join table' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3978:1: ( 'many to one using join table' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3979:1: 'many to one using join table'
            {
             before(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getManyToOneUsingJoinTableKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl8086); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3992:1: rule__ManyToOneJoinTableRelationShipAttribute__Group__1 : rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl rule__ManyToOneJoinTableRelationShipAttribute__Group__2 ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3996:1: ( rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl rule__ManyToOneJoinTableRelationShipAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:3997:2: rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl rule__ManyToOneJoinTableRelationShipAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__18117);
            rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__2_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__18120);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4004:1: rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl : ( ( rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1 ) ) ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4008:1: ( ( ( rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4009:1: ( ( rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4009:1: ( ( rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4010:1: ( rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4011:1: ( rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4011:2: rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl8147);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4021:1: rule__ManyToOneJoinTableRelationShipAttribute__Group__2 : rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl rule__ManyToOneJoinTableRelationShipAttribute__Group__3 ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4025:1: ( rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl rule__ManyToOneJoinTableRelationShipAttribute__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4026:2: rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl rule__ManyToOneJoinTableRelationShipAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__28177);
            rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__3_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__28180);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4033:1: rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4037:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4038:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4038:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4039:1: ':'
            {
             before(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl8208); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4052:1: rule__ManyToOneJoinTableRelationShipAttribute__Group__3 : rule__ManyToOneJoinTableRelationShipAttribute__Group__3__Impl ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4056:1: ( rule__ManyToOneJoinTableRelationShipAttribute__Group__3__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4057:2: rule__ManyToOneJoinTableRelationShipAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__3__Impl_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__38239);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4063:1: rule__ManyToOneJoinTableRelationShipAttribute__Group__3__Impl : ( ( rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4067:1: ( ( ( rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4068:1: ( ( rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4068:1: ( ( rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4069:1: ( rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4070:1: ( rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4070:2: rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__3__Impl8266);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4088:1: rule__ManyToOneMappedByRelationShipAttribute__Group__0 : rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl rule__ManyToOneMappedByRelationShipAttribute__Group__1 ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4092:1: ( rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl rule__ManyToOneMappedByRelationShipAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4093:2: rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl rule__ManyToOneMappedByRelationShipAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl_in_rule__ManyToOneMappedByRelationShipAttribute__Group__08304);
            rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__1_in_rule__ManyToOneMappedByRelationShipAttribute__Group__08307);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4100:1: rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl : ( 'many to one mapped by' ) ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4104:1: ( ( 'many to one mapped by' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4105:1: ( 'many to one mapped by' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4105:1: ( 'many to one mapped by' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4106:1: 'many to one mapped by'
            {
             before(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getManyToOneMappedByKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl8335); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4119:1: rule__ManyToOneMappedByRelationShipAttribute__Group__1 : rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl rule__ManyToOneMappedByRelationShipAttribute__Group__2 ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4123:1: ( rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl rule__ManyToOneMappedByRelationShipAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4124:2: rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl rule__ManyToOneMappedByRelationShipAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl_in_rule__ManyToOneMappedByRelationShipAttribute__Group__18366);
            rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__2_in_rule__ManyToOneMappedByRelationShipAttribute__Group__18369);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4131:1: rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl : ( ( rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1 ) ) ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4135:1: ( ( ( rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4136:1: ( ( rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4136:1: ( ( rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4137:1: ( rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4138:1: ( rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4138:2: rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1_in_rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl8396);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4148:1: rule__ManyToOneMappedByRelationShipAttribute__Group__2 : rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl rule__ManyToOneMappedByRelationShipAttribute__Group__3 ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4152:1: ( rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl rule__ManyToOneMappedByRelationShipAttribute__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4153:2: rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl rule__ManyToOneMappedByRelationShipAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl_in_rule__ManyToOneMappedByRelationShipAttribute__Group__28426);
            rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__3_in_rule__ManyToOneMappedByRelationShipAttribute__Group__28429);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4160:1: rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4164:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4165:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4165:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4166:1: ':'
            {
             before(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl8457); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4179:1: rule__ManyToOneMappedByRelationShipAttribute__Group__3 : rule__ManyToOneMappedByRelationShipAttribute__Group__3__Impl ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4183:1: ( rule__ManyToOneMappedByRelationShipAttribute__Group__3__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4184:2: rule__ManyToOneMappedByRelationShipAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__3__Impl_in_rule__ManyToOneMappedByRelationShipAttribute__Group__38488);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4190:1: rule__ManyToOneMappedByRelationShipAttribute__Group__3__Impl : ( ( rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4194:1: ( ( ( rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4195:1: ( ( rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4195:1: ( ( rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4196:1: ( rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4197:1: ( rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4197:2: rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3_in_rule__ManyToOneMappedByRelationShipAttribute__Group__3__Impl8515);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4215:1: rule__ManyToManyRelationshipAttribute__Group__0 : rule__ManyToManyRelationshipAttribute__Group__0__Impl rule__ManyToManyRelationshipAttribute__Group__1 ;
    public final void rule__ManyToManyRelationshipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4219:1: ( rule__ManyToManyRelationshipAttribute__Group__0__Impl rule__ManyToManyRelationshipAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4220:2: rule__ManyToManyRelationshipAttribute__Group__0__Impl rule__ManyToManyRelationshipAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ManyToManyRelationshipAttribute__Group__0__Impl_in_rule__ManyToManyRelationshipAttribute__Group__08553);
            rule__ManyToManyRelationshipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToManyRelationshipAttribute__Group__1_in_rule__ManyToManyRelationshipAttribute__Group__08556);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4227:1: rule__ManyToManyRelationshipAttribute__Group__0__Impl : ( 'many to many join table' ) ;
    public final void rule__ManyToManyRelationshipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4231:1: ( ( 'many to many join table' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4232:1: ( 'many to many join table' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4232:1: ( 'many to many join table' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4233:1: 'many to many join table'
            {
             before(grammarAccess.getManyToManyRelationshipAttributeAccess().getManyToManyJoinTableKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__ManyToManyRelationshipAttribute__Group__0__Impl8584); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4246:1: rule__ManyToManyRelationshipAttribute__Group__1 : rule__ManyToManyRelationshipAttribute__Group__1__Impl rule__ManyToManyRelationshipAttribute__Group__2 ;
    public final void rule__ManyToManyRelationshipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4250:1: ( rule__ManyToManyRelationshipAttribute__Group__1__Impl rule__ManyToManyRelationshipAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4251:2: rule__ManyToManyRelationshipAttribute__Group__1__Impl rule__ManyToManyRelationshipAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__ManyToManyRelationshipAttribute__Group__1__Impl_in_rule__ManyToManyRelationshipAttribute__Group__18615);
            rule__ManyToManyRelationshipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToManyRelationshipAttribute__Group__2_in_rule__ManyToManyRelationshipAttribute__Group__18618);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4258:1: rule__ManyToManyRelationshipAttribute__Group__1__Impl : ( ( rule__ManyToManyRelationshipAttribute__NameAssignment_1 ) ) ;
    public final void rule__ManyToManyRelationshipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4262:1: ( ( ( rule__ManyToManyRelationshipAttribute__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4263:1: ( ( rule__ManyToManyRelationshipAttribute__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4263:1: ( ( rule__ManyToManyRelationshipAttribute__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4264:1: ( rule__ManyToManyRelationshipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getManyToManyRelationshipAttributeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4265:1: ( rule__ManyToManyRelationshipAttribute__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4265:2: rule__ManyToManyRelationshipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ManyToManyRelationshipAttribute__NameAssignment_1_in_rule__ManyToManyRelationshipAttribute__Group__1__Impl8645);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4275:1: rule__ManyToManyRelationshipAttribute__Group__2 : rule__ManyToManyRelationshipAttribute__Group__2__Impl rule__ManyToManyRelationshipAttribute__Group__3 ;
    public final void rule__ManyToManyRelationshipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4279:1: ( rule__ManyToManyRelationshipAttribute__Group__2__Impl rule__ManyToManyRelationshipAttribute__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4280:2: rule__ManyToManyRelationshipAttribute__Group__2__Impl rule__ManyToManyRelationshipAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__ManyToManyRelationshipAttribute__Group__2__Impl_in_rule__ManyToManyRelationshipAttribute__Group__28675);
            rule__ManyToManyRelationshipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToManyRelationshipAttribute__Group__3_in_rule__ManyToManyRelationshipAttribute__Group__28678);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4287:1: rule__ManyToManyRelationshipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__ManyToManyRelationshipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4291:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4292:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4292:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4293:1: ':'
            {
             before(grammarAccess.getManyToManyRelationshipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__ManyToManyRelationshipAttribute__Group__2__Impl8706); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4306:1: rule__ManyToManyRelationshipAttribute__Group__3 : rule__ManyToManyRelationshipAttribute__Group__3__Impl ;
    public final void rule__ManyToManyRelationshipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4310:1: ( rule__ManyToManyRelationshipAttribute__Group__3__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4311:2: rule__ManyToManyRelationshipAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ManyToManyRelationshipAttribute__Group__3__Impl_in_rule__ManyToManyRelationshipAttribute__Group__38737);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4317:1: rule__ManyToManyRelationshipAttribute__Group__3__Impl : ( ( rule__ManyToManyRelationshipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__ManyToManyRelationshipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4321:1: ( ( ( rule__ManyToManyRelationshipAttribute__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4322:1: ( ( rule__ManyToManyRelationshipAttribute__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4322:1: ( ( rule__ManyToManyRelationshipAttribute__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4323:1: ( rule__ManyToManyRelationshipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getManyToManyRelationshipAttributeAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4324:1: ( rule__ManyToManyRelationshipAttribute__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4324:2: rule__ManyToManyRelationshipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__ManyToManyRelationshipAttribute__TypeAssignment_3_in_rule__ManyToManyRelationshipAttribute__Group__3__Impl8764);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4342:1: rule__ManyToManyMappedByRelationshipAttribute__Group__0 : rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl rule__ManyToManyMappedByRelationshipAttribute__Group__1 ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4346:1: ( rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl rule__ManyToManyMappedByRelationshipAttribute__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4347:2: rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl rule__ManyToManyMappedByRelationshipAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl_in_rule__ManyToManyMappedByRelationshipAttribute__Group__08802);
            rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__1_in_rule__ManyToManyMappedByRelationshipAttribute__Group__08805);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4354:1: rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl : ( 'many to many mapped by' ) ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4358:1: ( ( 'many to many mapped by' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4359:1: ( 'many to many mapped by' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4359:1: ( 'many to many mapped by' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4360:1: 'many to many mapped by'
            {
             before(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getManyToManyMappedByKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl8833); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4373:1: rule__ManyToManyMappedByRelationshipAttribute__Group__1 : rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl rule__ManyToManyMappedByRelationshipAttribute__Group__2 ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4377:1: ( rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl rule__ManyToManyMappedByRelationshipAttribute__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4378:2: rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl rule__ManyToManyMappedByRelationshipAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl_in_rule__ManyToManyMappedByRelationshipAttribute__Group__18864);
            rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__2_in_rule__ManyToManyMappedByRelationshipAttribute__Group__18867);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4385:1: rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl : ( ( rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1 ) ) ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4389:1: ( ( ( rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4390:1: ( ( rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4390:1: ( ( rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4391:1: ( rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4392:1: ( rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4392:2: rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1_in_rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl8894);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4402:1: rule__ManyToManyMappedByRelationshipAttribute__Group__2 : rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl rule__ManyToManyMappedByRelationshipAttribute__Group__3 ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4406:1: ( rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl rule__ManyToManyMappedByRelationshipAttribute__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4407:2: rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl rule__ManyToManyMappedByRelationshipAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl_in_rule__ManyToManyMappedByRelationshipAttribute__Group__28924);
            rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__3_in_rule__ManyToManyMappedByRelationshipAttribute__Group__28927);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4414:1: rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl : ( ':' ) ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4418:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4419:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4419:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4420:1: ':'
            {
             before(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl8955); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4433:1: rule__ManyToManyMappedByRelationshipAttribute__Group__3 : rule__ManyToManyMappedByRelationshipAttribute__Group__3__Impl ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4437:1: ( rule__ManyToManyMappedByRelationshipAttribute__Group__3__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4438:2: rule__ManyToManyMappedByRelationshipAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__3__Impl_in_rule__ManyToManyMappedByRelationshipAttribute__Group__38986);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4444:1: rule__ManyToManyMappedByRelationshipAttribute__Group__3__Impl : ( ( rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3 ) ) ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4448:1: ( ( ( rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4449:1: ( ( rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4449:1: ( ( rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4450:1: ( rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3 )
            {
             before(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4451:1: ( rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4451:2: rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3_in_rule__ManyToManyMappedByRelationshipAttribute__Group__3__Impl9013);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4469:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4473:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4474:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__09051);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__09054);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4481:1: rule__Reference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4485:1: ( ( 'ref' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4486:1: ( 'ref' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4486:1: ( 'ref' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4487:1: 'ref'
            {
             before(grammarAccess.getReferenceAccess().getRefKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__Reference__Group__0__Impl9082); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4500:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4504:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4505:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__19113);
            rule__Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__19116);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4512:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__NameAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4516:1: ( ( ( rule__Reference__NameAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4517:1: ( ( rule__Reference__NameAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4517:1: ( ( rule__Reference__NameAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4518:1: ( rule__Reference__NameAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4519:1: ( rule__Reference__NameAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4519:2: rule__Reference__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Reference__NameAssignment_1_in_rule__Reference__Group__1__Impl9143);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4529:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4533:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4534:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__29173);
            rule__Reference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__29176);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4541:1: rule__Reference__Group__2__Impl : ( ':' ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4545:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4546:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4546:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4547:1: ':'
            {
             before(grammarAccess.getReferenceAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__Reference__Group__2__Impl9204); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4560:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4564:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4565:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__39235);
            rule__Reference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__39238);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4572:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__TypeAssignment_3 ) ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4576:1: ( ( ( rule__Reference__TypeAssignment_3 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4577:1: ( ( rule__Reference__TypeAssignment_3 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4577:1: ( ( rule__Reference__TypeAssignment_3 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4578:1: ( rule__Reference__TypeAssignment_3 )
            {
             before(grammarAccess.getReferenceAccess().getTypeAssignment_3()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4579:1: ( rule__Reference__TypeAssignment_3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4579:2: rule__Reference__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Reference__TypeAssignment_3_in_rule__Reference__Group__3__Impl9265);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4589:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4593:1: ( rule__Reference__Group__4__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4594:2: rule__Reference__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__49295);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4600:1: rule__Reference__Group__4__Impl : ( ( rule__Reference__Group_4__0 )? ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4604:1: ( ( ( rule__Reference__Group_4__0 )? ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4605:1: ( ( rule__Reference__Group_4__0 )? )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4605:1: ( ( rule__Reference__Group_4__0 )? )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4606:1: ( rule__Reference__Group_4__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_4()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4607:1: ( rule__Reference__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4607:2: rule__Reference__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Reference__Group_4__0_in_rule__Reference__Group__4__Impl9322);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4627:1: rule__Reference__Group_4__0 : rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1 ;
    public final void rule__Reference__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4631:1: ( rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4632:2: rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1
            {
            pushFollow(FOLLOW_rule__Reference__Group_4__0__Impl_in_rule__Reference__Group_4__09363);
            rule__Reference__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group_4__1_in_rule__Reference__Group_4__09366);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4639:1: rule__Reference__Group_4__0__Impl : ( 'opposite' ) ;
    public final void rule__Reference__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4643:1: ( ( 'opposite' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4644:1: ( 'opposite' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4644:1: ( 'opposite' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4645:1: 'opposite'
            {
             before(grammarAccess.getReferenceAccess().getOppositeKeyword_4_0()); 
            match(input,42,FOLLOW_42_in_rule__Reference__Group_4__0__Impl9394); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4658:1: rule__Reference__Group_4__1 : rule__Reference__Group_4__1__Impl ;
    public final void rule__Reference__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4662:1: ( rule__Reference__Group_4__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4663:2: rule__Reference__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group_4__1__Impl_in_rule__Reference__Group_4__19425);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4669:1: rule__Reference__Group_4__1__Impl : ( ( rule__Reference__OppositeAssignment_4_1 ) ) ;
    public final void rule__Reference__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4673:1: ( ( ( rule__Reference__OppositeAssignment_4_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4674:1: ( ( rule__Reference__OppositeAssignment_4_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4674:1: ( ( rule__Reference__OppositeAssignment_4_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4675:1: ( rule__Reference__OppositeAssignment_4_1 )
            {
             before(grammarAccess.getReferenceAccess().getOppositeAssignment_4_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4676:1: ( rule__Reference__OppositeAssignment_4_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4676:2: rule__Reference__OppositeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Reference__OppositeAssignment_4_1_in_rule__Reference__Group_4__1__Impl9452);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4690:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4694:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4695:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__09486);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__09489);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4702:1: rule__Operation__Group__0__Impl : ( ( rule__Operation__VisibilityAssignment_0 )? ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4706:1: ( ( ( rule__Operation__VisibilityAssignment_0 )? ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4707:1: ( ( rule__Operation__VisibilityAssignment_0 )? )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4707:1: ( ( rule__Operation__VisibilityAssignment_0 )? )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4708:1: ( rule__Operation__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getOperationAccess().getVisibilityAssignment_0()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4709:1: ( rule__Operation__VisibilityAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=11 && LA22_0<=13)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4709:2: rule__Operation__VisibilityAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Operation__VisibilityAssignment_0_in_rule__Operation__Group__0__Impl9516);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4719:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4723:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4724:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__19547);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__19550);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4731:1: rule__Operation__Group__1__Impl : ( 'op' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4735:1: ( ( 'op' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4736:1: ( 'op' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4736:1: ( 'op' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4737:1: 'op'
            {
             before(grammarAccess.getOperationAccess().getOpKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__Operation__Group__1__Impl9578); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4750:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4754:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4755:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__29609);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__29612);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4762:1: rule__Operation__Group__2__Impl : ( ( rule__Operation__NameAssignment_2 ) ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4766:1: ( ( ( rule__Operation__NameAssignment_2 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4767:1: ( ( rule__Operation__NameAssignment_2 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4767:1: ( ( rule__Operation__NameAssignment_2 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4768:1: ( rule__Operation__NameAssignment_2 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_2()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4769:1: ( rule__Operation__NameAssignment_2 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4769:2: rule__Operation__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Operation__NameAssignment_2_in_rule__Operation__Group__2__Impl9639);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4779:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4783:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4784:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__39669);
            rule__Operation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__39672);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4791:1: rule__Operation__Group__3__Impl : ( '(' ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4795:1: ( ( '(' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4796:1: ( '(' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4796:1: ( '(' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4797:1: '('
            {
             before(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_3()); 
            match(input,44,FOLLOW_44_in_rule__Operation__Group__3__Impl9700); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4810:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4814:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4815:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__49731);
            rule__Operation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__49734);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4822:1: rule__Operation__Group__4__Impl : ( ( rule__Operation__Group_4__0 )? ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4826:1: ( ( ( rule__Operation__Group_4__0 )? ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4827:1: ( ( rule__Operation__Group_4__0 )? )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4827:1: ( ( rule__Operation__Group_4__0 )? )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4828:1: ( rule__Operation__Group_4__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_4()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4829:1: ( rule__Operation__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4829:2: rule__Operation__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl9761);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4839:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4843:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4844:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__59792);
            rule__Operation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__6_in_rule__Operation__Group__59795);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4851:1: rule__Operation__Group__5__Impl : ( ')' ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4855:1: ( ( ')' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4856:1: ( ')' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4856:1: ( ')' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4857:1: ')'
            {
             before(grammarAccess.getOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,45,FOLLOW_45_in_rule__Operation__Group__5__Impl9823); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4870:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl rule__Operation__Group__7 ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4874:1: ( rule__Operation__Group__6__Impl rule__Operation__Group__7 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4875:2: rule__Operation__Group__6__Impl rule__Operation__Group__7
            {
            pushFollow(FOLLOW_rule__Operation__Group__6__Impl_in_rule__Operation__Group__69854);
            rule__Operation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__7_in_rule__Operation__Group__69857);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4882:1: rule__Operation__Group__6__Impl : ( ':' ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4886:1: ( ( ':' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4887:1: ( ':' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4887:1: ( ':' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4888:1: ':'
            {
             before(grammarAccess.getOperationAccess().getColonKeyword_6()); 
            match(input,27,FOLLOW_27_in_rule__Operation__Group__6__Impl9885); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4901:1: rule__Operation__Group__7 : rule__Operation__Group__7__Impl ;
    public final void rule__Operation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4905:1: ( rule__Operation__Group__7__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4906:2: rule__Operation__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group__7__Impl_in_rule__Operation__Group__79916);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4912:1: rule__Operation__Group__7__Impl : ( ( rule__Operation__TypeAssignment_7 ) ) ;
    public final void rule__Operation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4916:1: ( ( ( rule__Operation__TypeAssignment_7 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4917:1: ( ( rule__Operation__TypeAssignment_7 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4917:1: ( ( rule__Operation__TypeAssignment_7 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4918:1: ( rule__Operation__TypeAssignment_7 )
            {
             before(grammarAccess.getOperationAccess().getTypeAssignment_7()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4919:1: ( rule__Operation__TypeAssignment_7 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4919:2: rule__Operation__TypeAssignment_7
            {
            pushFollow(FOLLOW_rule__Operation__TypeAssignment_7_in_rule__Operation__Group__7__Impl9943);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4945:1: rule__Operation__Group_4__0 : rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 ;
    public final void rule__Operation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4949:1: ( rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4950:2: rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__09989);
            rule__Operation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__09992);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4957:1: rule__Operation__Group_4__0__Impl : ( ( rule__Operation__ParamsAssignment_4_0 ) ) ;
    public final void rule__Operation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4961:1: ( ( ( rule__Operation__ParamsAssignment_4_0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4962:1: ( ( rule__Operation__ParamsAssignment_4_0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4962:1: ( ( rule__Operation__ParamsAssignment_4_0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4963:1: ( rule__Operation__ParamsAssignment_4_0 )
            {
             before(grammarAccess.getOperationAccess().getParamsAssignment_4_0()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4964:1: ( rule__Operation__ParamsAssignment_4_0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4964:2: rule__Operation__ParamsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Operation__ParamsAssignment_4_0_in_rule__Operation__Group_4__0__Impl10019);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4974:1: rule__Operation__Group_4__1 : rule__Operation__Group_4__1__Impl ;
    public final void rule__Operation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4978:1: ( rule__Operation__Group_4__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4979:2: rule__Operation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__110049);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4985:1: rule__Operation__Group_4__1__Impl : ( ( rule__Operation__Group_4_1__0 )* ) ;
    public final void rule__Operation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4989:1: ( ( ( rule__Operation__Group_4_1__0 )* ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4990:1: ( ( rule__Operation__Group_4_1__0 )* )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4990:1: ( ( rule__Operation__Group_4_1__0 )* )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4991:1: ( rule__Operation__Group_4_1__0 )*
            {
             before(grammarAccess.getOperationAccess().getGroup_4_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4992:1: ( rule__Operation__Group_4_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==46) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:4992:2: rule__Operation__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Operation__Group_4_1__0_in_rule__Operation__Group_4__1__Impl10076);
            	    rule__Operation__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5006:1: rule__Operation__Group_4_1__0 : rule__Operation__Group_4_1__0__Impl rule__Operation__Group_4_1__1 ;
    public final void rule__Operation__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5010:1: ( rule__Operation__Group_4_1__0__Impl rule__Operation__Group_4_1__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5011:2: rule__Operation__Group_4_1__0__Impl rule__Operation__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_4_1__0__Impl_in_rule__Operation__Group_4_1__010111);
            rule__Operation__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4_1__1_in_rule__Operation__Group_4_1__010114);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5018:1: rule__Operation__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Operation__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5022:1: ( ( ',' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5023:1: ( ',' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5023:1: ( ',' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5024:1: ','
            {
             before(grammarAccess.getOperationAccess().getCommaKeyword_4_1_0()); 
            match(input,46,FOLLOW_46_in_rule__Operation__Group_4_1__0__Impl10142); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5037:1: rule__Operation__Group_4_1__1 : rule__Operation__Group_4_1__1__Impl ;
    public final void rule__Operation__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5041:1: ( rule__Operation__Group_4_1__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5042:2: rule__Operation__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_4_1__1__Impl_in_rule__Operation__Group_4_1__110173);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5048:1: rule__Operation__Group_4_1__1__Impl : ( ( rule__Operation__ParamsAssignment_4_1_1 ) ) ;
    public final void rule__Operation__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5052:1: ( ( ( rule__Operation__ParamsAssignment_4_1_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5053:1: ( ( rule__Operation__ParamsAssignment_4_1_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5053:1: ( ( rule__Operation__ParamsAssignment_4_1_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5054:1: ( rule__Operation__ParamsAssignment_4_1_1 )
            {
             before(grammarAccess.getOperationAccess().getParamsAssignment_4_1_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5055:1: ( rule__Operation__ParamsAssignment_4_1_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5055:2: rule__Operation__ParamsAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__Operation__ParamsAssignment_4_1_1_in_rule__Operation__Group_4_1__1__Impl10200);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5069:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5073:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5074:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__010234);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__010237);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5081:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5085:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5086:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5086:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5087:1: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5088:1: ( rule__Parameter__NameAssignment_0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5088:2: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_0_in_rule__Parameter__Group__0__Impl10264);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5098:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5102:1: ( rule__Parameter__Group__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5103:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__110294);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5109:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__TypeAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5113:1: ( ( ( rule__Parameter__TypeAssignment_1 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5114:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5114:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5115:1: ( rule__Parameter__TypeAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5116:1: ( rule__Parameter__TypeAssignment_1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5116:2: rule__Parameter__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_1_in_rule__Parameter__Group__1__Impl10321);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5130:1: rule__TypeRef__Group__0 : rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 ;
    public final void rule__TypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5134:1: ( rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5135:2: rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__010355);
            rule__TypeRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__010358);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5142:1: rule__TypeRef__Group__0__Impl : ( ( rule__TypeRef__ReferencedAssignment_0 ) ) ;
    public final void rule__TypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5146:1: ( ( ( rule__TypeRef__ReferencedAssignment_0 ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5147:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5147:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5148:1: ( rule__TypeRef__ReferencedAssignment_0 )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5149:1: ( rule__TypeRef__ReferencedAssignment_0 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5149:2: rule__TypeRef__ReferencedAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl10385);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5159:1: rule__TypeRef__Group__1 : rule__TypeRef__Group__1__Impl ;
    public final void rule__TypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5163:1: ( rule__TypeRef__Group__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5164:2: rule__TypeRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__110415);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5170:1: rule__TypeRef__Group__1__Impl : ( ( rule__TypeRef__MultiAssignment_1 )? ) ;
    public final void rule__TypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5174:1: ( ( ( rule__TypeRef__MultiAssignment_1 )? ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5175:1: ( ( rule__TypeRef__MultiAssignment_1 )? )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5175:1: ( ( rule__TypeRef__MultiAssignment_1 )? )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5176:1: ( rule__TypeRef__MultiAssignment_1 )?
            {
             before(grammarAccess.getTypeRefAccess().getMultiAssignment_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5177:1: ( rule__TypeRef__MultiAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==49) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5177:2: rule__TypeRef__MultiAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeRef__MultiAssignment_1_in_rule__TypeRef__Group__1__Impl10442);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5191:1: rule__QualifiedNameWithWildCard__Group__0 : rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 ;
    public final void rule__QualifiedNameWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5195:1: ( rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5196:2: rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__010477);
            rule__QualifiedNameWithWildCard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__010480);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5203:1: rule__QualifiedNameWithWildCard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5207:1: ( ( ruleQualifiedName ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5208:1: ( ruleQualifiedName )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5208:1: ( ruleQualifiedName )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5209:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl10507);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5220:1: rule__QualifiedNameWithWildCard__Group__1 : rule__QualifiedNameWithWildCard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5224:1: ( rule__QualifiedNameWithWildCard__Group__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5225:2: rule__QualifiedNameWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__110536);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5231:1: rule__QualifiedNameWithWildCard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5235:1: ( ( ( '.*' )? ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5236:1: ( ( '.*' )? )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5236:1: ( ( '.*' )? )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5237:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5238:1: ( '.*' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==47) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5239:2: '.*'
                    {
                    match(input,47,FOLLOW_47_in_rule__QualifiedNameWithWildCard__Group__1__Impl10565); 

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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5254:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5258:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5259:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__010602);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__010605);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5266:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5270:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5271:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5271:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5272:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl10632); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5283:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5287:1: ( rule__QualifiedName__Group__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5288:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__110661);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5294:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5298:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5299:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5299:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5300:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5301:1: ( rule__QualifiedName__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==48) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5301:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl10688);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5315:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5319:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5320:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__010723);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__010726);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5327:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5331:1: ( ( '.' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5332:1: ( '.' )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5332:1: ( '.' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5333:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,48,FOLLOW_48_in_rule__QualifiedName__Group_1__0__Impl10754); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5346:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5350:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5351:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__110785);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5357:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5361:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5362:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5362:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5363:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl10812); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5379:1: rule__Model__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5383:1: ( ( ruleAbstractElement ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5384:1: ( ruleAbstractElement )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5384:1: ( ruleAbstractElement )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5385:1: ruleAbstractElement
            {
             before(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__Model__ElementsAssignment10850);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5394:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5398:1: ( ( ruleQualifiedNameWithWildCard ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5399:1: ( ruleQualifiedNameWithWildCard )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5399:1: ( ruleQualifiedNameWithWildCard )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5400:1: ruleQualifiedNameWithWildCard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_110881);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5409:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5413:1: ( ( ruleQualifiedName ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5414:1: ( ruleQualifiedName )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5414:1: ( ruleQualifiedName )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5415:1: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_110912);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5424:1: rule__PackageDeclaration__DatabaseModesAssignment_3 : ( ruleDatabaseMode ) ;
    public final void rule__PackageDeclaration__DatabaseModesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5428:1: ( ( ruleDatabaseMode ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5429:1: ( ruleDatabaseMode )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5429:1: ( ruleDatabaseMode )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5430:1: ruleDatabaseMode
            {
             before(grammarAccess.getPackageDeclarationAccess().getDatabaseModesDatabaseModeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDatabaseMode_in_rule__PackageDeclaration__DatabaseModesAssignment_310943);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5439:1: rule__PackageDeclaration__ElementsAssignment_4 : ( ruleAbstractElement ) ;
    public final void rule__PackageDeclaration__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5443:1: ( ( ruleAbstractElement ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5444:1: ( ruleAbstractElement )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5444:1: ( ruleAbstractElement )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5445:1: ruleAbstractElement
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__PackageDeclaration__ElementsAssignment_410974);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5454:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5458:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5459:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5459:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5460:1: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_111005); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5469:1: rule__DatabaseMode__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DatabaseMode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5473:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5474:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5474:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5475:1: RULE_ID
            {
             before(grammarAccess.getDatabaseModeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DatabaseMode__NameAssignment_111036); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5484:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5488:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5489:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5489:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5490:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_111067); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5499:1: rule__Entity__DatabaseVendorAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__DatabaseVendorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5503:1: ( ( ( RULE_ID ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5504:1: ( ( RULE_ID ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5504:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5505:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getDatabaseVendorDatabaseModeCrossReference_2_0()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5506:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5507:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getDatabaseVendorDatabaseModeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__DatabaseVendorAssignment_211102); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5518:1: rule__Entity__SuperTypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5522:1: ( ( ( RULE_ID ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5523:1: ( ( RULE_ID ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5523:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5524:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5525:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5526:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_3_111141); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5537:1: rule__Entity__ReadOnlyAssignment_4 : ( ruleReadOnly ) ;
    public final void rule__Entity__ReadOnlyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5541:1: ( ( ruleReadOnly ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5542:1: ( ruleReadOnly )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5542:1: ( ruleReadOnly )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5543:1: ruleReadOnly
            {
             before(grammarAccess.getEntityAccess().getReadOnlyReadOnlyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleReadOnly_in_rule__Entity__ReadOnlyAssignment_411176);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5552:1: rule__Entity__CacheableAssignment_5 : ( ruleCacheable ) ;
    public final void rule__Entity__CacheableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5556:1: ( ( ruleCacheable ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5557:1: ( ruleCacheable )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5557:1: ( ruleCacheable )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5558:1: ruleCacheable
            {
             before(grammarAccess.getEntityAccess().getCacheableCacheableParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleCacheable_in_rule__Entity__CacheableAssignment_511207);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5567:1: rule__Entity__IdentifierAssignment_7 : ( ruleIdentifier ) ;
    public final void rule__Entity__IdentifierAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5571:1: ( ( ruleIdentifier ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5572:1: ( ruleIdentifier )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5572:1: ( ruleIdentifier )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5573:1: ruleIdentifier
            {
             before(grammarAccess.getEntityAccess().getIdentifierIdentifierParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__Entity__IdentifierAssignment_711238);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5582:1: rule__Entity__ImportsAssignment_8 : ( ruleImport ) ;
    public final void rule__Entity__ImportsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5586:1: ( ( ruleImport ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5587:1: ( ruleImport )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5587:1: ( ruleImport )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5588:1: ruleImport
            {
             before(grammarAccess.getEntityAccess().getImportsImportParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Entity__ImportsAssignment_811269);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5597:1: rule__Entity__FeaturesAssignment_9 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5601:1: ( ( ruleFeature ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5602:1: ( ruleFeature )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5602:1: ( ruleFeature )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5603:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_911300);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5612:1: rule__ReadOnly__TableNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ReadOnly__TableNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5616:1: ( ( RULE_STRING ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5617:1: ( RULE_STRING )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5617:1: ( RULE_STRING )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5618:1: RULE_STRING
            {
             before(grammarAccess.getReadOnlyAccess().getTableNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ReadOnly__TableNameAssignment_111331); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5627:1: rule__ReadOnly__IdColumnAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ReadOnly__IdColumnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5631:1: ( ( RULE_STRING ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5632:1: ( RULE_STRING )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5632:1: ( RULE_STRING )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5633:1: RULE_STRING
            {
             before(grammarAccess.getReadOnlyAccess().getIdColumnSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ReadOnly__IdColumnAssignment_211362); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5642:1: rule__UniqueIdentiferColumn__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__UniqueIdentiferColumn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5646:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5647:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5647:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5648:1: RULE_ID
            {
             before(grammarAccess.getUniqueIdentiferColumnAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UniqueIdentiferColumn__NameAssignment_111393); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5657:1: rule__EmbeddedUniqueIdentifer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EmbeddedUniqueIdentifer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5661:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5662:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5662:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5663:1: RULE_ID
            {
             before(grammarAccess.getEmbeddedUniqueIdentiferAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EmbeddedUniqueIdentifer__NameAssignment_111424); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5672:1: rule__StaticAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StaticAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5676:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5677:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5677:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5678:1: RULE_ID
            {
             before(grammarAccess.getStaticAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StaticAttribute__NameAssignment_111455); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5687:1: rule__StaticAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__StaticAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5691:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5692:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5692:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5693:1: ruleTypeRef
            {
             before(grammarAccess.getStaticAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__StaticAttribute__TypeAssignment_311486);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5702:1: rule__ReadOnlyInternalAttribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ReadOnlyInternalAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5706:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5707:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5707:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5708:1: RULE_ID
            {
             before(grammarAccess.getReadOnlyInternalAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ReadOnlyInternalAttribute__NameAssignment_011517); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5717:1: rule__ReadOnlyInternalAttribute__TypeAssignment_2 : ( ruleTypeRef ) ;
    public final void rule__ReadOnlyInternalAttribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5721:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5722:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5722:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5723:1: ruleTypeRef
            {
             before(grammarAccess.getReadOnlyInternalAttributeAccess().getTypeTypeRefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__ReadOnlyInternalAttribute__TypeAssignment_211548);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5732:1: rule__UpdatableInternalAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__UpdatableInternalAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5736:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5737:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5737:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5738:1: RULE_ID
            {
             before(grammarAccess.getUpdatableInternalAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UpdatableInternalAttribute__NameAssignment_111579); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5747:1: rule__UpdatableInternalAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__UpdatableInternalAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5751:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5752:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5752:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5753:1: ruleTypeRef
            {
             before(grammarAccess.getUpdatableInternalAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__UpdatableInternalAttribute__TypeAssignment_311610);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5762:1: rule__TransientAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TransientAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5766:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5767:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5767:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5768:1: RULE_ID
            {
             before(grammarAccess.getTransientAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TransientAttribute__NameAssignment_111641); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5777:1: rule__TransientAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__TransientAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5781:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5782:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5782:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5783:1: ruleTypeRef
            {
             before(grammarAccess.getTransientAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__TransientAttribute__TypeAssignment_311672);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5792:1: rule__IdAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__IdAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5796:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5797:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5797:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5798:1: RULE_ID
            {
             before(grammarAccess.getIdAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IdAttribute__NameAssignment_111703); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5807:1: rule__IdAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__IdAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5811:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5812:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5812:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5813:1: ruleTypeRef
            {
             before(grammarAccess.getIdAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__IdAttribute__TypeAssignment_311734);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5822:1: rule__OneToOneRelationshipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OneToOneRelationshipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5826:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5827:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5827:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5828:1: RULE_ID
            {
             before(grammarAccess.getOneToOneRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OneToOneRelationshipAttribute__NameAssignment_111765); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5837:1: rule__OneToOneRelationshipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__OneToOneRelationshipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5841:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5842:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5842:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5843:1: ruleTypeRef
            {
             before(grammarAccess.getOneToOneRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__OneToOneRelationshipAttribute__TypeAssignment_311796);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5852:1: rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4 : ( RULE_STRING ) ;
    public final void rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5856:1: ( ( RULE_STRING ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5857:1: ( RULE_STRING )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5857:1: ( RULE_STRING )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5858:1: RULE_STRING
            {
             before(grammarAccess.getOneToOneRelationshipAttributeAccess().getJoinColumnOverrideSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_411827); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5867:1: rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5871:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5872:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5872:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5873:1: RULE_ID
            {
             before(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OneToOneMappedByRelationshipAttribute__NameAssignment_111858); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5882:1: rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5886:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5887:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5887:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5888:1: ruleTypeRef
            {
             before(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_311889);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5897:1: rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5901:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5902:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5902:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5903:1: RULE_ID
            {
             before(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_111920); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5912:1: rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5916:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5917:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5917:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5918:1: ruleTypeRef
            {
             before(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_311951);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5927:1: rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5931:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5932:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5932:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5933:1: RULE_ID
            {
             before(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_111982); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5942:1: rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5946:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5947:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5947:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5948:1: ruleTypeRef
            {
             before(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_312013);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5957:1: rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5961:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5962:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5962:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5963:1: RULE_ID
            {
             before(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OneToManyMappedByRelationshipAttribute__NameAssignment_112044); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5972:1: rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5976:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5977:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5977:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5978:1: ruleTypeRef
            {
             before(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_312075);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5987:1: rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5991:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5992:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5992:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:5993:1: RULE_ID
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_112106); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6002:1: rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6006:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6007:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6007:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6008:1: ruleTypeRef
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_312137);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6017:1: rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6021:1: ( ( RULE_STRING ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6022:1: ( RULE_STRING )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6022:1: ( RULE_STRING )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6023:1: RULE_STRING
            {
             before(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getJoinColumnOverrideSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_412168); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6032:1: rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6036:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6037:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6037:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6038:1: RULE_ID
            {
             before(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_112199); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6047:1: rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6051:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6052:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6052:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6053:1: ruleTypeRef
            {
             before(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_312230);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6062:1: rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6066:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6067:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6067:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6068:1: RULE_ID
            {
             before(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_112261); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6077:1: rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6081:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6082:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6082:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6083:1: ruleTypeRef
            {
             before(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_312292);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6092:1: rule__ManyToManyRelationshipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ManyToManyRelationshipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6096:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6097:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6097:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6098:1: RULE_ID
            {
             before(grammarAccess.getManyToManyRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ManyToManyRelationshipAttribute__NameAssignment_112323); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6107:1: rule__ManyToManyRelationshipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__ManyToManyRelationshipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6111:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6112:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6112:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6113:1: ruleTypeRef
            {
             before(grammarAccess.getManyToManyRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__ManyToManyRelationshipAttribute__TypeAssignment_312354);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6122:1: rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6126:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6127:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6127:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6128:1: RULE_ID
            {
             before(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_112385); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6137:1: rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6141:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6142:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6142:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6143:1: ruleTypeRef
            {
             before(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_312416);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6152:1: rule__Reference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Reference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6156:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6157:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6157:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6158:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_112447); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6167:1: rule__Reference__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__Reference__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6171:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6172:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6172:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6173:1: ruleTypeRef
            {
             before(grammarAccess.getReferenceAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Reference__TypeAssignment_312478);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6182:1: rule__Reference__OppositeAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__OppositeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6186:1: ( ( ( RULE_ID ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6187:1: ( ( RULE_ID ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6187:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6188:1: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getOppositeReferenceCrossReference_4_1_0()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6189:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6190:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getOppositeReferenceIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__OppositeAssignment_4_112513); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6201:1: rule__Operation__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Operation__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6205:1: ( ( ruleVisibility ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6206:1: ( ruleVisibility )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6206:1: ( ruleVisibility )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6207:1: ruleVisibility
            {
             before(grammarAccess.getOperationAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVisibility_in_rule__Operation__VisibilityAssignment_012548);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6216:1: rule__Operation__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6220:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6221:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6221:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6222:1: RULE_ID
            {
             before(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_212579); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6231:1: rule__Operation__ParamsAssignment_4_0 : ( ruleParameter ) ;
    public final void rule__Operation__ParamsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6235:1: ( ( ruleParameter ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6236:1: ( ruleParameter )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6236:1: ( ruleParameter )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6237:1: ruleParameter
            {
             before(grammarAccess.getOperationAccess().getParamsParameterParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Operation__ParamsAssignment_4_012610);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6246:1: rule__Operation__ParamsAssignment_4_1_1 : ( ruleParameter ) ;
    public final void rule__Operation__ParamsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6250:1: ( ( ruleParameter ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6251:1: ( ruleParameter )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6251:1: ( ruleParameter )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6252:1: ruleParameter
            {
             before(grammarAccess.getOperationAccess().getParamsParameterParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Operation__ParamsAssignment_4_1_112641);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6261:1: rule__Operation__TypeAssignment_7 : ( ruleTypeRef ) ;
    public final void rule__Operation__TypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6265:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6266:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6266:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6267:1: ruleTypeRef
            {
             before(grammarAccess.getOperationAccess().getTypeTypeRefParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Operation__TypeAssignment_712672);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6276:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6280:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6281:1: ( RULE_ID )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6281:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6282:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_012703); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6291:1: rule__Parameter__TypeAssignment_1 : ( ruleTypeRef ) ;
    public final void rule__Parameter__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6295:1: ( ( ruleTypeRef ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6296:1: ( ruleTypeRef )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6296:1: ( ruleTypeRef )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6297:1: ruleTypeRef
            {
             before(grammarAccess.getParameterAccess().getTypeTypeRefParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Parameter__TypeAssignment_112734);
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6306:1: rule__TypeRef__ReferencedAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypeRef__ReferencedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6310:1: ( ( ( RULE_ID ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6311:1: ( ( RULE_ID ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6311:1: ( ( RULE_ID ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6312:1: ( RULE_ID )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6313:1: ( RULE_ID )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6314:1: RULE_ID
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeRef__ReferencedAssignment_012769); 
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
    // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6325:1: rule__TypeRef__MultiAssignment_1 : ( ( '*' ) ) ;
    public final void rule__TypeRef__MultiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6329:1: ( ( ( '*' ) ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6330:1: ( ( '*' ) )
            {
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6330:1: ( ( '*' ) )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6331:1: ( '*' )
            {
             before(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6332:1: ( '*' )
            // ../jpadsl.ui/src-gen/jpadsl/ui/contentassist/antlr/internal/InternalJPADsl.g:6333:1: '*'
            {
             before(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 
            match(input,49,FOLLOW_49_in_rule__TypeRef__MultiAssignment_112809); 
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
    public static final BitSet FOLLOW_ruleReadOnlyInternalAttribute_in_entryRuleReadOnlyInternalAttribute1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReadOnlyInternalAttribute1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadOnlyInternalAttribute__Group__0_in_ruleReadOnlyInternalAttribute1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdatableInternalAttribute_in_entryRuleUpdatableInternalAttribute1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdatableInternalAttribute1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdatableInternalAttribute__Group__0_in_ruleUpdatableInternalAttribute1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransientAttribute_in_entryRuleTransientAttribute1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransientAttribute1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransientAttribute__Group__0_in_ruleTransientAttribute1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdAttribute_in_entryRuleIdAttribute1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdAttribute1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdAttribute__Group__0_in_ruleIdAttribute1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneToOneRelationshipAttribute_in_entryRuleOneToOneRelationshipAttribute1442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneToOneRelationshipAttribute1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneRelationshipAttribute__Group__0_in_ruleOneToOneRelationshipAttribute1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneToOneMappedByRelationshipAttribute_in_entryRuleOneToOneMappedByRelationshipAttribute1502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneToOneMappedByRelationshipAttribute1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__0_in_ruleOneToOneMappedByRelationshipAttribute1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneToManyJoinTableRelationshipAttribute_in_entryRuleOneToManyJoinTableRelationshipAttribute1562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneToManyJoinTableRelationshipAttribute1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__0_in_ruleOneToManyJoinTableRelationshipAttribute1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneToManyJoinColumnRelationshipAttribute_in_entryRuleOneToManyJoinColumnRelationshipAttribute1622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneToManyJoinColumnRelationshipAttribute1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__0_in_ruleOneToManyJoinColumnRelationshipAttribute1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneToManyMappedByRelationshipAttribute_in_entryRuleOneToManyMappedByRelationshipAttribute1682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneToManyMappedByRelationshipAttribute1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__0_in_ruleOneToManyMappedByRelationshipAttribute1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManyToOneJoinColumnRelationShipAttribute_in_entryRuleManyToOneJoinColumnRelationShipAttribute1742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleManyToOneJoinColumnRelationShipAttribute1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__0_in_ruleManyToOneJoinColumnRelationShipAttribute1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManyToOneJoinTableRelationShipAttribute_in_entryRuleManyToOneJoinTableRelationShipAttribute1802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleManyToOneJoinTableRelationShipAttribute1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__0_in_ruleManyToOneJoinTableRelationShipAttribute1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManyToOneMappedByRelationShipAttribute_in_entryRuleManyToOneMappedByRelationShipAttribute1862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleManyToOneMappedByRelationShipAttribute1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__0_in_ruleManyToOneMappedByRelationShipAttribute1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManyToManyRelationshipAttribute_in_entryRuleManyToManyRelationshipAttribute1922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleManyToManyRelationshipAttribute1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToManyRelationshipAttribute__Group__0_in_ruleManyToManyRelationshipAttribute1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManyToManyMappedByRelationshipAttribute_in_entryRuleManyToManyMappedByRelationshipAttribute1982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleManyToManyMappedByRelationshipAttribute1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__0_in_ruleManyToManyMappedByRelationshipAttribute2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference2042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0_in_ruleReference2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation2102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0_in_ruleOperation2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter2162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef2224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard2284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__AbstractElement__Alternatives2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__AbstractElement__Alternatives2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__AbstractElement__Alternatives2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipAttribute_in_rule__AbstractElement__Alternatives2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__Type__Alternatives2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueIdentiferColumn_in_rule__Identifier__Alternatives2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmbeddedUniqueIdentifer_in_rule__Identifier__Alternatives2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralFeature_in_rule__Feature__Alternatives2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__Feature__Alternatives2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__StructuralFeature__Alternatives2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__StructuralFeature__Alternatives2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalAttribute_in_rule__Attribute__Alternatives2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipAttribute_in_rule__Attribute__Alternatives2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticAttribute_in_rule__Attribute__Alternatives2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadOnlyInternalAttribute_in_rule__InternalAttribute__Alternatives2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdatableInternalAttribute_in_rule__InternalAttribute__Alternatives2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransientAttribute_in_rule__InternalAttribute__Alternatives2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdAttribute_in_rule__InternalAttribute__Alternatives2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneToOneRelationshipAttribute_in_rule__RelationshipAttribute__Alternatives2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneToOneMappedByRelationshipAttribute_in_rule__RelationshipAttribute__Alternatives2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneToManyJoinTableRelationshipAttribute_in_rule__RelationshipAttribute__Alternatives2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneToManyMappedByRelationshipAttribute_in_rule__RelationshipAttribute__Alternatives2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManyToOneJoinColumnRelationShipAttribute_in_rule__RelationshipAttribute__Alternatives2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManyToOneJoinTableRelationShipAttribute_in_rule__RelationshipAttribute__Alternatives2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManyToOneMappedByRelationShipAttribute_in_rule__RelationshipAttribute__Alternatives2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManyToManyRelationshipAttribute_in_rule__RelationshipAttribute__Alternatives2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManyToManyMappedByRelationshipAttribute_in_rule__RelationshipAttribute__Alternatives3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneToManyJoinColumnRelationshipAttribute_in_rule__RelationshipAttribute__Alternatives3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Visibility__Alternatives3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Visibility__Alternatives3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Visibility__Alternatives3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03139 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Import__Group__0__Impl3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__03262 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__03265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PackageDeclaration__Group__0__Impl3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__13324 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__13327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__23384 = new BitSet(new long[]{0x000001FF801EC000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__23387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PackageDeclaration__Group__2__Impl3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__33446 = new BitSet(new long[]{0x000001FF801EC000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__33449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__DatabaseModesAssignment_3_in_rule__PackageDeclaration__Group__3__Impl3476 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__43507 = new BitSet(new long[]{0x000001FF801EC000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__5_in_rule__PackageDeclaration__Group__43510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__ElementsAssignment_4_in_rule__PackageDeclaration__Group__4__Impl3537 = new BitSet(new long[]{0x000001FF8014C002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__5__Impl_in_rule__PackageDeclaration__Group__53568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PackageDeclaration__Group__5__Impl3596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__03639 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__03642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DataType__Group__0__Impl3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__13701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DatabaseMode__Group__0__Impl_in_rule__DatabaseMode__Group__03762 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DatabaseMode__Group__1_in_rule__DatabaseMode__Group__03765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DatabaseMode__Group__0__Impl3793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DatabaseMode__Group__1__Impl_in_rule__DatabaseMode__Group__13824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DatabaseMode__NameAssignment_1_in_rule__DatabaseMode__Group__1__Impl3851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03885 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Entity__Group__0__Impl3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13947 = new BitSet(new long[]{0x0000000000E10010L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl3977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__24007 = new BitSet(new long[]{0x0000000000E10010L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__24010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__DatabaseVendorAssignment_2_in_rule__Entity__Group__2__Impl4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__34068 = new BitSet(new long[]{0x0000000000E10010L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__34071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl4098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__44129 = new BitSet(new long[]{0x0000000000E10010L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__44132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__ReadOnlyAssignment_4_in_rule__Entity__Group__4__Impl4159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__54190 = new BitSet(new long[]{0x0000000000E10010L});
    public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__54193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__CacheableAssignment_5_in_rule__Entity__Group__5__Impl4220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__64251 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__64254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Entity__Group__6__Impl4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__74313 = new BitSet(new long[]{0x00000BFFF416F810L});
    public static final BitSet FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__74316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__IdentifierAssignment_7_in_rule__Entity__Group__7__Impl4343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__84373 = new BitSet(new long[]{0x00000BFFF416F810L});
    public static final BitSet FOLLOW_rule__Entity__Group__9_in_rule__Entity__Group__84376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__ImportsAssignment_8_in_rule__Entity__Group__8__Impl4403 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Entity__Group__9__Impl_in_rule__Entity__Group__94434 = new BitSet(new long[]{0x00000BFFF416F810L});
    public static final BitSet FOLLOW_rule__Entity__Group__10_in_rule__Entity__Group__94437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_9_in_rule__Entity__Group__9__Impl4464 = new BitSet(new long[]{0x00000BFFF414F812L});
    public static final BitSet FOLLOW_rule__Entity__Group__10__Impl_in_rule__Entity__Group__104495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Entity__Group__10__Impl4523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__04576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__04579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Entity__Group_3__0__Impl4607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__14638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperTypeAssignment_3_1_in_rule__Entity__Group_3__1__Impl4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadOnly__Group__0__Impl_in_rule__ReadOnly__Group__04699 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ReadOnly__Group__1_in_rule__ReadOnly__Group__04702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ReadOnly__Group__0__Impl4730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadOnly__Group__1__Impl_in_rule__ReadOnly__Group__14761 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ReadOnly__Group__2_in_rule__ReadOnly__Group__14764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadOnly__TableNameAssignment_1_in_rule__ReadOnly__Group__1__Impl4791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadOnly__Group__2__Impl_in_rule__ReadOnly__Group__24821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadOnly__IdColumnAssignment_2_in_rule__ReadOnly__Group__2__Impl4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cacheable__Group__0__Impl_in_rule__Cacheable__Group__04884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__Cacheable__Group__1_in_rule__Cacheable__Group__04887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Cacheable__Group__0__Impl4915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cacheable__Group__1__Impl_in_rule__Cacheable__Group__14946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueIdentiferColumn__Group__0__Impl_in_rule__UniqueIdentiferColumn__Group__05008 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UniqueIdentiferColumn__Group__1_in_rule__UniqueIdentiferColumn__Group__05011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__UniqueIdentiferColumn__Group__0__Impl5039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueIdentiferColumn__Group__1__Impl_in_rule__UniqueIdentiferColumn__Group__15070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueIdentiferColumn__NameAssignment_1_in_rule__UniqueIdentiferColumn__Group__1__Impl5097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmbeddedUniqueIdentifer__Group__0__Impl_in_rule__EmbeddedUniqueIdentifer__Group__05131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EmbeddedUniqueIdentifer__Group__1_in_rule__EmbeddedUniqueIdentifer__Group__05134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EmbeddedUniqueIdentifer__Group__0__Impl5162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmbeddedUniqueIdentifer__Group__1__Impl_in_rule__EmbeddedUniqueIdentifer__Group__15193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmbeddedUniqueIdentifer__NameAssignment_1_in_rule__EmbeddedUniqueIdentifer__Group__1__Impl5220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticAttribute__Group__0__Impl_in_rule__StaticAttribute__Group__05254 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StaticAttribute__Group__1_in_rule__StaticAttribute__Group__05257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__StaticAttribute__Group__0__Impl5285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticAttribute__Group__1__Impl_in_rule__StaticAttribute__Group__15316 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__StaticAttribute__Group__2_in_rule__StaticAttribute__Group__15319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticAttribute__NameAssignment_1_in_rule__StaticAttribute__Group__1__Impl5346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticAttribute__Group__2__Impl_in_rule__StaticAttribute__Group__25376 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StaticAttribute__Group__3_in_rule__StaticAttribute__Group__25379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__StaticAttribute__Group__2__Impl5407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticAttribute__Group__3__Impl_in_rule__StaticAttribute__Group__35438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticAttribute__TypeAssignment_3_in_rule__StaticAttribute__Group__3__Impl5465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadOnlyInternalAttribute__Group__0__Impl_in_rule__ReadOnlyInternalAttribute__Group__05503 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ReadOnlyInternalAttribute__Group__1_in_rule__ReadOnlyInternalAttribute__Group__05506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadOnlyInternalAttribute__NameAssignment_0_in_rule__ReadOnlyInternalAttribute__Group__0__Impl5533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadOnlyInternalAttribute__Group__1__Impl_in_rule__ReadOnlyInternalAttribute__Group__15563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ReadOnlyInternalAttribute__Group__2_in_rule__ReadOnlyInternalAttribute__Group__15566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ReadOnlyInternalAttribute__Group__1__Impl5594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadOnlyInternalAttribute__Group__2__Impl_in_rule__ReadOnlyInternalAttribute__Group__25625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadOnlyInternalAttribute__TypeAssignment_2_in_rule__ReadOnlyInternalAttribute__Group__2__Impl5652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdatableInternalAttribute__Group__0__Impl_in_rule__UpdatableInternalAttribute__Group__05688 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UpdatableInternalAttribute__Group__1_in_rule__UpdatableInternalAttribute__Group__05691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__UpdatableInternalAttribute__Group__0__Impl5719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdatableInternalAttribute__Group__1__Impl_in_rule__UpdatableInternalAttribute__Group__15750 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__UpdatableInternalAttribute__Group__2_in_rule__UpdatableInternalAttribute__Group__15753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdatableInternalAttribute__NameAssignment_1_in_rule__UpdatableInternalAttribute__Group__1__Impl5780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdatableInternalAttribute__Group__2__Impl_in_rule__UpdatableInternalAttribute__Group__25810 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UpdatableInternalAttribute__Group__3_in_rule__UpdatableInternalAttribute__Group__25813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__UpdatableInternalAttribute__Group__2__Impl5841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdatableInternalAttribute__Group__3__Impl_in_rule__UpdatableInternalAttribute__Group__35872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdatableInternalAttribute__TypeAssignment_3_in_rule__UpdatableInternalAttribute__Group__3__Impl5899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransientAttribute__Group__0__Impl_in_rule__TransientAttribute__Group__05937 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TransientAttribute__Group__1_in_rule__TransientAttribute__Group__05940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TransientAttribute__Group__0__Impl5968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransientAttribute__Group__1__Impl_in_rule__TransientAttribute__Group__15999 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__TransientAttribute__Group__2_in_rule__TransientAttribute__Group__16002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransientAttribute__NameAssignment_1_in_rule__TransientAttribute__Group__1__Impl6029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransientAttribute__Group__2__Impl_in_rule__TransientAttribute__Group__26059 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TransientAttribute__Group__3_in_rule__TransientAttribute__Group__26062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TransientAttribute__Group__2__Impl6090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransientAttribute__Group__3__Impl_in_rule__TransientAttribute__Group__36121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransientAttribute__TypeAssignment_3_in_rule__TransientAttribute__Group__3__Impl6148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdAttribute__Group__0__Impl_in_rule__IdAttribute__Group__06186 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IdAttribute__Group__1_in_rule__IdAttribute__Group__06189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__IdAttribute__Group__0__Impl6217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdAttribute__Group__1__Impl_in_rule__IdAttribute__Group__16248 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__IdAttribute__Group__2_in_rule__IdAttribute__Group__16251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdAttribute__NameAssignment_1_in_rule__IdAttribute__Group__1__Impl6278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdAttribute__Group__2__Impl_in_rule__IdAttribute__Group__26308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IdAttribute__Group__3_in_rule__IdAttribute__Group__26311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__IdAttribute__Group__2__Impl6339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdAttribute__Group__3__Impl_in_rule__IdAttribute__Group__36370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdAttribute__TypeAssignment_3_in_rule__IdAttribute__Group__3__Impl6397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneRelationshipAttribute__Group__0__Impl_in_rule__OneToOneRelationshipAttribute__Group__06435 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OneToOneRelationshipAttribute__Group__1_in_rule__OneToOneRelationshipAttribute__Group__06438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__OneToOneRelationshipAttribute__Group__0__Impl6466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneRelationshipAttribute__Group__1__Impl_in_rule__OneToOneRelationshipAttribute__Group__16497 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__OneToOneRelationshipAttribute__Group__2_in_rule__OneToOneRelationshipAttribute__Group__16500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneRelationshipAttribute__NameAssignment_1_in_rule__OneToOneRelationshipAttribute__Group__1__Impl6527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneRelationshipAttribute__Group__2__Impl_in_rule__OneToOneRelationshipAttribute__Group__26557 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OneToOneRelationshipAttribute__Group__3_in_rule__OneToOneRelationshipAttribute__Group__26560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__OneToOneRelationshipAttribute__Group__2__Impl6588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneRelationshipAttribute__Group__3__Impl_in_rule__OneToOneRelationshipAttribute__Group__36619 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__OneToOneRelationshipAttribute__Group__4_in_rule__OneToOneRelationshipAttribute__Group__36622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneRelationshipAttribute__TypeAssignment_3_in_rule__OneToOneRelationshipAttribute__Group__3__Impl6649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneRelationshipAttribute__Group__4__Impl_in_rule__OneToOneRelationshipAttribute__Group__46679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_4_in_rule__OneToOneRelationshipAttribute__Group__4__Impl6706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl_in_rule__OneToOneMappedByRelationshipAttribute__Group__06747 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__1_in_rule__OneToOneMappedByRelationshipAttribute__Group__06750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__OneToOneMappedByRelationshipAttribute__Group__0__Impl6778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl_in_rule__OneToOneMappedByRelationshipAttribute__Group__16809 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__2_in_rule__OneToOneMappedByRelationshipAttribute__Group__16812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneMappedByRelationshipAttribute__NameAssignment_1_in_rule__OneToOneMappedByRelationshipAttribute__Group__1__Impl6839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl_in_rule__OneToOneMappedByRelationshipAttribute__Group__26869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__3_in_rule__OneToOneMappedByRelationshipAttribute__Group__26872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__OneToOneMappedByRelationshipAttribute__Group__2__Impl6900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneMappedByRelationshipAttribute__Group__3__Impl_in_rule__OneToOneMappedByRelationshipAttribute__Group__36931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_3_in_rule__OneToOneMappedByRelationshipAttribute__Group__3__Impl6958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl_in_rule__OneToManyJoinTableRelationshipAttribute__Group__06996 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__1_in_rule__OneToManyJoinTableRelationshipAttribute__Group__06999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__OneToManyJoinTableRelationshipAttribute__Group__0__Impl7027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl_in_rule__OneToManyJoinTableRelationshipAttribute__Group__17058 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__2_in_rule__OneToManyJoinTableRelationshipAttribute__Group__17061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_1_in_rule__OneToManyJoinTableRelationshipAttribute__Group__1__Impl7088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl_in_rule__OneToManyJoinTableRelationshipAttribute__Group__27118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__3_in_rule__OneToManyJoinTableRelationshipAttribute__Group__27121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__OneToManyJoinTableRelationshipAttribute__Group__2__Impl7149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__Group__3__Impl_in_rule__OneToManyJoinTableRelationshipAttribute__Group__37180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_3_in_rule__OneToManyJoinTableRelationshipAttribute__Group__3__Impl7207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__07245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__1_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__07248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__0__Impl7276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__17307 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__2_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__17310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_1_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__1__Impl7337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__27367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__3_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__27370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__2__Impl7398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__Group__3__Impl_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__37429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_3_in_rule__OneToManyJoinColumnRelationshipAttribute__Group__3__Impl7456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl_in_rule__OneToManyMappedByRelationshipAttribute__Group__07494 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__1_in_rule__OneToManyMappedByRelationshipAttribute__Group__07497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__OneToManyMappedByRelationshipAttribute__Group__0__Impl7525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl_in_rule__OneToManyMappedByRelationshipAttribute__Group__17556 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__2_in_rule__OneToManyMappedByRelationshipAttribute__Group__17559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyMappedByRelationshipAttribute__NameAssignment_1_in_rule__OneToManyMappedByRelationshipAttribute__Group__1__Impl7586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl_in_rule__OneToManyMappedByRelationshipAttribute__Group__27616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__3_in_rule__OneToManyMappedByRelationshipAttribute__Group__27619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__OneToManyMappedByRelationshipAttribute__Group__2__Impl7647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyMappedByRelationshipAttribute__Group__3__Impl_in_rule__OneToManyMappedByRelationshipAttribute__Group__37678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_3_in_rule__OneToManyMappedByRelationshipAttribute__Group__3__Impl7705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__07743 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__1_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__07746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__0__Impl7774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__17805 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__2_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__17808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_1_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__1__Impl7835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__27865 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__3_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__27868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__2__Impl7896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__37927 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__4_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__37930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_3_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__3__Impl7957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__Group__4__Impl_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__47987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_4_in_rule__ManyToOneJoinColumnRelationShipAttribute__Group__4__Impl8014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__08055 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__1_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__08058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__0__Impl8086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__18117 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__2_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__18120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_1_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__1__Impl8147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__28177 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__3_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__28180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__2__Impl8208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__Group__3__Impl_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__38239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_3_in_rule__ManyToOneJoinTableRelationShipAttribute__Group__3__Impl8266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl_in_rule__ManyToOneMappedByRelationShipAttribute__Group__08304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__1_in_rule__ManyToOneMappedByRelationShipAttribute__Group__08307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ManyToOneMappedByRelationShipAttribute__Group__0__Impl8335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl_in_rule__ManyToOneMappedByRelationShipAttribute__Group__18366 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__2_in_rule__ManyToOneMappedByRelationShipAttribute__Group__18369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_1_in_rule__ManyToOneMappedByRelationShipAttribute__Group__1__Impl8396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl_in_rule__ManyToOneMappedByRelationShipAttribute__Group__28426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__3_in_rule__ManyToOneMappedByRelationShipAttribute__Group__28429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ManyToOneMappedByRelationShipAttribute__Group__2__Impl8457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__Group__3__Impl_in_rule__ManyToOneMappedByRelationShipAttribute__Group__38488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_3_in_rule__ManyToOneMappedByRelationShipAttribute__Group__3__Impl8515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToManyRelationshipAttribute__Group__0__Impl_in_rule__ManyToManyRelationshipAttribute__Group__08553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ManyToManyRelationshipAttribute__Group__1_in_rule__ManyToManyRelationshipAttribute__Group__08556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ManyToManyRelationshipAttribute__Group__0__Impl8584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToManyRelationshipAttribute__Group__1__Impl_in_rule__ManyToManyRelationshipAttribute__Group__18615 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ManyToManyRelationshipAttribute__Group__2_in_rule__ManyToManyRelationshipAttribute__Group__18618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToManyRelationshipAttribute__NameAssignment_1_in_rule__ManyToManyRelationshipAttribute__Group__1__Impl8645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToManyRelationshipAttribute__Group__2__Impl_in_rule__ManyToManyRelationshipAttribute__Group__28675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ManyToManyRelationshipAttribute__Group__3_in_rule__ManyToManyRelationshipAttribute__Group__28678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ManyToManyRelationshipAttribute__Group__2__Impl8706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToManyRelationshipAttribute__Group__3__Impl_in_rule__ManyToManyRelationshipAttribute__Group__38737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToManyRelationshipAttribute__TypeAssignment_3_in_rule__ManyToManyRelationshipAttribute__Group__3__Impl8764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl_in_rule__ManyToManyMappedByRelationshipAttribute__Group__08802 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__1_in_rule__ManyToManyMappedByRelationshipAttribute__Group__08805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ManyToManyMappedByRelationshipAttribute__Group__0__Impl8833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl_in_rule__ManyToManyMappedByRelationshipAttribute__Group__18864 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__2_in_rule__ManyToManyMappedByRelationshipAttribute__Group__18867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_1_in_rule__ManyToManyMappedByRelationshipAttribute__Group__1__Impl8894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl_in_rule__ManyToManyMappedByRelationshipAttribute__Group__28924 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__3_in_rule__ManyToManyMappedByRelationshipAttribute__Group__28927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ManyToManyMappedByRelationshipAttribute__Group__2__Impl8955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__Group__3__Impl_in_rule__ManyToManyMappedByRelationshipAttribute__Group__38986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_3_in_rule__ManyToManyMappedByRelationshipAttribute__Group__3__Impl9013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__09051 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__09054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Reference__Group__0__Impl9082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__19113 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__19116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__NameAssignment_1_in_rule__Reference__Group__1__Impl9143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__29173 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__29176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Reference__Group__2__Impl9204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__39235 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__39238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__TypeAssignment_3_in_rule__Reference__Group__3__Impl9265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__49295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__0_in_rule__Reference__Group__4__Impl9322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__0__Impl_in_rule__Reference__Group_4__09363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__1_in_rule__Reference__Group_4__09366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Reference__Group_4__0__Impl9394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__1__Impl_in_rule__Reference__Group_4__19425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__OppositeAssignment_4_1_in_rule__Reference__Group_4__1__Impl9452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__09486 = new BitSet(new long[]{0x00000BFFF414F810L});
    public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__09489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__VisibilityAssignment_0_in_rule__Operation__Group__0__Impl9516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__19547 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__19550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Operation__Group__1__Impl9578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__29609 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__29612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__NameAssignment_2_in_rule__Operation__Group__2__Impl9639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__39669 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__39672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Operation__Group__3__Impl9700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__49731 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__49734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl9761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__59792 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__6_in_rule__Operation__Group__59795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Operation__Group__5__Impl9823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__6__Impl_in_rule__Operation__Group__69854 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group__7_in_rule__Operation__Group__69857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Operation__Group__6__Impl9885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__7__Impl_in_rule__Operation__Group__79916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__TypeAssignment_7_in_rule__Operation__Group__7__Impl9943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__09989 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__09992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ParamsAssignment_4_0_in_rule__Operation__Group_4__0__Impl10019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__110049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4_1__0_in_rule__Operation__Group_4__1__Impl10076 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4_1__0__Impl_in_rule__Operation__Group_4_1__010111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group_4_1__1_in_rule__Operation__Group_4_1__010114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Operation__Group_4_1__0__Impl10142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4_1__1__Impl_in_rule__Operation__Group_4_1__110173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ParamsAssignment_4_1_1_in_rule__Operation__Group_4_1__1__Impl10200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__010234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__010237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_0_in_rule__Parameter__Group__0__Impl10264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__110294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_1_in_rule__Parameter__Group__1__Impl10321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__010355 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__010358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl10385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__110415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__MultiAssignment_1_in_rule__TypeRef__Group__1__Impl10442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__010477 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__010480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl10507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__110536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__QualifiedNameWithWildCard__Group__1__Impl10565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__010602 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__010605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl10632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__110661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl10688 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__010723 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__010726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__QualifiedName__Group_1__0__Impl10754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__110785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl10812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__Model__ElementsAssignment10850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_110881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_110912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatabaseMode_in_rule__PackageDeclaration__DatabaseModesAssignment_310943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__PackageDeclaration__ElementsAssignment_410974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_111005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DatabaseMode__NameAssignment_111036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_111067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__DatabaseVendorAssignment_211102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_3_111141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadOnly_in_rule__Entity__ReadOnlyAssignment_411176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCacheable_in_rule__Entity__CacheableAssignment_511207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__Entity__IdentifierAssignment_711238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Entity__ImportsAssignment_811269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_911300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ReadOnly__TableNameAssignment_111331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ReadOnly__IdColumnAssignment_211362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UniqueIdentiferColumn__NameAssignment_111393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EmbeddedUniqueIdentifer__NameAssignment_111424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StaticAttribute__NameAssignment_111455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__StaticAttribute__TypeAssignment_311486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ReadOnlyInternalAttribute__NameAssignment_011517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__ReadOnlyInternalAttribute__TypeAssignment_211548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UpdatableInternalAttribute__NameAssignment_111579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__UpdatableInternalAttribute__TypeAssignment_311610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TransientAttribute__NameAssignment_111641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__TransientAttribute__TypeAssignment_311672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IdAttribute__NameAssignment_111703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__IdAttribute__TypeAssignment_311734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OneToOneRelationshipAttribute__NameAssignment_111765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__OneToOneRelationshipAttribute__TypeAssignment_311796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__OneToOneRelationshipAttribute__JoinColumnOverrideAssignment_411827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OneToOneMappedByRelationshipAttribute__NameAssignment_111858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__OneToOneMappedByRelationshipAttribute__TypeAssignment_311889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OneToManyJoinTableRelationshipAttribute__NameAssignment_111920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__OneToManyJoinTableRelationshipAttribute__TypeAssignment_311951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OneToManyJoinColumnRelationshipAttribute__NameAssignment_111982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__OneToManyJoinColumnRelationshipAttribute__TypeAssignment_312013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OneToManyMappedByRelationshipAttribute__NameAssignment_112044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__OneToManyMappedByRelationshipAttribute__TypeAssignment_312075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ManyToOneJoinColumnRelationShipAttribute__NameAssignment_112106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__ManyToOneJoinColumnRelationShipAttribute__TypeAssignment_312137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ManyToOneJoinColumnRelationShipAttribute__JoinColumnOverrideAssignment_412168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ManyToOneJoinTableRelationShipAttribute__NameAssignment_112199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__ManyToOneJoinTableRelationShipAttribute__TypeAssignment_312230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ManyToOneMappedByRelationShipAttribute__NameAssignment_112261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__ManyToOneMappedByRelationShipAttribute__TypeAssignment_312292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ManyToManyRelationshipAttribute__NameAssignment_112323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__ManyToManyRelationshipAttribute__TypeAssignment_312354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ManyToManyMappedByRelationshipAttribute__NameAssignment_112385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__ManyToManyMappedByRelationshipAttribute__TypeAssignment_312416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_112447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Reference__TypeAssignment_312478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__OppositeAssignment_4_112513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_rule__Operation__VisibilityAssignment_012548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_212579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Operation__ParamsAssignment_4_012610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Operation__ParamsAssignment_4_1_112641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Operation__TypeAssignment_712672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_012703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Parameter__TypeAssignment_112734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeRef__ReferencedAssignment_012769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__TypeRef__MultiAssignment_112809 = new BitSet(new long[]{0x0000000000000002L});

}