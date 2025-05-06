import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args)
    {
        int r;
        float pi = 3.14f;
        double T;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of Circle : ");
        r = sc.nextInt();

        T = pi*(r*r);
        System.out.println("Area of Circle is: "+T);
    }
}
