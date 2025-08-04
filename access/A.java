package access;

public class A {
    String name;
    private int num;
    int[] arr;

    A(String name,int num){
        this.name=name;
        this.num=num;
        this.arr=new int[23];
    }

    public int getnum(){
        return num;

    }

    public void setnum(int num){
        this.num=num;
    }
    public static void main(String[] args) {
       A obj=new A("debs", 23) ;
       obj.getnum();
    }
}
