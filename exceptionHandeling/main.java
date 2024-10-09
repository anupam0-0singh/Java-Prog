package exceptionHandeling;

public class main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            // divide(a, b);
            String name = "Anupam";
            if (name.equals("Anupam")) {
                throw new myException("Name is Anupam");
            }
        } 
        catch (myException e) {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Normal Exception");
        }
        finally{
            System.out.println("This will always executed");
        }
    }
    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Do not divide with 0");
        }
        return a/b;
    }
}
