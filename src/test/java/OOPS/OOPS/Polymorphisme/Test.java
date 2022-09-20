package OOPS.OOPS.Polymorphisme;

public class Test {
    /*
    * 2 Types of poly:-
    * 1- Overloading / Compile Time Poly / Early Binding / Static Binding
    * 2- Overriding / RunTime Poly / Late Binding / Dynamic Binding
    *
    * Overloading : In a class if we have a methods with same name but different
    *  method signature is known as method overloading
    *
    *
    * Method signature:- is a combination of method and the parameters
    *
    * */
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.add(12,34,32, 12,34,556,8);
    }


    public void add(int a, int b){
        int sum = a + b ;
        System.out.println("add with 2 parameters is being called :  Sum --> " + sum);
    }

    public void add(int a, int b, int c){
        int sum = a + b + c;
        System.out.println("add with 3 parameters is being called : /n Sum --> " + sum);
    }
    public void add(int... var){
        int sum = 0;
        for (int i =0; i < var.length; i++){
            sum = sum + var[i];
        }
        System.out.println(sum);
    }



}
