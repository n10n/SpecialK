package com.biosimilarity.seleKt.model.ill.lang.illtl.Absyn; // Java Package generated by the BNF Converter.

public class Application extends RLLExpr {
  public final RLLExpr rllexpr_;
  public final ListRLLExpr listrllexpr_;

  public Application(RLLExpr p1, ListRLLExpr p2) { rllexpr_ = p1; listrllexpr_ = p2; }

  public <R,A> R accept(com.biosimilarity.seleKt.model.ill.lang.illtl.Absyn.RLLExpr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.seleKt.model.ill.lang.illtl.Absyn.Application) {
      com.biosimilarity.seleKt.model.ill.lang.illtl.Absyn.Application x = (com.biosimilarity.seleKt.model.ill.lang.illtl.Absyn.Application)o;
      return this.rllexpr_.equals(x.rllexpr_) && this.listrllexpr_.equals(x.listrllexpr_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.rllexpr_.hashCode())+this.listrllexpr_.hashCode();
  }


}
