package constructorExample.constructorExample;

public class Parent {
    int i = 100;

   /* public Parent (){
        this(12);
        System.out.println("Parent class no-arg constructor");
    }*/
    public Parent (String text){
        System.out.println(text);
    }

    public void add(){
        System.out.println("add() of parent class");
    }

}
