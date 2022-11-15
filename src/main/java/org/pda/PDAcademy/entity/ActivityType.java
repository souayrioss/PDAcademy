package org.loukili.javac.entity;

public enum ActivityType {
  FORMATION(1),TALK(2),EVENT(3);
  private int index;

  ActivityType(int index) {
    this.index = index;
  }

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }
}
