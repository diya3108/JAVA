// write a java program to use final variable.
class DiyaPolicy
{
    final void verifyIdentify()
    {
        System.out.println("Student Diya Identity Verified via Biometrics.");
    }
}

class AdvancedStudent extends DiyaPolicy
{
     
    // void verifyIdentify(){}
  
}

public class U2_P8_2
{
    public static void main(String[] args)
     {
        AdvancedStudent a = new AdvancedStudent();

        a.verifyIdentify();
     }
}