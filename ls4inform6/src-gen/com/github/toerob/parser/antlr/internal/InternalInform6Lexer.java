package com.github.toerob.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInform6Lexer extends Lexer {
    public static final int RULE_HEX=16;
    public static final int T__50=50;
    public static final int RULE_BYTE_ARROW=11;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_PREPROCESSORDIR=4;
    public static final int RULE_DIRECTIONS=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=7;
    public static final int RULE_WORD_ARROW=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int RULE_WS=15;
    public static final int RULE_COMPILER_DIRECTIVE_COMMENT=8;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_BINARY=17;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalInform6Lexer() {;} 
    public InternalInform6Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalInform6Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalInform6.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:11:7: ( 'System_file' )
            // InternalInform6.g:11:9: 'System_file'
            {
            match("System_file"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:12:7: ( ';' )
            // InternalInform6.g:12:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:13:7: ( 'Fake_Action' )
            // InternalInform6.g:13:9: 'Fake_Action'
            {
            match("Fake_Action"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:14:7: ( 'Message' )
            // InternalInform6.g:14:9: 'Message'
            {
            match("Message"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:15:7: ( 'Zcharacter' )
            // InternalInform6.g:15:9: 'Zcharacter'
            {
            match("Zcharacter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:16:7: ( 'Include' )
            // InternalInform6.g:16:9: 'Include'
            {
            match("Include"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:17:7: ( 'Link' )
            // InternalInform6.g:17:9: 'Link'
            {
            match("Link"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:18:7: ( 'End' )
            // InternalInform6.g:18:9: 'End'
            {
            match("End"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:19:7: ( 'Property' )
            // InternalInform6.g:19:9: 'Property'
            {
            match("Property"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:20:7: ( 'additive' )
            // InternalInform6.g:20:9: 'additive'
            {
            match("additive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:21:7: ( 'found_in' )
            // InternalInform6.g:21:9: 'found_in'
            {
            match("found_in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:22:7: ( 'Lowstring' )
            // InternalInform6.g:22:9: 'Lowstring'
            {
            match("Lowstring"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:23:7: ( 'Release' )
            // InternalInform6.g:23:9: 'Release'
            {
            match("Release"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:24:7: ( 'Replace' )
            // InternalInform6.g:24:9: 'Replace'
            {
            match("Replace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:25:7: ( 'Serial' )
            // InternalInform6.g:25:9: 'Serial'
            {
            match("Serial"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:26:7: ( 'Constant' )
            // InternalInform6.g:26:9: 'Constant'
            {
            match("Constant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:27:7: ( '=' )
            // InternalInform6.g:27:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:28:7: ( 'Default' )
            // InternalInform6.g:28:9: 'Default'
            {
            match("Default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:29:7: ( 'Switches' )
            // InternalInform6.g:29:9: 'Switches'
            {
            match("Switches"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:30:7: ( 'Global' )
            // InternalInform6.g:30:9: 'Global'
            {
            match("Global"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:31:7: ( 'meta' )
            // InternalInform6.g:31:9: 'meta'
            {
            match("meta"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:32:7: ( 'Attribute' )
            // InternalInform6.g:32:9: 'Attribute'
            {
            match("Attribute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:33:7: ( 'Class' )
            // InternalInform6.g:33:9: 'Class'
            {
            match("Class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:34:7: ( 'class' )
            // InternalInform6.g:34:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:35:7: ( '(' )
            // InternalInform6.g:35:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:36:7: ( ')' )
            // InternalInform6.g:36:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:37:7: ( ',' )
            // InternalInform6.g:37:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:38:7: ( 'Object' )
            // InternalInform6.g:38:9: 'Object'
            {
            match("Object"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:39:7: ( 'Nearby' )
            // InternalInform6.g:39:9: 'Nearby'
            {
            match("Nearby"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:40:7: ( 'Verb' )
            // InternalInform6.g:40:9: 'Verb'
            {
            match("Verb"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:41:7: ( 'Extend' )
            // InternalInform6.g:41:9: 'Extend'
            {
            match("Extend"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:42:7: ( 'only' )
            // InternalInform6.g:42:9: 'only'
            {
            match("only"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:43:7: ( 'first' )
            // InternalInform6.g:43:9: 'first'
            {
            match("first"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:44:7: ( 'last' )
            // InternalInform6.g:44:9: 'last'
            {
            match("last"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:45:7: ( '*' )
            // InternalInform6.g:45:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:46:7: ( 'reverse' )
            // InternalInform6.g:46:9: 'reverse'
            {
            match("reverse"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:47:7: ( '/' )
            // InternalInform6.g:47:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:48:7: ( 'Array' )
            // InternalInform6.g:48:9: 'Array'
            {
            match("Array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:49:7: ( 'buffer' )
            // InternalInform6.g:49:9: 'buffer'
            {
            match("buffer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:50:7: ( 'table' )
            // InternalInform6.g:50:9: 'table'
            {
            match("table"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:51:7: ( 'string' )
            // InternalInform6.g:51:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:52:7: ( 'with' )
            // InternalInform6.g:52:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:53:7: ( 'private' )
            // InternalInform6.g:53:9: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:54:7: ( 'has' )
            // InternalInform6.g:54:9: 'has'
            {
            match("has"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:55:7: ( '[' )
            // InternalInform6.g:55:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:56:7: ( ']' )
            // InternalInform6.g:56:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:57:7: ( '+' )
            // InternalInform6.g:57:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:58:7: ( '-' )
            // InternalInform6.g:58:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:59:7: ( ':' )
            // InternalInform6.g:59:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:60:7: ( '--' )
            // InternalInform6.g:60:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:61:7: ( '~' )
            // InternalInform6.g:61:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:62:7: ( '!' )
            // InternalInform6.g:62:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:63:7: ( '#' )
            // InternalInform6.g:63:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:64:7: ( '##' )
            // InternalInform6.g:64:9: '##'
            {
            match("##"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:65:7: ( 'hasnt' )
            // InternalInform6.g:65:9: 'hasnt'
            {
            match("hasnt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:66:7: ( 'move' )
            // InternalInform6.g:66:9: 'move'
            {
            match("move"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:67:7: ( 'to' )
            // InternalInform6.g:67:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:68:7: ( 'in' )
            // InternalInform6.g:68:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:69:7: ( 'print' )
            // InternalInform6.g:69:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:70:7: ( 'print_ret' )
            // InternalInform6.g:70:9: 'print_ret'
            {
            match("print_ret"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:71:7: ( 'self' )
            // InternalInform6.g:71:9: 'self'
            {
            match("self"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:72:7: ( 'true' )
            // InternalInform6.g:72:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:73:7: ( 'false' )
            // InternalInform6.g:73:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "RULE_BYTE_ARROW"
    public final void mRULE_BYTE_ARROW() throws RecognitionException {
        try {
            int _type = RULE_BYTE_ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:4936:17: ( '->' )
            // InternalInform6.g:4936:19: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BYTE_ARROW"

    // $ANTLR start "RULE_WORD_ARROW"
    public final void mRULE_WORD_ARROW() throws RecognitionException {
        try {
            int _type = RULE_WORD_ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:4938:17: ( '-->' )
            // InternalInform6.g:4938:19: '-->'
            {
            match("-->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WORD_ARROW"

    // $ANTLR start "RULE_DIRECTIONS"
    public final void mRULE_DIRECTIONS() throws RecognitionException {
        try {
            int _type = RULE_DIRECTIONS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:4940:17: ( ( 'e_to' | 'w_to' | 'n_to' | 's_to' | 'u_to' | 'd_to' | 'se_to' | 'sw_to' | 'nw_to' | 'ne_to' | 'in_to' | 'out_to' ) )
            // InternalInform6.g:4940:19: ( 'e_to' | 'w_to' | 'n_to' | 's_to' | 'u_to' | 'd_to' | 'se_to' | 'sw_to' | 'nw_to' | 'ne_to' | 'in_to' | 'out_to' )
            {
            // InternalInform6.g:4940:19: ( 'e_to' | 'w_to' | 'n_to' | 's_to' | 'u_to' | 'd_to' | 'se_to' | 'sw_to' | 'nw_to' | 'ne_to' | 'in_to' | 'out_to' )
            int alt1=12;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalInform6.g:4940:20: 'e_to'
                    {
                    match("e_to"); 


                    }
                    break;
                case 2 :
                    // InternalInform6.g:4940:27: 'w_to'
                    {
                    match("w_to"); 


                    }
                    break;
                case 3 :
                    // InternalInform6.g:4940:34: 'n_to'
                    {
                    match("n_to"); 


                    }
                    break;
                case 4 :
                    // InternalInform6.g:4940:41: 's_to'
                    {
                    match("s_to"); 


                    }
                    break;
                case 5 :
                    // InternalInform6.g:4940:48: 'u_to'
                    {
                    match("u_to"); 


                    }
                    break;
                case 6 :
                    // InternalInform6.g:4940:55: 'd_to'
                    {
                    match("d_to"); 


                    }
                    break;
                case 7 :
                    // InternalInform6.g:4940:62: 'se_to'
                    {
                    match("se_to"); 


                    }
                    break;
                case 8 :
                    // InternalInform6.g:4940:70: 'sw_to'
                    {
                    match("sw_to"); 


                    }
                    break;
                case 9 :
                    // InternalInform6.g:4940:78: 'nw_to'
                    {
                    match("nw_to"); 


                    }
                    break;
                case 10 :
                    // InternalInform6.g:4940:86: 'ne_to'
                    {
                    match("ne_to"); 


                    }
                    break;
                case 11 :
                    // InternalInform6.g:4940:94: 'in_to'
                    {
                    match("in_to"); 


                    }
                    break;
                case 12 :
                    // InternalInform6.g:4940:102: 'out_to'
                    {
                    match("out_to"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIRECTIONS"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:4942:10: ( ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )? )
            // InternalInform6.g:4942:12: ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )?
            {
            // InternalInform6.g:4942:12: ( '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalInform6.g:4942:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalInform6.g:4942:24: ( '.' ( '0' .. '9' )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalInform6.g:4942:25: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // InternalInform6.g:4942:29: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalInform6.g:4942:30: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:4944:10: ( '$' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )* )
            // InternalInform6.g:4944:12: '$' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )*
            {
            match('$'); 
            // InternalInform6.g:4944:16: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='F')||(LA5_0>='a' && LA5_0<='f')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalInform6.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_BINARY"
    public final void mRULE_BINARY() throws RecognitionException {
        try {
            int _type = RULE_BINARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:4946:13: ( '$' '$' ( '0' | '1' )* )
            // InternalInform6.g:4946:15: '$' '$' ( '0' | '1' )*
            {
            match('$'); 
            match('$'); 
            // InternalInform6.g:4946:23: ( '0' | '1' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='1')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalInform6.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BINARY"

    // $ANTLR start "RULE_COMPILER_DIRECTIVE_COMMENT"
    public final void mRULE_COMPILER_DIRECTIVE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_COMPILER_DIRECTIVE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:4948:33: ( '!' '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalInform6.g:4948:35: '!' '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('!'); 
            match('%'); 
            // InternalInform6.g:4948:43: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalInform6.g:4948:43: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalInform6.g:4948:59: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalInform6.g:4948:60: ( '\\r' )? '\\n'
                    {
                    // InternalInform6.g:4948:60: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalInform6.g:4948:60: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMPILER_DIRECTIVE_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:4950:17: ( '!' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalInform6.g:4950:19: '!' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('!'); 
            // InternalInform6.g:4950:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalInform6.g:4950:23: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalInform6.g:4950:39: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalInform6.g:4950:40: ( '\\r' )? '\\n'
                    {
                    // InternalInform6.g:4950:40: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalInform6.g:4950:40: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:4952:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalInform6.g:4952:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalInform6.g:4952:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\"') ) {
                alt15=1;
            }
            else if ( (LA15_0=='\'') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalInform6.g:4952:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalInform6.g:4952:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='!')||(LA13_0>='#' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalInform6.g:4952:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalInform6.g:4952:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalInform6.g:4952:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalInform6.g:4952:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalInform6.g:4952:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalInform6.g:4952:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_PREPROCESSORDIR"
    public final void mRULE_PREPROCESSORDIR() throws RecognitionException {
        try {
            int _type = RULE_PREPROCESSORDIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:4954:22: ( '#' RULE_ID (~ ( ';' ) )* ';' )
            // InternalInform6.g:4954:24: '#' RULE_ID (~ ( ';' ) )* ';'
            {
            match('#'); 
            mRULE_ID(); 
            // InternalInform6.g:4954:36: (~ ( ';' ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<=':')||(LA16_0>='<' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalInform6.g:4954:36: ~ ( ';' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<=':')||(input.LA(1)>='<' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PREPROCESSORDIR"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:4956:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalInform6.g:4956:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalInform6.g:4956:11: ( '^' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='^') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalInform6.g:4956:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalInform6.g:4956:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')||(LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='z')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalInform6.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:4958:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalInform6.g:4958:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalInform6.g:4958:24: ( options {greedy=false; } : . )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='*') ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1=='/') ) {
                        alt19=2;
                    }
                    else if ( ((LA19_1>='\u0000' && LA19_1<='.')||(LA19_1>='0' && LA19_1<='\uFFFF')) ) {
                        alt19=1;
                    }


                }
                else if ( ((LA19_0>='\u0000' && LA19_0<=')')||(LA19_0>='+' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalInform6.g:4958:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:4960:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalInform6.g:4960:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalInform6.g:4960:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalInform6.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6.g:4962:16: ( . )
            // InternalInform6.g:4962:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalInform6.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | RULE_BYTE_ARROW | RULE_WORD_ARROW | RULE_DIRECTIONS | RULE_INT | RULE_HEX | RULE_BINARY | RULE_COMPILER_DIRECTIVE_COMMENT | RULE_SL_COMMENT | RULE_STRING | RULE_PREPROCESSORDIR | RULE_ID | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt21=77;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // InternalInform6.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // InternalInform6.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // InternalInform6.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // InternalInform6.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // InternalInform6.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // InternalInform6.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // InternalInform6.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // InternalInform6.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // InternalInform6.g:1:58: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // InternalInform6.g:1:64: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // InternalInform6.g:1:70: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // InternalInform6.g:1:76: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // InternalInform6.g:1:82: T__30
                {
                mT__30(); 

                }
                break;
            case 14 :
                // InternalInform6.g:1:88: T__31
                {
                mT__31(); 

                }
                break;
            case 15 :
                // InternalInform6.g:1:94: T__32
                {
                mT__32(); 

                }
                break;
            case 16 :
                // InternalInform6.g:1:100: T__33
                {
                mT__33(); 

                }
                break;
            case 17 :
                // InternalInform6.g:1:106: T__34
                {
                mT__34(); 

                }
                break;
            case 18 :
                // InternalInform6.g:1:112: T__35
                {
                mT__35(); 

                }
                break;
            case 19 :
                // InternalInform6.g:1:118: T__36
                {
                mT__36(); 

                }
                break;
            case 20 :
                // InternalInform6.g:1:124: T__37
                {
                mT__37(); 

                }
                break;
            case 21 :
                // InternalInform6.g:1:130: T__38
                {
                mT__38(); 

                }
                break;
            case 22 :
                // InternalInform6.g:1:136: T__39
                {
                mT__39(); 

                }
                break;
            case 23 :
                // InternalInform6.g:1:142: T__40
                {
                mT__40(); 

                }
                break;
            case 24 :
                // InternalInform6.g:1:148: T__41
                {
                mT__41(); 

                }
                break;
            case 25 :
                // InternalInform6.g:1:154: T__42
                {
                mT__42(); 

                }
                break;
            case 26 :
                // InternalInform6.g:1:160: T__43
                {
                mT__43(); 

                }
                break;
            case 27 :
                // InternalInform6.g:1:166: T__44
                {
                mT__44(); 

                }
                break;
            case 28 :
                // InternalInform6.g:1:172: T__45
                {
                mT__45(); 

                }
                break;
            case 29 :
                // InternalInform6.g:1:178: T__46
                {
                mT__46(); 

                }
                break;
            case 30 :
                // InternalInform6.g:1:184: T__47
                {
                mT__47(); 

                }
                break;
            case 31 :
                // InternalInform6.g:1:190: T__48
                {
                mT__48(); 

                }
                break;
            case 32 :
                // InternalInform6.g:1:196: T__49
                {
                mT__49(); 

                }
                break;
            case 33 :
                // InternalInform6.g:1:202: T__50
                {
                mT__50(); 

                }
                break;
            case 34 :
                // InternalInform6.g:1:208: T__51
                {
                mT__51(); 

                }
                break;
            case 35 :
                // InternalInform6.g:1:214: T__52
                {
                mT__52(); 

                }
                break;
            case 36 :
                // InternalInform6.g:1:220: T__53
                {
                mT__53(); 

                }
                break;
            case 37 :
                // InternalInform6.g:1:226: T__54
                {
                mT__54(); 

                }
                break;
            case 38 :
                // InternalInform6.g:1:232: T__55
                {
                mT__55(); 

                }
                break;
            case 39 :
                // InternalInform6.g:1:238: T__56
                {
                mT__56(); 

                }
                break;
            case 40 :
                // InternalInform6.g:1:244: T__57
                {
                mT__57(); 

                }
                break;
            case 41 :
                // InternalInform6.g:1:250: T__58
                {
                mT__58(); 

                }
                break;
            case 42 :
                // InternalInform6.g:1:256: T__59
                {
                mT__59(); 

                }
                break;
            case 43 :
                // InternalInform6.g:1:262: T__60
                {
                mT__60(); 

                }
                break;
            case 44 :
                // InternalInform6.g:1:268: T__61
                {
                mT__61(); 

                }
                break;
            case 45 :
                // InternalInform6.g:1:274: T__62
                {
                mT__62(); 

                }
                break;
            case 46 :
                // InternalInform6.g:1:280: T__63
                {
                mT__63(); 

                }
                break;
            case 47 :
                // InternalInform6.g:1:286: T__64
                {
                mT__64(); 

                }
                break;
            case 48 :
                // InternalInform6.g:1:292: T__65
                {
                mT__65(); 

                }
                break;
            case 49 :
                // InternalInform6.g:1:298: T__66
                {
                mT__66(); 

                }
                break;
            case 50 :
                // InternalInform6.g:1:304: T__67
                {
                mT__67(); 

                }
                break;
            case 51 :
                // InternalInform6.g:1:310: T__68
                {
                mT__68(); 

                }
                break;
            case 52 :
                // InternalInform6.g:1:316: T__69
                {
                mT__69(); 

                }
                break;
            case 53 :
                // InternalInform6.g:1:322: T__70
                {
                mT__70(); 

                }
                break;
            case 54 :
                // InternalInform6.g:1:328: T__71
                {
                mT__71(); 

                }
                break;
            case 55 :
                // InternalInform6.g:1:334: T__72
                {
                mT__72(); 

                }
                break;
            case 56 :
                // InternalInform6.g:1:340: T__73
                {
                mT__73(); 

                }
                break;
            case 57 :
                // InternalInform6.g:1:346: T__74
                {
                mT__74(); 

                }
                break;
            case 58 :
                // InternalInform6.g:1:352: T__75
                {
                mT__75(); 

                }
                break;
            case 59 :
                // InternalInform6.g:1:358: T__76
                {
                mT__76(); 

                }
                break;
            case 60 :
                // InternalInform6.g:1:364: T__77
                {
                mT__77(); 

                }
                break;
            case 61 :
                // InternalInform6.g:1:370: T__78
                {
                mT__78(); 

                }
                break;
            case 62 :
                // InternalInform6.g:1:376: T__79
                {
                mT__79(); 

                }
                break;
            case 63 :
                // InternalInform6.g:1:382: T__80
                {
                mT__80(); 

                }
                break;
            case 64 :
                // InternalInform6.g:1:388: RULE_BYTE_ARROW
                {
                mRULE_BYTE_ARROW(); 

                }
                break;
            case 65 :
                // InternalInform6.g:1:404: RULE_WORD_ARROW
                {
                mRULE_WORD_ARROW(); 

                }
                break;
            case 66 :
                // InternalInform6.g:1:420: RULE_DIRECTIONS
                {
                mRULE_DIRECTIONS(); 

                }
                break;
            case 67 :
                // InternalInform6.g:1:436: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 68 :
                // InternalInform6.g:1:445: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 69 :
                // InternalInform6.g:1:454: RULE_BINARY
                {
                mRULE_BINARY(); 

                }
                break;
            case 70 :
                // InternalInform6.g:1:466: RULE_COMPILER_DIRECTIVE_COMMENT
                {
                mRULE_COMPILER_DIRECTIVE_COMMENT(); 

                }
                break;
            case 71 :
                // InternalInform6.g:1:498: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 72 :
                // InternalInform6.g:1:514: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 73 :
                // InternalInform6.g:1:526: RULE_PREPROCESSORDIR
                {
                mRULE_PREPROCESSORDIR(); 

                }
                break;
            case 74 :
                // InternalInform6.g:1:547: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 75 :
                // InternalInform6.g:1:555: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 76 :
                // InternalInform6.g:1:571: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 77 :
                // InternalInform6.g:1:579: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA1_eotS =
        "\17\uffff";
    static final String DFA1_eofS =
        "\17\uffff";
    static final String DFA1_minS =
        "\1\144\2\uffff\2\137\12\uffff";
    static final String DFA1_maxS =
        "\1\167\2\uffff\2\167\12\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\5\1\6\1\13\1\14\1\3\1\11\1\12\1\4\1\7\1\10";
    static final String DFA1_specialS =
        "\17\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\6\1\1\3\uffff\1\7\4\uffff\1\3\1\10\3\uffff\1\4\1\uffff\1\5\1\uffff\1\2",
            "",
            "",
            "\1\11\5\uffff\1\13\21\uffff\1\12",
            "\1\14\5\uffff\1\15\21\uffff\1\16",
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

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "4940:19: ( 'e_to' | 'w_to' | 'n_to' | 's_to' | 'u_to' | 'd_to' | 'se_to' | 'sw_to' | 'nw_to' | 'ne_to' | 'in_to' | 'out_to' )";
        }
    }
    static final String DFA21_eotS =
        "\1\64\1\77\1\uffff\13\77\1\uffff\5\77\3\uffff\5\77\1\uffff\1\77\1\145\6\77\3\uffff\1\167\2\uffff\1\173\1\176\5\77\1\uffff\1\73\1\uffff\1\u0088\3\73\3\uffff\3\77\2\uffff\20\77\1\uffff\7\77\3\uffff\6\77\1\uffff\1\77\2\uffff\2\77\1\u00af\11\77\3\uffff\1\u00bb\4\uffff\1\u00bf\5\uffff\1\u00c1\6\77\4\uffff\11\77\1\u00d1\32\77\1\uffff\11\77\1\u00f7\2\uffff\1\u00bf\3\uffff\1\77\1\uffff\15\77\1\u0106\1\77\1\uffff\14\77\1\u0114\1\u0115\5\77\1\u011b\1\u011c\1\77\1\u011e\3\77\1\u0122\1\77\1\u0124\1\77\1\u0126\1\77\1\u0128\1\u0126\3\77\1\uffff\1\77\2\u0126\2\77\2\u0126\7\77\1\uffff\5\77\1\u013b\1\u013c\3\77\1\u0140\2\77\2\uffff\1\77\1\u0144\1\u0145\2\77\2\uffff\1\77\1\uffff\2\77\1\u014b\1\uffff\1\77\1\uffff\1\u0126\1\uffff\1\u0126\1\uffff\1\77\1\u014f\1\u0150\3\u0126\1\77\1\u0152\6\77\1\u0159\3\77\2\uffff\3\77\1\uffff\1\77\1\u0161\1\77\2\uffff\1\u0163\1\u0164\1\u0126\1\77\1\u0166\1\uffff\1\u0167\2\77\2\uffff\1\77\1\uffff\2\77\1\u016d\1\77\1\u016f\1\77\1\uffff\3\77\1\u0174\1\u0175\1\77\1\u0177\1\uffff\1\77\2\uffff\1\u0179\2\uffff\1\u017a\2\77\1\u017d\1\77\1\uffff\1\77\1\uffff\1\77\1\u0181\1\u0182\1\u0183\2\uffff\1\u0184\1\uffff\1\77\2\uffff\2\77\1\uffff\2\77\1\u018a\4\uffff\1\u018b\1\u018c\2\77\1\u018f\3\uffff\1\u0190\1\u0191\3\uffff";
    static final String DFA21_eofS =
        "\u0192\uffff";
    static final String DFA21_minS =
        "\1\0\1\145\1\uffff\1\141\1\145\1\143\1\156\1\151\1\156\1\162\1\144\1\141\1\145\1\154\1\uffff\1\145\1\154\1\145\1\162\1\154\3\uffff\1\142\2\145\1\156\1\141\1\uffff\1\145\1\52\1\165\1\141\2\137\1\162\1\141\3\uffff\1\55\2\uffff\1\0\1\43\1\156\4\137\1\uffff\1\60\1\uffff\1\44\2\0\1\101\3\uffff\1\163\1\162\1\151\2\uffff\1\153\1\163\1\150\1\143\1\156\1\167\1\144\1\164\1\157\1\144\1\165\1\162\2\154\1\156\1\141\1\uffff\1\146\1\157\1\164\1\166\1\164\1\162\1\141\3\uffff\1\152\1\141\1\162\1\154\1\164\1\163\1\uffff\1\166\2\uffff\1\146\1\142\1\60\1\165\1\162\1\137\1\164\1\137\2\164\1\151\1\163\3\uffff\1\76\4\uffff\1\0\5\uffff\1\60\2\164\2\137\2\164\4\uffff\1\164\1\151\1\164\1\145\1\163\1\141\1\154\1\153\1\163\1\60\1\145\1\160\1\151\1\156\2\163\1\145\1\154\2\163\1\141\1\142\1\141\1\145\1\162\1\141\1\163\1\145\1\162\1\142\1\171\1\137\1\164\1\145\1\146\1\154\1\uffff\1\145\1\151\1\146\1\164\1\157\1\164\1\150\1\157\1\156\1\60\2\uffff\1\0\1\12\2\uffff\1\164\1\uffff\2\157\2\164\2\157\1\145\1\141\1\143\1\137\1\141\1\162\1\165\1\60\1\164\1\uffff\1\156\1\145\1\164\1\144\1\164\1\145\2\141\1\164\1\163\1\165\1\141\2\60\1\151\1\171\1\163\1\143\1\142\2\60\1\164\1\60\1\162\2\145\1\60\1\156\1\60\1\157\1\60\1\157\2\60\1\141\2\164\1\uffff\1\157\2\60\2\157\2\60\1\155\1\154\1\150\1\101\1\147\1\141\1\144\1\uffff\1\162\1\144\1\162\1\151\1\137\2\60\1\163\1\143\1\141\1\60\2\154\2\uffff\1\142\2\60\1\164\1\171\2\uffff\1\157\1\uffff\1\163\1\162\1\60\1\uffff\1\147\1\uffff\1\60\1\uffff\1\60\1\uffff\1\164\5\60\1\137\1\60\1\145\1\143\1\145\1\143\1\145\1\151\1\60\1\164\1\166\1\151\2\uffff\2\145\1\156\1\uffff\1\164\1\60\1\165\2\uffff\3\60\1\145\1\60\1\uffff\1\60\1\145\1\162\2\uffff\1\146\1\uffff\1\163\1\164\1\60\1\164\1\60\1\156\1\uffff\1\171\1\145\1\156\2\60\1\164\1\60\1\uffff\1\164\2\uffff\1\60\2\uffff\1\60\1\145\1\151\1\60\1\151\1\uffff\1\145\1\uffff\1\147\3\60\2\uffff\1\60\1\uffff\1\145\2\uffff\1\164\1\154\1\uffff\1\157\1\162\1\60\4\uffff\2\60\1\145\1\156\1\60\3\uffff\2\60\3\uffff";
    static final String DFA21_maxS =
        "\1\uffff\1\171\1\uffff\1\141\1\145\1\143\1\156\1\157\1\170\1\162\1\144\1\157\1\145\1\157\1\uffff\1\145\1\154\1\157\1\164\1\154\3\uffff\1\142\2\145\1\165\1\141\1\uffff\1\145\1\52\1\165\1\162\1\167\1\151\1\162\1\141\3\uffff\1\76\2\uffff\1\uffff\1\172\1\156\1\137\1\167\2\137\1\uffff\1\71\1\uffff\1\44\2\uffff\1\172\3\uffff\1\163\1\162\1\151\2\uffff\1\153\1\163\1\150\1\143\1\156\1\167\1\144\1\164\1\157\1\144\1\165\1\162\1\154\1\160\1\156\1\141\1\uffff\1\146\1\157\1\164\1\166\1\164\1\162\1\141\3\uffff\1\152\1\141\1\162\1\154\1\164\1\163\1\uffff\1\166\2\uffff\1\146\1\142\1\172\1\165\1\162\1\154\1\164\1\137\2\164\1\151\1\163\3\uffff\1\76\4\uffff\1\uffff\5\uffff\1\172\2\164\2\137\2\164\4\uffff\1\164\1\151\1\164\1\145\1\163\1\141\1\154\1\153\1\163\1\172\1\145\1\160\1\151\1\156\2\163\1\145\1\154\2\163\1\141\1\142\1\141\1\145\1\162\1\141\1\163\1\145\1\162\1\142\1\171\1\137\1\164\1\145\1\146\1\154\1\uffff\1\145\1\151\1\146\1\164\1\157\1\164\1\150\1\157\1\166\1\172\2\uffff\1\uffff\1\12\2\uffff\1\164\1\uffff\2\157\2\164\2\157\1\145\1\141\1\143\1\137\1\141\1\162\1\165\1\172\1\164\1\uffff\1\156\1\145\1\164\1\144\1\164\1\145\2\141\1\164\1\163\1\165\1\141\2\172\1\151\1\171\1\163\1\143\1\142\2\172\1\164\1\172\1\162\2\145\1\172\1\156\1\172\1\157\1\172\1\157\2\172\1\141\2\164\1\uffff\1\157\2\172\2\157\2\172\1\155\1\154\1\150\1\101\1\147\1\141\1\144\1\uffff\1\162\1\144\1\162\1\151\1\137\2\172\1\163\1\143\1\141\1\172\2\154\2\uffff\1\142\2\172\1\164\1\171\2\uffff\1\157\1\uffff\1\163\1\162\1\172\1\uffff\1\147\1\uffff\1\172\1\uffff\1\172\1\uffff\1\164\5\172\1\137\1\172\1\145\1\143\1\145\1\143\1\145\1\151\1\172\1\164\1\166\1\151\2\uffff\2\145\1\156\1\uffff\1\164\1\172\1\165\2\uffff\3\172\1\145\1\172\1\uffff\1\172\1\145\1\162\2\uffff\1\146\1\uffff\1\163\1\164\1\172\1\164\1\172\1\156\1\uffff\1\171\1\145\1\156\2\172\1\164\1\172\1\uffff\1\164\2\uffff\1\172\2\uffff\1\172\1\145\1\151\1\172\1\151\1\uffff\1\145\1\uffff\1\147\3\172\2\uffff\1\172\1\uffff\1\145\2\uffff\1\164\1\154\1\uffff\1\157\1\162\1\172\4\uffff\2\172\1\145\1\156\1\172\3\uffff\2\172\3\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\2\13\uffff\1\21\5\uffff\1\31\1\32\1\33\5\uffff\1\43\10\uffff\1\55\1\56\1\57\1\uffff\1\61\1\63\7\uffff\1\103\1\uffff\1\103\4\uffff\1\112\1\114\1\115\3\uffff\1\112\1\2\20\uffff\1\21\7\uffff\1\31\1\32\1\33\6\uffff\1\43\1\uffff\1\113\1\45\14\uffff\1\55\1\56\1\57\1\uffff\1\100\1\60\1\61\1\63\1\uffff\1\64\1\107\1\66\1\65\1\111\7\uffff\1\105\1\104\1\110\1\114\44\uffff\1\71\12\uffff\1\101\1\62\2\uffff\2\106\1\uffff\1\72\17\uffff\1\10\45\uffff\1\54\16\uffff\1\7\15\uffff\1\25\1\70\5\uffff\1\36\1\40\1\uffff\1\42\3\uffff\1\76\1\uffff\1\75\1\uffff\1\102\1\uffff\1\52\22\uffff\1\41\1\77\3\uffff\1\27\3\uffff\1\46\1\30\5\uffff\1\50\3\uffff\1\73\1\67\1\uffff\1\17\6\uffff\1\37\7\uffff\1\24\1\uffff\1\34\1\35\1\uffff\1\47\1\51\5\uffff\1\4\1\uffff\1\6\4\uffff\1\15\1\16\1\uffff\1\22\1\uffff\1\44\1\53\2\uffff\1\23\3\uffff\1\11\1\12\1\13\1\20\5\uffff\1\14\1\26\1\74\2\uffff\1\5\1\1\1\3";
    static final String DFA21_specialS =
        "\1\0\52\uffff\1\4\12\uffff\1\5\1\1\102\uffff\1\3\101\uffff\1\2\u00d5\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\73\2\72\2\73\1\72\22\73\1\72\1\53\1\66\1\54\1\65\2\73\1\67\1\24\1\25\1\34\1\47\1\26\1\50\1\63\1\36\12\62\1\51\1\2\1\73\1\16\3\73\1\22\1\71\1\15\1\17\1\10\1\3\1\20\1\71\1\6\2\71\1\7\1\4\1\30\1\27\1\11\1\71\1\14\1\1\2\71\1\31\3\71\1\5\1\45\1\73\1\46\1\70\1\71\1\73\1\12\1\37\1\23\1\61\1\56\1\13\1\71\1\44\1\55\2\71\1\33\1\21\1\57\1\32\1\43\1\71\1\35\1\41\1\40\1\60\1\71\1\42\3\71\3\73\1\52\uff81\73",
            "\1\75\21\uffff\1\76\1\uffff\1\74",
            "",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105\5\uffff\1\106",
            "\1\107\11\uffff\1\110",
            "\1\111",
            "\1\112",
            "\1\115\7\uffff\1\114\5\uffff\1\113",
            "\1\116",
            "\1\120\2\uffff\1\117",
            "",
            "\1\122",
            "\1\123",
            "\1\124\11\uffff\1\125",
            "\1\127\1\uffff\1\126",
            "\1\130",
            "",
            "",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137\6\uffff\1\140",
            "\1\141",
            "",
            "\1\143",
            "\1\144",
            "\1\146",
            "\1\147\15\uffff\1\150\2\uffff\1\151",
            "\1\154\5\uffff\1\153\16\uffff\1\152\2\uffff\1\155",
            "\1\157\11\uffff\1\156",
            "\1\160",
            "\1\161",
            "",
            "",
            "",
            "\1\165\20\uffff\1\166",
            "",
            "",
            "\45\174\1\172\uffda\174",
            "\1\175\35\uffff\32\177\3\uffff\2\177\1\uffff\32\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082\5\uffff\1\u0084\21\uffff\1\u0083",
            "\1\u0085",
            "\1\u0086",
            "",
            "\12\64",
            "",
            "\1\u0087",
            "\0\u0089",
            "\0\u0089",
            "\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "",
            "",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "",
            "",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b\3\uffff\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "\1\u00ac",
            "",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b3\14\uffff\1\u00b2",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "",
            "",
            "\1\u00ba",
            "",
            "",
            "",
            "",
            "\12\u00bc\1\u00be\2\u00bc\1\u00bd\ufff2\u00bc",
            "",
            "",
            "",
            "",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\u00c0\1\uffff\32\77",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "",
            "",
            "",
            "",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f5\7\uffff\1\u00f4",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\15\77\1\u00f6\14\77",
            "",
            "",
            "\12\u00bc\1\u00be\2\u00bc\1\u00bd\ufff2\u00bc",
            "\1\u00be",
            "",
            "",
            "\1\u00f8",
            "",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0107",
            "",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u011d",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0123",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0125",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0127",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "",
            "\1\u012c",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u012d",
            "\1\u012e",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0141",
            "\1\u0142",
            "",
            "",
            "\1\u0143",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0146",
            "\1\u0147",
            "",
            "",
            "\1\u0148",
            "",
            "\1\u0149",
            "\1\u014a",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "\1\u014c",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "\1\u014d",
            "\12\77\7\uffff\32\77\4\uffff\1\u014e\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0151",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "",
            "",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "",
            "\1\u0160",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0162",
            "",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0165",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0168",
            "\1\u0169",
            "",
            "",
            "\1\u016a",
            "",
            "\1\u016b",
            "\1\u016c",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u016e",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0170",
            "",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0176",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "\1\u0178",
            "",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u017b",
            "\1\u017c",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u017e",
            "",
            "\1\u017f",
            "",
            "\1\u0180",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "\1\u0185",
            "",
            "",
            "\1\u0186",
            "\1\u0187",
            "",
            "\1\u0188",
            "\1\u0189",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "",
            "",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u018d",
            "\1\u018e",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | RULE_BYTE_ARROW | RULE_WORD_ARROW | RULE_DIRECTIONS | RULE_INT | RULE_HEX | RULE_BINARY | RULE_COMPILER_DIRECTIVE_COMMENT | RULE_SL_COMMENT | RULE_STRING | RULE_PREPROCESSORDIR | RULE_ID | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_0 = input.LA(1);

                        s = -1;
                        if ( (LA21_0=='S') ) {s = 1;}

                        else if ( (LA21_0==';') ) {s = 2;}

                        else if ( (LA21_0=='F') ) {s = 3;}

                        else if ( (LA21_0=='M') ) {s = 4;}

                        else if ( (LA21_0=='Z') ) {s = 5;}

                        else if ( (LA21_0=='I') ) {s = 6;}

                        else if ( (LA21_0=='L') ) {s = 7;}

                        else if ( (LA21_0=='E') ) {s = 8;}

                        else if ( (LA21_0=='P') ) {s = 9;}

                        else if ( (LA21_0=='a') ) {s = 10;}

                        else if ( (LA21_0=='f') ) {s = 11;}

                        else if ( (LA21_0=='R') ) {s = 12;}

                        else if ( (LA21_0=='C') ) {s = 13;}

                        else if ( (LA21_0=='=') ) {s = 14;}

                        else if ( (LA21_0=='D') ) {s = 15;}

                        else if ( (LA21_0=='G') ) {s = 16;}

                        else if ( (LA21_0=='m') ) {s = 17;}

                        else if ( (LA21_0=='A') ) {s = 18;}

                        else if ( (LA21_0=='c') ) {s = 19;}

                        else if ( (LA21_0=='(') ) {s = 20;}

                        else if ( (LA21_0==')') ) {s = 21;}

                        else if ( (LA21_0==',') ) {s = 22;}

                        else if ( (LA21_0=='O') ) {s = 23;}

                        else if ( (LA21_0=='N') ) {s = 24;}

                        else if ( (LA21_0=='V') ) {s = 25;}

                        else if ( (LA21_0=='o') ) {s = 26;}

                        else if ( (LA21_0=='l') ) {s = 27;}

                        else if ( (LA21_0=='*') ) {s = 28;}

                        else if ( (LA21_0=='r') ) {s = 29;}

                        else if ( (LA21_0=='/') ) {s = 30;}

                        else if ( (LA21_0=='b') ) {s = 31;}

                        else if ( (LA21_0=='t') ) {s = 32;}

                        else if ( (LA21_0=='s') ) {s = 33;}

                        else if ( (LA21_0=='w') ) {s = 34;}

                        else if ( (LA21_0=='p') ) {s = 35;}

                        else if ( (LA21_0=='h') ) {s = 36;}

                        else if ( (LA21_0=='[') ) {s = 37;}

                        else if ( (LA21_0==']') ) {s = 38;}

                        else if ( (LA21_0=='+') ) {s = 39;}

                        else if ( (LA21_0=='-') ) {s = 40;}

                        else if ( (LA21_0==':') ) {s = 41;}

                        else if ( (LA21_0=='~') ) {s = 42;}

                        else if ( (LA21_0=='!') ) {s = 43;}

                        else if ( (LA21_0=='#') ) {s = 44;}

                        else if ( (LA21_0=='i') ) {s = 45;}

                        else if ( (LA21_0=='e') ) {s = 46;}

                        else if ( (LA21_0=='n') ) {s = 47;}

                        else if ( (LA21_0=='u') ) {s = 48;}

                        else if ( (LA21_0=='d') ) {s = 49;}

                        else if ( ((LA21_0>='0' && LA21_0<='9')) ) {s = 50;}

                        else if ( (LA21_0=='.') ) {s = 51;}

                        else if ( (LA21_0=='$') ) {s = 53;}

                        else if ( (LA21_0=='\"') ) {s = 54;}

                        else if ( (LA21_0=='\'') ) {s = 55;}

                        else if ( (LA21_0=='^') ) {s = 56;}

                        else if ( (LA21_0=='B'||LA21_0=='H'||(LA21_0>='J' && LA21_0<='K')||LA21_0=='Q'||(LA21_0>='T' && LA21_0<='U')||(LA21_0>='W' && LA21_0<='Y')||LA21_0=='_'||LA21_0=='g'||(LA21_0>='j' && LA21_0<='k')||LA21_0=='q'||LA21_0=='v'||(LA21_0>='x' && LA21_0<='z')) ) {s = 57;}

                        else if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 58;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\u001F')||(LA21_0>='%' && LA21_0<='&')||LA21_0=='<'||(LA21_0>='>' && LA21_0<='@')||LA21_0=='\\'||LA21_0=='`'||(LA21_0>='{' && LA21_0<='}')||(LA21_0>='\u007F' && LA21_0<='\uFFFF')) ) {s = 59;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_55 = input.LA(1);

                        s = -1;
                        if ( ((LA21_55>='\u0000' && LA21_55<='\uFFFF')) ) {s = 137;}

                        else s = 59;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_188 = input.LA(1);

                        s = -1;
                        if ( (LA21_188=='\r') ) {s = 189;}

                        else if ( (LA21_188=='\n') ) {s = 190;}

                        else if ( ((LA21_188>='\u0000' && LA21_188<='\t')||(LA21_188>='\u000B' && LA21_188<='\f')||(LA21_188>='\u000E' && LA21_188<='\uFFFF')) ) {s = 188;}

                        else s = 191;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_122 = input.LA(1);

                        s = -1;
                        if ( ((LA21_122>='\u0000' && LA21_122<='\t')||(LA21_122>='\u000B' && LA21_122<='\f')||(LA21_122>='\u000E' && LA21_122<='\uFFFF')) ) {s = 188;}

                        else if ( (LA21_122=='\r') ) {s = 189;}

                        else if ( (LA21_122=='\n') ) {s = 190;}

                        else s = 191;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA21_43 = input.LA(1);

                        s = -1;
                        if ( (LA21_43=='%') ) {s = 122;}

                        else if ( ((LA21_43>='\u0000' && LA21_43<='$')||(LA21_43>='&' && LA21_43<='\uFFFF')) ) {s = 124;}

                        else s = 123;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA21_54 = input.LA(1);

                        s = -1;
                        if ( ((LA21_54>='\u0000' && LA21_54<='\uFFFF')) ) {s = 137;}

                        else s = 59;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}