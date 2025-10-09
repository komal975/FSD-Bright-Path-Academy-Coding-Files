import java.util.Scanner;

public class charSearching {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);

        String str1 = "Bright";
        System.out.println(str1);

        boolean isFound = false;
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);

        for(int i = 0; i < str1.length(); i++) {
            if(ch == str1.charAt(i)) {
                isFound = true;
                System.out.println("Character is Present");
                break;
            }
        }
        if(isFound == false) {
            System.out.println("Character is not present");
        }
    }
}