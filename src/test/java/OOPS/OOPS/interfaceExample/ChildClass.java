package OOPS.OOPS.interfaceExample;

public class ChildClass implements Parent1,Parent2 {



    public void p1(){
        System.out.println("p1() of child class got executed");
    }

    public static void main(String[] args) {
        ChildClass c = new ChildClass();
        c.p1();
    }
}
