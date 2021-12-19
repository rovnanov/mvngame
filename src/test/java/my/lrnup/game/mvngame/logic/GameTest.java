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
        Assertions.assertTrue(game.isFailed(10));
    }
    @Test
    public void gameTestGreenLight(){
        game.setGreen(true);
        Assertions.assertFalse(game.isFailed(10));
    }
    @Test
    public void speedyGameTest(){
        Assertions.assertTrue(speedyGame.isFailed(11));
    }
    @Test
    public void speedyGameTest2(){
        speedyGame.setMaxSpeed(5);
        speedyGame.setGreen(true);
        Assertions.assertFalse(speedyGame.isFailed(10));
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
    @Test
    public void FastPlayertest(){
        Movable player = new FastPlayer(10,5);
        System.out.println(player.getSpeed());
        System.out.println(player.getSpeed());
        System.out.println(player.getSpeed());
        System.out.println(player.getSpeed());
    }
    @Test
    public void loserTestp2Won(){
        Movable p1 = new FastPlayer(1,2);
        Movable p2 = new FastPlayer(1,4);
        Assertions.assertEquals(1,speedyManager.loser(p1,p2,speedyGame,10));
    }
    @Test
    public void loserTestp1Won(){
        Movable p1 = new FastPlayer(1,6);
        Movable p2 = new FastPlayer(1,4);
        Assertions.assertEquals(-1,speedyManager.loser(p1,p2,speedyGame,10));
    }
    @Test
    public void loserTestNobodyWon(){
        Movable p1 = new FastPlayer(1,1);
        Movable p2 = new FastPlayer(1,1);
        Assertions.assertEquals(0,speedyManager.loser(p1,p2,speedyGame,5));
    }
}