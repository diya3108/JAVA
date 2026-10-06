//Extra program 1 Write a java program that takes a number as input and prints its multiplication table up to 10.

import java.util.Scanner;

public class U1_EP1
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter no.:");
		int num=scn.nextInt();
		
		System.out.println("Multiplication table of "+num);
		for(int i=0;i<=10;i++)
		{
			System.out.println(num+" x "+ i +" = "+(num * i));
		}
		scn.close();
	}
}	
		
		