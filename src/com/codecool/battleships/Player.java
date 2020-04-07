package com.codecool.battleships;

public class Player {
    private int player;
    private boolean human;

    public Player(int player) {
        this.player = player;
    }
    public void isHuman() {
        this.human = true;
    }
}
