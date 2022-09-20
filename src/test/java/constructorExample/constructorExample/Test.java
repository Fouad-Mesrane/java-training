package constructorExample.constructorExample;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        t.p1();
        // this keyword cannot be used inside a static method
    }

    public void p1 (){
        this.p2();
        Test.p3();
    }
    public void p2 (){
        System.out.println("p2 ");
    }
    public static void p3 (){

    }

}

