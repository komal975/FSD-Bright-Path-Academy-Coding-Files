import java.util.Scanner;

public class WhileForSumOfEvenDigits {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n,digit,sum = 0;

        System.out.println("Enter the number : ");
        n = sc.nextInt();

        while (n > 0) {
            digit = n % 10;
            if (n % 2 == 0) {
                sum = sum + digit;
            }
            n = n / 10;
        }
        System.out.println("The sum of digits of even numbers in number is :" + sum);
    }
}
