import java.util.Scanner;

public class ArmstrongNumberUsingWhileLoop {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n,orgNum;
        int digit;
        int sum = 0;

        System.out.println("Enter the number :");
        n = sc.nextInt();
        
        orgNum = n;

        while (orgNum > 0) {
            digit = orgNum % 10;
          
                sum = sum + (digit*digit*digit);
            
            orgNum = orgNum / 10;
        }

        if (sum == n) {
            System.out.println("The number " + n + " is an Armstrong Number");
        }
        else{
            System.out.println("The number " + n + " is not an Armstrong Number");
        }
    }
}