import java.util.Scanner;

public class SumOfEvenNumbersInArray {
    
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
        SumOfEvenNumbers(arr);
        return arr;
    }

    public static void display(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        return;
    }

    public static void SumOfEvenNumbers(int[] arr) {
        int SumEven = 0;
        for(int i = 0;i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                SumEven = SumEven + arr[i];
            }
        }
        System.out.println("Sum Of Even Numbers in Array :" + SumEven);
    }
}
