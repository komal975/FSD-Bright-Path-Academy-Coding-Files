import java.util.Scanner;

public class WhileLoopFactorsOfNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        
        int i=1;

        System.out.println("Enter the Number :");
        n = sc.nextInt();

        while (i < n) {
            if (n % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
