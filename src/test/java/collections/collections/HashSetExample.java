package collections.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String[] args) {

        //insertion order is not preserved / duplicate values are not allowed in set
        HashSet set = new HashSet();
        set.add("fouad");
        set.add("fou");
        set.add("foud");
        set.add("fouad");
        set.add("fouad");

        System.out.println(set);
        System.out.println(set.size());

        Iterator itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
