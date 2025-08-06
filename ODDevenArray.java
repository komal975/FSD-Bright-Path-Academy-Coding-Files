import java.util.Scanner;

public class ODDevenArray {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        Init(arr);
    }

    public static int[] Init(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter the data of array: ");
            arr[i] = sc.nextInt();
        }
        display(arr);
        EvenOddCheck(arr);
        return arr;
    }

    public static void display(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        return;
    }

    public static void  EvenOddCheck(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0) {
                System.out.println("Entered element "+ arr[i] + " of Array is Even Number.");
            }
            else{
                System.out.println("Entered element " + arr[i] + " of Array is Odd Number.");
            }
        }
    }
}
