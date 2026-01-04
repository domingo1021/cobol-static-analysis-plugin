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

public class CobolPictureDefImpl extends ASTWrapperPsiElement implements CobolPictureDef {

  public CobolPictureDefImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitPictureDef(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

}
