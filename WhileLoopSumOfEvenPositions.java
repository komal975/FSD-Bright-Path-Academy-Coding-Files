import java.util.Scanner;

public class WhileLoopSumOfEvenPositions {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,digit = 0;
        int count = 0,sum = 0;

        System.out.println("Enter the number");
        n = sc.nextInt();

        while (n > 0) {
            digit = n % 10;
            if (count % 2 == 0) {
                sum = sum + digit;
            }
            count++;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
