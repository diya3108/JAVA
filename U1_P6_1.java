//6.1 Write a java program to get different values from user and print 10 times using for loop.

import java.util.Scanner;

 public class U1_P6_1

	   {
	           public static void main(String args[])
			   {
			           Scanner scn = new Scanner(System.in);
					   
					   System.out.println("Enter values:");
					   int value = scn.nextInt();
					    
						int i;
					   for(i=1;i<=10;i++)
					   {
						   System.out.println("Value :" + i);
					   }
					  
					scn.close();
			   }
	   }
	   
		