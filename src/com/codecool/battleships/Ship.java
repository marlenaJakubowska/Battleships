package com.codecool.battleships;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Ship {
    private int coordinateX;
    private int coordinateY;
    private int shipLength;
    private String orientation;
    private String shipType;
    private ArrayList<Square> shipSquaresList;
//    public static Map<String, Integer> shipTypeAndLength; //TEST

    Ship(int coordinateX, int coordinateY, int shipLength, String orientation, String shipType) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.shipLength = shipLength;
        this.orientation = orientation.toUpperCase();
        this.shipType = shipType;
        this.shipSquaresList = new ArrayList<>();
    }

    public void addSquaretoShipSquaresList(Square area) {
        this.shipSquaresList.add(area);
    }

    public int getCoordinateX() {
        return this.coordinateX;
    }

    public int getCoordinateY() {
        return this.coordinateY;
    }

    public int getShipLength() {
        return this.shipLength;
    }

    public String getOrientation() {
        return this.orientation;
    }

    public String getShipType() {
        return this.shipType;
    }

    public ArrayList<Square> getShipSquaresList() {
        return this.shipSquaresList;
    }

//    //public static void getShipsLengthMap() {
//    public static void createShipsLengthMap() {   //TEST
//        // Map<String, Integer> shipTypeAndLength = new HashMap<>();  //TEST
//        shipTypeAndLength = new HashMap<>();
//        shipTypeAndLength.put("Carrier", 5);
//        shipTypeAndLength.put("Battleship", 4);
//        shipTypeAndLength.put("Cruiser", 3);
//        shipTypeAndLength.put("Submarine", 3);
//        shipTypeAndLength.put("Destroyer", 2);
//        //return shipTypeAndLength.get(this.getShipType());  //TEST
//    }

}
// TO BE CHANGED:

//    public void setXofShip(int x){
//        this.x = x;
//    }
//    public void setYofShip(int y){
//        this.y = y;

//    public void sunk() {
//        this.isSunk = true;
//    }
//
//
//    private void setShip(int length, int x, int y, Square [][] board) {
//        Square position;
//
//        for (int i = 0; i < length; i++) {
//
//            if (this.isHorizontal) {
//                position = new Square(x + i, y);
//                position.setSquareStatus(shipSign);
//                board[y][x + i] = position;
//            } else {
//                position = new Square(x, y + i);
//                position.setSquareStatus(shipSign);
//                board[y + i][x] = position;
//            }
//            this.shipSquares.add(position);
//        }
//    }
//
//    public Boolean checkIfSunked() {
//        for (Square position : shipSquares) {
//            if (!position.getSquareStatus().equals("x")) {
//                return false;
//            }
//        }
//        return true;
//    }

