import java.util.Scanner;

public class WhileLoopForSumOfDigitsInNumber {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n,sum = 0,digit;

        System.out.println("Enter the number : ");
        n = sc.nextInt();

        while (n != 0) {
            digit = n % 10;
            sum = sum + digit;
            n = n/10;
        }
        System.out.println("The Addition of digits is :" +sum);
    }
}
