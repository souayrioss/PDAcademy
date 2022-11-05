package com.pda.pdacademy.entity;

public enum Etat {
    ACTIVE(1),DESACTIVE(2);
    private int index;

    Etat(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
