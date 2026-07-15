//4.2 Write a java program to perform different arithmetic operations without using command line args.

import java.util.Scanner;
public class ArithmeticOperations
{
   public static void main(String args[])
   {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter First no. :");
	int num1 = sc.nextInt();
	
	System.out.print("Enter Second no. :");
	int num2 = sc.nextInt();
	
	int Addition = num1 + num2;
	int Substraction = num1 - num2;
	int Multiplication = num1 * num2;
	int Division = num1/num2;
	int Modulus = num1%num2;
	
	System.out.println( "Addition = " + Addition  );
	System.out.println( "Substraction = " + Substraction);
	System.out.println( "Multiplication = " + Multiplication);
	System.out.println( "Division = " + Division);
	System.out.println( "Modulus = " + Modulus);
	 sc.close();
   }
}   
	
	
	
	
