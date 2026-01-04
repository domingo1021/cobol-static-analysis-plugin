package com.example.cobolstaticanalysisplugin;

import com.intellij.psi.tree.TokenSet;

/**
 * Define all sets of related token types
 */
public interface CobolTokenSets {
  TokenSet Keywords = TokenSet.create(
          CobolTypes.BY,
          CobolTypes.DATA,
          CobolTypes.DISPLAY,
          CobolTypes.DIVISION,
          CobolTypes.EQ,
          CobolTypes.FROM,
          CobolTypes.IDENTIFICATION,
          CobolTypes.INTEGER,
          CobolTypes.LEVEL_NUMBER_TOKEN,
          CobolTypes.LPAREN,
          CobolTypes.PERFORM,
          CobolTypes.PIC,
          CobolTypes.PROCEDURE,
          CobolTypes.PROGRAM_ID,
          CobolTypes.RPAREN,
          CobolTypes.RUN,
          CobolTypes.SECTION,
          CobolTypes.STOP,
          CobolTypes.STRING,
          CobolTypes.UNTIL,
          CobolTypes.VALUE,
          CobolTypes.VARYING,
          CobolTypes.WORKING_STORAGE,
          CobolTypes.ZERO
  );
}
