import java.util.Scanner;

public class Percentage {
    public static void main(String[] args)
    {
        double Math;
        double English;
        double Science;
        double TotalMarks;
        double percentage;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of Math : ");
        Math = sc.nextDouble();

        System.out.println("Enter the marks of English : ");
        English = sc.nextDouble();

        System.out.println("Enter the marks of Science : ");
        Science = sc.nextDouble();

        TotalMarks = (Math+English+Science);
        System.out.println("Total marks is : "+TotalMarks);

        percentage = ((Math+English+Science)/3);
        System.out.println("Percentage of 3 subject : "+percentage);
    }
    
}
