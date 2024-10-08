package abstractDemo;

public class daughter extends Parent{

    public daughter(int age){
        // this.age = age; --> If the parent class constructor is not present then we can use this.
        super(age);
    }

    @Override
    void career (){
        System.out.println("I am going to be an Engineer");
    }
    @Override
    void partner (){
        System.out.println("I love Iron man");
    }
}
