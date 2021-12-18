package my.lrnup.game.mvngame.logic;

public class Game {
    public boolean isGreen;
    public int speed;

    public Game(boolean isGreen, int maxSpeed) {
    }

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

    boolean isFailed(int speed) {
        if (!isGreen) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Movable slowPlayer = new ConstantPlayer(10);
        Movable fastPlayer = new FastPlayer(10, 5);
        slowPlayer.getSpeed();
        System.out.println();
        fastPlayer.getSpeed();
        fastPlayer.getSpeed();
        fastPlayer.getSpeed();
    }
}