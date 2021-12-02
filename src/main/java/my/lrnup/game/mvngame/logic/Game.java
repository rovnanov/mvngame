package my.lrnup.game.mvngame.logic;

public class Game {
    public boolean isGreen;
    public int maxSpeed;

    public boolean getIsGreen() {
        return isGreen;
    }

    public void setIsGreen(boolean isGreen) {
        this.isGreen = isGreen;
    }

    public boolean isFailed(int speed) {
        SpeedyGame speedyGame = new SpeedyGame(false, 10);
        if (!isGreen) {
            if (speed > speedyGame.maxSpeed) return true;
        }
        return false;
    }
    public static void main(String[] args){
        Movable slowPlayer = new ConstantPlayer(10);
        Movable fastPlayer = new FastPlayer(10,5);
        slowPlayer.getSpeed();
        System.out.println();
        fastPlayer.getSpeed();
        fastPlayer.getSpeed();
        fastPlayer.getSpeed();
    }
}