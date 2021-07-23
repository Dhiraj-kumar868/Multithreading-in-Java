public class ThreadPriority extends Thread{
    public ThreadPriority(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<50){
        System.out.println("Thank You "+this.getName());
        i++;
        }
    }
    public static void main(String[] args){
        ThreadPriority t1=new ThreadPriority("Thread1 (Most Important)");
        ThreadPriority t2=new ThreadPriority("Thread2");
        ThreadPriority t3=new ThreadPriority("Thread3");
        ThreadPriority t4=new ThreadPriority("Thread4");
        ThreadPriority t5=new ThreadPriority("Thread5");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(4);
        System.out.println(t3.getPriority());
        //getState method helps to get the state of the thread
        System.out.println(t3.getState());
        t1.start();
        t2.start();
        t3.start();
        System.out.println(t3.getState());
        t4.start();
        t5.start();
        //currentThread() method returns a reference to the currently executing thread object.
        System.out.println(Thread.currentThread().getState());
    }
} 
