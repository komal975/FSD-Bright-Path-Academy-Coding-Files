import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args)
    {
        int P;
        double R;
        int T;
        double SI;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Principal Amount : ");
        P = sc.nextInt();

        System.out.println("Enter the Rate of Interest : ");
        R = sc.nextDouble();

        System.out.println("Enter the Time: ");
        T = sc.nextInt();

        SI = ((P*R*T)/100);
        System.out.println("Simple Interest is : "+SI);
        System.out.println("Amount : "+SI+P);
    }
}
