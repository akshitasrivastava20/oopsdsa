class baccha{
  String name;
    int rollno;

    //function
    void greting(){
        System.out.println("hello"+this.name);
    }
    //constructor=to initialise an object when it is allocated \
    baccha(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    //copy constructor
    baccha(baccha other){
        this.name=other.name;
        this.rollno=other.rollno;
    }
    //calling a constructor from another constructor
    baccha (){
        this("akshita", 23);
    }

 
}


public class student{
    public static void main(String[] args) {
        baccha deb=new baccha("devshakya",23);
        baccha bubu=new baccha(deb);
        baccha dudu=new baccha();


        baccha one=new baccha();
        baccha two=one;

        one.name="heyyy";
        System.out.println(two.name);
        // deb.name="devshakya";
        // deb.rollno=23;
    //   deb.greting();
    //   bubu.greting();
    //   dudu.greting();
    }

}
