public class ThreadDemo
{
    public static void main(String[] args) {

        Thread t=new Thread()
        {
            public void run()
            {
                for(int i=0;i<=5;i++)
                {
                    System.out.println('k');
                }
            }
        };
        Thread t1=new Thread()
        {
            public void run()
            {
                for(int i=17;i<=25;i++)
                {
                    System.out.println(":"+i);
                }
            }
        };
        Thread t2=new Thread()
        {
            public void run()
            {
                for(int i=11;i<=16;i++)
                {
                    System.out.println(i);
                }
            }
        };
        t.start();
        t1.start();
        t2.start();
        t.run();

     /*   Runnable r=new Runnable()
        {
            public void run()
            {
                for(int i=0;i<5;i++)
                {
                    System.out.println(i);
                }
            }
        };
        Thread t=new Thread(r)
        {
            public void run()
            {
                for(int i=0;i<5;i++)
                {
                    System.out.println("Main"+i);
                }
            }
        };
        t.start(); */
    }
}
