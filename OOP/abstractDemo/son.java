package abstractDemo;

public class son extends Parent{

    public son(int age){
        // this.age = age; --> If the parent class constructor is not present then we can use this.
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be a Doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Thor");
    }

}
