package arrayList;

import java.util.*;

public class listEx {
    public static void main(String args[]){
        Student s1 = new Student(101, "Abhi", 25);
        Student s2 = new Student(102, "Yuvi", 26);
        Student s3 = new Student(103, "Kumar", 27);
        
        ArrayList <Student> list = new ArrayList<Student>();
        
        list.add(s1);
        list.add(s2);
        list.add(s3);

        Iterator itr=list.iterator();  
        while(itr.hasNext()){  
            Student st=(Student)itr.next();  
            System.out.println(st.roll+" "+st.name+" "+st.age);  
          }  
    }
}
class Student{
    int roll;
    String name;
    int age;

    Student(int roll, String name, int age){
        this.roll = roll;
        this.name = name;
        this.age = age;
    }
}