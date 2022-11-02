package com.pda.pdacademy.beans;

public enum Status{
    ENCOUR(1),TERMINE(2);

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
