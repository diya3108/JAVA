import java.util.Scanner;

class UserInput{
    Scanner scn = new Scanner(System.in);
    int a,b;
    void GetVal(){
        System.out.println("Enter value1:");
        a = scn.nextInt();
        System.out.println("Enter value2:");
        b = scn.nextInt();
    }
}
class Calculate extends UserInput{
    
    void add()
    {
        System.out.println("The addition :"+ (a + b));
    }
    void sub()
    {
        System.out.println("The substraction :"+ (a - b));
    }
     void mul()
     {
        System.out.println("The multiplication :"+ (a * b));
    }
     void div()
     {
        System.out.println("The divison :"+ (a / b));
    }
     void mod()
     {
        System.out.println("The modulus :"+ (a % b));
    }
}


public class U2_P4{
      public static void main(String args[])
      {
        Calculate c = new Calculate();
        
        c.GetVal();
        c.add();
        c.sub();
        c.mul();
        c.div();
        c.mod();

      }
}