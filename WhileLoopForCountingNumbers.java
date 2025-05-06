import java.util.Scanner;

public class WhileLoopForCountingNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n,count = 0;

        System.out.println("Enter the Number : ");
            n = sc.nextInt();

        while (n > 0) {
            count = count + 1;
            n = n / 10;
            }
            System.out.println("The number of digits is : "+count);
    }
}
