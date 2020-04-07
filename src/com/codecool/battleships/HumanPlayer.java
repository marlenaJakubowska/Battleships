package com.codecool.battleships;

public class HumanPlayer extends Player {

    private String playerName;

    public HumanPlayer(int player, String name) {
        super(player);
        this.playerName = name;
        }

	public String getPlayerName() {
        return this.playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;

    }
}
