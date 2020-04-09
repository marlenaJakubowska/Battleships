package com.codecool.battleships;

import java.util.ArrayList;
import java.util.List;

public class PlayerTest {

    private boolean isHuman;
    private Ocean playerBoard;
    private ArrayList<Ship> listOfSips;


    public Ocean createPlayerBoard() {
        int boardSize = 10;
        ArrayList<Ship> list = new ArrayList<>();
        Ocean board = new Ocean(boardSize);
        boolean doesItFit = true;
        for (String key : Tools.shipTypeAndLength.keySet()) {
            Ship shipToPlace;
            do {
                System.out.println(board.toString());
                System.out.println("Put the " + key + " ship on the board. The ship size is "
                    + Tools.shipTypeAndLength.get(key) + ".");
                if (!doesItFit) {
                    System.out.println("The ships cannot touch each other and must fit the board");
                }
                String shipOrientation = Tools.takeOrientationInput("Type v - vertical, h - horizontal");
                String position = Tools.takePositionInput("Enter position. eg. A9");
                char positionLetter = position.charAt(0);
                int coordinateY = Tools.convertCharacterToNumber(positionLetter);
                int coordinateX = Integer.parseInt(position.substring(1)) -1;
                int length = Tools.shipTypeAndLength.get(key);
                shipToPlace = new Ship(coordinateX, coordinateY, length, shipOrientation, key);
                list.add(shipToPlace);
                doesItFit = board.placeShipOnBoard(shipToPlace);

            } while (!doesItFit);
            this.getListOfShips().add(shipToPlace);
            board.setAreaUnavailable();
        }
        System.out.println(board.toString());
        return board;
    }

    public List<Ship> getListOfShips() {
        return this.listOfSips;
    }

}
