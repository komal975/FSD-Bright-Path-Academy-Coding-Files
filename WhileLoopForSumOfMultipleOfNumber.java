import java.util.Scanner;

public class WhileLoopForSumOfMultipleOfNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a,b,sum = 0,i = 0;

        System.out.println("Enter the initial number : ");;
        a = sc.nextInt();

        System.out.println("Enter the last number : ");
        b = sc.nextInt();

        while (i <= b) {
            if (i % 5 == 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println("The sum of multiple of 5 using while loop is : "+sum);
    }
}
