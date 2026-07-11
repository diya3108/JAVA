//6.1 Write a java program to get different values from user and print 10 times using while loop.

import java.util.Scanner;

 public class U1_P6_2
	   {
	           public static void main(String args[])
			   {
			           Scanner scn = new Scanner(System.in);
					   
					  System.out.println("Enter values:");
					   int value = scn.nextInt();
					   
					   int i=1;
					   while(i<=10)
					   {
						   System.out.println("Value :" + i);
						   i++;
					   }
					  
					scn.close();
			   }
	   }