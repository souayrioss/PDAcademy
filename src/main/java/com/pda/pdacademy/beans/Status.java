package com.pda.pdacademy.beans;

public enum Status{
    ACTIVE(1),DESACTIVE(2);
    private int index;

    Status(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
