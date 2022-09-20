package exceptionHandling.exceptionHandling;

public class Test {
    public static void main(String[] args) throws MyException {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        /*try {
            System.out.println(4 / 0);
        }
        catch ()*/


        MyException.show(10);

        System.out.println(5);

    }
}
