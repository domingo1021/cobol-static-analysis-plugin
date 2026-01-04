// This is a generated file. Not intended for manual editing.
package com.example.cobolstaticanalysisplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolPerformStatement extends PsiElement {

  @Nullable
  CobolCondition getCondition();

  @NotNull
  List<CobolLiteral> getLiteralList();

}
