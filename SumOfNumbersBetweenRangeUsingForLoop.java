import java.util.Scanner;

public class SumOfNumbersBetweenRangeUsingForLoop {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a,b, sum = 0;

        System.out.println("Enter the initial number : ");
        a = sc.nextInt();

        System.out.println("Enter the last number : ");
        b = sc.nextInt();

        for(int i = a; i <= b; i++)
        { 
            sum = sum +i;
        }
        System.out.println("The sum of numbers is : " +sum);
    }
}
