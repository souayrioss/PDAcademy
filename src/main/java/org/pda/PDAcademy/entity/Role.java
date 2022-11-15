package org.loukili.javac.entity;

public enum Role {
  ADMIN(1),RESPONSIBLE(2),PARTICIPANT(3);
  private int index;

  Role(int index) {
    this.index = index;
  }

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }
}
