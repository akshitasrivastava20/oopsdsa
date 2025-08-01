package staticexample;

public class staticinitialize {
    static int a=4;
    static int b;

    static{
        System.out.println("inside static block");
        b=a*4;
        
    }
    public static void main(String[] args) {
        staticinitialize obj1=new staticinitialize();
        System.out.println(staticinitialize.b);
        staticinitialize obj2=new staticinitialize();
        System.out.println(staticinitialize.b);

    }
}
