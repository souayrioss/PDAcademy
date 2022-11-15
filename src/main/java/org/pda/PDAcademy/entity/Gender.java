package org.loukili.javac.entity;

public enum Gender {
  MALE(1),FEMALE(2);
  private int index;

  Gender(int index) {
    this.index = index;
  }

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }
}
