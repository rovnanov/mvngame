package my.lrnup.game.mvngame.logic;

public class GameManager {
    private Game game;
    public GameManager(Game game){
        this.game = game;
    }

    public int roundSurvived(int[] speeds){
        int count = 0;
        for(int i = 0; i < speeds.length; i++){
            if(!game.isGreen){
                if(speeds[i] > 0){
                    count = count +1;
                } else count = count;
            } else count = speeds.length;
        }
        return count;
    }
}
