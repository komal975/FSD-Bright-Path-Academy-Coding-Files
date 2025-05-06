import java.util.Scanner;

public class StarPatternOfX {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int n,i,j;

         System.out.println(" Enter number of lines :");
         n = sc.nextInt();
    
        for(i = 0; i < n; i++){
            for( j = 0; j < n; j++){
                if ( i == j || i == n - j - 1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

   }
}

