package genrics;

import java.util.ArrayList;
import java.util.Arrays;

public class customArrayList {
    private int[] data;
    private static int default_size=10;
    private int size=0;

    customArrayList(){
        this.data=new int[default_size];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private boolean isFull(){
        return size==data.length;
    }
    
    private void resize(){
        int[] temp=new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
            
        }
        data=temp;
    }

    public int remove(){
        int removed=data[--size];
        return removed;
    }

    public int get(int index){
        return data[size];

    }

    public int size(){
        return size;
    }

    public void set(int index,int val){
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
    }
}
