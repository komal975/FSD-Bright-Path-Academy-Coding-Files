import java.util.Scanner;

public class CharOrNumberCheck {
    public static void main(String[] args)
    {
        char ch;
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character or number : ");
        ch = sc.next().charAt(0);

       // System.out.println("Enter the number : ");
       // n = sc.nextInt();

        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            System.out.println("The entered character" + ch + " is Alphabet");
        }
        else
        if (ch >= 0 || ch <= 9) {
            System.out.println("The entered character" + ch + " is Digit");
        }
        
    }
}
