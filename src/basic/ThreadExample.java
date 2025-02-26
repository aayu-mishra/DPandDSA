package basic;


class MyThread2 implements Runnable{

    @Override
    public void run(){
        for(int i=0;i<100;i++) {
            System.out.println("second thread is running");
        }
    }
}
public class ThreadExample implements Runnable{

    int n=50;
    @Override
    public void run() {

        for(int i=1;i<n;i++){

        }
        callMethod();
    }

    private static void callMethod() {
        while(true){
            System.out.println(Thread.currentThread().getName()+" thread is running");
        }
    }

    void printEvenNumber(int n){
        if(n%2==0){
            System.out.println(n);
        }else{
            try{
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new ThreadExample(),"thread-1");
        Thread thread1= new Thread(new ThreadExample(), "thread-2");
        thread.start();
        //thread1.join();
        thread1.start();

    }
}
