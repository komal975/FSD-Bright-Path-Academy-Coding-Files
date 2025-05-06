import java.util.Scanner;

public class WhileLoopForSumOfEvenNumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a,b,sum = 0;
        int i =0;
        System.out.println("Enter the initial number  : ");
        a= sc.nextInt();

        System.out.println("Enter the last number : ");
        b = sc.nextInt();

        while (i <= b) {
            if (i % 2 == 0) {
                sum = sum + i;
               }
            i++;
        }
        System.out.println("The sum of even numbers using while loop is : "+sum);
    }
}
