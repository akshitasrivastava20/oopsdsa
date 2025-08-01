package staticexample;

import packages.message;

class insan{
    String name;
    int age;
     static  long population;
    insan(String name,int age){
        this.name=name;
        this.age=age;
        insan.population+=1;
    }
}
public class human {
    public static void main(String[] args) {
      insan bhunnu=new insan("akshuuu",18); 
      System.out.println(bhunnu.name); 
      System.out.println(insan.population);
      human obj=new human();
      obj.message();
    }

    void message(){
        System.out.println("hello ");
    }
}
