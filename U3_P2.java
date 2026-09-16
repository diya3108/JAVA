public class U3_P2
{
    public static void main(String[] args) 
    {
       try
       {
         int [] diyaScores = new int[3];
        diyaScores[0] = 75;
        diyaScores[0] = 85;
        diyaScores[0] = 90;

        diyaScores[5]=100;
       }

catch (ArithmeticException e)
{
    System.out.println(" Arithmetic Error occured.");
}
catch (ArrayIndexOutOfBoundsException e)
{
  System.out.println(" Array Index Error : diya accessed an individual index!");
}
catch(Exception e)
{
    System.out.println("General Exception Handler : " + e);
}
}
}
