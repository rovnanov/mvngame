package my.lrnup.game.mvngame.logic;

public class ConstantPlayer implements Movable {
    int speed;

    public ConstantPlayer(int speed){
        this.speed = speed;
    }
    @Override
    public int getSpeed(){
        return speed;
    }
}
