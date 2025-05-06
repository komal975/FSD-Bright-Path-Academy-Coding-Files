import java.util.Scanner;

public class HoursConversionToMinSec {
    public static void main(String[] args)
    {
        int Hours;
        int Minutes;
        int Seconds;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Hours :");
        Hours = sc.nextInt();
        System.out.println("Our Hours is : "+Hours);

        Minutes = Hours * 60;
        System.out.println("Total minutes in " +Hours + " hour is : "+Minutes +" minutes");

        Seconds = Minutes * 60;
        System.out.println("Total seconds in " +Hours + " hour is : " +Seconds + " seconds");

    }
}
