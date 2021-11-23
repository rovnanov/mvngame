package my.lrnup.game.mvngame.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void shouldCountOutPlayersWhenLightIsGreen() {
        int[] speed = {0,-11,10,11,50,100};
        Game.isGreen = true;
        Game.maxSpeed = 10;


        int expected = 0;
        int actual = Game.outCount(speed);

        Assertions.assertEquals(expected,actual, "Метод outCount работает корректно при зеленом свете");
    }
    @Test
    public void shouldCountOutPlayersWhenLightIsNotGreen() {
        int[] speed = {0,-11,10,11,50,100};
        Game.isGreen = false;
        Game.maxSpeed = 10;


        int expected = 3;
        int actual = Game.outCount(speed);

        Assertions.assertEquals(expected,actual, "Метод outCount работает корректно при красном свете");
    }
    @Test
    public void shouldCalcLoseArrayWhenLightIsGreen() {
        int[] speed = {0,-11,10,11,50,100};
        Game.isGreen = true;
        Game.maxSpeed = 10;


        int[] expected = {};
        int[] actual = Game.loseArray(speed);

        Assertions.assertArrayEquals(expected,actual, "Метод loseArray работает корректно при зеленом свете");
    }
    @Test
    public void shouldCalcLoseArrayWhenLightIsNotGreen() {
        int[] speed = {0,-11,10,11,50,100};
        Game.isGreen = false;
        Game.maxSpeed = 10;


        int[] expected = {11,50,100};
        int[] actual = Game.loseArray(speed);

        Assertions.assertArrayEquals(expected,actual, "Метод loseArray работает корректно при красном свете");
    }
    @Test
    public void shouldCalcWonArrayWhenLightIsGreen() {
        int[] speed = {0,-11,10,11,50,100};
        Game.isGreen = true;
        Game.maxSpeed = 10;


        int[] expected = {0,-11,10,11,50,100};
        int[] actual = Game.wonArray(speed);

        Assertions.assertArrayEquals(expected,actual, "Метод wonArray работает корректно при зеленом свете");
    }
    @Test
    public void shouldCalcWonArrayWhenLightIsNotGreen() {
        int[] speed = {0,-11,10,11,50,100};
        Game.isGreen = false;
        Game.maxSpeed = 10;


        int[] expected = {0,-11,10};
        int[] actual = Game.wonArray(speed);

        Assertions.assertArrayEquals(expected,actual, "Метод wonArray работает корректно при красном свете");
    }
    @Test
    public void nameArrayWorksWithGreenLight() {
        String[] speed = {"Собака 10","Кошка 0"};
        Game.isGreen = true;
        Game.maxSpeed = 10;

        String[] expected = {};
        String[] actual = Game.nameArray(speed);
        Assertions.assertArrayEquals(expected,actual, "Метод nameArray работает корректно при зеленом свете");

    }
    @Test
    public void nameArrayWorksWithRedLight() {
        String[] speed = {"Собака 11","Кошка 0"};
        Game.isGreen = false;
        Game.maxSpeed = 10;

        String[] expected = {"Кошка"};
        String[] actual = Game.nameArray(speed);
        Assertions.assertArrayEquals(expected,actual, "Метод nameArray работает корректно при красном свете");

    }

}
