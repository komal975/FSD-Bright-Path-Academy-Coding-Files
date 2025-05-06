import java.util.Scanner;

public class WhileLoopForFactorialOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n,fact = 1;
        int i = 1;

        System.out.println("Enter the number :");
        n = sc.nextInt();

        while (i <= n) {
            if (n != 0) {
               fact = fact * i; 
            }
            i++;
        }

        System.out.println("The factorial of number " + n + " is : "+fact);
    }
}
