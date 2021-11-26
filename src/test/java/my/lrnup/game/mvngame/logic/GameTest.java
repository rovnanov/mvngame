package my.lrnup.game.mvngame.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    public void shouldCountOutPlayersWhenLightIsGreen() {
        Settings settings = new Settings(true, 10);
        int[] speed = {1, 2, 3, 4, 5};

        int expected = 0;
        int actual = settings.outCount(speed);

        Assertions.assertEquals(expected, actual, "Метод outCount работает корректно при зелёном цвете");
    }

    @Test
    public void shouldCountOutPlayersWhenLightIsNotGreen() {
        Settings settings = new Settings(false, 10);
        int[] speed = {0, -11, 10, 11, 50, 100};

        int expected = 3;
        int actual = settings.outCount(speed);

        Assertions.assertEquals(expected, actual, "Метод outCount работает корректно при красном свете");
    }

    @Test
    public void shouldCalcLoseArrayWhenLightIsGreen() {
        Settings settings = new Settings(true, 10);
        int[] speed = {0, -11, 10, 11, 50, 100};

        int[] expected = {};
        int[] actual = settings.loseArray(speed);

        Assertions.assertArrayEquals(expected, actual, "Метод loseArray работает корректно при зеленом свете");
    }

    @Test
    public void shouldCalcLoseArrayWhenLightIsNotGreen() {
        Settings settings = new Settings(false, 10);
        int[] speed = {0, -11, 10, 11, 50, 100};

        int[] expected = {11, 50, 100};
        int[] actual = settings.loseArray(speed);

        Assertions.assertArrayEquals(expected, actual, "Метод loseArray работает корректно при красном свете");
    }

    @Test
    public void shouldCalcWonArrayWhenLightIsGreen() {
        Settings settings = new Settings(true, 10);
        int[] speed = {0, -11, 10, 11, 50, 100};

        int[] expected = {0, -11, 10, 11, 50, 100};
        int[] actual = settings.wonArray(speed);

        Assertions.assertArrayEquals(expected, actual, "Метод wonArray работает корректно при зеленом свете");
    }

    @Test
    public void shouldCalcWonArrayWhenLightIsNotGreen() {
        Settings settings = new Settings(false, 10);
        int[] speed = {0, -11, 10, 11, 50, 100};

        int[] expected = {0, -11, 10};
        int[] actual = settings.wonArray(speed);

        Assertions.assertArrayEquals(expected, actual, "Метод wonArray работает корректно при красном свете");
    }

    @Test
    public void nameArrayWorksWithGreenLight() {
        Settings settings = new Settings(true, 10);
        String[] speed = {"Собака 10", "Кошка 0"};

        String[] expected = {};
        String[] actual = settings.nameArray(speed);
        Assertions.assertArrayEquals(expected, actual, "Метод nameArray работает корректно при зеленом свете");
    }

    @Test
    public void nameArrayWorksWithRedLight() {
        Settings settings = new Settings(false, 10);
        String[] speed = {"Собака 11", "Кошка 0"};

        String[] expected = {"Кошка"};
        String[] actual = settings.nameArray(speed);
        Assertions.assertArrayEquals(expected, actual, "Метод nameArray работает корректно при красном свете");
    }
}
