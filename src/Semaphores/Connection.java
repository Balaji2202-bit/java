package Semaphores;

import java.util.concurrent.Semaphore;

public class Connection
{
    private static Connection instance=new Connection();
    private int connections=0;
    Semaphore semaphores=new Semaphore(10);
    private  Connection()
    {

    }
    public static Connection getInstance()
    {
        return instance;
    }
    public void connect() throws InterruptedException {
        semaphores.acquire();
        synchronized (this)
        {
            connections++;
            System.out.println("Current conection : "+connections);
        }
        Thread.sleep(1000);
        semaphores.release();
        synchronized (this)
        {
            connections--;
        }
    }
}
