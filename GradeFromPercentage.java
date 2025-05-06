import java.util.Scanner;

public class GradeFromPercentage {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int Percentage;
        int Total;
        int English,Math,Science,Java,HTML;

        System.out.println("Enter the marks of English subject : ");
        English = sc.nextInt();
        
        System.out.println("Enter the marks of Math subject : ");
        Math = sc.nextInt();

        System.out.println("Enter the marks of Science subject : ");
        Science = sc.nextInt();

        System.out.println("Enter the marks of Java subject : ");
        Java = sc.nextInt();

        System.out.println("Enter the marks of HTML subject : ");
        HTML = sc.nextInt();

        Total = English+Math+Science+Java+HTML;
        System.out.println("The Total Marks is : "+Total);

        Percentage = Total / 5;
        System.out.println("Percentage is : "+ Percentage);

        if (Percentage >=90 && Percentage <=100) {
            System.out.println("The student gets " + Percentage + " % marks and A+ Grade");
        }
        else 
            if (Percentage >= 80 && Percentage <= 89) {
                System.out.println("The student gets " + Percentage + " % marks and B+ Grade ");
            }
            else 
              if (Percentage >= 70 && Percentage <= 79) {
              System.out.println("The student gets " + Percentage + " % marks and B Grade ");
              }
             else 
               if (Percentage >= 60 && Percentage <= 69) {
                System.out.println("The student gets " + Percentage + " % marks and C+ Grade ");
              }
              else 
                 if (Percentage >= 50 && Percentage <= 59) {
                  System.out.println("The student gets " + Percentage + " % marks and C Grade ");
                 }
                 else
                   if (Percentage >= 40 && Percentage <= 49) {
                   System.out.println("The student gets " + Percentage + " % marks and P Grade ");
                  }
                 else {
                  System.out.println("The student gets " + Percentage + " % marks and Fail Grade");
                  }
                
    }
}
