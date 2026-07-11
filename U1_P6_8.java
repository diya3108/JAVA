//6.8 Write a java program to get name from user and ask how many times user want to print that name while loop.

import java.util.Scanner;

 public class U1_P6_8
	   {
	           public static void main(String args[])
			   {
			           Scanner scn = new Scanner(System.in);
					   
					   System.out.println("Enter name:");
					   String name = scn.nextLine();
					   
					   System.out.println("How many times:");
					   int n = scn.nextInt();
					    
						int i=1;
					   while(i<=n)
					   {
						   System.out.println(name);
						   i++;
					   }
					  
					scn.close();
			   }
	   }