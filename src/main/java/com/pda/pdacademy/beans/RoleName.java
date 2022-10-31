package com.pda.pdacademy.beans;

public enum RoleName {
    ADMIN(1),RESPONSABLE(2),PARTICIPANT(3);
    private int index;

    RoleName(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
