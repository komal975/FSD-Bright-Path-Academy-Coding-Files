import java.util.Scanner;

public class PrimeNumberUsingArray {

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
        PrimeNumber(arr);
        return arr;
    }

    public static void display(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
        }
        return;
    }

    public static boolean isPrime(int no){
            for(int i=2;i<no;i++){
                if(no%i==0){
                    return false;
                }
            }
            return true;
    }

    public static void PrimeNumber(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(isPrime(arr[i])==true) {
                System.out.println("The Prime Numbers in array is :" +arr[i]);
            }
        }
    }

}