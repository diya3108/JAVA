public class U3_P4 {
    public static void main(String[] args)
 {
   if (age<18)
   {
    throw new ArithmeticException(studentName + "is not eligible to vote(Age must be 18+).")
   }     else
   {
    System.out.println(studentName + "is eligible to vote!");
   }
    }

    public static void main(String[] args) 
    {
        try
        {
            System.out.println("Checking registration for diya...");
            checkVotingEligibility(16, "diya");
        }catch(ArithmeticException e)
        {
            System.out.println("caught Explicit Exception :" + e.getMessage());
        }
    }
}