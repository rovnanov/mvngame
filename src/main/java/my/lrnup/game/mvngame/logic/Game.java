package my.lrnup.game.mvngame.logic;

public class Game {
    public boolean isGreen;
    public Game(boolean isGreen){
        this.isGreen = isGreen;
    }
    public boolean getIsGreen(){
        return isGreen;
    }
    public void setIsGreen(boolean isGreen){
        this.isGreen = isGreen;
    }

    boolean isFailed(int speed){
        if(!isGreen && speed > 0){
            return true;
        }
        return false;
    }
}