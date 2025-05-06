import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args)
    {
        int h;
        int l;
        double T;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Height : ");
        h = sc.nextInt();

        System.out.println("Enter the Length : ");
        l = sc.nextInt();

        T = h*l;
        System.out.println("Area of Rectanglr is : "+T);
    }
}
