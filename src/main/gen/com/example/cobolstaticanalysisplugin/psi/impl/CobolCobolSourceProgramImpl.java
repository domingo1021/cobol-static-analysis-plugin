// This is a generated file. Not intended for manual editing.
package com.example.cobolstaticanalysisplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.example.cobolstaticanalysisplugin.CobolTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.example.cobolstaticanalysisplugin.psi.*;

public class CobolCobolSourceProgramImpl extends ASTWrapperPsiElement implements CobolCobolSourceProgram {

  public CobolCobolSourceProgramImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitCobolSourceProgram(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolDataDivision getDataDivision() {
    return findChildByClass(CobolDataDivision.class);
  }

  @Override
  @NotNull
  public CobolIdentificationDivision getIdentificationDivision() {
    return findNotNullChildByClass(CobolIdentificationDivision.class);
  }

  @Override
  @Nullable
  public CobolProcedureDivision getProcedureDivision() {
    return findChildByClass(CobolProcedureDivision.class);
  }

}
