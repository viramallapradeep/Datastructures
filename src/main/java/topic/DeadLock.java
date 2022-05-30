package topic;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

class Gen<T>{

    public  T[]  name;

    public T[] getName() {
        return name;
    }

    public void setName(T[] name) {
        this.name = name;
    }

    public <E>T test(E  e){

        if(e instanceof List<?>){
            List<String> list = (List<String>) e;
            return (T) list;
        }else if(e instanceof String){
            String st = (String) e;
            return (T) st;
        }
        return null;
     }


}



class  task extends Thread{

     static  int count = 0;

    public  void run(){
        for (int i = 1; i < 10; i++) {
            System.out.println(i*2);
        }
//        System.out.println(count);
    }

}

class  task2 extends Thread{


    public  void run(){
        for (int i = 1; i < 10; i++) {
            System.out.println(i*2);
        }
//        System.out.println(count);
    }

}

public class DeadLock {

    public static void main(String[] args) throws InterruptedException {
        task k = new task();
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        t1.start();
        t2.start();

        System.out.println(k.count);

        ExecutorService expoo = Executors.newFixedThreadPool(20);

    }



   static int  test(){
        try {
                int f = 34 / 0;
        } catch (Exception e) {
            System.out.println("----5----");
            System.exit(0);
            return 5;
        }finally {
            System.out.println("---8---");
            return 8;
        }

//        return 1;

    }

  static void  quick(int a[],int low,int high) {

        if(low<high) {

            int div = partion(a,low,high);
            quick(a,low,div-1);
            quick(a,div+1,high);

        }
   }

    static int partion(int a[],int low,int high){

        int pivot = a[low];

        int lb = low;
        int hb = high;

        while(lb<hb) {

            while (lb <= high && a[lb] >= pivot)
                lb++;

            while (hb >= low && a[hb] < pivot)
                hb--;

            if (lb < hb) {
                int temp = a[lb];
                a[lb] = a[hb];
                a[hb] = temp;
            }
        }

        int temp = a[low];
        a[low] = a[hb];
        a[hb] = temp;

    return hb;

        }
    }
