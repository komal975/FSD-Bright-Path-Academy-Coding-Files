import java.util.Scanner;

public class WhileLoopForPerfectNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n,sum = 0;
        int i = 1;

        System.out.println("Enter the number : ");
        n = sc.nextInt();

    while (i < n) {
        if (n % i == 0) {
            sum = sum + i;
        }
        i++;
    } 
    
    if (sum == n) {
        System.out.println("This number " + n + " is Perfect Number");
    }
    else{
        System.out.println("This number " + n + " is not Perfect Number");
    }
    }
}
