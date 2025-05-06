import java.util.Scanner;

public class SpyNumberUsingWhileLoop {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n,spyNum;
        int sum = 0;
        int digit;
        int mult = 1;

        System.out.println("Enter the number :");
        n = sc.nextInt();

        spyNum = n;

        while (spyNum > 0) {
            digit = spyNum % 10;

            sum = sum + digit;
            mult = mult * digit;

            spyNum = spyNum / 10;
        }
        
        if (sum == mult) {
            System.out.println("The number " + n + " is Spy Number");
        }
        else{
            System.out.println("The number " + n + " is not Spy Number");
        }
    }
}
