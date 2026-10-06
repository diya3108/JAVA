// Extra program 3.2 write a java program to swap two variables without 'temp' variable.

import java.util.Scanner;

public class U1_EP3_2
{
    public static void main(String[] args) 
	{
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scn.nextInt();

        System.out.print("Enter second number: ");
        int b = scn.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
		
		scn.close();
    }
	
}