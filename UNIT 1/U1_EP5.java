// Extra program 5 write a java program to print numbers between 1 and 100 divisible by 3, 5 and both.

public class U1_EP5
{
    public static void main(String[] args) {

        System.out.println("Divisible by 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + " ");
        }

        System.out.println("\n\nDivisible by 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0)
                System.out.print(i + " ");
        }

        System.out.println("\n\nDivisible by both 3 and 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print(i + " ");
        }
    }
}