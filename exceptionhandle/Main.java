package exceptionhandle;
import exceptionhandle.MyException;
public class Main {
    public static void main(String[] args) {
        
      try {

        String name="akshita";
        if(name=="akshita"){
            throw new MyException("mera naam h yeh");
        }
        //   divide(5,0);
      } catch (ArithmeticException e) {
        System.out.println(e.getMessage());
      }
      finally{
        System.out.println("done");
      }
    }

    static int divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("do not divide by zero")
        }
        return a/b;
    }
}
