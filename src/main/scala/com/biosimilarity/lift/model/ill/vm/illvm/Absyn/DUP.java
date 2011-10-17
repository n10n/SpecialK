package com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn; // Java Package generated by the BNF Converter.

public class DUP extends Instruction {
  public final String illdup_;

  public DUP(String p1) { illdup_ = p1; }

  public <R,A> R accept(com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.Instruction.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.DUP) {
      com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.DUP x = (com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.DUP)o;
      return this.illdup_.equals(x.illdup_);
    }
    return false;
  }

  public int hashCode() {
    return this.illdup_.hashCode();
  }


}