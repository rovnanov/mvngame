package my.lrnup.game.mvngame.logic;

public class Game {
    public static void main(String[] args) {
        Settings settings = new Settings(false, 10);
        String[] nameSpeed = {"Bob 0", "Jack -11", "Tolyan 10", "Mikhalych 11", "Stepa 50", "VTB 100"};
        int[] speeds = {0, -11, 10, 11, 50, 100};
        System.out.println("Количество выбывших игроков = " + settings.outCount(speeds));
        System.out.println("Массив из имен выбывающих:");
        String[] loseNames = settings.nameArray(nameSpeed);
        for (int i = 0; i < loseNames.length; i++) {
            System.out.println(loseNames[i]);
        }
        System.out.println("Массив из скоростей выбывающих:");
        int[] lose = settings.loseArray(speeds);
        for (int i = 0; i < lose.length; i++) {
            System.out.println(lose[i]);
        }
        System.out.println("Массив из скоростей не выбывающих:");
        int[] won = settings.wonArray(speeds);
        for (int i = 0; i < won.length; i++) {
            System.out.println(won[i]);
        }
    }
}