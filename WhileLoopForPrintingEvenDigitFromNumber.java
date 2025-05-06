import java.util.Scanner;

public class WhileLoopForPrintingEvenDigitFromNumber{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        int digit = 0;

        System.out.println("Enter the number : ");
        n = sc.nextInt();

        while (n > 0) {
            digit = n % 10;
            if (n % 2 == 0) {
                System.out.println(digit);
            }
            n = n / 10;
        }

    }
}