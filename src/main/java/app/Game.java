package app;

import game.GameInterface;

public class Game {
    public static void main(String[] args) {
        GameInterface gameInterface = new GameInterface();
        gameInterface.startGame();
    }
}
