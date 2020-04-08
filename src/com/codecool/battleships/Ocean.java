package com.codecool.battleships;

import java.util.ArrayList;
import java.util.List;


public class Ocean {

    //private List<Ship> ships = new ArrayList<>();
    private ArrayList<Square> boardSquaresList;
    private ArrayList<Square> shipsSquaresList;
    private Square[][] board;
    private int boardSize;

    public Ocean(int boardSize) {
        this.boardSize = boardSize;
        this.boardSquaresList = new ArrayList<>();
        this.board = createBoard(boardSize);

    }

    public Square[][] createBoard(int boardSize) {
        board = new Square[boardSize][boardSize];
        shipsSquaresList = new ArrayList<>();
        for (int i=0; i<boardSize; i++) {
            for (int j=0; j< boardSize; j++) {
                Square area = new Square(i,j);
                board[i][j] = area;
                boardSquaresList.add(area);
            }
        }
        return board;
    }

    public Square getSquare(int x, int y) {
        return board[x][y];
    }

    public Square[][] getBoard() {
        return board;
    }

    public void placeShipOnBoard() {
       //to do
    }

    public void checkIfPlacementAvailable() {
        //to do
    }

    public void getShipSquareList() {
        //must return a list of ship's squares
    }

    public void setUnavailable(){
        //sets squares unavailable
    }


    // to be used later
    // public void setBombs() {
    //     Random r = new Random();
    //     for (int iterator = 0; iterator <= 5; iterator++) {
    //         int x = r.nextInt(10);
    //         int y = r.nextInt(10);
    //         for (int i = 0; i < 10; i++) {
    //             for (int j = 0; j < 10; j++) {
    //                 if (i == x && j == y) {
    //                     board[i][j].setSign("B");
    //                 }
    //             }
    //         }
    //     }
    // }
}

