package my.lrnup.game.mvngame.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    public void GameTest(){
        Game game = new Game(false);
        Game game2 = new Game(true);
        Assertions.assertTrue(game.isFailed(1));
        Assertions.assertFalse(game.isFailed(0));
        Assertions.assertFalse(game2.isFailed(10));
    }
    @Test
    public void PlayerLoseTest(){
        Game speedyGame = new SpeedyGame(false, 10);
        int speed = 11;

        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertTrue(actual,"Игрок проиграл");
    }
    @Test
    public void PlayerWonTest(){
        Game speedyGame = new SpeedyGame(false, 10);
        int speed = 10;

        boolean expected = false;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertFalse(actual, "Игрок выйграл");
    }
}