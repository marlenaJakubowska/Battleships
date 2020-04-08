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

    Ship(int coordinateX, int coordinateY, int shipLength, String orientation, String shipType) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.shipLength = shipLength;
        this.orientation = orientation.toLowerCase();
        this.shipType = shipType;
        this.shipSquaresList = new ArrayList<>();
    }
}
// TO BE CHANGED:

//    public void setXofShip(int x){
//        this.x = x;
//    }
//    public void setYofShip(int y){
//        this.y = y;
//    }
//    public int getXofShip(){
//        return x;
//    }
//    public int getYofShip(){
//        return y;
//    }
//    public void sunk() {
//        this.isSunk = true;
//    }
//
//  public Map<String, Integer> getShipsLength() {
//        Map<String, Integer> shipsLength = new HashMap<>();
//        shipsLength.put("Carrier", 5);
//        shipsLength.put("Battleship", 4);
//        shipsLength.put("Cruiser", 3);
//        shipsLength.put("Submarine", 3);
//        shipsLength.put("Destroyer", 2);
//
//        return shipsLength;
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

