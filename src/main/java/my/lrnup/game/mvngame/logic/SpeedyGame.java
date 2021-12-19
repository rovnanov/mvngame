package my.lrnup.game.mvngame.logic;

public class SpeedyGame extends Game {
    public int maxSpeed;
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public SpeedyGame(boolean isGreen, int maxSpeed) {
        super(isGreen);
        this.maxSpeed = maxSpeed;
    }

    @Override
    boolean isFailed(int speed) {
        if(!isGreen){
            return speed > maxSpeed;
        }
        return false;
    }
}
