import java.util.Scanner;

public class ForLoopForMultipleOfNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b;

        System.out.println("Enter the starting point : ");
        a = sc.nextInt();

        System.out.println("Enter the ending point");
        b = sc.nextInt();

        for(int i = a; i <= b; i++)
        {
            if (i % 8 == 0) {
                System.out.println("The multiples of 8 is : "+i);
            }
        }
    }
}
