import javax.annotation.processing.Processor;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatch1 implements Runnable
{
    private CountDownLatch latch;
    public CountDownLatch1(CountDownLatch latch)
    {
        this.latch=latch;
    }
    public void run() {
        System.out.println("Started....");
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        latch.countDown();
    }
}
class app3
{
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch=new CountDownLatch(3);
        ExecutorService executor= Executors.newFixedThreadPool(3);
        for (int i=0;i<6;i++)
        {
            executor.submit(new CountDownLatch1(latch));
        }
        latch.await();
        System.out.println("Completed...");
    }
}