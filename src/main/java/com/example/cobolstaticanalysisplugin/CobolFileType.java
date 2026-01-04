package com.example.cobolstaticanalysisplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import javax.swing.Icon;
import org.jetbrains.annotations.NotNull;

public final class CobolFileType extends LanguageFileType {

  public static final CobolFileType INSTANCE = new CobolFileType();

  private CobolFileType() {
    super(CobolLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public String getName() {
    return "COBOLE File";
  }

  @NotNull
  @Override
  public String getDescription() {
    return "Simple language file";
  }

  @NotNull
  @Override
  public String getDefaultExtension() {
    return "cbl";
  }

  @Override
  public Icon getIcon() {
    return CobolIcons.FILE;
  }

}