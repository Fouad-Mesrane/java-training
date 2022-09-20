package Arrays.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int [] array = new int [10];
        for (int i = 0; i< array.length; i++){
            int random = ((int)(Math.random() * 100));
            array[i]= random;
            System.out.println(array[i]);
        }
        System.out.println("Array length is : " + array.length);
        ABC a = new ABC();
        a.add(10,20);

        }







    }

