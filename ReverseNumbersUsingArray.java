import java.util.Scanner;

public class ReverseNumbersUsingArray {
     static Scanner sc = new Scanner(System.in);

     public static void main(String[] args) {
        System.out.println("Enter the size of array :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        Init(arr);
    }

    public static int[] Init(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter the data of array :");
            arr[i] = sc.nextInt();
        }
        display(arr);
        ReverseArray(arr);
        return arr;
    }

    public static void display(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        return;
    }

    public static void ReverseArray(int[] arr) {

        for(int i = arr.length-1 ; i >= 0; i--){
            System.out.println(i);
            System.out.println("The Reversed Array is : " + arr[i]);
        }
    }
    
}
