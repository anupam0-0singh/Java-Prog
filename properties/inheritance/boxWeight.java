package properties.inheritance;

public class boxWeight extends box{
    double weight;

    boxWeight(){
        this.weight = -1;
    }

    boxWeight(double l, double h, double w, double weight){
        super(l, h, w); // It says call the parent class constructor. Used to initialized the value used in parent class.
        this.weight = weight;
    }
    
    boxWeight(double side){
        super(side);
    }

    boxWeight(boxWeight other){
        super(other);
        this.weight = other.weight;
    }
}
