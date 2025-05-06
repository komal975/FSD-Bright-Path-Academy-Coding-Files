import java.util.Scanner;

public class NestedIfElsePercentageComparision {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double percentage;

        System.out.println("Enter the percentage : ");
        percentage = sc.nextDouble();

        if (percentage >= 90 && percentage <= 100) {
            System.out.println("Percentage " + percentage + " is between 90 and 100");
        }
        else{
            System.out.println("Percentage " + percentage + " is not between 90 and 100");
        }
    }
}
