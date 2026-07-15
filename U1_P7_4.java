//7.4 write a java program to use NESTED IF() IF() ELSE ELSE condition.

import java.util.Scanner;

public class U1_p7_4
	      {
		           public static void main(String args[])
				           {
                                 Scanner scn = new Scanner(System.in);
								 
								  System.out.println("Enter number:");
								  int num = scn.nextInt();
								  
								   if(num>=50)
								   {
									  if (num==50)
									  {
										  System.out.println("The number is equal to 50");
									  }
									  
									    else
								  {
									System.out.println("The number is greater than 50");
								  }
								  
							}
								   else 
									  
								  {
									System.out.println("The number is less than 50");
								  }
								    scn.close();
						   }
	      }
									