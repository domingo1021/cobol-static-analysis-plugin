// This is a generated file. Not intended for manual editing.
package com.example.cobolstaticanalysisplugin;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.example.cobolstaticanalysisplugin.psi.impl.*;

public interface CobolTypes {

  IElementType COBOL_SOURCE_PROGRAM = new CobolElementType("COBOL_SOURCE_PROGRAM");
  IElementType CONDITION = new CobolElementType("CONDITION");
  IElementType DATA_DEFINITION = new CobolElementType("DATA_DEFINITION");
  IElementType DATA_DIVISION = new CobolElementType("DATA_DIVISION");
  IElementType DISPLAY_STATEMENT = new CobolElementType("DISPLAY_STATEMENT");
  IElementType IDENTIFICATION_DIVISION = new CobolElementType("IDENTIFICATION_DIVISION");
  IElementType LITERAL = new CobolElementType("LITERAL");
  IElementType PARAGRAPH = new CobolElementType("PARAGRAPH");
  IElementType PERFORM_STATEMENT = new CobolElementType("PERFORM_STATEMENT");
  IElementType PICTURE_DEF = new CobolElementType("PICTURE_DEF");
  IElementType PROCEDURE_BODY = new CobolElementType("PROCEDURE_BODY");
  IElementType PROCEDURE_DIVISION = new CobolElementType("PROCEDURE_DIVISION");
  IElementType PROCEDURE_STATEMENT = new CobolElementType("PROCEDURE_STATEMENT");
  IElementType STOP_STATEMENT = new CobolElementType("STOP_STATEMENT");
  IElementType WORKING_STORAGE_SECTION = new CobolElementType("WORKING_STORAGE_SECTION");

  IElementType BY = new CobolTokenType("BY");
  IElementType DATA = new CobolTokenType("DATA");
  IElementType DISPLAY = new CobolTokenType("DISPLAY");
  IElementType DIVISION = new CobolTokenType("DIVISION");
  IElementType DOT = new CobolTokenType("DOT");
  IElementType EQ = new CobolTokenType("EQ");
  IElementType FROM = new CobolTokenType("FROM");
  IElementType IDENTIFICATION = new CobolTokenType("IDENTIFICATION");
  IElementType INTEGER = new CobolTokenType("INTEGER");
  IElementType LEVEL_NUMBER_TOKEN = new CobolTokenType("LEVEL_NUMBER_TOKEN");
  IElementType LPAREN = new CobolTokenType("LPAREN");
  IElementType PERFORM = new CobolTokenType("PERFORM");
  IElementType PIC = new CobolTokenType("PIC");
  IElementType PROCEDURE = new CobolTokenType("PROCEDURE");
  IElementType PROGRAM_ID = new CobolTokenType("PROGRAM_ID");
  IElementType RPAREN = new CobolTokenType("RPAREN");
  IElementType RUN = new CobolTokenType("RUN");
  IElementType SECTION = new CobolTokenType("SECTION");
  IElementType STOP = new CobolTokenType("STOP");
  IElementType STRING = new CobolTokenType("STRING");
  IElementType UNTIL = new CobolTokenType("UNTIL");
  IElementType USER_DEFINED_WORD = new CobolTokenType("USER_DEFINED_WORD");
  IElementType VALUE = new CobolTokenType("VALUE");
  IElementType VARYING = new CobolTokenType("VARYING");
  IElementType WORKING_STORAGE = new CobolTokenType("WORKING_STORAGE");
  IElementType ZERO = new CobolTokenType("ZERO");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == COBOL_SOURCE_PROGRAM) {
        return new CobolCobolSourceProgramImpl(node);
      }
      else if (type == CONDITION) {
        return new CobolConditionImpl(node);
      }
      else if (type == DATA_DEFINITION) {
        return new CobolDataDefinitionImpl(node);
      }
      else if (type == DATA_DIVISION) {
        return new CobolDataDivisionImpl(node);
      }
      else if (type == DISPLAY_STATEMENT) {
        return new CobolDisplayStatementImpl(node);
      }
      else if (type == IDENTIFICATION_DIVISION) {
        return new CobolIdentificationDivisionImpl(node);
      }
      else if (type == LITERAL) {
        return new CobolLiteralImpl(node);
      }
      else if (type == PARAGRAPH) {
        return new CobolParagraphImpl(node);
      }
      else if (type == PERFORM_STATEMENT) {
        return new CobolPerformStatementImpl(node);
      }
      else if (type == PICTURE_DEF) {
        return new CobolPictureDefImpl(node);
      }
      else if (type == PROCEDURE_BODY) {
        return new CobolProcedureBodyImpl(node);
      }
      else if (type == PROCEDURE_DIVISION) {
        return new CobolProcedureDivisionImpl(node);
      }
      else if (type == PROCEDURE_STATEMENT) {
        return new CobolProcedureStatementImpl(node);
      }
      else if (type == STOP_STATEMENT) {
        return new CobolStopStatementImpl(node);
      }
      else if (type == WORKING_STORAGE_SECTION) {
        return new CobolWorkingStorageSectionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
