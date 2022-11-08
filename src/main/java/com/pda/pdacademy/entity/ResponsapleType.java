package com.pda.pdacademy.entity;

public enum ResponsapleType {
    FORMATEUR(1),INTERVENANT(2);
    private int index;

    ResponsapleType(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
