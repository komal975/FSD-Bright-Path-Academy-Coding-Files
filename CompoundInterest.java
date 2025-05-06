import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args)
    {
        int P;
        double Rate;
        int Time;
        int NumberOfTimes;
        double InterestOfCompound;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Principal Amount : ");
        P = sc.nextInt();

        System.out.println("Enter the Rate of Interest : ");
        Rate = sc.nextDouble();

        System.out.println("Enter Time Period : ");
        Time = sc.nextInt();

        System.out.println("Enter the number of times the interest is compounded : ");
        NumberOfTimes = sc.nextInt();

        InterestOfCompound = P*(1+Rate/NumberOfTimes)*(NumberOfTimes*Time);
        System.out.println("Compound Interest is : "+InterestOfCompound);

    }
}
