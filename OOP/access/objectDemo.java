package access;

public class objectDemo {

    int num;

    public objectDemo(int num){
        this.num = num;
    }

    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main() {
        objectDemo obj = new objectDemo(35);
        System.out.println(obj.hashCode());
    }
}
