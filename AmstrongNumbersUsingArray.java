import java.util.Scanner;

public class AmstrongNumbersUsingArray {
    
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
        AmstrongNumber(arr);
        return arr;
    }

    public static void display(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static boolean isAmstrong(int no) {
        int digit,orgNum;
        int sum = 0;

        orgNum = no;

        for(int i = 0; i < no; i++){
            digit = orgNum % 10;
            sum = sum + (digit * digit * digit);
            orgNum = orgNum / 10;

            if (sum == no){
                return true;
            }
        }
        return false;
    }

    public static void AmstrongNumber(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(isAmstrong(arr[i]) == true) {
                System.out.println("The Amstrong Numbers in an array is : "+ arr[i]);
            }
        }
    }
}
