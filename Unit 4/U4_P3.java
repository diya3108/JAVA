//Write a Java program to set Thread name and priority & test it.//
class MyThread extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Thread is running with name:"+ Thread.currentThread().getName());
        System.out.println("Thread priority:"+Thread.currentThread().getPriority());
    }
}

public class U4_P3
{
    public static void main(String[] args) 
    {
     Thread MyThread = new Thread(new MyThread());
     MyThread.setName("Diya");
     MyThread.setPriority(Thread.MAX_PRIORITY);

     MyThread.start();    

     System.out.println("Main thread name: "+ Thread.currentThread().getName());
     System.out.println("Main thread priority: "+ Thread.currentThread().getPriority());

    }
}
