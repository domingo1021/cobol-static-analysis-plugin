package com.example.cobolstaticanalysisplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import javax.swing.Icon;
import org.jetbrains.annotations.NotNull;

public final class SimpleFileType extends LanguageFileType {

  public static final SimpleFileType INSTANCE = new SimpleFileType();

  private SimpleFileType() {
    super(SimpleLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public String getName() {
    return "Simple File";
  }

  @NotNull
  @Override
  public String getDescription() {
    return "Simple language file";
  }

  @NotNull
  @Override
  public String getDefaultExtension() {
    return "simple";
  }

  @Override
  public Icon getIcon() {
    return SimpleIcons.FILE;
  }

}