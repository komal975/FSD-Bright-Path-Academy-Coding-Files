import java.util.Scanner;

public class NestedIfElseMultipleofNumber {
    public static void main(String[] args)
    {
        int a;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        a = sc.nextInt();

        if (a%3 == 0 && a%9 == 0) {
            System.out.println("The number " + a + " is divisable by 3 and 9");
        }
        else if (a%3 == 0  && a%9 != 0) {
            System.out.println("The number " + a + " is divisable by 3 but not divisable by 9");
        }
        else
        {
            System.out.println("The number " + a + " is not divisable by 3 and also not divisable by 9");
        }
    }
}
