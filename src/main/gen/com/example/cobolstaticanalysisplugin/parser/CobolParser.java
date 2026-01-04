// This is a generated file. Not intended for manual editing.
package com.example.cobolstaticanalysisplugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.example.cobolstaticanalysisplugin.CobolTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CobolParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return cobolFile(b, l + 1);
  }

  /* ********************************************************** */
  // cobolSourceProgram
  static boolean cobolFile(PsiBuilder b, int l) {
    return cobolSourceProgram(b, l + 1);
  }

  /* ********************************************************** */
  // identificationDivision dataDivision? procedureDivision?
  public static boolean cobolSourceProgram(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cobolSourceProgram")) return false;
    if (!nextTokenIs(b, LEVEL_NUMBER_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identificationDivision(b, l + 1);
    r = r && cobolSourceProgram_1(b, l + 1);
    r = r && cobolSourceProgram_2(b, l + 1);
    exit_section_(b, m, COBOL_SOURCE_PROGRAM, r);
    return r;
  }

  // dataDivision?
  private static boolean cobolSourceProgram_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cobolSourceProgram_1")) return false;
    dataDivision(b, l + 1);
    return true;
  }

  // procedureDivision?
  private static boolean cobolSourceProgram_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cobolSourceProgram_2")) return false;
    procedureDivision(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // identifier_or_literal (EQ | "=") identifier_or_literal
  public static boolean condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITION, "<condition>");
    r = identifier_or_literal(b, l + 1);
    r = r && condition_1(b, l + 1);
    r = r && identifier_or_literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // EQ | "="
  private static boolean condition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_1")) return false;
    boolean r;
    r = consumeToken(b, EQ);
    if (!r) r = consumeToken(b, "=");
    return r;
  }

  /* ********************************************************** */
  // line_start (INTEGER | ZERO) USER_DEFINED_WORD (PIC pictureDef)? (VALUE literal)? dot
  public static boolean dataDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataDefinition")) return false;
    if (!nextTokenIs(b, LEVEL_NUMBER_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = line_start(b, l + 1);
    r = r && dataDefinition_1(b, l + 1);
    r = r && consumeToken(b, USER_DEFINED_WORD);
    r = r && dataDefinition_3(b, l + 1);
    r = r && dataDefinition_4(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, DATA_DEFINITION, r);
    return r;
  }

  // INTEGER | ZERO
  private static boolean dataDefinition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataDefinition_1")) return false;
    boolean r;
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, ZERO);
    return r;
  }

  // (PIC pictureDef)?
  private static boolean dataDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataDefinition_3")) return false;
    dataDefinition_3_0(b, l + 1);
    return true;
  }

  // PIC pictureDef
  private static boolean dataDefinition_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataDefinition_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PIC);
    r = r && pictureDef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (VALUE literal)?
  private static boolean dataDefinition_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataDefinition_4")) return false;
    dataDefinition_4_0(b, l + 1);
    return true;
  }

  // VALUE literal
  private static boolean dataDefinition_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataDefinition_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VALUE);
    r = r && literal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // line_start DATA DIVISION dot_sep
  //     working_storage_section?
  //     dataDefinition*
  public static boolean dataDivision(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataDivision")) return false;
    if (!nextTokenIs(b, LEVEL_NUMBER_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = line_start(b, l + 1);
    r = r && consumeTokens(b, 0, DATA, DIVISION);
    r = r && dot_sep(b, l + 1);
    r = r && dataDivision_4(b, l + 1);
    r = r && dataDivision_5(b, l + 1);
    exit_section_(b, m, DATA_DIVISION, r);
    return r;
  }

  // working_storage_section?
  private static boolean dataDivision_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataDivision_4")) return false;
    working_storage_section(b, l + 1);
    return true;
  }

  // dataDefinition*
  private static boolean dataDivision_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataDivision_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dataDefinition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dataDivision_5", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // DISPLAY (literal | USER_DEFINED_WORD)* optional_dot
  public static boolean displayStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "displayStatement")) return false;
    if (!nextTokenIs(b, DISPLAY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DISPLAY);
    r = r && displayStatement_1(b, l + 1);
    r = r && optional_dot(b, l + 1);
    exit_section_(b, m, DISPLAY_STATEMENT, r);
    return r;
  }

  // (literal | USER_DEFINED_WORD)*
  private static boolean displayStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "displayStatement_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!displayStatement_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "displayStatement_1", c)) break;
    }
    return true;
  }

  // literal | USER_DEFINED_WORD
  private static boolean displayStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "displayStatement_1_0")) return false;
    boolean r;
    r = literal(b, l + 1);
    if (!r) r = consumeToken(b, USER_DEFINED_WORD);
    return r;
  }

  /* ********************************************************** */
  // DOT
  static boolean dot_sep(PsiBuilder b, int l) {
    return consumeToken(b, DOT);
  }

  /* ********************************************************** */
  // line_start IDENTIFICATION DIVISION dot_sep
  //     line_start PROGRAM_ID optional_dot USER_DEFINED_WORD optional_dot
  public static boolean identificationDivision(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identificationDivision")) return false;
    if (!nextTokenIs(b, LEVEL_NUMBER_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = line_start(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFICATION, DIVISION);
    r = r && dot_sep(b, l + 1);
    r = r && line_start(b, l + 1);
    r = r && consumeToken(b, PROGRAM_ID);
    r = r && optional_dot(b, l + 1);
    r = r && consumeToken(b, USER_DEFINED_WORD);
    r = r && optional_dot(b, l + 1);
    exit_section_(b, m, IDENTIFICATION_DIVISION, r);
    return r;
  }

  /* ********************************************************** */
  // USER_DEFINED_WORD | literal
  static boolean identifier_or_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_or_literal")) return false;
    boolean r;
    r = consumeToken(b, USER_DEFINED_WORD);
    if (!r) r = literal(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // LEVEL_NUMBER_TOKEN
  static boolean line_start(PsiBuilder b, int l) {
    return consumeToken(b, LEVEL_NUMBER_TOKEN);
  }

  /* ********************************************************** */
  // INTEGER | ZERO | STRING
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, ZERO);
    if (!r) r = consumeToken(b, STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DOT?
  static boolean optional_dot(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optional_dot")) return false;
    consumeToken(b, DOT);
    return true;
  }

  /* ********************************************************** */
  // line_start USER_DEFINED_WORD dot_sep
  public static boolean paragraph(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paragraph")) return false;
    if (!nextTokenIs(b, LEVEL_NUMBER_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = line_start(b, l + 1);
    r = r && consumeToken(b, USER_DEFINED_WORD);
    r = r && dot_sep(b, l + 1);
    exit_section_(b, m, PARAGRAPH, r);
    return r;
  }

  /* ********************************************************** */
  // PERFORM USER_DEFINED_WORD (VARYING USER_DEFINED_WORD FROM literal BY literal UNTIL condition)? optional_dot
  public static boolean performStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "performStatement")) return false;
    if (!nextTokenIs(b, PERFORM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PERFORM, USER_DEFINED_WORD);
    r = r && performStatement_2(b, l + 1);
    r = r && optional_dot(b, l + 1);
    exit_section_(b, m, PERFORM_STATEMENT, r);
    return r;
  }

  // (VARYING USER_DEFINED_WORD FROM literal BY literal UNTIL condition)?
  private static boolean performStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "performStatement_2")) return false;
    performStatement_2_0(b, l + 1);
    return true;
  }

  // VARYING USER_DEFINED_WORD FROM literal BY literal UNTIL condition
  private static boolean performStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "performStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, VARYING, USER_DEFINED_WORD, FROM);
    r = r && literal(b, l + 1);
    r = r && consumeToken(b, BY);
    r = r && literal(b, l + 1);
    r = r && consumeToken(b, UNTIL);
    r = r && condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (USER_DEFINED_WORD | INTEGER | ZERO) (LPAREN (INTEGER | ZERO) RPAREN)?
  public static boolean pictureDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pictureDef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PICTURE_DEF, "<picture def>");
    r = pictureDef_0(b, l + 1);
    r = r && pictureDef_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // USER_DEFINED_WORD | INTEGER | ZERO
  private static boolean pictureDef_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pictureDef_0")) return false;
    boolean r;
    r = consumeToken(b, USER_DEFINED_WORD);
    if (!r) r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, ZERO);
    return r;
  }

  // (LPAREN (INTEGER | ZERO) RPAREN)?
  private static boolean pictureDef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pictureDef_1")) return false;
    pictureDef_1_0(b, l + 1);
    return true;
  }

  // LPAREN (INTEGER | ZERO) RPAREN
  private static boolean pictureDef_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pictureDef_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && pictureDef_1_0_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // INTEGER | ZERO
  private static boolean pictureDef_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pictureDef_1_0_1")) return false;
    boolean r;
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, ZERO);
    return r;
  }

  /* ********************************************************** */
  // (paragraph | procedureStatement)*
  public static boolean procedureBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedureBody")) return false;
    Marker m = enter_section_(b, l, _NONE_, PROCEDURE_BODY, "<procedure body>");
    while (true) {
      int c = current_position_(b);
      if (!procedureBody_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "procedureBody", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // paragraph | procedureStatement
  private static boolean procedureBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedureBody_0")) return false;
    boolean r;
    r = paragraph(b, l + 1);
    if (!r) r = procedureStatement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // line_start PROCEDURE DIVISION dot_sep
  //     procedureBody
  public static boolean procedureDivision(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedureDivision")) return false;
    if (!nextTokenIs(b, LEVEL_NUMBER_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = line_start(b, l + 1);
    r = r && consumeTokens(b, 0, PROCEDURE, DIVISION);
    r = r && dot_sep(b, l + 1);
    r = r && procedureBody(b, l + 1);
    exit_section_(b, m, PROCEDURE_DIVISION, r);
    return r;
  }

  /* ********************************************************** */
  // line_start (performStatement | stopStatement | displayStatement)
  public static boolean procedureStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedureStatement")) return false;
    if (!nextTokenIs(b, LEVEL_NUMBER_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = line_start(b, l + 1);
    r = r && procedureStatement_1(b, l + 1);
    exit_section_(b, m, PROCEDURE_STATEMENT, r);
    return r;
  }

  // performStatement | stopStatement | displayStatement
  private static boolean procedureStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedureStatement_1")) return false;
    boolean r;
    r = performStatement(b, l + 1);
    if (!r) r = stopStatement(b, l + 1);
    if (!r) r = displayStatement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // STOP RUN optional_dot
  public static boolean stopStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stopStatement")) return false;
    if (!nextTokenIs(b, STOP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STOP, RUN);
    r = r && optional_dot(b, l + 1);
    exit_section_(b, m, STOP_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // line_start WORKING_STORAGE SECTION dot_sep
  //     dataDefinition*
  public static boolean working_storage_section(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "working_storage_section")) return false;
    if (!nextTokenIs(b, LEVEL_NUMBER_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = line_start(b, l + 1);
    r = r && consumeTokens(b, 0, WORKING_STORAGE, SECTION);
    r = r && dot_sep(b, l + 1);
    r = r && working_storage_section_4(b, l + 1);
    exit_section_(b, m, WORKING_STORAGE_SECTION, r);
    return r;
  }

  // dataDefinition*
  private static boolean working_storage_section_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "working_storage_section_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dataDefinition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "working_storage_section_4", c)) break;
    }
    return true;
  }

}
