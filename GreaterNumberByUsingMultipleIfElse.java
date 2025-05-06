import java.util.Scanner;

public class GreaterNumberByUsingMultipleIfElse {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a,b,c;

        System.out.println("Enter the value of first number : ");
        a = sc.nextInt();

        System.out.println("Enter the value of second number : ");
        b = sc.nextInt();

        System.out.println("Enter the value of third number : ");
        c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("The first number " + a + " is greater than " + b + " second number");
        }
        else if (b > a && b > c) {
            System.out.println("The second number " + b + " is greater than " + a + " first number");
           }
          
         else
         {
            System.out.println("The third number " + c + " is greater than " + a + " first number & also greater than " + b + " Second number");
        }
     }
}
