package my.lrnup.game.mvngame.logic;

public class SpeedyGame extends Game {
    public int maxSpeed;

    public SpeedyGame(boolean isGreen, int maxSpeed) {
        this.isGreen = isGreen;
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int speed){
        this.maxSpeed = maxSpeed;
    }
}
