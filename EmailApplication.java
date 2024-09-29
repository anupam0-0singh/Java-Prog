import java.util.Random;
import java.util.Scanner;

public class EmailApplication {

    private String firstName;
    private String lastName;
    private String department;
    private String email;
    private String password;
    private int mailboxCapacity = 500; 
    private String alternateEmail;
    private final int defaultPasswordLength = 10;
    private final String companySuffix = "company.com";

    
    public EmailApplication() {
        Scanner in = new Scanner(System.in);

        
        System.out.print("Enter your first name: ");
        this.firstName = in.nextLine();

        
        System.out.print("Enter your last name: ");
        this.lastName = in.nextLine();

        
        this.department = setDepartment();

        
        this.email = generateEmail();

        
        this.password = generateRandomPassword(defaultPasswordLength);
    }

    
    private String setDepartment() {
        System.out.print("Enter the department:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) { return "sales"; }
        else if (depChoice == 2) { return "development"; }
        else if (depChoice == 3) { return "accounting"; }
        else { return ""; }
    }

    
    private String generateEmail() {
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + (department.equals("") ? "" : department + ".") + companySuffix;
    }

    
    private String generateRandomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            password[i] = passwordSet.charAt(rand.nextInt(passwordSet.length()));
        }
        return new String(password);
    }

    
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    
    public void changePassword(String password) {
        this.password = password;
    }

    
    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName +
               "\nCOMPANY EMAIL: " + email +
               "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }

    public static void main(String[] args) {
        EmailApplication em1 = new EmailApplication();
        System.out.println(em1.showInfo());
    }
}
