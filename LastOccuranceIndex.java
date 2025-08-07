import java.util.Scanner;

public class LastOccuranceIndex {

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
        LastOccuranceCheck(arr);
        return arr;
    }

    public static void display(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void LastOccuranceCheck(int[] arr) {

        int key;

        System.out.println("Enter the key value :");
        key = sc.nextInt();

        for(int i = arr.length - 1; i > 0; i--) {
            if(key == arr[i]) {
                System.out.println(i);
                break;
            }
        }
    }
    
} 