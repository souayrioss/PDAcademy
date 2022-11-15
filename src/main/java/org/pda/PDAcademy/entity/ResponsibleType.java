package org.loukili.javac.entity;

public enum ResponsibleType {
  TRAINER(1),SPEAKER(2);
  private int index;

  ResponsibleType(int index) {
    this.index = index;
  }

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }
}
