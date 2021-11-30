package my.lrnup.game.mvngame.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    public void PlayerLoseTest(){
        SpeedyGame speedyGame = new SpeedyGame(false, 10);
        Game game = new Game();
        int speed = 11;

        boolean expected = true;
        boolean actual = game.isFailed(speed);
        Assertions.assertTrue(actual,"Игрок проиграл");
    }
    @Test
    public void PlayerWonTest(){
        SpeedyGame speedyGame = new SpeedyGame(false, 10);
        Game game = new Game();
        int speed = 10;

        boolean expected = false;
        boolean actual = game.isFailed(speed);
        Assertions.assertFalse(actual, "Игрок выйграл");
    }
    @Test
    public void GameManagerPlayerWonTest(){
        int speed = 12;
        GameManager gameManager = new GameManager(false,10);

        boolean expected = true;
        boolean actual = gameManager.isFailed(speed);
        Assertions.assertTrue(actual, "Игрок успешно проиграл в Gamemanager");
    }
    @Test
    public void GameManagerPlayerLoseTest(){
        int speed = 9;
        GameManager gameManager = new GameManager(false,10);

        boolean expected = false;
        boolean actual = gameManager.isFailed(speed);
        Assertions.assertFalse(actual, "Игрок успешно выйграл в Gamemanager");
    }
    @Test
    public void GameManagerRoundSurvivedTest(){
        int[] speeds = {5,6,10,11,15,16};
        GameManager gameManager = new GameManager(false,10);

        int expected = 3;
        int actual = gameManager.roundSurvived(speeds);
        Assertions.assertEquals(expected, actual, "Правильный расчет кол-ва раундов при красном свете");
    }
    @Test
    public void GameManagerRoundSurvivedTest2(){
        int[] speeds = {5,6,10,11,15,16};
        GameManager gameManager = new GameManager(true,10);

        int expected = 6;
        int actual = gameManager.roundSurvived(speeds);
        Assertions.assertEquals(expected, actual, "Правильный расчет кол-ва раундов при зеленом свете");
    }
}