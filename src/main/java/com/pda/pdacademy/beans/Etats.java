package com.pda.pdacademy.beans;

public enum Etats {
    ACTIVE(1),DESACTIVE(2);
    private int index;

    Etats(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
