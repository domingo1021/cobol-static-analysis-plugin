package com.example.cobolstaticanalysisplugin;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public class CobolSyntaxHighlighter extends SyntaxHighlighterBase {

  public static final TextAttributesKey METADATA =
      createTextAttributesKey("SIMPLE_METADATA", DefaultLanguageHighlighterColors.METADATA);
  public static final TextAttributesKey SEPARATOR =
      createTextAttributesKey("SIMPLE_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
  public static final TextAttributesKey KEY =
      createTextAttributesKey("SIMPLE_KEY", DefaultLanguageHighlighterColors.KEYWORD);
  public static final TextAttributesKey STRING_VALUE =
      createTextAttributesKey("SIMPLE_VALUE", DefaultLanguageHighlighterColors.STRING);
  public static final TextAttributesKey NUMBER =
      createTextAttributesKey("SIMPLE_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
  public static final TextAttributesKey COMMENT =
      createTextAttributesKey("SIMPLE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
  public static final TextAttributesKey PARENTHESES =
      createTextAttributesKey("SIMPLE_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES);
  public static final TextAttributesKey BAD_CHARACTER =
      createTextAttributesKey("SIMPLE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);
  public static final TextAttributesKey DOT =
      createTextAttributesKey("SIMPLE_DOT", DefaultLanguageHighlighterColors.DOT);
  public static final TextAttributesKey USER_DEFINED_WORD =
      createTextAttributesKey("SIMPLE_USER_DEFINED_WORD",
          DefaultLanguageHighlighterColors.LOCAL_VARIABLE);


  private static final TextAttributesKey[] METADATA_KEYS = new TextAttributesKey[]{METADATA};
  private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
  private static final TextAttributesKey[] KEY_KEYS = new TextAttributesKey[]{KEY};
  private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING_VALUE};
  private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
  private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
  private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
  private static final TextAttributesKey[] PARENTHESES_KEYS = new TextAttributesKey[]{PARENTHESES};
  private static final TextAttributesKey[] DOT_KEYS = new TextAttributesKey[]{DOT};
  private static final TextAttributesKey[] USER_DEFINED_WORD_KEYS = new TextAttributesKey[]{
      USER_DEFINED_WORD};

  @NotNull
  @Override
  public Lexer getHighlightingLexer() {
    return new CobolLexerAdapter();
  }

  @Override
  public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
    // Cobol specific tokens
    if (tokenType.equals(CobolTypes.LEVEL_NUMBER_TOKEN)) {
      return METADATA_KEYS;
    }
    if (tokenType.equals(CobolTypes.INTEGER)) {
      return NUMBER_KEYS;
    }
    if (tokenType.equals(CobolTypes.USER_DEFINED_WORD)) {
      return USER_DEFINED_WORD_KEYS;
    }
    if (tokenType.equals(CobolTypes.STRING)) {
      return STRING_KEYS;
    }
    if (tokenType.equals(CobolTypes.IDENTIFICATION)
        || tokenType.equals(CobolTypes.DISPLAY)
        || tokenType.equals(CobolTypes.STOP)
        || tokenType.equals(CobolTypes.WORKING_STORAGE)
        || tokenType.equals(CobolTypes.PROCEDURE)
        || tokenType.equals(CobolTypes.DIVISION)
        || tokenType.equals(CobolTypes.SECTION)
        || tokenType.equals(CobolTypes.PERFORM)
        || tokenType.equals(CobolTypes.RUN)
        || tokenType.equals(CobolTypes.VARYING)
        || tokenType.equals(CobolTypes.UNTIL)
        || tokenType.equals(CobolTypes.BY)
        || tokenType.equals(CobolTypes.FROM)
        || tokenType.equals(CobolTypes.VALUE)
        || tokenType.equals(CobolTypes.PIC)
        || tokenType.equals(CobolTypes.PROGRAM_ID)
        || tokenType.equals(CobolTypes.DATA)
        || tokenType.equals(CobolTypes.ZERO)) {
      return KEY_KEYS;
    }
    if (tokenType.equals(CobolTypes.LPAREN) || tokenType.equals(CobolTypes.RPAREN)) {
      return PARENTHESES_KEYS;
    }
    if (tokenType.equals(CobolTypes.DOT)) {
      return DOT_KEYS;
    }

    // Other tokens
    if (tokenType.equals(KEY)) {
      return KEY_KEYS;
    }
    if (tokenType.equals(STRING_VALUE)) {
      return STRING_KEYS;
    }
    if (tokenType.equals(COMMENT)) {
      return COMMENT_KEYS;
    }
    if (tokenType.equals(TokenType.BAD_CHARACTER)) {
      return BAD_CHAR_KEYS;
    }
    return EMPTY_KEYS;
  }

}