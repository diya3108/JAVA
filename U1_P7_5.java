//7.5 write a java program to use IF() ELSE IF() ELSE condition.

import java.util.Scanner;

public class U1_p7_5
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
								  
								  else
									  
								  {
								    System.out.println("The number is Greater than 50");
								  }
								  
								  if(num>0)
									  
								  {
									System.out.println("The number is Positive");
								  }
								  
								   else
									  
								  {
								    System.out.println("The number is Negative");
								  }
								    scn.close();
						   }
	      }
									