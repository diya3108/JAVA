// Extra program 4 write a java program to accept a number and check whether the number is even or odd. Prints 0 if number is odd else 1 if number is.

import java.util.Scanner;

public class U1_EP4 
{
    public static void main(String[] args)
	{
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scn.nextInt();

        if (n % 2 == 0)
            System.out.println(1);
        else
            System.out.println(0);
		
    scn.close();
	}
	
}