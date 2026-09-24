
class Diya implements Runnable
{
    public void run()
    {
        for(int j=1;j<=5;j++)
        {
            System.out.println("From Thread Diya: j =" + j);
        }
        System.out.println("Exit from Thread Diya");
    }
}
class Tanvi implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("From Thread Tanvi: i =" + i);
        }
        System.out.println("Exit from Thread Tanvi");
    }
}
class Rudri implements Runnable
{
    public void run()
    {
        for(int k=1;k<=5;k++)
        {
            System.out.println("From Thread Rudri: k =" + k);
        }
        System.out.println("Exit from Thread Rudri");
    }
}
public class U4_P1_2
{
    public static void main(String args[])
    {
        
        Diya d2 = new Diya();
        Tanvi t2 = new Tanvi();
        Rudri r2 = new Rudri();

      

        Thread ta = new Thread(d2);
        System.out.println("Thread Diya Started.");
        ta.start();

        Thread tb = new Thread(t2);
        System.out.println("Thread Tanvi Started.");
        tb.start();

        Thread tc = new Thread(r2);
        System.out.println("Thread Rudri Started.");
        tc.start();
    }
}