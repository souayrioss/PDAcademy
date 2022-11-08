package com.pda.pdacademy.entity;

public enum Statut{
    ENCOUR(1),TERMINE(2);

    private int index;

    Statut(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
