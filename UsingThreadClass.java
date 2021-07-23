
class MyThread extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<1000){
            System.out.println("My Thread is Running");
            System.out.println("I am happy");
            i++;
        }   
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<1000){
            System.out.println("My Thread2 is Running");
            System.out.println("I am sad");
            i++;
        }   
    }
}

public class UsingThreadClass{
    public static void main(String[] args){
           MyThread t1=new MyThread();
           MyThread2 t2=new MyThread2();
           t1.start();
           t2.start();
           System.out.println("The id of the thread t1 is : "+t1.getId());
           System.out.println("The name of the thread t1 is : "+t1.getName());
     }
}