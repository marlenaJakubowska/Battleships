package com.codecool.battleships;

import java.util.ArrayList;
import java.util.List;


public class Ocean {

    //private List<Ship> ships = new ArrayList<>();
    private ArrayList<Square> boardSquaresList;
    private ArrayList<Square> shipsSquaresList = new ArrayList<>();
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

    public void addSquareAreaToShipsSquaresList(Square area){
        this.shipsSquaresList.add(area);
    }

    public int getBoardSize() {
        return this.boardSize;
    }

    public Square getSquare(int coordinateX, int coordinateY) {
        return this.getBoard()[coordinateX][coordinateY];
    }

    public Square[][] getBoard() {
        return this.board;
    }

    public ArrayList<Square> getBoardSquaresList() {
        return this.boardSquaresList;
    }

    public ArrayList<Square> getShipsSquaresList() {
        return this.shipsSquaresList;
    }

    public void setAreaUnavailable(){
        for (Square element :getShipsSquaresList()) {
            for (int i = -1; i < 2; i++){
                for (int j = -1; j <2; j++) {
                    int coordinateX = element.getCoordinateX() + j;
                    int coordinateY = element.getCoordinateY() + i;
                    if (coordinateX >= 0 && coordinateX < 10 && coordinateY >= 0 && coordinateY < 10) {
                        this.getBoard()[coordinateY][coordinateX].setUnavailable();
                    }
                }
            }
        }
    }

    //place ship on board and add to ships and boardsquare list. return true is ship placed
    public boolean placeShipOnBoard(Ship shipToPlace) {
        if (shipToPlace.getOrientation().equals("h")) {
            for (int i = shipToPlace.getCoordinateX(); i < shipToPlace.getCoordinateX()
                    + shipToPlace.getShipLength(); i++) {
                this.getBoard()[shipToPlace.getCoordinateY()][i].setSquareStatus("ship");
                Square area = this.getSquare(shipToPlace.getCoordinateY(), i);
                shipToPlace.addSquaretoShipSquaresList(area); //adding to one ship list
                this.addSquareAreaToShipsSquaresList(area); //adding to all ships list
            }
        } else if (shipToPlace.getOrientation().equals("v")) {
            for (int i = shipToPlace.getCoordinateY(); i < shipToPlace.getCoordinateY()
                    + shipToPlace.getShipLength(); i++) {
                this.getBoard()[i][shipToPlace.getCoordinateX()].setSquareStatus("ship");
                Square area = this.getSquare(i, shipToPlace.getCoordinateX());
                shipToPlace.addSquaretoShipSquaresList(area); //adding to one ship list
                this.addSquareAreaToShipsSquaresList(area); //adding to all ships list
            }
            return true;
        }
        return false;
    }


    public void checkIfPlacementAvailable() {
        //to do
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

