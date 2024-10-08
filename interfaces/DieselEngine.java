package interfaces;

public class DieselEngine implements engine{

    @Override
    public void start() {
        System.out.println("Diesel Engine started");
    }

    @Override
    public void stop() {
        System.out.println("Diesel Engine stopped");
    }

    @Override
    public void acc() {
        System.out.println("Diesel Engine accelerated");
    }

}
