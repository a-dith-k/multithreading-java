package threadname;

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
        },"Thread-1");

        Thread thread2=new Thread(()->{
            for(int i=0; i<5; i++){
                System.out.println("Hello");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });

        thread1.start();
        thread2.start();

        //useful when working with multiple threads in an application
        thread1.setName("firstThread");
        thread2.setName("secondThread");

        System.out.println(thread1.getName());
        System.out.println(thread2.getName());

    }
}




