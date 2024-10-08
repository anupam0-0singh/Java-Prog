package interfaces;

public class car implements engine, brake{
    @Override
    public void start(){
        System.out.println("I starts like a normal car");
    }
    @Override
    public void stop(){
        System.out.println("I stops like a normal car");
    }
    @Override
    public void acc(){
        System.out.println("I accelerates like a normal car");
    }
    @Override
    public void brake(){
        System.out.println("I brakes like a normal car");
    }
}
