package com.pda.pdacademy.entity;

public enum Gender {
    Homme(1),FEMME(2);
    private int index;

    Gender(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


}
