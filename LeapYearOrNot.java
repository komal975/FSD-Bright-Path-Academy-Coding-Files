import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args)
    {
        int year;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year : ");
        year = sc.nextInt();

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        {
            System.out.println("The Entered year " + year + " is Leap Year");
        }
        else{
            System.out.println("The entered year " + year + "is not Leap Year");
        }
    }
}
