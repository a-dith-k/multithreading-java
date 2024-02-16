package threadinterface;

public class MultithreadingApplication {

    public static void main(String [] args){


        Hi obj1=new Hi();
        Hello obj2=new Hello();

        Thread thread1=new Thread(obj1);
        Thread thread2=new Thread(obj2);

        thread1.start();
        thread2.start();

    }
}

class Hi  implements Runnable{
    public void run(){
        int i=0;
        while(i<5){
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }

}

class Hello implements Runnable{

    public void run(){
        int i=0;
        while(i<5){
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }

}
