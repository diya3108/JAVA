// Extra program 6 write a java program to get a numberfrom user and print whether it is positive or negative.

import java.util.Scanner;

public class U1_EP6
{
    public static void main(String[] args) 
	{
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scn.nextInt();

        if (n > 0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
        
		scn.close();
    }
}