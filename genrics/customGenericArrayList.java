
package genrics;

import java.util.ArrayList;
import java.util.Arrays;

public class customGenericArrayList <T>{
    private Object[] data;
    private static int default_size=10;
    private int size=0;

    customGenericArrayList(){
        this.data=new Object[default_size];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private boolean isFull(){
        return size==data.length;
    }
    
    private void resize(){
        Object[] temp=new Object[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
            
        }
        data=temp;
    }

    public T remove(){
        T removed=(T)data[--size];
        return removed;
    }

    public T get(int index){
        return (T)[size];

    }

    public int size(){
        return size;
    }

    public void set(int index,T val){
        data[index]=val;
    }

    public String toString(){
        return "CustomArraylist{"+"data="+Arrays.toString(data)+",size="+size+'}';
    }

    public static void main(String[] args) {
        customArrayList list=new customArrayList();
        list.add(23);
        list.add(45);
        list.add(67);

        System.out.println(list);
        list.remove();

        customGenericArrayList<Integer> list2=new customGenericArrayList<>();
        list2.add(34);
        list2.add(34);
    }
}
