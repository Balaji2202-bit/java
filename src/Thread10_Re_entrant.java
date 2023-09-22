import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Thread10_Re_entrant
{
    private static int count=0;
    private static Lock lock=new ReentrantLock();
    private static Condition cond=lock.newCondition();
    public static void increment()
    {

        for (int i=0;i<10000;i++)
        {
            lock.lock();
            count++;
            lock.unlock();
//            lock.tryLock();
        }
    }
    public static void firstThread() throws InterruptedException {
        lock.lock();
        System.out.println("waiting... ");
        cond.await();
        System.out.println("Woken up!...");
        try
        {
            increment();
        }
        finally {
            lock.unlock();
        }

    }
    public static void secondThread() throws InterruptedException {
        Thread.sleep(100);
        lock.lock();
        System.out.println("press the return key...");
        new Scanner(System.in).nextLine();
        System.out.println("Got return Key!...");
        cond.signal();
        try
        {
            increment();
        }
        finally {
            lock.unlock();
        }
    }
    public static void finished()
    {
        System.out.println("count is : "+count);

    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    firstThread();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
//                finished();
            }
        });
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    secondThread();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
//                finished();//10000 above count
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                finished();  // 10000 below count
            }
        });
        long start=System.currentTimeMillis();
        thread.start();
        thread1.start();
        thread.join();
        thread1.join();
        thread2.start();
        long end=System.currentTimeMillis();
        System.out.println(end-start);


    }
}
