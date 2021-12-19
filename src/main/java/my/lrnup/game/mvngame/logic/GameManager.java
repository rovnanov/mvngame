package my.lrnup.game.mvngame.logic;

public class GameManager {
    private Game game;

    public GameManager(Game game) {
        this.game = game;
    }

    public int roundSurvived(int[] speeds) {
        int count = 0;
        for (int i = 0; i < speeds.length; i++) {
            if (!game.isGreen) {
                if (speeds[i] > 0) {
                    count = count + 1;
                } else count = count;
            } else count = speeds.length;
        }
        return count;
    }

    public int loser(Movable p1, Movable p2, Game game, int rounds) {
        for (int i = 0; i < rounds; i++) {
            if (!game.isGreen) {
                if (game.isFailed(p1.getSpeed())) {
                    return -1;
                }
                if (game.isFailed(p2.getSpeed())) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
