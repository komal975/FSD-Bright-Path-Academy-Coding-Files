import java.util.Scanner;

public class WhileLoopForPrintingTable {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a,i = 1;
         
        System.out.println("Enter the number");
        a = sc.nextInt();

        while (i <= 10) {
           System.out.println(a*i);
           i++;
        }
    }
}
