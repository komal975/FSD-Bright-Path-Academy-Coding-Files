import java.util.Scanner;

public class ForLoopForStartAndEnd {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a,b,i,j;

        System.out.println("Enter the starting point : ");
        a = sc.nextInt();

        System.out.println("Enter the ending point : ");
        b = sc.nextInt();

        for(i = a; i <= b; i++){
           
            System.out.println(i);
            
        }
    }
}
