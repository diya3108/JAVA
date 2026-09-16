public class U3_P3
{
public static void main(String[] args)
{
    try
    {
        System.out.println("diya opening database connection....");
        int data = 25 / 5;
        System.out.println("Data calculated : " + data);
    }
    catch (ArithmeticException e)
    {
        System.out.println("Exception caught.");
    }
    finally
    {
        System.out.println("FINALLY BLOCK: Closing diya's database connection guaranteed!");
    }
      
}
}
