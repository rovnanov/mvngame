package my.lrnup.game.mvngame.logic;

public class FastPlayer implements Movable{
    protected int speed;
    protected int step;
    protected int currentSpeed;
    @Override
    public void getSpeed() {
        System.out.println(speed);
        speed = speed + step;
        currentSpeed = speed;
    }

    @Override
    public int currentSpeed() {
        return currentSpeed;
    }

    public FastPlayer(int startSpeed, int speedStep){
        this.speed = startSpeed;
        this.step = speedStep;
    }
}
