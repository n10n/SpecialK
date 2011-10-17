package com.biosimilarity.magritte.json.Absyn; // Java Package generated by the BNF Converter.

public class JArray extends JSONArray {
  public final ListJSONValue listjsonvalue_;

  public JArray(ListJSONValue p1) { listjsonvalue_ = p1; }

  public <R,A> R accept(com.biosimilarity.magritte.json.Absyn.JSONArray.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.magritte.json.Absyn.JArray) {
      com.biosimilarity.magritte.json.Absyn.JArray x = (com.biosimilarity.magritte.json.Absyn.JArray)o;
      return this.listjsonvalue_.equals(x.listjsonvalue_);
    }
    return false;
  }

  public int hashCode() {
    return this.listjsonvalue_.hashCode();
  }


}