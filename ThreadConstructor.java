public class ThreadConstructor extends Thread{
    public ThreadConstructor(String name){
        super(name);
    }
    public void run(){
        System.out.println("Thank You");
    }
    public static void main(String[] args){
        ThreadConstructor t1=new ThreadConstructor("Thread1");
        t1.start();
        System.out.println("The id of the thread is : "+t1.getId());
        System.out.println("The name of the thread is : "+t1.getName());
    }
}
