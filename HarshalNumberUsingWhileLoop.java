import java.util.Scanner;

public class HarshalNumberUsingWhileLoop {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n,harshNum;
        int sum = 0;
        int digit;

        System.out.println("Enter the number :");
        n = sc.nextInt();

        harshNum = n;

        while (harshNum > 0) {
            digit = harshNum % 10;

            sum = sum + digit;

            harshNum = harshNum / 10;
        }

        if(n % sum == 0)
        {
            System.out.println("The number " + n + " is Harshad Number");
        }
        else
        {
            System.out.println("The number " + n + " is not Harshad Number");
        }
    }
}
