package com.codecool.battleships;
import java.util.HashMap;
import java.util.Map;

public class Square {
    private int coordinateX;
    private int coordinateY;
    private String squareStatus; //occupied by ship, free, hit, or missed
    private boolean isAvailable; // is available for ship placement


    public Square(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.squareStatus = "empty";
        this.isAvailable = true;
    }

   public Square() {
       this.squareStatus = "empty";
   }

    public void setSquareStatus(String squareStatus) {
        this.squareStatus = squareStatus;
    }

    public String getSquareStatus() {
        return this.squareStatus;
    }

    public int getCoordinateX() {
        return this.coordinateX;
    }

    public int getCoordinateY() {
        return this.coordinateY;
    }

    public void getIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void setUnavailable() {
        this.isAvailable = false;
    }

    public String toString() {
        String emptySign = "\uE43E";
        String shipSign = "\uD83D\uDEA2";
        String hitSign =  "\uE11D";
        String missedShotSign = "\uD83D\uDCA9";
        Map<String, String> squareSign = new HashMap<>();
        squareSign.put("empty", emptySign);
        squareSign.put("ship", shipSign);
        squareSign.put("hit", hitSign);
        squareSign.put("missedShot", missedShotSign);
        return squareSign.get(this.getSquareStatus());

    }
}