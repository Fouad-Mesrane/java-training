package collections.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap map = new HashMap();

        // key-value pair
        //duplicate keys are not allowed/ duplicate values are allowed
        map.put("Fouad", 1);
        map.put("asmaa", 100);
        map.put("Third", 110.3);
        map.put("Third", 133);
        map.put(100, "Selenium");
        System.out.println(map.get(1000));

       Set setOfKeys = map.keySet();
        Iterator itr = setOfKeys.iterator();
        while (itr.hasNext()){
            Object key = itr.next();
            System.out.println(" keys: " + key + " Value: "+map.get(key));
        }





    }
}
