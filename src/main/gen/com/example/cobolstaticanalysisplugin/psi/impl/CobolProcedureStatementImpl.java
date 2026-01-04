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

public class CobolProcedureStatementImpl extends ASTWrapperPsiElement implements CobolProcedureStatement {

  public CobolProcedureStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitProcedureStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolDisplayStatement getDisplayStatement() {
    return findChildByClass(CobolDisplayStatement.class);
  }

  @Override
  @Nullable
  public CobolPerformStatement getPerformStatement() {
    return findChildByClass(CobolPerformStatement.class);
  }

  @Override
  @Nullable
  public CobolStopStatement getStopStatement() {
    return findChildByClass(CobolStopStatement.class);
  }

}
