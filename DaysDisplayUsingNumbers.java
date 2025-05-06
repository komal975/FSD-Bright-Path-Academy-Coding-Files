import java.util.Scanner;

public class DaysDisplayUsingNumbers {
    public static void main(String[] args)
    {
        int n;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number : ");
        n = sc.nextInt();

        if (n == 1 ) {
            System.out.println("The day is Sunday");
        }
        else
        if (n == 2) {
            System.out.println("The day is Monday");
        }
        else
        if (n == 3) {
            System.out.println("The day is Tuesday");
        }
        else
        if (n == 4) {
            System.out.println("The day is Wednesday");
        }
        else
        if (n == 5) {
            System.out.println("The day is Thursday");
        }
        else
        if (n == 6) {
            System.out.println("The day is Friday");
        }
        else
         {
            System.out.println("The day is Saturday");
        }

    }
}
