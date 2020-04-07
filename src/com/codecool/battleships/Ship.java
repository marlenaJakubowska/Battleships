package com.codecool.battleships;

public class Ship {
    int length;
    Boolean isHorizontal;
    Boolean isSunk;
    private int x;
    private int y;
    List<Square> shipSquares = new ArrayList<>();
    private String shipSign = "S";
