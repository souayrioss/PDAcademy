package com.pda.pdacademy.beans;

public enum TypeName {
    FORMATION(1),TALK(2),EVENT(3);
    private int index;

    TypeName(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
