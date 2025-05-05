import java.util.Scanner;

public class StarPatternOfV {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Enter number Of lines : ");
        n = sc.nextInt();

        int mid = (n/2)+1;

        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= n; j++){
                if(i == j && j < mid){
                    System.out.print("*");
                }
                else if(j == n - i -1 && i < mid){
                    System.out.print("*");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
