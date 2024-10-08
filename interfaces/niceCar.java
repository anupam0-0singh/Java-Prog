package interfaces;

public class niceCar {
    private engine engine;
    private media player = new CDplayer();
    
    public niceCar(){
        engine = new DieselEngine();
    }
    public niceCar(){
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }
    public void upgradeEngine(){
        this.engine = new PetrolEngine();
    }
}
