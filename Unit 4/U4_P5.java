//Group//
public class U4_P5
{
    public static void main(String[] args) 
    {
    ThreadGroup grp = new ThreadGroup("group1");
    myThread m1 = new myThread(grp, "thread1");
    myThread m2 = new myThread(grp, "thread2");
    myThread m3 = new myThread(grp, "thread3");
    m1.start();
    m2.start();
    m3.start();
    grp.stop();
    System.out.println("Active Counts in Group :" + grp.activeCount());
  }
}
class myThread extends Thread
{
    public myThread(ThreadGroup g , String s)
    {
        super(g,s);
    }
    public void run()
    {
        System.out.println("Thread name , priority,thread group"+ Thread.currentThread());
    }
}
