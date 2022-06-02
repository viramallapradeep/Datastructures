package topic;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {


    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        Runnable prod = ()->{
            for (int i = 0; i < 20; i++) {
                try {
                    queue.put(i);
                    System.out.println("produced = "+i);
                }catch (InterruptedException exe){
                    System.out.println(exe);
                }
            }
        };

        Runnable cons = ()->{
            int take =0;
            while(take!=19){
                try {
                    Thread.sleep(2434);
                     take = queue.take();
                    System.out.println("consumed = "+take);
                }catch (InterruptedException exe){
                    System.out.println(exe);
                }
            }
        };

        Thread t1 = new Thread(prod);
        Thread t2 = new Thread(cons);
        t1.start();
        t2.start();

    }

}
