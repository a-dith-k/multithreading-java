package threadlambda.better;

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



    }
}




