package exceptionHandling.exceptionHandling;

public class HandlingException {

    public static void main(String[] args) {


        try {
            MyException.show(8);
            System.out.println(4/0);

        }
        catch (MyException e){
            System.out.println("First Block");
            e.printStackTrace();
        }
        catch (ArithmeticException ex){
            System.out.println("Second Block");
            ex.printStackTrace();
        }


    }
}
