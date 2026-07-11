//6.6 Write a java program to get name from user and print 10 times using do..while loop.

import java.util.Scanner;

 public class U1_P6_6
	   {
	           public static void main(String args[])
			   {
			           Scanner scn = new Scanner(System.in);
					   
					   System.out.println("Enter name:");
					   String name = scn.nextLine();
					    
					
					    int i=1;
					   do
					   {
						   System.out.println("Name :" + name);
						   i++;
					   }while(i<=10)
					  
					scn.close();
			   }
	   }