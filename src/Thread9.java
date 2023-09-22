import java.util.Collection;
import java.util.LinkedList;

public class Thread9
{
    private static LinkedList<Integer> list=new LinkedList<>();
    private static final int LIMIT=10;
    private static Object lock=new Object();
    public static void produce() throws InterruptedException {
        int value=0;
        while(true)
        {
            synchronized (lock)
            {
                while (list.size()==LIMIT)
                {
                    lock.wait();
                }
                list.add(value++);
                lock.notify();
            }

        }
    }
    public static void consume() throws InterruptedException {
        while(true)
        {
            synchronized (lock) {
//                Thread.sleep(1000);
                while (list.size() == 0) {
                    lock.wait();

                }

                System.out.println("List size is : " + list.size());
                int value = list.removeFirst();
                System.out.println("value is : " + value);
                lock.notify();
                if(value==1000){
                    System.exit(0);
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(() -> {
            try {
                produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.start();
        thread1.start();
    }
}
