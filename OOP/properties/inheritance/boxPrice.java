package properties.inheritance;

public class boxPrice extends boxWeight {
    double price;
    
    boxPrice(){
        super();
        this.price = -1;
    }

    boxPrice(boxPrice other){
        super(other);
        this.price = other.price;
    }

    boxPrice(double side, double weight){
        super(side);
        this.weight = weight;
    }

    boxPrice(double l, double h, double w, double weight, double price){
        super(l, w, h, weight);
        this.price = price;
    }
}
