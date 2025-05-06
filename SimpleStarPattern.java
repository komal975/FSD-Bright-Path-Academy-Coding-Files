import java.util.Scanner;

public class SimpleStarPattern{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n;
        
        System.out.println("Enter the Number : ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
             {   
                System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }

