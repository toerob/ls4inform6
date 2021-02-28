package com.github.toerob.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInform6Lexer extends Lexer {
    public static final int HyphenMinusHyphenMinus=49;
    public static final int Meta=42;
    public static final int Zcharacter=7;
    public static final int RULE_HEX=71;
    public static final int Reverse=21;
    public static final int RULE_BYTE_ARROW=67;
    public static final int Include=15;
    public static final int Lowstring=9;
    public static final int Remove=28;
    public static final int String=29;
    public static final int System_file=5;
    public static final int Global=23;
    public static final int Give=40;
    public static final int Last=41;
    public static final int Class_1=33;
    public static final int LeftParenthesis=54;
    public static final int Verb=39;
    public static final int Private=20;
    public static final int First=34;
    public static final int To=51;
    public static final int RULE_ANY_PREPROCESSORDIR=79;
    public static final int RightSquareBracket=65;
    public static final int ExclamationMark=52;
    public static final int Buffer=27;
    public static final int RULE_ID=77;
    public static final int RightParenthesis=55;
    public static final int RULE_DIRECTIONS=69;
    public static final int Fake_Action=4;
    public static final int Extend=22;
    public static final int PlusSign=57;
    public static final int RULE_INT=70;
    public static final int NumberSign=53;
    public static final int RULE_ML_COMMENT=80;
    public static final int Object=25;
    public static final int End=46;
    public static final int LeftSquareBracket=64;
    public static final int Link=38;
    public static final int Message=16;
    public static final int Attribute=8;
    public static final int In=50;
    public static final int Constant=10;
    public static final int Switches=12;
    public static final int Nearby=24;
    public static final int RULE_STRING=75;
    public static final int With=45;
    public static final int RULE_SL_COMMENT=74;
    public static final int Abbreviate=6;
    public static final int Comma=58;
    public static final int EqualsSign=63;
    public static final int Additive=13;
    public static final int Abort=31;
    public static final int HyphenMinus=59;
    public static final int RULE_WORD_ARROW=68;
    public static final int Move=43;
    public static final int Solidus=60;
    public static final int Colon=61;
    public static final int EOF=-1;
    public static final int Property=11;
    public static final int Asterisk=56;
    public static final int Release=17;
    public static final int Replace=18;
    public static final int Table=37;
    public static final int Hasnt=35;
    public static final int NumberSignNumberSign=48;
    public static final int RULE_WS=81;
    public static final int Notin=36;
    public static final int RULE_STATIC=76;
    public static final int Only=44;
    public static final int Tilde=66;
    public static final int RULE_COMPILER_DIRECTIVE_COMMENT=73;
    public static final int Found_in=14;
    public static final int RULE_UNTIL_AND_WITH_SEMICOLON=78;
    public static final int RULE_ANY_OTHER=82;
    public static final int Array=30;
    public static final int Semicolon=62;
    public static final int Serial=26;
    public static final int Alias=32;
    public static final int Default_1=19;
    public static final int RULE_BINARY=72;
    public static final int Has=47;

    // delegates
    // delegators

    public InternalInform6Lexer() {;} 
    public InternalInform6Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalInform6Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalInform6Lexer.g"; }

    // $ANTLR start "Fake_Action"
    public final void mFake_Action() throws RecognitionException {
        try {
            int _type = Fake_Action;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:14:13: ( ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'K' | 'k' ) ( 'E' | 'e' ) '_' ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // InternalInform6Lexer.g:14:15: ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'K' | 'k' ) ( 'E' | 'e' ) '_' ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Fake_Action"

    // $ANTLR start "System_file"
    public final void mSystem_file() throws RecognitionException {
        try {
            int _type = System_file;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:16:13: ( ( 'S' | 's' ) ( 'Y' | 'y' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'M' | 'm' ) '_' ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // InternalInform6Lexer.g:16:15: ( 'S' | 's' ) ( 'Y' | 'y' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'M' | 'm' ) '_' ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "System_file"

    // $ANTLR start "Abbreviate"
    public final void mAbbreviate() throws RecognitionException {
        try {
            int _type = Abbreviate;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:18:12: ( ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'B' | 'b' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // InternalInform6Lexer.g:18:14: ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'B' | 'b' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Abbreviate"

    // $ANTLR start "Zcharacter"
    public final void mZcharacter() throws RecognitionException {
        try {
            int _type = Zcharacter;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:20:12: ( ( 'Z' | 'z' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // InternalInform6Lexer.g:20:14: ( 'Z' | 'z' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Zcharacter"

    // $ANTLR start "Attribute"
    public final void mAttribute() throws RecognitionException {
        try {
            int _type = Attribute;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:22:11: ( ( 'A' | 'a' ) ( 'T' | 't' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'B' | 'b' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // InternalInform6Lexer.g:22:13: ( 'A' | 'a' ) ( 'T' | 't' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'B' | 'b' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Attribute"

    // $ANTLR start "Lowstring"
    public final void mLowstring() throws RecognitionException {
        try {
            int _type = Lowstring;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:24:11: ( ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'W' | 'w' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // InternalInform6Lexer.g:24:13: ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'W' | 'w' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Lowstring"

    // $ANTLR start "Constant"
    public final void mConstant() throws RecognitionException {
        try {
            int _type = Constant;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:26:10: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // InternalInform6Lexer.g:26:12: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Constant"

    // $ANTLR start "Property"
    public final void mProperty() throws RecognitionException {
        try {
            int _type = Property;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:28:10: ( ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'Y' | 'y' ) )
            // InternalInform6Lexer.g:28:12: ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Property"

    // $ANTLR start "Switches"
    public final void mSwitches() throws RecognitionException {
        try {
            int _type = Switches;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:30:10: ( ( 'S' | 's' ) ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // InternalInform6Lexer.g:30:12: ( 'S' | 's' ) ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Switches"

    // $ANTLR start "Additive"
    public final void mAdditive() throws RecognitionException {
        try {
            int _type = Additive;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:32:10: ( ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) )
            // InternalInform6Lexer.g:32:12: ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Additive"

    // $ANTLR start "Found_in"
    public final void mFound_in() throws RecognitionException {
        try {
            int _type = Found_in;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:34:10: ( ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'D' | 'd' ) '_' ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // InternalInform6Lexer.g:34:12: ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'D' | 'd' ) '_' ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Found_in"

    // $ANTLR start "Include"
    public final void mInclude() throws RecognitionException {
        try {
            int _type = Include;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:36:9: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'D' | 'd' ) ( 'E' | 'e' ) )
            // InternalInform6Lexer.g:36:11: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'D' | 'd' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Include"

    // $ANTLR start "Message"
    public final void mMessage() throws RecognitionException {
        try {
            int _type = Message;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:38:9: ( ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) )
            // InternalInform6Lexer.g:38:11: ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Message"

    // $ANTLR start "Release"
    public final void mRelease() throws RecognitionException {
        try {
            int _type = Release;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:40:9: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalInform6Lexer.g:40:11: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Release"

    // $ANTLR start "Replace"
    public final void mReplace() throws RecognitionException {
        try {
            int _type = Replace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:42:9: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'E' | 'e' ) )
            // InternalInform6Lexer.g:42:11: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Replace"

    // $ANTLR start "Default_1"
    public final void mDefault_1() throws RecognitionException {
        try {
            int _type = Default_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:44:11: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'T' | 't' ) )
            // InternalInform6Lexer.g:44:13: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Default_1"

    // $ANTLR start "Private"
    public final void mPrivate() throws RecognitionException {
        try {
            int _type = Private;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:46:9: ( ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // InternalInform6Lexer.g:46:11: ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Private"

    // $ANTLR start "Reverse"
    public final void mReverse() throws RecognitionException {
        try {
            int _type = Reverse;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:48:9: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalInform6Lexer.g:48:11: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Reverse"

    // $ANTLR start "Extend"
    public final void mExtend() throws RecognitionException {
        try {
            int _type = Extend;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:50:8: ( ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // InternalInform6Lexer.g:50:10: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Extend"

    // $ANTLR start "Global"
    public final void mGlobal() throws RecognitionException {
        try {
            int _type = Global;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:52:8: ( ( 'G' | 'g' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'B' | 'b' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // InternalInform6Lexer.g:52:10: ( 'G' | 'g' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'B' | 'b' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Global"

    // $ANTLR start "Nearby"
    public final void mNearby() throws RecognitionException {
        try {
            int _type = Nearby;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:54:8: ( ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'B' | 'b' ) ( 'Y' | 'y' ) )
            // InternalInform6Lexer.g:54:10: ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'B' | 'b' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Nearby"

    // $ANTLR start "Object"
    public final void mObject() throws RecognitionException {
        try {
            int _type = Object;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:56:8: ( ( 'O' | 'o' ) ( 'B' | 'b' ) ( 'J' | 'j' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // InternalInform6Lexer.g:56:10: ( 'O' | 'o' ) ( 'B' | 'b' ) ( 'J' | 'j' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Object"

    // $ANTLR start "Serial"
    public final void mSerial() throws RecognitionException {
        try {
            int _type = Serial;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:58:8: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // InternalInform6Lexer.g:58:10: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Serial"

    // $ANTLR start "Buffer"
    public final void mBuffer() throws RecognitionException {
        try {
            int _type = Buffer;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:60:8: ( ( 'B' | 'b' ) ( 'U' | 'u' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // InternalInform6Lexer.g:60:10: ( 'B' | 'b' ) ( 'U' | 'u' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Buffer"

    // $ANTLR start "Remove"
    public final void mRemove() throws RecognitionException {
        try {
            int _type = Remove;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:62:8: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'V' | 'v' ) ( 'E' | 'e' ) )
            // InternalInform6Lexer.g:62:10: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'V' | 'v' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Remove"

    // $ANTLR start "String"
    public final void mString() throws RecognitionException {
        try {
            int _type = String;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:64:8: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // InternalInform6Lexer.g:64:10: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "String"

    // $ANTLR start "Array"
    public final void mArray() throws RecognitionException {
        try {
            int _type = Array;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:66:7: ( ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'Y' | 'y' ) )
            // InternalInform6Lexer.g:66:9: ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Array"

    // $ANTLR start "Abort"
    public final void mAbort() throws RecognitionException {
        try {
            int _type = Abort;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:68:7: ( ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' ) )
            // InternalInform6Lexer.g:68:9: ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Abort"

    // $ANTLR start "Alias"
    public final void mAlias() throws RecognitionException {
        try {
            int _type = Alias;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:70:7: ( ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'S' | 's' ) )
            // InternalInform6Lexer.g:70:9: ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Alias"

    // $ANTLR start "Class_1"
    public final void mClass_1() throws RecognitionException {
        try {
            int _type = Class_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:72:9: ( ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) )
            // InternalInform6Lexer.g:72:11: ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Class_1"

    // $ANTLR start "First"
    public final void mFirst() throws RecognitionException {
        try {
            int _type = First;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:74:7: ( ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'S' | 's' ) ( 'T' | 't' ) )
            // InternalInform6Lexer.g:74:9: ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'S' | 's' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "First"

    // $ANTLR start "Hasnt"
    public final void mHasnt() throws RecognitionException {
        try {
            int _type = Hasnt;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:76:7: ( ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // InternalInform6Lexer.g:76:9: ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'N' | 'n' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Hasnt"

    // $ANTLR start "Notin"
    public final void mNotin() throws RecognitionException {
        try {
            int _type = Notin;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:78:7: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // InternalInform6Lexer.g:78:9: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Notin"

    // $ANTLR start "Table"
    public final void mTable() throws RecognitionException {
        try {
            int _type = Table;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:80:7: ( ( 'T' | 't' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // InternalInform6Lexer.g:80:9: ( 'T' | 't' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Table"

    // $ANTLR start "Link"
    public final void mLink() throws RecognitionException {
        try {
            int _type = Link;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:82:6: ( ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'K' | 'k' ) )
            // InternalInform6Lexer.g:82:8: ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'K' | 'k' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Link"

    // $ANTLR start "Verb"
    public final void mVerb() throws RecognitionException {
        try {
            int _type = Verb;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:84:6: ( ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'B' | 'b' ) )
            // InternalInform6Lexer.g:84:8: ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'B' | 'b' )
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Verb"

    // $ANTLR start "Give"
    public final void mGive() throws RecognitionException {
        try {
            int _type = Give;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:86:6: ( ( 'G' | 'g' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) )
            // InternalInform6Lexer.g:86:8: ( 'G' | 'g' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Give"

    // $ANTLR start "Last"
    public final void mLast() throws RecognitionException {
        try {
            int _type = Last;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:88:6: ( ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'T' | 't' ) )
            // InternalInform6Lexer.g:88:8: ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Last"

    // $ANTLR start "Meta"
    public final void mMeta() throws RecognitionException {
        try {
            int _type = Meta;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:90:6: ( ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'A' | 'a' ) )
            // InternalInform6Lexer.g:90:8: ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'A' | 'a' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Meta"

    // $ANTLR start "Move"
    public final void mMove() throws RecognitionException {
        try {
            int _type = Move;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:92:6: ( ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'V' | 'v' ) ( 'E' | 'e' ) )
            // InternalInform6Lexer.g:92:8: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'V' | 'v' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Move"

    // $ANTLR start "Only"
    public final void mOnly() throws RecognitionException {
        try {
            int _type = Only;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:94:6: ( ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'L' | 'l' ) ( 'Y' | 'y' ) )
            // InternalInform6Lexer.g:94:8: ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'L' | 'l' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Only"

    // $ANTLR start "With"
    public final void mWith() throws RecognitionException {
        try {
            int _type = With;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:96:6: ( ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'H' | 'h' ) )
            // InternalInform6Lexer.g:96:8: ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "With"

    // $ANTLR start "End"
    public final void mEnd() throws RecognitionException {
        try {
            int _type = End;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:98:5: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // InternalInform6Lexer.g:98:7: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "End"

    // $ANTLR start "Has"
    public final void mHas() throws RecognitionException {
        try {
            int _type = Has;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:100:5: ( ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'S' | 's' ) )
            // InternalInform6Lexer.g:100:7: ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Has"

    // $ANTLR start "NumberSignNumberSign"
    public final void mNumberSignNumberSign() throws RecognitionException {
        try {
            int _type = NumberSignNumberSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:102:22: ( '#' '#' )
            // InternalInform6Lexer.g:102:24: '#' '#'
            {
            match('#'); 
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NumberSignNumberSign"

    // $ANTLR start "HyphenMinusHyphenMinus"
    public final void mHyphenMinusHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinusHyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:104:24: ( '-' '-' )
            // InternalInform6Lexer.g:104:26: '-' '-'
            {
            match('-'); 
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusHyphenMinus"

    // $ANTLR start "In"
    public final void mIn() throws RecognitionException {
        try {
            int _type = In;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:106:4: ( ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // InternalInform6Lexer.g:106:6: ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "In"

    // $ANTLR start "To"
    public final void mTo() throws RecognitionException {
        try {
            int _type = To;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:108:4: ( ( 'T' | 't' ) ( 'O' | 'o' ) )
            // InternalInform6Lexer.g:108:6: ( 'T' | 't' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "To"

    // $ANTLR start "ExclamationMark"
    public final void mExclamationMark() throws RecognitionException {
        try {
            int _type = ExclamationMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:110:17: ( '!' )
            // InternalInform6Lexer.g:110:19: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMark"

    // $ANTLR start "NumberSign"
    public final void mNumberSign() throws RecognitionException {
        try {
            int _type = NumberSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:112:12: ( '#' )
            // InternalInform6Lexer.g:112:14: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NumberSign"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:114:17: ( '(' )
            // InternalInform6Lexer.g:114:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:116:18: ( ')' )
            // InternalInform6Lexer.g:116:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Asterisk"
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:118:10: ( '*' )
            // InternalInform6Lexer.g:118:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asterisk"

    // $ANTLR start "PlusSign"
    public final void mPlusSign() throws RecognitionException {
        try {
            int _type = PlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:120:10: ( '+' )
            // InternalInform6Lexer.g:120:12: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSign"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:122:7: ( ',' )
            // InternalInform6Lexer.g:122:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:124:13: ( '-' )
            // InternalInform6Lexer.g:124:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "Solidus"
    public final void mSolidus() throws RecognitionException {
        try {
            int _type = Solidus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:126:9: ( '/' )
            // InternalInform6Lexer.g:126:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Solidus"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:128:7: ( ':' )
            // InternalInform6Lexer.g:128:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "Semicolon"
    public final void mSemicolon() throws RecognitionException {
        try {
            int _type = Semicolon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:130:11: ( ';' )
            // InternalInform6Lexer.g:130:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Semicolon"

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:132:12: ( '=' )
            // InternalInform6Lexer.g:132:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSign"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:134:19: ( '[' )
            // InternalInform6Lexer.g:134:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:136:20: ( ']' )
            // InternalInform6Lexer.g:136:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "Tilde"
    public final void mTilde() throws RecognitionException {
        try {
            int _type = Tilde;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:138:7: ( '~' )
            // InternalInform6Lexer.g:138:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Tilde"

    // $ANTLR start "RULE_BYTE_ARROW"
    public final void mRULE_BYTE_ARROW() throws RecognitionException {
        try {
            int _type = RULE_BYTE_ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:140:17: ( '->' )
            // InternalInform6Lexer.g:140:19: '->'
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
            // InternalInform6Lexer.g:142:17: ( '-->' )
            // InternalInform6Lexer.g:142:19: '-->'
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
            // InternalInform6Lexer.g:144:17: ( ( 'e_to' | 'w_to' | 'n_to' | 's_to' | 'u_to' | 'd_to' | 'se_to' | 'sw_to' | 'nw_to' | 'ne_to' | 'in_to' | 'out_to' ) )
            // InternalInform6Lexer.g:144:19: ( 'e_to' | 'w_to' | 'n_to' | 's_to' | 'u_to' | 'd_to' | 'se_to' | 'sw_to' | 'nw_to' | 'ne_to' | 'in_to' | 'out_to' )
            {
            // InternalInform6Lexer.g:144:19: ( 'e_to' | 'w_to' | 'n_to' | 's_to' | 'u_to' | 'd_to' | 'se_to' | 'sw_to' | 'nw_to' | 'ne_to' | 'in_to' | 'out_to' )
            int alt1=12;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalInform6Lexer.g:144:20: 'e_to'
                    {
                    match("e_to"); 


                    }
                    break;
                case 2 :
                    // InternalInform6Lexer.g:144:27: 'w_to'
                    {
                    match("w_to"); 


                    }
                    break;
                case 3 :
                    // InternalInform6Lexer.g:144:34: 'n_to'
                    {
                    match("n_to"); 


                    }
                    break;
                case 4 :
                    // InternalInform6Lexer.g:144:41: 's_to'
                    {
                    match("s_to"); 


                    }
                    break;
                case 5 :
                    // InternalInform6Lexer.g:144:48: 'u_to'
                    {
                    match("u_to"); 


                    }
                    break;
                case 6 :
                    // InternalInform6Lexer.g:144:55: 'd_to'
                    {
                    match("d_to"); 


                    }
                    break;
                case 7 :
                    // InternalInform6Lexer.g:144:62: 'se_to'
                    {
                    match("se_to"); 


                    }
                    break;
                case 8 :
                    // InternalInform6Lexer.g:144:70: 'sw_to'
                    {
                    match("sw_to"); 


                    }
                    break;
                case 9 :
                    // InternalInform6Lexer.g:144:78: 'nw_to'
                    {
                    match("nw_to"); 


                    }
                    break;
                case 10 :
                    // InternalInform6Lexer.g:144:86: 'ne_to'
                    {
                    match("ne_to"); 


                    }
                    break;
                case 11 :
                    // InternalInform6Lexer.g:144:94: 'in_to'
                    {
                    match("in_to"); 


                    }
                    break;
                case 12 :
                    // InternalInform6Lexer.g:144:102: 'out_to'
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
            // InternalInform6Lexer.g:146:10: ( ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )? )
            // InternalInform6Lexer.g:146:12: ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )?
            {
            // InternalInform6Lexer.g:146:12: ( '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalInform6Lexer.g:146:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalInform6Lexer.g:146:24: ( '.' ( '0' .. '9' )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalInform6Lexer.g:146:25: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // InternalInform6Lexer.g:146:29: ( '0' .. '9' )+
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
                    	    // InternalInform6Lexer.g:146:30: '0' .. '9'
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
            // InternalInform6Lexer.g:148:10: ( '$' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )* )
            // InternalInform6Lexer.g:148:12: '$' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )*
            {
            match('$'); 
            // InternalInform6Lexer.g:148:16: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='F')||(LA5_0>='a' && LA5_0<='f')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalInform6Lexer.g:
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
            // InternalInform6Lexer.g:150:13: ( '$' '$' ( '0' | '1' )* )
            // InternalInform6Lexer.g:150:15: '$' '$' ( '0' | '1' )*
            {
            match('$'); 
            match('$'); 
            // InternalInform6Lexer.g:150:23: ( '0' | '1' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='1')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalInform6Lexer.g:
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
            // InternalInform6Lexer.g:152:33: ( '!' '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalInform6Lexer.g:152:35: '!' '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('!'); 
            match('%'); 
            // InternalInform6Lexer.g:152:43: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalInform6Lexer.g:152:43: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalInform6Lexer.g:152:59: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalInform6Lexer.g:152:60: ( '\\r' )? '\\n'
                    {
                    // InternalInform6Lexer.g:152:60: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalInform6Lexer.g:152:60: '\\r'
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
            // InternalInform6Lexer.g:154:17: ( '!' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalInform6Lexer.g:154:19: '!' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('!'); 
            // InternalInform6Lexer.g:154:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalInform6Lexer.g:154:23: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalInform6Lexer.g:154:39: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalInform6Lexer.g:154:40: ( '\\r' )? '\\n'
                    {
                    // InternalInform6Lexer.g:154:40: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalInform6Lexer.g:154:40: '\\r'
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
            // InternalInform6Lexer.g:156:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalInform6Lexer.g:156:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalInform6Lexer.g:156:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalInform6Lexer.g:156:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalInform6Lexer.g:156:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalInform6Lexer.g:156:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalInform6Lexer.g:156:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalInform6Lexer.g:156:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalInform6Lexer.g:156:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalInform6Lexer.g:156:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalInform6Lexer.g:156:61: ~ ( ( '\\\\' | '\\'' ) )
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

    // $ANTLR start "RULE_STATIC"
    public final void mRULE_STATIC() throws RecognitionException {
        try {
            int _type = RULE_STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:158:13: ( 'static' )
            // InternalInform6Lexer.g:158:15: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STATIC"

    // $ANTLR start "RULE_ANY_PREPROCESSORDIR"
    public final void mRULE_ANY_PREPROCESSORDIR() throws RecognitionException {
        try {
            int _type = RULE_ANY_PREPROCESSORDIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:160:26: ( '#' RULE_ID RULE_UNTIL_AND_WITH_SEMICOLON )
            // InternalInform6Lexer.g:160:28: '#' RULE_ID RULE_UNTIL_AND_WITH_SEMICOLON
            {
            match('#'); 
            mRULE_ID(); 
            mRULE_UNTIL_AND_WITH_SEMICOLON(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_PREPROCESSORDIR"

    // $ANTLR start "RULE_UNTIL_AND_WITH_SEMICOLON"
    public final void mRULE_UNTIL_AND_WITH_SEMICOLON() throws RecognitionException {
        try {
            // InternalInform6Lexer.g:162:40: ( (~ ( ';' ) )* ';' )
            // InternalInform6Lexer.g:162:42: (~ ( ';' ) )* ';'
            {
            // InternalInform6Lexer.g:162:42: (~ ( ';' ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<=':')||(LA16_0>='<' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalInform6Lexer.g:162:42: ~ ( ';' )
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

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNTIL_AND_WITH_SEMICOLON"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalInform6Lexer.g:164:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalInform6Lexer.g:164:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalInform6Lexer.g:164:11: ( '^' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='^') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalInform6Lexer.g:164:11: '^'
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

            // InternalInform6Lexer.g:164:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')||(LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='z')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalInform6Lexer.g:
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
            // InternalInform6Lexer.g:166:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalInform6Lexer.g:166:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalInform6Lexer.g:166:24: ( options {greedy=false; } : . )*
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
            	    // InternalInform6Lexer.g:166:52: .
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
            // InternalInform6Lexer.g:168:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalInform6Lexer.g:168:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalInform6Lexer.g:168:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalInform6Lexer.g:
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
            // InternalInform6Lexer.g:170:16: ( . )
            // InternalInform6Lexer.g:170:18: .
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
        // InternalInform6Lexer.g:1:8: ( Fake_Action | System_file | Abbreviate | Zcharacter | Attribute | Lowstring | Constant | Property | Switches | Additive | Found_in | Include | Message | Release | Replace | Default_1 | Private | Reverse | Extend | Global | Nearby | Object | Serial | Buffer | Remove | String | Array | Abort | Alias | Class_1 | First | Hasnt | Notin | Table | Link | Verb | Give | Last | Meta | Move | Only | With | End | Has | NumberSignNumberSign | HyphenMinusHyphenMinus | In | To | ExclamationMark | NumberSign | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | Solidus | Colon | Semicolon | EqualsSign | LeftSquareBracket | RightSquareBracket | Tilde | RULE_BYTE_ARROW | RULE_WORD_ARROW | RULE_DIRECTIONS | RULE_INT | RULE_HEX | RULE_BINARY | RULE_COMPILER_DIRECTIVE_COMMENT | RULE_SL_COMMENT | RULE_STRING | RULE_STATIC | RULE_ANY_PREPROCESSORDIR | RULE_ID | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt21=78;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // InternalInform6Lexer.g:1:10: Fake_Action
                {
                mFake_Action(); 

                }
                break;
            case 2 :
                // InternalInform6Lexer.g:1:22: System_file
                {
                mSystem_file(); 

                }
                break;
            case 3 :
                // InternalInform6Lexer.g:1:34: Abbreviate
                {
                mAbbreviate(); 

                }
                break;
            case 4 :
                // InternalInform6Lexer.g:1:45: Zcharacter
                {
                mZcharacter(); 

                }
                break;
            case 5 :
                // InternalInform6Lexer.g:1:56: Attribute
                {
                mAttribute(); 

                }
                break;
            case 6 :
                // InternalInform6Lexer.g:1:66: Lowstring
                {
                mLowstring(); 

                }
                break;
            case 7 :
                // InternalInform6Lexer.g:1:76: Constant
                {
                mConstant(); 

                }
                break;
            case 8 :
                // InternalInform6Lexer.g:1:85: Property
                {
                mProperty(); 

                }
                break;
            case 9 :
                // InternalInform6Lexer.g:1:94: Switches
                {
                mSwitches(); 

                }
                break;
            case 10 :
                // InternalInform6Lexer.g:1:103: Additive
                {
                mAdditive(); 

                }
                break;
            case 11 :
                // InternalInform6Lexer.g:1:112: Found_in
                {
                mFound_in(); 

                }
                break;
            case 12 :
                // InternalInform6Lexer.g:1:121: Include
                {
                mInclude(); 

                }
                break;
            case 13 :
                // InternalInform6Lexer.g:1:129: Message
                {
                mMessage(); 

                }
                break;
            case 14 :
                // InternalInform6Lexer.g:1:137: Release
                {
                mRelease(); 

                }
                break;
            case 15 :
                // InternalInform6Lexer.g:1:145: Replace
                {
                mReplace(); 

                }
                break;
            case 16 :
                // InternalInform6Lexer.g:1:153: Default_1
                {
                mDefault_1(); 

                }
                break;
            case 17 :
                // InternalInform6Lexer.g:1:163: Private
                {
                mPrivate(); 

                }
                break;
            case 18 :
                // InternalInform6Lexer.g:1:171: Reverse
                {
                mReverse(); 

                }
                break;
            case 19 :
                // InternalInform6Lexer.g:1:179: Extend
                {
                mExtend(); 

                }
                break;
            case 20 :
                // InternalInform6Lexer.g:1:186: Global
                {
                mGlobal(); 

                }
                break;
            case 21 :
                // InternalInform6Lexer.g:1:193: Nearby
                {
                mNearby(); 

                }
                break;
            case 22 :
                // InternalInform6Lexer.g:1:200: Object
                {
                mObject(); 

                }
                break;
            case 23 :
                // InternalInform6Lexer.g:1:207: Serial
                {
                mSerial(); 

                }
                break;
            case 24 :
                // InternalInform6Lexer.g:1:214: Buffer
                {
                mBuffer(); 

                }
                break;
            case 25 :
                // InternalInform6Lexer.g:1:221: Remove
                {
                mRemove(); 

                }
                break;
            case 26 :
                // InternalInform6Lexer.g:1:228: String
                {
                mString(); 

                }
                break;
            case 27 :
                // InternalInform6Lexer.g:1:235: Array
                {
                mArray(); 

                }
                break;
            case 28 :
                // InternalInform6Lexer.g:1:241: Abort
                {
                mAbort(); 

                }
                break;
            case 29 :
                // InternalInform6Lexer.g:1:247: Alias
                {
                mAlias(); 

                }
                break;
            case 30 :
                // InternalInform6Lexer.g:1:253: Class_1
                {
                mClass_1(); 

                }
                break;
            case 31 :
                // InternalInform6Lexer.g:1:261: First
                {
                mFirst(); 

                }
                break;
            case 32 :
                // InternalInform6Lexer.g:1:267: Hasnt
                {
                mHasnt(); 

                }
                break;
            case 33 :
                // InternalInform6Lexer.g:1:273: Notin
                {
                mNotin(); 

                }
                break;
            case 34 :
                // InternalInform6Lexer.g:1:279: Table
                {
                mTable(); 

                }
                break;
            case 35 :
                // InternalInform6Lexer.g:1:285: Link
                {
                mLink(); 

                }
                break;
            case 36 :
                // InternalInform6Lexer.g:1:290: Verb
                {
                mVerb(); 

                }
                break;
            case 37 :
                // InternalInform6Lexer.g:1:295: Give
                {
                mGive(); 

                }
                break;
            case 38 :
                // InternalInform6Lexer.g:1:300: Last
                {
                mLast(); 

                }
                break;
            case 39 :
                // InternalInform6Lexer.g:1:305: Meta
                {
                mMeta(); 

                }
                break;
            case 40 :
                // InternalInform6Lexer.g:1:310: Move
                {
                mMove(); 

                }
                break;
            case 41 :
                // InternalInform6Lexer.g:1:315: Only
                {
                mOnly(); 

                }
                break;
            case 42 :
                // InternalInform6Lexer.g:1:320: With
                {
                mWith(); 

                }
                break;
            case 43 :
                // InternalInform6Lexer.g:1:325: End
                {
                mEnd(); 

                }
                break;
            case 44 :
                // InternalInform6Lexer.g:1:329: Has
                {
                mHas(); 

                }
                break;
            case 45 :
                // InternalInform6Lexer.g:1:333: NumberSignNumberSign
                {
                mNumberSignNumberSign(); 

                }
                break;
            case 46 :
                // InternalInform6Lexer.g:1:354: HyphenMinusHyphenMinus
                {
                mHyphenMinusHyphenMinus(); 

                }
                break;
            case 47 :
                // InternalInform6Lexer.g:1:377: In
                {
                mIn(); 

                }
                break;
            case 48 :
                // InternalInform6Lexer.g:1:380: To
                {
                mTo(); 

                }
                break;
            case 49 :
                // InternalInform6Lexer.g:1:383: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 50 :
                // InternalInform6Lexer.g:1:399: NumberSign
                {
                mNumberSign(); 

                }
                break;
            case 51 :
                // InternalInform6Lexer.g:1:410: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 52 :
                // InternalInform6Lexer.g:1:426: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 53 :
                // InternalInform6Lexer.g:1:443: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 54 :
                // InternalInform6Lexer.g:1:452: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 55 :
                // InternalInform6Lexer.g:1:461: Comma
                {
                mComma(); 

                }
                break;
            case 56 :
                // InternalInform6Lexer.g:1:467: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 57 :
                // InternalInform6Lexer.g:1:479: Solidus
                {
                mSolidus(); 

                }
                break;
            case 58 :
                // InternalInform6Lexer.g:1:487: Colon
                {
                mColon(); 

                }
                break;
            case 59 :
                // InternalInform6Lexer.g:1:493: Semicolon
                {
                mSemicolon(); 

                }
                break;
            case 60 :
                // InternalInform6Lexer.g:1:503: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 61 :
                // InternalInform6Lexer.g:1:514: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 62 :
                // InternalInform6Lexer.g:1:532: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 63 :
                // InternalInform6Lexer.g:1:551: Tilde
                {
                mTilde(); 

                }
                break;
            case 64 :
                // InternalInform6Lexer.g:1:557: RULE_BYTE_ARROW
                {
                mRULE_BYTE_ARROW(); 

                }
                break;
            case 65 :
                // InternalInform6Lexer.g:1:573: RULE_WORD_ARROW
                {
                mRULE_WORD_ARROW(); 

                }
                break;
            case 66 :
                // InternalInform6Lexer.g:1:589: RULE_DIRECTIONS
                {
                mRULE_DIRECTIONS(); 

                }
                break;
            case 67 :
                // InternalInform6Lexer.g:1:605: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 68 :
                // InternalInform6Lexer.g:1:614: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 69 :
                // InternalInform6Lexer.g:1:623: RULE_BINARY
                {
                mRULE_BINARY(); 

                }
                break;
            case 70 :
                // InternalInform6Lexer.g:1:635: RULE_COMPILER_DIRECTIVE_COMMENT
                {
                mRULE_COMPILER_DIRECTIVE_COMMENT(); 

                }
                break;
            case 71 :
                // InternalInform6Lexer.g:1:667: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 72 :
                // InternalInform6Lexer.g:1:683: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 73 :
                // InternalInform6Lexer.g:1:695: RULE_STATIC
                {
                mRULE_STATIC(); 

                }
                break;
            case 74 :
                // InternalInform6Lexer.g:1:707: RULE_ANY_PREPROCESSORDIR
                {
                mRULE_ANY_PREPROCESSORDIR(); 

                }
                break;
            case 75 :
                // InternalInform6Lexer.g:1:732: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 76 :
                // InternalInform6Lexer.g:1:740: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 77 :
                // InternalInform6Lexer.g:1:756: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 78 :
                // InternalInform6Lexer.g:1:764: RULE_ANY_OTHER
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
            return "144:19: ( 'e_to' | 'w_to' | 'n_to' | 's_to' | 'u_to' | 'd_to' | 'se_to' | 'sw_to' | 'nw_to' | 'ne_to' | 'in_to' | 'out_to' )";
        }
    }
    static final String DFA21_eotS =
        "\1\56\24\71\1\152\1\156\1\160\5\uffff\1\170\6\uffff\10\71\1\uffff\1\65\1\uffff\1\u0081\3\65\3\uffff\3\71\1\uffff\24\71\2\u009f\25\71\1\u00b9\3\71\3\uffff\1\u00be\2\uffff\1\u00c2\17\uffff\1\71\4\uffff\33\71\1\uffff\12\71\1\u00e9\14\71\1\u00f7\1\71\1\uffff\3\71\2\uffff\1\u00c2\3\uffff\13\71\1\u0107\10\71\1\u0110\1\u0111\7\71\1\u0119\1\u011a\5\71\1\u0107\1\71\1\uffff\1\u0107\1\71\1\u0122\3\71\1\u0107\2\71\1\u0128\3\71\1\uffff\1\71\1\u012d\1\u012e\2\u0107\2\71\1\u0131\2\71\1\u0107\1\71\1\u0107\2\71\1\uffff\1\71\1\u0138\2\71\1\u013b\1\u013c\2\71\2\uffff\1\71\1\u0140\3\71\1\u0107\1\71\2\uffff\7\71\1\uffff\1\71\1\u0107\1\u014d\1\u0107\1\71\1\uffff\2\71\1\u0151\1\u0152\2\uffff\2\71\1\uffff\2\71\1\u0157\1\u0158\1\u0159\1\71\1\uffff\2\71\2\uffff\3\71\1\uffff\7\71\1\u0167\1\71\1\u0169\1\u016a\1\u016b\1\uffff\1\u016c\1\u0107\1\u016d\2\uffff\4\71\3\uffff\7\71\1\u0179\1\u017a\1\u017b\1\u017c\1\u017d\1\u017e\1\uffff\1\u017f\5\uffff\1\71\1\u0181\1\71\1\u0183\2\71\1\u0186\2\71\1\u0189\1\u018a\7\uffff\1\71\1\uffff\1\71\1\uffff\1\71\1\u018e\1\uffff\1\71\1\u0190\2\uffff\2\71\1\u0193\1\uffff\1\u0194\1\uffff\1\u0195\1\u0196\4\uffff";
    static final String DFA21_eofS =
        "\u0197\uffff";
    static final String DFA21_minS =
        "\1\0\1\101\1\105\1\102\1\103\1\101\1\114\1\122\1\116\3\105\1\116\1\111\1\105\1\102\1\125\2\101\1\105\1\111\1\43\1\55\1\0\5\uffff\1\52\6\uffff\1\116\1\111\2\105\1\137\1\105\1\116\1\102\1\uffff\1\60\1\uffff\1\44\2\0\1\101\3\uffff\1\113\1\125\1\122\1\uffff\1\123\1\111\2\122\1\164\1\122\1\111\1\122\1\102\1\124\1\104\1\122\1\111\1\110\1\127\1\116\1\123\1\116\1\101\1\111\2\60\1\123\1\126\1\114\1\106\1\164\1\124\1\104\1\164\1\117\1\126\1\101\1\124\1\164\1\137\1\101\1\112\1\114\1\164\1\106\1\123\1\102\1\60\1\122\1\124\1\164\3\uffff\1\76\2\uffff\1\0\17\uffff\1\164\4\uffff\1\105\1\116\1\123\2\124\1\164\1\111\1\164\1\111\1\164\1\157\3\122\1\111\3\101\1\123\1\113\1\124\2\123\1\120\1\126\1\114\1\164\1\uffff\1\123\1\101\2\105\1\114\1\105\1\117\1\101\1\157\1\105\1\60\1\157\1\102\1\105\1\122\1\164\1\111\1\157\1\164\1\105\1\131\1\137\1\106\1\60\1\114\1\uffff\1\102\1\110\1\157\2\uffff\1\0\1\12\2\uffff\1\157\1\137\1\104\1\124\1\105\1\103\1\157\1\101\1\157\1\116\1\151\1\60\1\105\1\124\1\111\1\124\1\131\1\123\1\122\1\124\2\60\1\124\1\123\1\105\1\101\1\125\1\157\1\101\2\60\2\101\1\122\1\126\1\125\1\60\1\116\1\uffff\1\60\1\101\1\60\1\102\1\157\1\116\1\60\1\157\1\103\1\60\1\164\1\105\1\124\1\uffff\1\105\4\60\1\101\1\137\1\60\1\115\1\110\1\60\1\114\1\60\1\107\1\143\1\uffff\1\126\1\60\1\102\1\111\2\60\1\101\1\122\2\uffff\1\101\1\60\1\122\1\124\1\104\1\60\1\107\2\uffff\1\123\1\103\1\123\1\105\1\114\1\104\1\114\1\uffff\1\131\3\60\1\124\1\uffff\1\157\1\122\2\60\2\uffff\1\103\1\111\1\uffff\1\137\1\105\3\60\1\111\1\uffff\1\125\1\126\2\uffff\1\103\1\111\1\116\1\uffff\1\124\6\105\1\60\1\124\3\60\1\uffff\3\60\2\uffff\1\124\1\116\1\106\1\123\3\uffff\1\101\1\124\1\105\1\124\1\116\1\124\1\131\6\60\1\uffff\1\60\5\uffff\1\111\1\60\1\111\1\60\1\124\1\105\1\60\1\105\1\107\2\60\7\uffff\1\117\1\uffff\1\114\1\uffff\1\105\1\60\1\uffff\1\122\1\60\2\uffff\1\116\1\105\1\60\1\uffff\1\60\1\uffff\2\60\4\uffff";
    static final String DFA21_maxS =
        "\1\uffff\1\157\1\171\1\164\1\143\2\157\1\162\1\156\1\157\2\145\1\170\1\154\1\167\2\165\1\141\1\157\1\145\1\151\1\172\1\76\1\uffff\5\uffff\1\52\6\uffff\1\170\1\151\1\157\1\171\1\137\1\145\2\156\1\uffff\1\71\1\uffff\1\44\2\uffff\1\172\3\uffff\1\153\1\165\1\162\1\uffff\1\163\1\151\2\162\1\164\1\162\1\151\1\162\1\157\1\164\1\144\1\162\1\151\1\150\1\167\1\156\1\163\1\156\1\141\1\157\2\172\1\164\2\166\1\146\2\164\1\144\1\164\1\157\1\166\1\141\2\164\1\137\1\141\1\152\1\154\1\164\1\146\1\163\1\142\1\172\1\162\2\164\3\uffff\1\76\2\uffff\1\uffff\17\uffff\1\164\4\uffff\1\145\1\156\1\163\3\164\1\151\1\164\1\151\1\164\1\157\3\162\1\151\3\141\1\163\1\153\1\164\2\163\1\160\1\166\1\154\1\164\1\uffff\1\163\1\141\2\145\1\154\1\145\1\157\1\141\1\157\1\145\1\172\1\157\1\142\1\145\1\162\1\164\1\151\1\157\1\164\1\145\1\171\1\137\1\146\1\172\1\154\1\uffff\1\142\1\150\1\157\2\uffff\1\uffff\1\12\2\uffff\1\157\1\137\1\144\1\164\1\145\1\143\1\157\1\141\1\157\1\156\1\151\1\172\1\145\1\164\1\151\1\164\1\171\1\163\1\162\1\164\2\172\1\164\1\163\1\145\1\141\1\165\1\157\1\141\2\172\2\141\1\162\1\166\1\165\1\172\1\156\1\uffff\1\172\1\141\1\172\1\142\1\157\1\156\1\172\1\157\1\143\1\172\1\164\1\145\1\164\1\uffff\1\145\4\172\1\141\1\137\1\172\1\155\1\150\1\172\1\154\1\172\1\147\1\143\1\uffff\1\166\1\172\1\142\1\151\2\172\1\141\1\162\2\uffff\1\141\1\172\1\162\1\164\1\144\1\172\1\147\2\uffff\1\163\1\143\1\163\1\145\1\154\1\144\1\154\1\uffff\1\171\3\172\1\164\1\uffff\1\157\1\162\2\172\2\uffff\1\143\1\151\1\uffff\1\137\1\145\3\172\1\151\1\uffff\1\165\1\166\2\uffff\1\143\1\151\1\156\1\uffff\1\164\6\145\1\172\1\164\3\172\1\uffff\3\172\2\uffff\1\164\1\156\1\146\1\163\3\uffff\1\141\1\164\1\145\1\164\1\156\1\164\1\171\6\172\1\uffff\1\172\5\uffff\1\151\1\172\1\151\1\172\1\164\1\145\1\172\1\145\1\147\2\172\7\uffff\1\157\1\uffff\1\154\1\uffff\1\145\1\172\1\uffff\1\162\1\172\2\uffff\1\156\1\145\1\172\1\uffff\1\172\1\uffff\2\172\4\uffff";
    static final String DFA21_acceptS =
        "\30\uffff\1\63\1\64\1\65\1\66\1\67\1\uffff\1\72\1\73\1\74\1\75\1\76\1\77\10\uffff\1\103\1\uffff\1\103\4\uffff\1\113\1\115\1\116\3\uffff\1\113\57\uffff\1\55\1\62\1\112\1\uffff\1\100\1\70\1\uffff\1\61\1\107\1\63\1\64\1\65\1\66\1\67\1\114\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\uffff\1\105\1\104\1\110\1\115\33\uffff\1\57\31\uffff\1\60\3\uffff\1\101\1\56\2\uffff\2\106\46\uffff\1\53\15\uffff\1\54\17\uffff\1\102\10\uffff\1\43\1\46\7\uffff\1\47\1\50\7\uffff\1\45\5\uffff\1\51\4\uffff\1\44\1\52\2\uffff\1\37\6\uffff\1\34\2\uffff\1\33\1\35\3\uffff\1\36\14\uffff\1\41\3\uffff\1\40\1\42\4\uffff\1\27\1\32\1\111\15\uffff\1\31\1\uffff\1\23\1\24\1\25\1\26\1\30\13\uffff\1\21\1\14\1\15\1\16\1\17\1\22\1\20\1\uffff\1\13\1\uffff\1\11\2\uffff\1\12\2\uffff\1\7\1\10\3\uffff\1\5\1\uffff\1\6\2\uffff\1\3\1\4\1\1\1\2";
    static final String DFA21_specialS =
        "\1\5\26\uffff\1\0\30\uffff\1\3\1\4\75\uffff\1\2\117\uffff\1\1\u00d7\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\65\2\64\2\65\1\64\22\65\1\64\1\27\1\60\1\25\1\57\2\65\1\61\1\30\1\31\1\32\1\33\1\34\1\26\1\55\1\35\12\54\1\36\1\37\1\65\1\40\3\65\1\3\1\20\1\6\1\51\1\44\1\1\1\15\1\21\1\52\2\63\1\5\1\11\1\46\1\53\1\7\1\63\1\12\1\47\1\22\1\63\1\23\1\45\2\63\1\4\1\41\1\65\1\42\1\62\1\63\1\65\1\3\1\20\1\6\1\13\1\14\1\1\1\15\1\21\1\10\2\63\1\5\1\11\1\16\1\17\1\7\1\63\1\12\1\2\1\22\1\50\1\23\1\24\2\63\1\4\3\65\1\43\uff81\65",
            "\1\66\7\uffff\1\70\5\uffff\1\67\21\uffff\1\66\7\uffff\1\70\5\uffff\1\67",
            "\1\77\16\uffff\1\101\2\uffff\1\100\1\uffff\1\72\5\uffff\1\76\5\uffff\1\74\16\uffff\1\75\2\uffff\1\73\1\uffff\1\72",
            "\1\102\1\uffff\1\104\7\uffff\1\106\5\uffff\1\105\1\uffff\1\103\15\uffff\1\102\1\uffff\1\104\7\uffff\1\106\5\uffff\1\105\1\uffff\1\103",
            "\1\107\37\uffff\1\107",
            "\1\112\7\uffff\1\111\5\uffff\1\110\21\uffff\1\112\7\uffff\1\111\5\uffff\1\110",
            "\1\114\2\uffff\1\113\34\uffff\1\114\2\uffff\1\113",
            "\1\115\37\uffff\1\115",
            "\1\117\37\uffff\1\116",
            "\1\120\11\uffff\1\121\25\uffff\1\120\11\uffff\1\121",
            "\1\122\37\uffff\1\122",
            "\1\123\31\uffff\1\124\5\uffff\1\123",
            "\1\126\11\uffff\1\125\6\uffff\1\127\16\uffff\1\126\11\uffff\1\125",
            "\1\131\2\uffff\1\130\34\uffff\1\131\2\uffff\1\130",
            "\1\136\11\uffff\1\133\17\uffff\1\134\5\uffff\1\132\11\uffff\1\133\7\uffff\1\135",
            "\1\137\13\uffff\1\140\23\uffff\1\137\13\uffff\1\140\6\uffff\1\141",
            "\1\142\37\uffff\1\142",
            "\1\143\37\uffff\1\143",
            "\1\144\15\uffff\1\145\21\uffff\1\144\15\uffff\1\145",
            "\1\146\37\uffff\1\146",
            "\1\147\25\uffff\1\150\11\uffff\1\147",
            "\1\151\35\uffff\32\153\3\uffff\2\153\1\uffff\32\153",
            "\1\154\20\uffff\1\155",
            "\45\161\1\157\uffda\161",
            "",
            "",
            "",
            "",
            "",
            "\1\167",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\126\11\uffff\1\125\25\uffff\1\126\11\uffff\1\125",
            "\1\147\37\uffff\1\147",
            "\1\136\11\uffff\1\133\25\uffff\1\136\11\uffff\1\133",
            "\1\77\16\uffff\1\101\2\uffff\1\100\1\uffff\1\72\13\uffff\1\77\16\uffff\1\101\2\uffff\1\100\1\uffff\1\72",
            "\1\177",
            "\1\123\37\uffff\1\123",
            "\1\117\37\uffff\1\117",
            "\1\137\13\uffff\1\140\23\uffff\1\137\13\uffff\1\140",
            "",
            "\12\56",
            "",
            "\1\u0080",
            "\0\u0082",
            "\0\u0082",
            "\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "",
            "\1\u0084\37\uffff\1\u0084",
            "\1\u0085\37\uffff\1\u0085",
            "\1\u0086\37\uffff\1\u0086",
            "",
            "\1\u0087\37\uffff\1\u0087",
            "\1\u0088\25\uffff\1\u0089\11\uffff\1\u0088",
            "\1\u008a\14\uffff\1\u008b\22\uffff\1\u008a",
            "\1\u008c\16\uffff\1\u008d\20\uffff\1\u008c",
            "\1\u008e",
            "\1\u008a\37\uffff\1\u008a",
            "\1\u0088\37\uffff\1\u0088",
            "\1\u008c\37\uffff\1\u008c",
            "\1\u008f\14\uffff\1\u0090\22\uffff\1\u008f\14\uffff\1\u0090",
            "\1\u0091\37\uffff\1\u0091",
            "\1\u0092\37\uffff\1\u0092",
            "\1\u0093\37\uffff\1\u0093",
            "\1\u0094\37\uffff\1\u0094",
            "\1\u0095\37\uffff\1\u0095",
            "\1\u0096\37\uffff\1\u0096",
            "\1\u0097\37\uffff\1\u0097",
            "\1\u0098\37\uffff\1\u0098",
            "\1\u0099\37\uffff\1\u0099",
            "\1\u009a\37\uffff\1\u009a",
            "\1\u009c\5\uffff\1\u009b\31\uffff\1\u009c\5\uffff\1\u009b",
            "\12\71\7\uffff\2\71\1\u009d\27\71\4\uffff\1\u009e\1\uffff\2\71\1\u009d\27\71",
            "\12\71\7\uffff\2\71\1\u009d\27\71\4\uffff\1\71\1\uffff\2\71\1\u009d\27\71",
            "\1\u00a0\1\u00a1\36\uffff\1\u00a0\1\u00a1",
            "\1\u00a2\37\uffff\1\u00a2",
            "\1\u00a3\1\u00a6\2\uffff\1\u00a4\5\uffff\1\u00a5\25\uffff\1\u00a3\1\u00a6\2\uffff\1\u00a4\5\uffff\1\u00a5",
            "\1\u00a7\37\uffff\1\u00a7",
            "\1\u00a8",
            "\1\u00a9\37\uffff\1\u00a9",
            "\1\u00aa\37\uffff\1\u00aa",
            "\1\u00ab",
            "\1\u00ac\37\uffff\1\u00ac",
            "\1\u00ad\37\uffff\1\u00ad",
            "\1\u00ae\35\uffff\1\u00af\1\uffff\1\u00ae",
            "\1\u00b0\37\uffff\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00ae\37\uffff\1\u00ae",
            "\1\u00b3\37\uffff\1\u00b3",
            "\1\u00b4\37\uffff\1\u00b4",
            "\1\u00b5",
            "\1\u00b6\37\uffff\1\u00b6",
            "\1\u00b7\37\uffff\1\u00b7",
            "\1\u00b8\37\uffff\1\u00b8",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00ba\37\uffff\1\u00ba",
            "\1\u00bb\37\uffff\1\u00bb",
            "\1\u00bc",
            "",
            "",
            "",
            "\1\u00bd",
            "",
            "",
            "\12\u00bf\1\u00c1\2\u00bf\1\u00c0\ufff2\u00bf",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c3",
            "",
            "",
            "",
            "",
            "\1\u00c4\37\uffff\1\u00c4",
            "\1\u00c5\37\uffff\1\u00c5",
            "\1\u00c6\37\uffff\1\u00c6",
            "\1\u00c7\37\uffff\1\u00c7",
            "\1\u00c8\37\uffff\1\u00c8",
            "\1\u00c9",
            "\1\u00ca\37\uffff\1\u00ca",
            "\1\u00cb",
            "\1\u00cc\37\uffff\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf\37\uffff\1\u00cf",
            "\1\u00d0\37\uffff\1\u00d0",
            "\1\u00d1\37\uffff\1\u00d1",
            "\1\u00d2\37\uffff\1\u00d2",
            "\1\u00d3\37\uffff\1\u00d3",
            "\1\u00d4\37\uffff\1\u00d4",
            "\1\u00d5\37\uffff\1\u00d5",
            "\1\u00d6\37\uffff\1\u00d6",
            "\1\u00d7\37\uffff\1\u00d7",
            "\1\u00d8\37\uffff\1\u00d8",
            "\1\u00d9\37\uffff\1\u00d9",
            "\1\u00da\37\uffff\1\u00da",
            "\1\u00db\37\uffff\1\u00db",
            "\1\u00dc\37\uffff\1\u00dc",
            "\1\u00dd\37\uffff\1\u00dd",
            "\1\u00de",
            "",
            "\1\u00df\37\uffff\1\u00df",
            "\1\u00e0\37\uffff\1\u00e0",
            "\1\u00e1\37\uffff\1\u00e1",
            "\1\u00e2\37\uffff\1\u00e2",
            "\1\u00e3\37\uffff\1\u00e3",
            "\1\u00e4\37\uffff\1\u00e4",
            "\1\u00e5\37\uffff\1\u00e5",
            "\1\u00e6\37\uffff\1\u00e6",
            "\1\u00e7",
            "\1\u00e8\37\uffff\1\u00e8",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00ea",
            "\1\u00eb\37\uffff\1\u00eb",
            "\1\u00ec\37\uffff\1\u00ec",
            "\1\u00ed\37\uffff\1\u00ed",
            "\1\u00ee",
            "\1\u00ef\37\uffff\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2\37\uffff\1\u00f2",
            "\1\u00f3\37\uffff\1\u00f3",
            "\1\u00f4",
            "\1\u00f5\37\uffff\1\u00f5",
            "\12\71\7\uffff\15\71\1\u00f6\14\71\4\uffff\1\71\1\uffff\15\71\1\u00f6\14\71",
            "\1\u00f8\37\uffff\1\u00f8",
            "",
            "\1\u00f9\37\uffff\1\u00f9",
            "\1\u00fa\37\uffff\1\u00fa",
            "\1\u00fb",
            "",
            "",
            "\12\u00bf\1\u00c1\2\u00bf\1\u00c0\ufff2\u00bf",
            "\1\u00c1",
            "",
            "",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe\37\uffff\1\u00fe",
            "\1\u00ff\37\uffff\1\u00ff",
            "\1\u0100\37\uffff\1\u0100",
            "\1\u0101\37\uffff\1\u0101",
            "\1\u0102",
            "\1\u0103\37\uffff\1\u0103",
            "\1\u0104",
            "\1\u0105\37\uffff\1\u0105",
            "\1\u0106",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0108\37\uffff\1\u0108",
            "\1\u0109\37\uffff\1\u0109",
            "\1\u010a\37\uffff\1\u010a",
            "\1\u010b\37\uffff\1\u010b",
            "\1\u010c\37\uffff\1\u010c",
            "\1\u010d\37\uffff\1\u010d",
            "\1\u010e\37\uffff\1\u010e",
            "\1\u010f\37\uffff\1\u010f",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0112\37\uffff\1\u0112",
            "\1\u0113\37\uffff\1\u0113",
            "\1\u0114\37\uffff\1\u0114",
            "\1\u0115\37\uffff\1\u0115",
            "\1\u0116\37\uffff\1\u0116",
            "\1\u0117",
            "\1\u0118\37\uffff\1\u0118",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u011b\37\uffff\1\u011b",
            "\1\u011c\37\uffff\1\u011c",
            "\1\u011d\37\uffff\1\u011d",
            "\1\u011e\37\uffff\1\u011e",
            "\1\u011f\37\uffff\1\u011f",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0120\37\uffff\1\u0120",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0121\37\uffff\1\u0121",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0123\37\uffff\1\u0123",
            "\1\u0124",
            "\1\u0125\37\uffff\1\u0125",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0126",
            "\1\u0127\37\uffff\1\u0127",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0129",
            "\1\u012a\37\uffff\1\u012a",
            "\1\u012b\37\uffff\1\u012b",
            "",
            "\1\u012c\37\uffff\1\u012c",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u012f\37\uffff\1\u012f",
            "\1\u0130",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0132\37\uffff\1\u0132",
            "\1\u0133\37\uffff\1\u0133",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0134\37\uffff\1\u0134",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0135\37\uffff\1\u0135",
            "\1\u0136",
            "",
            "\1\u0137\37\uffff\1\u0137",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0139\37\uffff\1\u0139",
            "\1\u013a\37\uffff\1\u013a",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u013d\37\uffff\1\u013d",
            "\1\u013e\37\uffff\1\u013e",
            "",
            "",
            "\1\u013f\37\uffff\1\u013f",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0141\37\uffff\1\u0141",
            "\1\u0142\37\uffff\1\u0142",
            "\1\u0143\37\uffff\1\u0143",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0144\37\uffff\1\u0144",
            "",
            "",
            "\1\u0145\37\uffff\1\u0145",
            "\1\u0146\37\uffff\1\u0146",
            "\1\u0147\37\uffff\1\u0147",
            "\1\u0148\37\uffff\1\u0148",
            "\1\u0149\37\uffff\1\u0149",
            "\1\u014a\37\uffff\1\u014a",
            "\1\u014b\37\uffff\1\u014b",
            "",
            "\1\u014c\37\uffff\1\u014c",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u014e\37\uffff\1\u014e",
            "",
            "\1\u014f",
            "\1\u0150\37\uffff\1\u0150",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "\1\u0153\37\uffff\1\u0153",
            "\1\u0154\37\uffff\1\u0154",
            "",
            "\1\u0155",
            "\1\u0156\37\uffff\1\u0156",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u015a\37\uffff\1\u015a",
            "",
            "\1\u015b\37\uffff\1\u015b",
            "\1\u015c\37\uffff\1\u015c",
            "",
            "",
            "\1\u015d\37\uffff\1\u015d",
            "\1\u015e\37\uffff\1\u015e",
            "\1\u015f\37\uffff\1\u015f",
            "",
            "\1\u0160\37\uffff\1\u0160",
            "\1\u0161\37\uffff\1\u0161",
            "\1\u0162\37\uffff\1\u0162",
            "\1\u0163\37\uffff\1\u0163",
            "\1\u0164\37\uffff\1\u0164",
            "\1\u0165\37\uffff\1\u0165",
            "\1\u0166\37\uffff\1\u0166",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0168\37\uffff\1\u0168",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "\1\u016e\37\uffff\1\u016e",
            "\1\u016f\37\uffff\1\u016f",
            "\1\u0170\37\uffff\1\u0170",
            "\1\u0171\37\uffff\1\u0171",
            "",
            "",
            "",
            "\1\u0172\37\uffff\1\u0172",
            "\1\u0173\37\uffff\1\u0173",
            "\1\u0174\37\uffff\1\u0174",
            "\1\u0175\37\uffff\1\u0175",
            "\1\u0176\37\uffff\1\u0176",
            "\1\u0177\37\uffff\1\u0177",
            "\1\u0178\37\uffff\1\u0178",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "",
            "",
            "",
            "\1\u0180\37\uffff\1\u0180",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0182\37\uffff\1\u0182",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0184\37\uffff\1\u0184",
            "\1\u0185\37\uffff\1\u0185",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0187\37\uffff\1\u0187",
            "\1\u0188\37\uffff\1\u0188",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u018b\37\uffff\1\u018b",
            "",
            "\1\u018c\37\uffff\1\u018c",
            "",
            "\1\u018d\37\uffff\1\u018d",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\1\u018f\37\uffff\1\u018f",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "\1\u0191\37\uffff\1\u0191",
            "\1\u0192\37\uffff\1\u0192",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
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
            return "1:1: Tokens : ( Fake_Action | System_file | Abbreviate | Zcharacter | Attribute | Lowstring | Constant | Property | Switches | Additive | Found_in | Include | Message | Release | Replace | Default_1 | Private | Reverse | Extend | Global | Nearby | Object | Serial | Buffer | Remove | String | Array | Abort | Alias | Class_1 | First | Hasnt | Notin | Table | Link | Verb | Give | Last | Meta | Move | Only | With | End | Has | NumberSignNumberSign | HyphenMinusHyphenMinus | In | To | ExclamationMark | NumberSign | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | Solidus | Colon | Semicolon | EqualsSign | LeftSquareBracket | RightSquareBracket | Tilde | RULE_BYTE_ARROW | RULE_WORD_ARROW | RULE_DIRECTIONS | RULE_INT | RULE_HEX | RULE_BINARY | RULE_COMPILER_DIRECTIVE_COMMENT | RULE_SL_COMMENT | RULE_STRING | RULE_STATIC | RULE_ANY_PREPROCESSORDIR | RULE_ID | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_23 = input.LA(1);

                        s = -1;
                        if ( (LA21_23=='%') ) {s = 111;}

                        else if ( ((LA21_23>='\u0000' && LA21_23<='$')||(LA21_23>='&' && LA21_23<='\uFFFF')) ) {s = 113;}

                        else s = 112;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_191 = input.LA(1);

                        s = -1;
                        if ( (LA21_191=='\r') ) {s = 192;}

                        else if ( (LA21_191=='\n') ) {s = 193;}

                        else if ( ((LA21_191>='\u0000' && LA21_191<='\t')||(LA21_191>='\u000B' && LA21_191<='\f')||(LA21_191>='\u000E' && LA21_191<='\uFFFF')) ) {s = 191;}

                        else s = 194;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_111 = input.LA(1);

                        s = -1;
                        if ( ((LA21_111>='\u0000' && LA21_111<='\t')||(LA21_111>='\u000B' && LA21_111<='\f')||(LA21_111>='\u000E' && LA21_111<='\uFFFF')) ) {s = 191;}

                        else if ( (LA21_111=='\r') ) {s = 192;}

                        else if ( (LA21_111=='\n') ) {s = 193;}

                        else s = 194;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_48 = input.LA(1);

                        s = -1;
                        if ( ((LA21_48>='\u0000' && LA21_48<='\uFFFF')) ) {s = 130;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA21_49 = input.LA(1);

                        s = -1;
                        if ( ((LA21_49>='\u0000' && LA21_49<='\uFFFF')) ) {s = 130;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA21_0 = input.LA(1);

                        s = -1;
                        if ( (LA21_0=='F'||LA21_0=='f') ) {s = 1;}

                        else if ( (LA21_0=='s') ) {s = 2;}

                        else if ( (LA21_0=='A'||LA21_0=='a') ) {s = 3;}

                        else if ( (LA21_0=='Z'||LA21_0=='z') ) {s = 4;}

                        else if ( (LA21_0=='L'||LA21_0=='l') ) {s = 5;}

                        else if ( (LA21_0=='C'||LA21_0=='c') ) {s = 6;}

                        else if ( (LA21_0=='P'||LA21_0=='p') ) {s = 7;}

                        else if ( (LA21_0=='i') ) {s = 8;}

                        else if ( (LA21_0=='M'||LA21_0=='m') ) {s = 9;}

                        else if ( (LA21_0=='R'||LA21_0=='r') ) {s = 10;}

                        else if ( (LA21_0=='d') ) {s = 11;}

                        else if ( (LA21_0=='e') ) {s = 12;}

                        else if ( (LA21_0=='G'||LA21_0=='g') ) {s = 13;}

                        else if ( (LA21_0=='n') ) {s = 14;}

                        else if ( (LA21_0=='o') ) {s = 15;}

                        else if ( (LA21_0=='B'||LA21_0=='b') ) {s = 16;}

                        else if ( (LA21_0=='H'||LA21_0=='h') ) {s = 17;}

                        else if ( (LA21_0=='T'||LA21_0=='t') ) {s = 18;}

                        else if ( (LA21_0=='V'||LA21_0=='v') ) {s = 19;}

                        else if ( (LA21_0=='w') ) {s = 20;}

                        else if ( (LA21_0=='#') ) {s = 21;}

                        else if ( (LA21_0=='-') ) {s = 22;}

                        else if ( (LA21_0=='!') ) {s = 23;}

                        else if ( (LA21_0=='(') ) {s = 24;}

                        else if ( (LA21_0==')') ) {s = 25;}

                        else if ( (LA21_0=='*') ) {s = 26;}

                        else if ( (LA21_0=='+') ) {s = 27;}

                        else if ( (LA21_0==',') ) {s = 28;}

                        else if ( (LA21_0=='/') ) {s = 29;}

                        else if ( (LA21_0==':') ) {s = 30;}

                        else if ( (LA21_0==';') ) {s = 31;}

                        else if ( (LA21_0=='=') ) {s = 32;}

                        else if ( (LA21_0=='[') ) {s = 33;}

                        else if ( (LA21_0==']') ) {s = 34;}

                        else if ( (LA21_0=='~') ) {s = 35;}

                        else if ( (LA21_0=='E') ) {s = 36;}

                        else if ( (LA21_0=='W') ) {s = 37;}

                        else if ( (LA21_0=='N') ) {s = 38;}

                        else if ( (LA21_0=='S') ) {s = 39;}

                        else if ( (LA21_0=='u') ) {s = 40;}

                        else if ( (LA21_0=='D') ) {s = 41;}

                        else if ( (LA21_0=='I') ) {s = 42;}

                        else if ( (LA21_0=='O') ) {s = 43;}

                        else if ( ((LA21_0>='0' && LA21_0<='9')) ) {s = 44;}

                        else if ( (LA21_0=='.') ) {s = 45;}

                        else if ( (LA21_0=='$') ) {s = 47;}

                        else if ( (LA21_0=='\"') ) {s = 48;}

                        else if ( (LA21_0=='\'') ) {s = 49;}

                        else if ( (LA21_0=='^') ) {s = 50;}

                        else if ( ((LA21_0>='J' && LA21_0<='K')||LA21_0=='Q'||LA21_0=='U'||(LA21_0>='X' && LA21_0<='Y')||LA21_0=='_'||(LA21_0>='j' && LA21_0<='k')||LA21_0=='q'||(LA21_0>='x' && LA21_0<='y')) ) {s = 51;}

                        else if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 52;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\u001F')||(LA21_0>='%' && LA21_0<='&')||LA21_0=='<'||(LA21_0>='>' && LA21_0<='@')||LA21_0=='\\'||LA21_0=='`'||(LA21_0>='{' && LA21_0<='}')||(LA21_0>='\u007F' && LA21_0<='\uFFFF')) ) {s = 53;}

                        else s = 46;

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