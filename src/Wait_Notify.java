import java.util.Scanner;

public class Wait_Notify
{
    public static void main(String[] args) throws InterruptedException {
        Wait_Notify waitNotify=new Wait_Notify();
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitNotify.produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitNotify.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.start();
        thread1.start();

    }
    public void produce() throws InterruptedException {
        synchronized (this)
        {
            System.out.println("Producer running...");
            wait();
            System.out.println("Resumed...");
        }
    }
    public void consume() throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        Thread.sleep(2000);
        synchronized (this)
        {
            System.out.println("waiting for returning key...");
            sc.nextLine();
            System.out.println("Return key pressed...");
            notify();
            Thread.sleep(5000);
        }
    }
}
