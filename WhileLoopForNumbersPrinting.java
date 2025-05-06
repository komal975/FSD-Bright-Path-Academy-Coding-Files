import java.util.Scanner;

public class WhileLoopForNumbersPrinting {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a,b;
        System.out.println("Enter the Starting Point : ");
        a = sc.nextInt();

        System.out.println("Enter the Ending Point : ");
        b = sc.nextInt();

        while (a<=b) {
            System.out.println(a);
            a++;
        }


    }
}
