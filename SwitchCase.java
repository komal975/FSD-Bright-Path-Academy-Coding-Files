import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char ch;
        int a, b, D;

        System.out.println("Enter tha value of A :");
        a = sc.nextInt();

        System.out.println("Enter tha value of B :");
        b = sc.nextInt();

        System.out.println("Enter the character : ");
        ch = sc.next().charAt(0);

        switch (ch) {
            case '+':
                D = a + b;
                System.out.println("The addition of a & b : " +D);
                break;

            case '-':
                D = a - b;
                System.out.println("The substraction of a & b : " +D);
                break;

            case '*':
                D = a * b;
                System.out.println("The multiplication of a & b : " +D);
                break;

            case '/':
                D = a / b;
                System.out.println("The division of a & b : " +D);
                break;

            case '%':
                D = a % b;
                System.out.println("The modulus of a & b : " +D);
                break;
        
            default:
            System.out.println("Not performed any operation");
                break;
        }

    }
}
