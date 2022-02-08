package com.example.tiktaktoe;

public class Square {
    private Player player = null;

    public void fill(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public boolean isFilled() {
        return player != null;
    }

}
