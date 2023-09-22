package Callable_Future;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class App
{
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newCachedThreadPool();
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                Random random=new Random();
                int duration=random.nextInt(4000);
                System.out.println("Started...");
                try {
                    Thread.sleep(duration);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("Finished...");
            }
        });
        executorService.shutdown();
    }
}


