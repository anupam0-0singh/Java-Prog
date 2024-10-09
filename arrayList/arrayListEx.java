package arrayList;

import java.util.*;

public class arrayListEx {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();

        list.add("Hello");
        list.add("I");
        list.add("am");
        list.add("ArrayList");

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println(list);

    }
}