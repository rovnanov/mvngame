package my.lrnup.game.mvngame.logic;

public class Game {
    public static boolean isGreen;
    public static int maxSpeed;

    public static int outCount(int[] speed) {
        int count = 0;
        for (int i = 0; i < speed.length; i++) {
            if (!isGreen) {
                if (speed[i] > maxSpeed) {
                    count = count + 1;
                }
            }
        }
        return count;

    }

    public static int[] loseArray(int[] speed) {
        int loseNumber = 0;
        for (int i = 0; i < speed.length; i++) {
            if (!isGreen) {
                if (speed[i] > maxSpeed) {
                    loseNumber = loseNumber + 1;
                }
            }
        }

        int[] loseCountArray = new int[loseNumber];
        int o = 0;
        for (int i = 0; i < speed.length; i++) {
            if (!isGreen) {
                if (speed[i] > maxSpeed) {
                    loseCountArray[o] = speed[i];
                    o = o + 1;
                }
            }
        }
        return loseCountArray;
    }

    public static int[] wonArray(int[] speed) {
        int wonNumber = 0;
        for (int i = 0; i < speed.length; i++) {
            if (!isGreen) {
                if (speed[i] <= maxSpeed) {
                    wonNumber = wonNumber + 1;
                }
            } else {
                wonNumber = wonNumber + 1;
            }
        }

        int[] wonCountArray = new int[wonNumber];
        int o = 0;
        for (int i = 0; i < speed.length; i++) {
            if (!isGreen) {
                if (speed[i] <= maxSpeed) {
                    wonCountArray[o] = speed[i];
                    o = o + 1;
                }
            } else {
                wonCountArray[i] = speed[i];
            }
        }
        return wonCountArray;

    }

    public static void main(String[] args) {
        isGreen = true;
        maxSpeed = 10;
        int[] speeds = {0,-11,10,11,50,100};
        int losecount = outCount(speeds);
        int[] lose = loseArray(speeds);
        int[] won = wonArray(speeds);
        System.out.println("Количество выбывших = " + losecount);
        System.out.println();
        System.out.println("Массив из скоростей выбывающих: ");
        for (int i = 0; i < lose.length; i++) {
            System.out.println(lose[i]);
        }
        System.out.println();
        System.out.println("Массив из скоростей не выбывающих: ");
        for (int i = 0; i < won.length; i++) {
            System.out.println(won[i]);
        }


    }
}