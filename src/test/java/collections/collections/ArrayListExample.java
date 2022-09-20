package collections.collections;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        /*
        * Array --> store multiple values
        * drawbacks of array:
        *
        * 1- Fixed in length
        * 2- Array can contain similar type of elements only
        *
        * */
        //int [] arr = new int[5];
        ArrayList list = new ArrayList();


        // how to insert values into arraylist
        list.add(10);
        list.add(10.34);
        list.add("Java");
        list.add(true);
        list.add('a');
        list.add(null);


        //print values
//        System.out.println(list);

        //how to fetch values available in an arrayList
//        System.out.println(list.get(2));
        for (int i =0; i < list.size();i++){
            System.out.println(list.get(i));
        }

        //how to get size of the arraylist
//        System.out.println(list.size());
    }
}
