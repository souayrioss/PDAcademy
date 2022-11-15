package org.loukili.javac.entity;

public enum ExerciseStatus {
  ONGOING(1),DONE(2);

  private int index;

  ExerciseStatus(int index) {
    this.index = index;
  }

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }
}
