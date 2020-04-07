package com.codecool.battleships;

public class ComputerPlayer extends Player {

    private int difficultyLevel;

    public ComputerPlayer(int player, int difficultyLevel) {
        super(player);
        this.difficultyLevel = difficultyLevel;
    }
}
