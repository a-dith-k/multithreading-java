package joinandisalive;

public class MultithreadingApplication {

    public static void main(String [] args){

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

        System.out.println(thread1.isAlive());//return boolean if thread is alive or not

        try {
            thread1.join();//waits for the thread to die
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //When both threads execution over it joins main thread to print the below statement
        System.out.println("Execution Over");

    }
}




