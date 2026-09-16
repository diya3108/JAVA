public class U3_P1
{
    public static void main(String[] args)
    {
        String studentName = "Diya";
        System.out.println(studentName +"started math calculation....");

        int totalMarks = 100;
        int subjects = 0;
        int result = totalMarks/subjects;

        
    }
    System.out.println("Result:" + result);
    catch(Exception e)
{
    System.out.println("Exception caught : Division by zero is not allowed for " + studentName + "!");
    System.out.println("System error detail : "+ e.getMessage());
    System.out.println(studentName + "'s program continues execution smoothly!");
}
  
}
