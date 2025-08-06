import java.util.Scanner;

public class SumOfOddNumbersInArray {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size of array :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        Init(arr); 
    }

    public static int[] Init(int[] arr) {
        for(int i = 0 ; i < arr.length; i++) {
            System.out.println("Enter the data of array :");
            arr[i] = sc.nextInt();
        }
        display(arr);
        SumOfOddNumber(arr);
        return arr;
    }

    public static void display(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        return;
    }

    public static void SumOfOddNumber(int[] arr) {
        int SumOdd = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                SumOdd = SumOdd + arr[i];
            }
        }
        System.out.println("Sum of Odd Numbers in Array is :" + SumOdd);
    }
}
