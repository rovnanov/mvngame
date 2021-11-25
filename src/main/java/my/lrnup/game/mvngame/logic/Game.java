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

    public static String[] nameArray(String[] nameSpeed) {
        int loseNumber = 0;
        for (String line : nameSpeed) {
            String[] parts = line.split(" ");
            int speed = Integer.parseInt(parts[1]);
            if (!isGreen) {
                if (speed <= maxSpeed) {
                    loseNumber = loseNumber + 1;
                }
            }
        }

        String loseNameArray[] = new String[loseNumber];
        int i = 0;
        for (String line1 : nameSpeed) {
            String[] parts1 = line1.split(" ");
            String name1 = parts1[0];
            int speed1 = Integer.parseInt(parts1[1]);
            if (!isGreen) {
                if (speed1 <= maxSpeed) {
                    loseNameArray[i] = name1;
                    i = i + 1;
                }
            }
        }
        return loseNameArray;
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
        isGreen = false;
        maxSpeed = 10;
        String[] nameSpeed = {"Bob 0", "Jack -11", "Tolyan 10", "Mikhalych 11", "Stepa 50", "VTB 100"};
        int[] speeds = {0, -11, 10, 11, 50, 100};
        int losecount = outCount(speeds);
        int[] lose = loseArray(speeds);
        int[] won = wonArray(speeds);
        String[] loseNames = nameArray(nameSpeed);
        System.out.println("Массив имён выбывающих: ");
        for (int i = 0; i < loseNames.length; i++) {
            System.out.println(loseNames[i]);
        }
        System.out.println();
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