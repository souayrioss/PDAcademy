package org.loukili.javac.entity;

public enum State {
  ACTIVE(1),DESACTIVE(2);
  private int index;

  State(int index) {
    this.index = index;
  }

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }
}
