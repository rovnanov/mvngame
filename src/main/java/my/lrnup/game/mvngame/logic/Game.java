package my.lrnup.game.mvngame.logic;

public class Game {
    public boolean isGreen;

    public boolean isGreen() {
        return isGreen;
    }

    public void setGreen(boolean green) {
        isGreen = green;
    }

    boolean isFailed(int speed){
        if(!isGreen){
            return false;
        }
        return true;
    }
}