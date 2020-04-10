package com.codecool.battleships;

import java.util.ArrayList;
import java.util.List;

public class PlayerTest {

    private List<Ship> listOfSips = new ArrayList<>();

    public Ocean createPlayerBoard() {
        int boardSize = 10;
        List<Ship> list = new ArrayList<>();
        Ocean board = new Ocean(boardSize);
        boolean doesItFit = true;
        for (String key : Tools.shipTypeAndLength.keySet()) {
            Ship shipToPlace;
            do {
                System.out.println(board.toString());
                System.out.printf("Put the %s ship on the board. The ship size is %d.\n", key, Tools.shipTypeAndLength.get(key));
            
                String shipOrientation = Tools.takeOrientationInput("Type v - vertical, h - horizontal");
                String position = Tools.takePositionInput("Enter position. eg. A9");
                char positionLetter = position.charAt(0);
                int coordinateY = Tools.convertCharacterToNumber(positionLetter);
                int coordinateX = Integer.parseInt(position.substring(1)) -1;
                int length = Tools.shipTypeAndLength.get(key);
                shipToPlace = new Ship(coordinateX, coordinateY, length, shipOrientation, key);
                if (canPlaceShipOnTheBoard(shipToPlace, board)) {
                    list.add(shipToPlace);
                    board.placeShipOnBoard(shipToPlace);
                    System.out.println("da sie");
                    doesItFit = true;
                } else {
                    System.out.println("The ships cannot touch each other and must fit the board.");
                    doesItFit = false;
                }

            } while (!doesItFit);
            this.getListOfShips().add(shipToPlace);
            board.setAreaUnavailable();
        }
        System.out.println(board.toString());
        return board;
    }

    private boolean canPlaceShipOnTheBoard(Ship shipToPlace, Ocean board) {
        // TODO - zaimplementować logikę walidacji
        /*
        dla każdego square w statku
            jeżeli square == statek lub square.sąsiedzi == statek
            square -> x i y
            sąsiedzi -> square[x-1][y-1]
            return false

        return true
        */
        return true;
    }

    public List<Ship> getListOfShips() {
        return this.listOfSips;
    }

}
