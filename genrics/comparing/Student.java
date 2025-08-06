package genrics.comparing;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno,int marks){
       this.rollno=rollno;
       this.marks=marks;
    }
    @Override
   
    public int compareTo(Student o) {
        int diff=(int) (this.marks-o.marks);
        return diff;

       
    }

    public static void main(String[] args) {
        Student ak=new Student(23, 99);
        Student de=new Student(13, 100);
         if(ak.compareTo(de)<0){
        System.out.println("de is great");
    }
    }

   
}
