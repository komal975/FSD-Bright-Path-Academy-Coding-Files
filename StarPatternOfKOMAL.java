import java.util.Scanner;

public class StarPatternOfKOMAL {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n,i,j;

        System.out.println("Enter number of lines :");
        n = sc.nextInt();

        int mid = (n/2)+1;

        /*Star Pattern of K */
        for( i = 1; i <= n; i++){
            for( j = 1; j <= n; j++){
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
        /*Star Pattern of K End */

        System.out.println();
        /*Star Pattern of O */

        for(i = 1; i <= n; i++){
          for(j = 1; j <= n; j++){
            if(i == 1 || i == n){
                System.out.print("*");
            }
            else if (j == 1 || j == n) {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            }
            System.out.println();
        }
        /* Star Pattern Of O End */
        System.out.println();

        /*Star Pattern Of M */
        for(i = 1; i <= n; i++){
            for(j = 1; j <= n; j++){
                if(j == 1 || j == n){
                    System.out.print("*  ");
                }

               else if( i == j && j < mid){
                        System.out.print("*");
                }
                else if(j == n-i-1 && i <mid){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        /*Star Pattern Of M End */
        System.out.println();

        /* Star Pattern Of A */

      for(i = 1; i <= n; i++){
        for(j = 1; j <= n; j++){
            if(i == 1 || i == mid){
                System.out.print("*");
            }
            else if (j == 1 || j == n) {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    /* Star Pattern Of A End */
        System.out.println();

        /* Star Pattern O L  */
        for(i = 1; i <= n; i++){
            for(j = 1; j <= n ; j++){
                if(j == 1 || i == n){
                    System.out.print("*");
                }
                else{
                    System.out.print("");
                }
            }
            System.out.println();
        }





    }
}
