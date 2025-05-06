import java.util.Scanner;

public class WhileLoopForCountingOddNumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n,count = 0,digit;

        System.out.println("Enter the number : ");
        n = sc.nextInt();

        while (n > 0) {
            digit = n % 10;
            if (digit % 2 != 0) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
