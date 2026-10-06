//6.5 Write a java program to get name from user and print 10 times using while loop.

import java.util.Scanner;

 public class U1_P6_5
	   {
	           public static void main(String args[])
			   {
			           Scanner scn = new Scanner(System.in);
					   
					   System.out.println("Enter name:");
					   String name = scn.nextLine();
					    
						
					    int i=1;
					   while(i<=10)
					   {
						   System.out.println("Name :" + name);
						   i++;
					   }
					  
					scn.close();
			   }
	   }
