import java.util.Scanner;

public class WhileLoopForSumOfNumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a,b,sum = 0;
        int i = 0;
        System.out.println("Enter the initial Number : ");
        a = sc.nextInt();

        System.out.println("Enter the last number : ");
        b = sc.nextInt();

        while (i <= b) {
            sum = sum + i;
            i++;
        }
        System.out.println("The addition of numbers : " +sum);
    }
}
