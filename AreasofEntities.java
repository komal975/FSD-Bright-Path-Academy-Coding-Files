import java.util.Scanner;

public class AreasofEntities {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int h = 0; 
        int b = 0;
        int l = 0;

        double T = 0f;
        double pi = 3.14;
        float r = 2.0f;

        System.out.println("Enter the height : ");
        h = sc.nextInt();

        System.out.println("Enter the breadth : ");
        b = sc.nextInt();

        System.out.println("Enter the length : ");
        l = sc.nextInt();

        //Area of triangle
        T = (0.5)*h*b;
        System.out.println("Area of Triangle is : "+T);

        //Area of rectangle
        T = h*l;
        System.out.println("Area of Rectangle is : "+T);

        //Area of circle
        T = pi*(r*r);
        System.out.println("Area of circle is : "+T);
    }
    
}
