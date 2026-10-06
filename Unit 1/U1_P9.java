//9 write a java program to find out students result/grade using IF condition.

import java.util.Scanner;

	 public class U1_P9
	      {
		           public static void main(String args[])
				   {
                        Scanner scn = new Scanner(System.in);
							 
						int s1,s2,s3,s4,s5,total;
						float per ;
						String result;
						String grade = "";
						
						System.out.println("Enter GR no. :");
						int grno = scn.nextInt();
						scn.nextLine();
						
						System.out.println("Enter Name :");
						String name = scn.nextLine();
						
						System.out.println("Enter marks of subject 1:");
						s1 = scn.nextInt();
						System.out.println("Enter marks of subject 2 :");
						s2 = scn.nextInt();
						System.out.println("Enter marks of subject 3 :");
						s3 = scn.nextInt();
						System.out.println("Enter marks of subject 4 :");
						s4 = scn.nextInt();
						System.out.println("Enter marks of subject 5 :");
						s5 = scn.nextInt();
						
						total = s1+s2+s3+s4+s5;
						per = total/5;
						
						
						if(per>=35)
						{
							result="pass";
							if(per>=90)
								grade="A";
							else if (per>=80)
								grade="B";
							else if (per>=70)
								grade="C";
							else if (per>=60)
								grade="D";
						}
						else
						{
							result="Fail";
							grade="F";
						}
						  System.out.println("\n");
						  System.out.println("|  STUDENT RESULT |");
						  System.out.println("|-----------------------|");
						  System.out.println("|  GR no.| "+grno);
						  System.out.println("|-----------------------|");
						  System.out.println("|  Name |"+name);
						  System.out.println("|-----------------------|");
						  System.out.println("|  Subject 1|"+s1);
						  System.out.println("|  Subject 2|"+s2);
						  System.out.println("|  Subject 3|"+s3);
						  System.out.println("|  Subject 4|"+s4);
						  System.out.println("|  Subject 5|"+s5);
						  System.out.println("|-----------------------|"); 
						  System.out.println("|  Total marks|"+total);
						  System.out.println("|  Percentage|"+per);
			              System.out.println("|  Grade|"+grade);
						  System.out.println("|  Result|"+result);
						  
						  scn.close();
	              
                   }
		  }				   
				
					  
					 
					  
                      					  
					
						
							