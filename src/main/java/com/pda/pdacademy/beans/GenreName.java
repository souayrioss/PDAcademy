package com.pda.pdacademy.beans;

public enum GenreName {
    Homme(1),FEMME(2);
    private int index;

    GenreName(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


}
