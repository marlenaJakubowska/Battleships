package com.codecool.battleships;

public class Square {
    private String statusSign; //occupied by ship, free, hit, or missed
    private boolean isAvailable; // is available for ship placement
    private Integer coordinateX;
    private Integer coordinateY;


    public Square(Integer coordinateX, Integer coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.statusSign = "~";
    }

    public Square() {
        this.statusSign = "~";
    }

    public void setStatusSign(String sign) {
        this.statusSign = sign;
    }

    public String getStatusSign() {
        return this.statusSign;
    }

    public int getX() {
        return this.coordinateX;
    }

    public int getY() {
        return this.coordinateY;
    }

    public void getIsMarked(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public boolean getIsMarked() {
        return this.isAvailable;
    }


    //to do:
//    public String toString() {
//    returns different string values for different statusSigns
//    }
}