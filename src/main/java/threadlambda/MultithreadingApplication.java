package threadlambda;

public class MultithreadingApplication {

    public static void main(String [] args){


        Runnable obj1=()-> {

            for(int i=0; i<5; i++){
                    System.out.println("Hi");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            };

        Runnable obj2=()->{
            for(int i=0; i<5; i++){
                System.out.println("Hello");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        };

        Thread thread1=new Thread(obj1);
        Thread thread2=new Thread(obj2);

        thread1.start();
        thread2.start();

    }
}




