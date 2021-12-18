package my.lrnup.game.mvngame.logic;

public class Game {
    public boolean isGreen;
    public int speed;

    public boolean isGreen() {
        return isGreen;
    }

    public void setGreen(boolean green) {
        isGreen = green;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    boolean isFailed(int speed){
        if(!isGreen){
            return false;
        }
        return true;
    }
}