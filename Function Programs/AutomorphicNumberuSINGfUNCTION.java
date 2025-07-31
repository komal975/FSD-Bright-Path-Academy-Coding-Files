import java.util.Scanner;

public class AutomorphicNumberuSINGfUNCTION {
    
    public static boolean isAutomorphic(int n) {
        
        int square = 1;
        int lastSqr = 1;
        int autoNum;
        int digit;

        autoNum = n;

        square = autoNum * autoNum;

        while(autoNum > 0){
            digit = autoNum % 10;
            lastSqr = square % 10;

            if(digit == lastSqr){
                System.out.println("The entered number " + n + " is Automorphic Number");
                return true;
            }
            autoNum = autoNum / 10;
            square = square / 10;
        }
        System.out.println("The entered number " + n + " is not Automorphic Number");
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("Enter the number : ");
        a = sc.nextInt();

        boolean c = isAutomorphic(a);
        System.out.println(c);
    }
}
