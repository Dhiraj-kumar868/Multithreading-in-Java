
class MyThreadRunnable implements Runnable{
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
class MyThreadRunnable2 implements Runnable{
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

public class UsingRunnable{
    public static void main(String[] args){
        MyThreadRunnable bullet1=new MyThreadRunnable();
        Thread gun1=new Thread(bullet1);
        MyThreadRunnable2 bullet2=new MyThreadRunnable2();
        Thread gun2=new Thread(bullet2);
        gun1.start();
        gun2.start();

     }
}