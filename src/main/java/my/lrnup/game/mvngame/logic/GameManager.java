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

    public int roundSurvived(int[] speeds){
        int count = 0;
        for(int i = 0; i < speeds.length; i++){
            if(!isGreen){
                if(speeds[i] <= maxSpeed){
                    count = count + 1;
                }
            } else count = speeds.length;
        }
        return count;
    }

}
