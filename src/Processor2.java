import java.util.Scanner;

public class Processor2 extends Thread
{
    private volatile boolean running=true;
    int n=0;
    public void run()
    {
        while (running)
        {
            System.out.println("Hello "+n++);
            try
            {
                Thread.sleep(100);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    public void shutdown()
    {
        running=false;
    }
}
class app
{
    public static void main(String[] args) {
        Processor2 processor=new Processor2();
        processor.start();
        System.out.println("Press return to stop :");
        Scanner sc=new Scanner(System.in);
        sc.nextLine();
        processor.shutdown();
    }
}
