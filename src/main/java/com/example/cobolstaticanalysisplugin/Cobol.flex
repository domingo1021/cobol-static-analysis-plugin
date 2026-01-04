package com.example.cobolstaticanalysisplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import static com.example.cobolstaticanalysisplugin.CobolTypes.*;

%%

%class CobolLexer
%implements FlexLexer
%unicode
%ignorecase
%function advance
%type IElementType
%eof{
 return;
%eof}

// The predefined expressions
CRLF           = \R
WHITE_SPACE    = [ \t\f]+
SEQ_NUM        = [0-9]{2}
COBOL_WORD     = [A-Za-z0-9]+("-"[A-Za-z0-9]+)*
INTEGER        = [0-9]+
STRING         = [\'] ([^\'] | [\'][\'])* [\']
ZERO           = [0]+

%%

<YYINITIAL> {
  {WHITE_SPACE}     { return TokenType.WHITE_SPACE; }
  {CRLF}            { return TokenType.WHITE_SPACE; }

  // Every line starts will be level numbers
  ^{SEQ_NUM}         { return LEVEL_NUMBER_TOKEN; }

  // Keywords, either lexical or reserved words
  "IDENTIFICATION"  { return IDENTIFICATION; }
  "DIVISION"        { return DIVISION; }
  "PROGRAM-ID"      { return PROGRAM_ID; }
  "DATA"            { return DATA; }
  "WORKING-STORAGE" { return WORKING_STORAGE; }
  "SECTION"         { return SECTION; }
  "PROCEDURE"       { return PROCEDURE; }
  "PERFORM"         { return PERFORM; }
  "VARYING"         { return VARYING; }
  "FROM"            { return FROM; }
  "BY"              { return BY; }
  "UNTIL"           { return UNTIL; }
  "STOP"            { return STOP; }
  "RUN"             { return RUN; }
  "DISPLAY"         { return DISPLAY; }
  "PIC"             { return PIC; }
  "VALUE"           { return VALUE; }

  "."               { return DOT; }
  "="               { return EQ; }
  "("               { return LPAREN; }
  ")"               { return RPAREN; }

  {STRING}          { return STRING; }
  {ZERO}            { return ZERO; }
  {INTEGER}         { return INTEGER; }
  {COBOL_WORD}      { return USER_DEFINED_WORD; }

  [^]               { return TokenType.BAD_CHARACTER; }
}