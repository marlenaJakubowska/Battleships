package com.codecool.battleships;

public class Player {
    private int player;
    private boolean human;  // jeśli is true to scaner do statku, a jak false to if/else i radnomowo ustawi

    public Player(int player) {
        this.player = player;
    }

	public int getPlayerNumber() {
        return this.player;
    }

    public void setPlayerNumber(int player) {
        this.player = player;
    }
    
    public void isHuman() {
        this.human = true;
    }
}
