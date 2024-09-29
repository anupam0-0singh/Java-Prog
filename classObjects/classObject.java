package classObjects;

public class classObject{
    public static void main(String args[]){

        Student student1 = new Student();

        Student student2 = new Student();
        
        // student1.rollno = 1;
        // student1.name = "Kunal";
        // student1.marks = 87.9f;
        
        System.out.println(student1.rollno);
        System.out.println(student1.name);
        System.out.println(student1.marks);

        System.out.println("");

        System.out.println(student2.rollno);
        System.out.println(student2.name);
        System.out.println(student2.marks);

        System.out.println("");

        student1.greeting();

        System.out.println("");

        student1.changeName("Dog Lover");
        student1.greeting();

        System.out.println("");

        Student student3 = new Student(2, "Aks", 89.8f);
        System.out.println(student3.rollno);
        System.out.println(student3.name);
        System.out.println(student3.marks);

        System.out.println("");

        Student student4 = new Student(student2);
        System.out.println(student4.name);

        Student student5 = new Student();
        System.out.println(student5.name);
    }
}

class Student{
    int rollno;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello my name is " + this.name);
    }

    void changeName(String newName){
        name = newName;
    }

    // We need a way to add the values of the above properties object by object

    // We need one word to access every object

    // this keyword replaces the created object i.e. student1, student2

    Student(){
        // this.rollno = 1;
        // this.name = "Anupam";
        // this.marks = 87.9f;

        //This is how we call a constructor from another constructor
        //Internally it works like : new Student(5, "Anupam", 86.44f);

        this(5, "Anupam", 86.44f);
    }
    
    Student(int rollno, String name, float marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other){
        this.name = other.name;
        this.rollno = other.rollno;
        this.marks = other.marks;
    }

}