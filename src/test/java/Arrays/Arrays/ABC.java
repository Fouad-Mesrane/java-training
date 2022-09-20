package Arrays.Arrays;

public class ABC {
    public static void main(String[] args) {
        ABC [] array = new ABC[5];
        for (int i = 0; i < array.length; i++){
            array[i]= new ABC();
            System.out.println(array[i]);
        }
        array[0].add(10,20);
    }

    public void add(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }
}
