import java.util.Scanner;

public class EvenAndOddUsingIfElse {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("Enter the Number : ");
        a = sc.nextInt();

        if (a%2 == 0) {
            System.out.println("The number " + a + " is Even"); 
        }
        else{
            System.out.println("The number " + a + " is Odd"); 
        }
    }
}
