//10.1 write a java program of 1D array.

import java.util.Scanner;

	 public class U1_P10_1
	      {
		           public static void main(String args[])
				   {
                        Scanner scn = new Scanner(System.in);
						
						int marks[] = new int[5];
						
						System.out.println("Enter marks of 5 subjects:");
						for(int i=0;i<marks.length;i++)
						{
							marks[i]=scn.nextInt();
						}
						
						System.out.println("Enter marks of 5 subjects:");
						for(int i=0;i<5;i++)
							
						{
							System.out.println(marks[i]+"");
						}
						scn.close();
				   }
		  }
		  