import java.util.Scanner;
 class ArrayInitial{
     static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size");
        int size=sc.nextInt();
        int[] arr = new int[size];
        Init(arr);
        
    }

    public static int[] Init(int[] arr){
        for(int i= 0; i < arr.length; i++){
            System.out.println("Enter the data: ");
            arr[i] = sc.nextInt();
        }
        display(arr);
        return arr;
    }
    
    public static void display(int[] arr) {
        for(int i=0; i < arr.length; i++){
           System.out.println(arr[i]);
        }
        return ;
        
    }

}



