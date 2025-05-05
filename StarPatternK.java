import java.util.Scanner;

public class StarPatternK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n;

        System.out.println("Enter number of lines:");
        n = sc.nextInt();

        int mid = (n/2)+1;
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if ((j==n-i && j>=mid-1)|| j == 1) {
                    System.out.print("*");
                }
                else if((i == j+1 || j == n - i -1 && j>=mid) && i>=mid){
                
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
