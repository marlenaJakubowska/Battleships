package com.codecool.battleships;

public class ComputerPlayer extends Player {

    private int difficultyLevel;
    private String name;

    public ComputerPlayer(int player, String name) {
        super(player);
        this.name = name;
    }

	public int getDifficultyLevel() {
        return this.difficultyLevel;
    }

    public void setPlayerName(String name) {
        this.name = "Bot";
    }
}
