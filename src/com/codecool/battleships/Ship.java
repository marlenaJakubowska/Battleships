package com.codecool.battleships;

public class Ship {
    int length;
    Boolean isHorizontal;
    Boolean isSunk;
    private int x;
    private int y;
    List<Square> shipSquares = new ArrayList<>();
    private String shipSign = "S";

    public Ship(int length, Boolean isHorizontal, int x, int y, Square[][] board) {
        this.length = length;
        this.isHorizontal = isHorizontal;
        this.isSunk = false;
        setShip(length, x, y, board);    
    }  
    public void setXofShip(int x){
        this.x = x;
    }
    public void setYofShip(int y){
        this.y = y;
    }
    public int getXofShip(){
        return x;
    }
    public int getYofShip(){
        return y;
    } 
    public void sunk() {
        this.isSunk = true;
    }

  public Map<String, Integer> getShipsLength() {
        Map<String, Integer> shipsLength = new HashMap<>();
        shipsLength.put("Carrier", 5);
        shipsLength.put("Battleship", 4);
        shipsLength.put("Cruiser", 3);
        shipsLength.put("Submarine", 3);
        shipsLength.put("Destroyer", 2);

        return shipsLength;
    }

