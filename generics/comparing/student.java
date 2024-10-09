package generics.comparing;

public class student implements Comparable <student>{
    int roll;
    float marks;

    student(int roll, float marks){
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public int compareTo(student o) {
        int diff = (int)(this.marks - o.marks);

        /*
            If diff == 0 i.e. both are equal
            If diff < 1 i.e. o is bigger else o is smaller
        */

        return diff;
    }
}
