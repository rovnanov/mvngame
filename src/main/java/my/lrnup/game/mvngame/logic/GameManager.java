package my.lrnup.game.mvngame.logic;

public class GameManager extends SpeedyGame {

    public GameManager(boolean isGreen, int maxSpeed) {
        super(isGreen, maxSpeed);
    }

    @Override
    public boolean isFailed(int speed) {
        SpeedyGame speedyGame = new SpeedyGame(false, 10);
        if (!isGreen) {
            if (speed > speedyGame.maxSpeed) return true;
        }
        return false;
    }

    public int roundSurvived(int[] speeds) {
        int count = 0;
        for (int i = 0; i < speeds.length; i++) {
            if (!isGreen) {
                if (speeds[i] <= maxSpeed) {
                    count = count + 1;
                }
            } else count = speeds.length;
        }
        return count;
    }

    public int loser(Movable p1, Movable p2, Game game, int rounds) {
        int status = 0;

        for (int i = 0; i < rounds; i++) {
            p1.getSpeed();
            p2.getSpeed();
            if (!isGreen) {
                if (p1.currentSpeed() > maxSpeed) {
                    status = -1;
                    break;
                }
                if (p2.currentSpeed() > maxSpeed) {
                    status = 1;
                    break;
                }
            }
        }
        return status;
    }
}