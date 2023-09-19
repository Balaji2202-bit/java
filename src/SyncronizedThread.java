public class SyncronizedThread
{
    private int count=0;
    public synchronized void increament()
    {
        count++;
    }
    public static void main(String[] args)  {
        SyncronizedThread t1=new SyncronizedThread();
        try {
            t1.doWork();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void doWork() throws InterruptedException {
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10000;i++)
                {
                    //atomic operation
//                    count++;
                    increament();
                }
            }
        });
        Thread t3= new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10000;i++)
                {
//                    count++;
                    increament();
                }
            }
        });
        t2.start();
        t3.start();
        try
        {
            t2.join(10000);
            t3.join(10000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Count is :"+count);
    }
}
