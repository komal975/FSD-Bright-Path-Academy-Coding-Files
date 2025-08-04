import java.util.Scanner;

public class BaseExponentUsingFunction {

    public static int BaseExponent(int n, int m) {

        int result= 1;

        if(m < 0) {
            System.out.println("When Exponent is 0 it always returns 1");
            return 1;
        }

        for(int i = 0; i < m; i++) {
            result = result * n;
        }

        System.out.println("The result of Base " + n + " & Exponent " + m + " is : "+result);
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int base,exponent;

        System.out.println("Enter the base value: ");
        base = sc.nextInt();

        System.out.println("Enter the exponent value :");
        exponent = sc.nextInt();

        int c = BaseExponent(base,exponent);
        System.out.println(c);
    }
}