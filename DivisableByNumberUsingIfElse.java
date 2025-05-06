import java.util.Scanner;

public class DivisableByNumberUsingIfElse {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int a;

        System.out.println("Enter the Number : ");
        a = sc.nextInt();

        if (a%3 == 0) {
            System.out.println("The Number " + a + " is divisable by 3");
        }
        else
        {
            System.out.println("The Number " + a + " is not divisable by 3");
        }
    }
}
