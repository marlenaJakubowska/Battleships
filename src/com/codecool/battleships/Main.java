package com.codecool.battleships;

public class Main {
    
    public static void main(String[] args) {
//        UI userInterface = new UI();
//        userInterface.start();

        PlayerTest player = new PlayerTest();
        Tools.createHashMaps();
        player.createPlayerBoard();
    }
}
