// Extra program 3.1 write a java program to swap two variables with 'temp' variable.

import java.util.Scanner;

public class U1_EP3_1
 {
    public static void main(String[] args) 
	{
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scn.nextInt();

        System.out.print("Enter second number: ");
        int b = scn.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
		
		scn.close();
    }
	
}