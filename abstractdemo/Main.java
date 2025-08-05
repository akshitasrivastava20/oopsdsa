package abstractdemo;

public class Main {
    public static void main(String[] args) {
        child son=new child(23);
        son.career("engineer");
        System.out.println(son.age);
       
    }
}
//abstract classes may contain normal methods,static methods
// not contain abstrat constructors,cannont create object of abstract class
