package com.pda.pdacademy.beans;

public enum EtatName {
    ENCOUR(1),TERMINE(2);
    private int index;

    EtatName(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
