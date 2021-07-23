
public class ThreadMethod extends Thread{
    public ThreadMethod(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<100){
        System.out.println("Thank You "+this.getName());
        try{
            Thread.sleep(455);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        i++;
        }
    }
    public static void main(String[] args){
        ThreadMethod t1=new ThreadMethod("Thread1");
        ThreadMethod t2=new ThreadMethod("Thread2");
        t1.start();
        try{
            //with the help of this method,t2 thread will wait till the t1 thread is completely executed.
            //This method may throw an exception so we need to keep it inside try block.
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        t2.start();
    }
} 
