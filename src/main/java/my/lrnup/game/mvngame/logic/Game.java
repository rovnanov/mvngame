package my.lrnup.game.mvngame.logic;

public class Game {
    public boolean isGreen;
    public int speed;

    public boolean getIsGreen() {
        return isGreen;
    }
    public void setIsGreen(boolean isGreen) {
       this.isGreen = isGreen;
    }
    public boolean isFailed(int speed){
        SpeedyGame speedyGame = new SpeedyGame(false,10);
        if(!isGreen){
            if(speed > speedyGame.maxSpeed) return true;
        }
        return false;
    }
}