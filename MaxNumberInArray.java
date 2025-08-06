import java.util.Scanner;

public class MaxNumberInArray {
    
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
            arr[i]= sc.nextInt();
        }
        display(arr);
        MaxArray(arr);
        return arr;
    }

    public static void display(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        return;
    }

    public static void MaxArray(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum number in array is : " + max);
    }
}
