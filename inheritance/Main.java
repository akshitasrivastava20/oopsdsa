package inheritance;

public class Main {
    public static void main(String[] args) {
        Box box=new Box(4);
        System.out.println(box.l+" "+box.h+" "+box.w);
        BoxWeight box1 = new BoxWeight(1, 2, 3, 4);
        System.out.println(box1.l + " " + box1.h + " " + box1.w + " " + box1.weight);
    }
}
