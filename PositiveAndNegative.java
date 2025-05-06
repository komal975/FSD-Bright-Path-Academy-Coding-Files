import java.util.Scanner;

public class PositiveAndNegative {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int a;
        System.out.println("Enter the value of A : ");
        a = sc.nextInt();

        if (a >= 0) {
            System.out.println("The number " +a+ " is Positive");
        }
        else{
            System.out.println("The number " +a+ " is Negative");
        }
    }
}
