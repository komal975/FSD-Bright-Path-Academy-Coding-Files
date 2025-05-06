import java.util.Scanner;

public class StarPatternFullPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,i,j,k; 

        System.out.println("Enter number of lines of pyramid : ");
        n = sc. nextInt();

        for(i = 1; i <= n; i++){//For Upper Half Pyramid
            for(k = n - 1; k >= i; k--){
                System.out.print(" ");
            }
            for(j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(i = n - 1; i >= 1; i--){//For lower half pyramid

            for(k = n - 1; k >= i; k--){
                System.out.print(" ");
            }
            for(j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}