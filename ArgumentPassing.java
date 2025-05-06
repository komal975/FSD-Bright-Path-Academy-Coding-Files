import java.util.Scanner;

public class ArgumentPassing {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        System.out.println("Default value is of a:"+a);
        System.out.println("Default value of b is:"+b);
        System.out.println("enter value of a");
        a = sc.nextInt();
        System.out.println("Enter value of b");
        b = sc.nextInt();
        System.out.println("Actual value of a after user input : "+a);
        System.out.println("Actual value of b after user input : "+b);

        //float value
        float c = 0.0f;
        System.out.println("Default value of c: "+c);
        System.out.println("Enter value of c");
        c = sc.nextFloat();
        System.out.println("Actual value of c after user input : "+c);

        //double value
        double d = 0.0;
        System.out.println("Default value of d: "+d);
        System.out.println("Enter value of d");
        d = sc.nextFloat();
        System.out.println("Actual value of c after user input : "+d);
    }
}
