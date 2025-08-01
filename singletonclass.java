class singleton{
    private static singleton instance;
    private singleton(){

    }
    public  static singleton getInstance(){
        if(instance==null){
            instance=new singleton();
        }
        return instance;
    }
}


public class singletonclass {
    public static void main(String[] args) {
        singleton obj1=singleton.getInstance();
        
    }
}
