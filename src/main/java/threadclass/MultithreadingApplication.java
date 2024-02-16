package threadclass;

public class MultithreadingApplication {

    public static void main(String [] args){






        Hi obj1=new Hi();
        Hello obj2=new Hello();

        obj1.start();
        obj2.start();

//        obj1.show();
//        obj2.show();
    }
}

class Hi extends Thread{
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

class Hello extends Thread{

    public void run(){
        int i=0;
        while(i<5){
            System.out.println("Hello :"+Thread.currentThread().getPriority());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }

}
