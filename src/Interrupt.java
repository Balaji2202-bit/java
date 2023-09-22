import java.util.Random;

public class Interrupt
{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("started....");
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                Random random=new Random();
                for (int i=0;i<100 ;i++)
                {
                    if(Thread.currentThread().isInterrupted())
                    {
                        System.out.println("interrupted....");
                    }
                    Math.sin(random.nextDouble());
                }
            }
        });
        t1.start();
        Thread.sleep(500);
        t1.interrupt();
        t1.join();
        System.out.println("Finished....");
    }
}
