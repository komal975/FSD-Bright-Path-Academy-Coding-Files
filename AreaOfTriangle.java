import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args)
    {
        int h;
        int b;
        double T;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Height : ");
        h = sc.nextInt();
       
        System.out.println("Enter the Breadth : ");
        b = sc.nextInt();

        T = (0.5)*h*b;
        System.out.println("Area of Triangle is: "+T);
    }
}
