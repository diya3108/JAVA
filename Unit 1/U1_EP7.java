// Extra program 7 write a java program to take three numbers and print the smallest and biggest number.

import java.util.Scanner;

public class U1_EP7
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int a =scn.nextInt();
		
		System.out.println("Enter second number:");
		int b =scn.nextInt();
		
		System.out.println("Enter third number:");
		int c =scn.nextInt();
		
		if(a>=b && a>=c)
			System.out.println("Biggest ="+a);
		else if(b>=a && b>=c)
			System.out.println("Biggest ="+b);
		else
			System.out.println("Biggest ="+c);
		
		if(a<=b && a<=c)
			System.out.println("Smallest ="+a);
		else if(b<=a && b<=c)
			System.out.println("Smallest ="+b);
		else
			System.out.println("Smallest ="+c);
		
		scn.close();
	}
}	