package properties.polymorphism;

public class objectPrint {
    int num;

    objectPrint(int num){
        this.num = num;
    }

    @Override
    public String toString(){
        return "ObjectPrint " + num ;
    }

    public static void main(String args[]){
        objectPrint obj = new objectPrint(25);
        System.out.println(obj);
    }
}
