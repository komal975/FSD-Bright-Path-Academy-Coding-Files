import java.util.Scanner;

public class WhileLoopForNumerOfOccuerences {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,rem = 0;

        System.out.println("Enter the Number :");
        n = sc.nextInt();

        while(n>0){
             rem = n%10;
             System.out.println("The remainder is :"+rem);
            n=n/10;
        }
       
    }
}
