package interfaces;

public class PetrolEngine implements engine{

    @Override
    public void start() {
        System.out.println("Petrol Engine started");
    }

    @Override
    public void stop() {
        System.out.println("Petrol Engine stopped");
    }

    @Override
    public void acc() {
        System.out.println("Petrol Engine accelerated");
    }

}
