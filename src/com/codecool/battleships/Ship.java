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
