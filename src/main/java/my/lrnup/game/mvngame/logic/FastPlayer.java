package my.lrnup.game.mvngame.logic;

public class FastPlayer implements Movable {
    int startSpeed;
    int speedStep;

    public FastPlayer(int startSpeed, int speedStep){
        this.startSpeed = startSpeed;
        this.speedStep = speedStep;
    }

    @Override
    public int getSpeed(){
        int speed = startSpeed;
        startSpeed = speed + speedStep;
        return speed;
    }
}
