package com.pda.pdacademy.entity;

public enum ActiviteType {
    FORMATION(1),TALK(2),EVENT(3);
    private int index;

    ActiviteType(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
