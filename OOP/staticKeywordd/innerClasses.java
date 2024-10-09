package staticKeywordd;



public class innerClasses {

    static class Test{
        String name;
    
        public Test(String name){
            this.name = name;
        }
    }
    
    public static void main(String[] args) {
        Test A = new Test("Anupam");
        Test B = new Test("Rahul");

        System.out.println(A.name);
        System.out.println(B.name);
    }
}
