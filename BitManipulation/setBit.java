package BitManipulation;

// Change the value
// Set bit

public class setBit {
    public static void main(String[] args){
        int n = 5;
        int pos = 1;
        int bitMask = pos << 1;

        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}
