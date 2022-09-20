package Arrays.Arrays;

public class ThreeDArray {
    public static void main(String[] args) {
        int [][][] array =new int [1][2][3];
        for (int i = 0; i<array.length; i++){
            for (int j = 0; j<array[i].length; j++){
                for (int h = 0; h<array[i][j].length;h++){
                    array[i][j][h]= (int)(Math.random()*1000);
                    System.out.println(array[i][j][h]);
                    System.out.println(array[i][j][h]);
                }
            }

        }


    }
}
