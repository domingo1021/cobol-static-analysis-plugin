package com.example.cobolstaticanalysisplugin;

import com.intellij.lexer.FlexAdapter;

public class CobolLexerAdapter extends FlexAdapter {

  public CobolLexerAdapter() {
    super(new CobolLexer(null));
  }

}