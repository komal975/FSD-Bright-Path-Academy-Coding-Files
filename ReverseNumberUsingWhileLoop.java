import java.util.Scanner;

public class ReverseNumberUsingWhileLoop {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n,digit;
        int revNum = 0;
        int OrgininalNumber;

        System.out.println("Enter the number");
        n = sc.nextInt();

        OrgininalNumber = n;

        while (n > 0) {
            digit = n % 10;

            revNum = revNum * 10 + digit;

            n = n / 10;
        }
        
        System.out.println("The Reverse Number of number is : " + revNum);

        if (revNum == OrgininalNumber ) {
            System.out.println("The Number " + OrgininalNumber + " and Reverse Number " + revNum + " is Palindrome");
        }
        else{
            System.out.println("The Number " + OrgininalNumber + " and Reverse Number " + revNum + " is not Palindrome");
        }

    }
}
