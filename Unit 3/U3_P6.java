class InvalidStudentMarksException extends Exception
{
    public InvalidStudentMarksException(String message)
    {
        super(message);
    }
}

public class U3_P6
{
    static void validateDiyaMarks(double marks) throws InvalidStudentMarksException
    {
        if (marks < 0.0 || marks > 100.0)
        {
            throw new InvalidStudentMarksException("Marks must be betwwen 0 and 100! Input was :" + marks);
        } else {
            System.out.println("Diya's Marks Validated Successfully : " + marks);
        }
    }
 

   public static void main (String[] args)
   {
    try
    {
        System.out.println("Submitting Exam Score for Diya");
        validateDiyaMarks(105.5);
    } catch(InvalidStudentMarksException e)
    {
        System.out.println("Custom Exception caught : " + e.getMessage());
    }
   }
}