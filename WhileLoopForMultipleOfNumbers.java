import java.util.Scanner;

public class WhileLoopForMultipleOfNumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a,b;

        System.out.println("Enter the starting point : ");
        a = sc.nextInt();

        System.out.println("Enter the ending point : ");
        b = sc.nextInt();

        while (a <= b) {
            if (a % 8 == 0) {
                System.out.println(a);
            }
            a++;
        }
    }
}
