package cloning;

public class human implements Cloneable {
    int age;
    String name;

    human(int age,
    String name){
        this.age=age;
        this.name=name;
    }
//cloning
    human(human other){
        this.age=other.age;
        this.name=other.name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String[] args) throws CloneNotSupportedException{
        human akshu=new human(23, "kshita");
        // human deb=new human(akshu);
        human deb=(human)akshu.clone();
    }
}
