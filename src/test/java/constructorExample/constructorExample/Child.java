package constructorExample.constructorExample;

public class Child extends Parent{

    int i = 50;

    public Child (String text){
        // parent class constructor will be called automatically first
        super(text);
        System.out.println(text);
    }


    public static void main(String[] args) {
        Child c = new Child("Guru");

    }




    public void add(){
        System.out.println("add() of child class" );
        // add() of parent class
        super.add();
        // print value i of child class
        System.out.println(i);
        // print value i of parent class
        System.out.println(super.i);
    }
}
