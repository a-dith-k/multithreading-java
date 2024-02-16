package sychronizedkeyword;

//here without synchronized keyword two threads can access the method
// at the same time which results in corruption of count value
// because at a certain point both the threads will have same count value

class Counter{

    int count=0;

    //when the synchronized keyword is used
    // at a time one thread is allowed to access the method
    // and hence the data consistency is maintained
    public synchronized void increment(){
        count++;
    }
}
public class ThreadSafe {



    public static void main(String[] args) throws InterruptedException {
        Counter counter=new Counter();

        Thread thread1=new Thread(()->{
            for(int i=0; i<1000; i++){
                counter.increment();
            }
        });

        Thread thread2=new Thread(()->{
            for(int i=0; i<1000; i++){
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();
        //join() is used for main thread to wait until other threads to finish their execution
        thread1.join();
        thread2.join();
        System.out.println(counter.count);
    }
}
