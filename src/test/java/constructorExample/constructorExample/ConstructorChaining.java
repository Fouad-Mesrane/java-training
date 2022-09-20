package constructorExample.constructorExample;

public class ConstructorChaining {


    public ConstructorChaining(){
        this (10); // Constructor Calling must be the first statement
    }
    public ConstructorChaining(int i){
        this ("Java");
        System.out.println(i); // this will b called second

    }
    public ConstructorChaining(String s){
        System.out.println(s); // this will be called first
    }

    public static void main(String[] args) {
        ConstructorChaining obj = new ConstructorChaining();

    }

}
