package polymorphism;

public class MethodOverloading {
    int sum(int a,int b){
        return a+b;
 
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        MethodOverloading m=new MethodOverloading();
        m.sum(0, 0);
        m.sum(2, 3, 4);
    }
}
