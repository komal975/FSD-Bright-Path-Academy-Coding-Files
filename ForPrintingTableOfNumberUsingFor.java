import java.util.Scanner;

public class ForPrintingTableOfNumberUsingFor {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("Enter the number : ");
        a = sc.nextInt();

        for(int i = 0; i <= 10; i++)
        {
            System.out.println(a*i);
        }
    }
}
