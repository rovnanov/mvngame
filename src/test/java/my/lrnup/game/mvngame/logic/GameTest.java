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
}