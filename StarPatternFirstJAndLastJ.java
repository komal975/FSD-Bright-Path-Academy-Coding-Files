import java.util.Scanner;

public class StarPatternFirstJAndLastJ{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Enter number of lines : ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if (j == 1 && i <= n){
                    System.out.print(" * ");
                }
                else if (j == n && i <= n) {
                    System.out.print(" * ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}