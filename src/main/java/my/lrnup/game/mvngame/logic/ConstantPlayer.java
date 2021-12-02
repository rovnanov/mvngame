package my.lrnup.game.mvngame.logic;

public class ConstantPlayer implements Movable {
    protected int speed;
    @Override
    public void getSpeed() {
        System.out.println(speed);
    }

    @Override
    public int currentSpeed() {
        return 0;
    }

    public ConstantPlayer(int speed) {
        this.speed = speed;
    }
}

