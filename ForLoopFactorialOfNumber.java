import java.util.Scanner;

public class ForLoopFactorialOfNumber {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int n, fact = 1;

        System.out.println("Enter the Number :");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            //System.out.println(i); //For Printing Factorial numbers
            if (n != 0) {
                fact = fact * i;
            }
        }
        System.out.println("The factorial of number " + n + " is : "+fact);
        
    }
}
