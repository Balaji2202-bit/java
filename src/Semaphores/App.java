package Semaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class App
{
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore=new Semaphore(2);
        semaphore.release();
        semaphore.acquire();
        System.out.println("Available permits : "+semaphore.availablePermits());

        ExecutorService executor= Executors.newCachedThreadPool();
        for (int i=0;i<200;i++)
        {
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Connection.getInstance().connect();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);
    }
}
