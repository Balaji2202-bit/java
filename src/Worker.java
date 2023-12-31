import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker
{
    private static Random random=new Random();
    private static List<Integer> list1=new ArrayList<>();
    private static List<Integer> list2=new ArrayList<>();
    private static Object lock1=new Object();
    private static Object lock2=new Object();
    public static void stageOne()
    {
        //it execute less time complexity
        synchronized (lock1)
        {
            try
            {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }
    }
    public static  void stageTwo()
    {
        synchronized (lock2)
        {

            try
            {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }
    }
    public static void process()
    {
        for (int i=0;i<1000;i++)
        {
            stageOne();
            stageTwo();
        }
    }

    public static void main(String[] arg) throws InterruptedException {
        System.out.println("Started......");
        long start=System.currentTimeMillis();
        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
        });

        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        long end=System.currentTimeMillis();
        System.out.println("Time Taken :"+(end-start));
        System.out.println("List1 : "+list1.size()+"  List2 : "+list2.size());
    }
}
