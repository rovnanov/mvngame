package my.lrnup.game.mvngame.logic;

public class Settings {
    public boolean isGreen;
    public int maxSpeed;

    public Settings(boolean isGreen, int maxSpeed) {
        this.isGreen = isGreen;
        this.maxSpeed = maxSpeed;
    }

    public int outCount(int[] speed) {
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

    public String[] nameArray(String[] nameSpeed) {
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


    public int[] loseArray(int[] speed) {
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

    public int[] wonArray(int[] speed) {
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
}



