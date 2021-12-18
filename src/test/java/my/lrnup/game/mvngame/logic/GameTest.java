package my.lrnup.game.mvngame.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    Game game = new Game(false);
    SpeedyGame speedyGame = new SpeedyGame(false,10);
    GameManager manager = new GameManager(game);
    GameManager speedyManager = new GameManager(speedyGame);

    @Test
    public void gameTest(){
        Assertions.assertFalse(game.isFailed(10));
    }
    @Test
    public void gameTestGreenLight(){
        game.setGreen(true);
        Assertions.assertTrue(game.isFailed(10));
    }
    @Test
    public void speedyGameTest(){
        Assertions.assertTrue(speedyGame.isFailed(11));
    }
    @Test
    public void speedyGameTest2(){
        speedyGame.setMaxSpeed(5);
        speedyGame.setGreen(true);
        Assertions.assertTrue(speedyGame.isFailed(10));
    }
    @Test
    public void managerTest(){
        int[] speeds = new int[]{0,10,0,20};
        int expected = 2;
        int actual = manager.roundSurvived(speeds);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void managerTest2(){
        game.setGreen(true);
        int[] speeds = new int[]{0,10,0,20};
        int expected = 4;
        int actual = manager.roundSurvived(speeds);
        Assertions.assertEquals(expected,actual);
    }
}