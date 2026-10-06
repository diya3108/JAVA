// Extra program 2 write a java program to print the area and perimeter of a rectangle and circle.

import java.util.Scanner;

public class U1_EP2
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter length:");
		int length=scn.nextInt();
		
		System.out.println("Enter width:");
		int width=scn.nextInt();
		
		int rectarea= length*width;
		int rectperimeter= 2*(length+width);
		
		System.out.println("Rectangle area = "+rectarea);
		System.out.println("Rectangle perimeter = "+rectperimeter);
		
		System.out.println("Enter radius:");
	    double radius=scn.nextInt();
		
		double circlearea= 3.14*radius*radius ;
		double circleperimeter= 2*3.14*radius;
		
		System.out.println("Circle area = "+circlearea);
		System.out.println("Circle perimeter = "+circleperimeter);
		
		scn.close();
	}
}	
		
		