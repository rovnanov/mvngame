package my.lrnup.game.mvngame.logic;

public class Game {
    public boolean isGreen;

    public Game(boolean isGreen){
        this.isGreen = isGreen;
    }

    public boolean isGreen() {
        return isGreen;
    }

    public void setGreen(boolean green) {
        isGreen = green;
    }
    boolean isFailed(int speed) {
        if (!isGreen && speed > 0) {
            return true;
        }
        return false;
    }
}