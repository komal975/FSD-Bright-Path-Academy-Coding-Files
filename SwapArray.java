import java.util.Scanner;

public class SwapArray {

     static Scanner sc = new Scanner(System.in);

     public static void main(String[] args) {

        System.out.println("Enter the size of array :");
        int size  = sc.nextInt();
        int[] arr = new int[size];
        Init(arr);
     }

     public static int[] Init(int[] arr) {
         for(int i = 0;i < arr.length; i++) {
            System.out.println("Enter the data of array :");
            arr[i] = sc.nextInt();
         }
         display(arr);
         SwappedArray(arr);
         return arr;
     }

     public static void display(int[] arr) {
         for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
         }  
     }

     public static void SwappedArray(int[] arr) {

         int start = 0;
         int end = arr.length - 1;

         for(int i = 0; i < arr.length; i++) {
            while(start <= end) {
               int temp = arr[start];
               arr[start] = arr[end];
               arr[end] = temp;
               start++;
               end--;
            }
            System.out.println(i);
            System.out.println("The Swapped Array is : "+arr[i]);
         }
      }
}