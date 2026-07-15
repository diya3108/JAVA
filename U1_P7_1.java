//7.1 write a java program to use IF condition.

import java.util.Scanner;

public class U1_p7_1
	      {
		           public static void main(String args[])
				           {
                                 Scanner scn = new Scanner(System.in);
								  System.out.println("Enter number:");
								  int num = scn.nextInt();
								  
								  if(num<50)
								  {
									  System.out.println("The number is less than 50");
								  }
								    scn.close();
						   }
	      }
									