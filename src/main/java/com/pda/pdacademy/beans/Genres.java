package com.pda.pdacademy.beans;

public enum Genres {
    Homme(1),FEMME(2);
    private int index;

    Genres(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


}
