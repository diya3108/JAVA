//6.9 Write a java program to get name from user and ask how many times user want to print that name do..while loop.

import java.util.Scanner;

 public class U1_P6_9
	   {
	           public static void main(String args[])
			   {
			           Scanner scn = new Scanner(System.in);
					   
					   System.out.println("Enter name:");
					   String name = scn.nextLine();
					    
					
					   int i=1;
					   do
					   {
						   System.out.println(name);
						   i++;
					   }while(i<=n)
					  
					scn.close();
			   }
	   }