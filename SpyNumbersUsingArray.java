import java.util.Scanner;

public class SpyNumbersUsingArray {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size of array :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        Init(arr);
    }

    public static int[] Init(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter the data of array : ");
            arr[i] = sc.nextInt();
        }
        display(arr);
        SpyNumber(arr);
        return arr;
    }

    public static void display(int [] arr) {
        for(int i = 0;i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static boolean isSpy(int n) {
        int sum = 0;
        int mult = 1;
        int digit,spyNum;

        spyNum = n;

        while(spyNum > 0) {
            digit = spyNum % 10;
            sum = sum + digit;
            mult = mult * digit;
            spyNum = spyNum / 10;
        }

        if(sum == mult) {
            return true;
        }
        return false;
    }

    public static void SpyNumber(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(isSpy(arr[i]) == true) {
                System.out.println("The Spy Numbers in an Array is: "+arr[i]);
            }
        }
    }
}
