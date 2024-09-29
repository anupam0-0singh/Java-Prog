package string;

public class concatination {
    public static void main(String[] args) {
        String fname = "Tony";
        String lname = "Stark";
        String fullName = fname + " " + lname;
        System.out.println(fullName);
        System.out.println(fullName.length());
        
        // To print every character in string
        for(int i = 0; i < fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

        // Compare two strings
        String name1 = "tony";
        String name2 = "tony";

        // s1 > s2 = +ve value
        // s1 = s2 = 0
        // s1 < s2 = -ve value

        if(name1.compareTo(name2) == 0){
            System.out.println("Name 1 and Name 2 are equal");
        }
        else{
            System.out.println("Name 1 and Name 2 are not equal");
        }

        // Substrings
        String sen = "My name is Tony";
        String nam = sen.substring(11, sen.length());
        System.out.println(nam);

    }
    
}
