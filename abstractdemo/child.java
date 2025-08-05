package abstractdemo;

public class child extends parent{
    child(int age){
        super(age);
    }
    @Override
    void career(String name){
        System.out.println("my career my choice" + name);
    }
}
