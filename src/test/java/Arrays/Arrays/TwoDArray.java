package Arrays.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int [][] arr = new int [2][];
        arr[0] = new int [3];
        arr[1]= new int [10];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*1000);
                System.out.println(arr[i][j]);
            }

    }
}
}
