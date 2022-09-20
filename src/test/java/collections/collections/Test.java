package collections.collections;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        String [] array = {"fouad", "asmaa", "three", "fouad", "fourth"};

        HashSet<String> set = new HashSet<String>();

        for (int i =0; i< array.length; i++){
           String s = array[i];
           set.add(s);
        }
        System.out.println(set);
        Test t = new Test();
        String s =t.missingChar("Fouad", 4);
        System.out.println(s);

    }

    public  String missingChar(String str, int n){

        StringBuilder build = new StringBuilder(str);
        StringBuilder newBuildStr = build.deleteCharAt(n);
       String newStr = newBuildStr.toString();
       return newStr;
    }
}
