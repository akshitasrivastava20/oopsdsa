package polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape=new Shapes();
       Shapes c=new Circle();
      
        c.area();
    }
}
//final method can't be overridden
//on overriding static methods , parent method always runs cause its class level