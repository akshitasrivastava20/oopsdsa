


public class wrapperexample {
  public static void main(String[] args) {
      Integer a=23;
      Integer b=24;
      swap(a,b);
      System.out.println(a+" "+b);

  }

  static void swap(Integer a,Integer b){
    Integer temp=a;
    a=b;
    b=temp;
  }
  //here swapping can't take place even when its pass by refrence becoz integer is a final class



}
