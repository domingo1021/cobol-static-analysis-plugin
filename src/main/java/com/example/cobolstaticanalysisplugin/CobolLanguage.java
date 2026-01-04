package com.example.cobolstaticanalysisplugin;

import com.intellij.lang.Language;

public class CobolLanguage extends Language {

  public static final CobolLanguage INSTANCE = new CobolLanguage();

  private CobolLanguage() {
    super("COBOL");
  }

}