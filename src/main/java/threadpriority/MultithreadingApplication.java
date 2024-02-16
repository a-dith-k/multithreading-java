package threadpriority;

public class MultithreadingApplication {

    public static void main(String [] args){

        //Thread class Constructor accepts Runnable and thread name (Runnable target,String name)

        Thread thread1=new Thread(()-> {

            for(int i=0; i<5; i++){
                System.out.println("Hi");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });

        Thread thread2=new Thread(()->{
            for(int i=0; i<5; i++){
                //Thread.currentThread() can be used
                // to access the current thread inside thread
                System.out.println("Hello"+Thread.currentThread());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });

        thread1.start();
        thread2.start();

        //priority ranges between 1 and 10
        thread1.setPriority(1);
        //Thread class provides Constants for thread priority
        // so that it is easy to understand in the future
        thread2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(thread1.getPriority());
        System.out.println(thread2.getPriority());

    }
}




