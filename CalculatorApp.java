import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.println("Enter value of a");
        a = sc.nextInt();
        System.out.println("Enter value of b");
        b = sc.nextInt();

        c = a + b;
        System.out.println("Addition of a & b : " + c);

        c = a - b;
        System.out.println("Substraction of a & b : " + c);

        c = a * b;
        System.out.println("Multiplication of a & b : " + c);

        c = a / b;
        System.out.println("Division of a & b : " + c);

        c = a % b;
        System.out.println("Modulus of a & b : " + c);

    }
}
