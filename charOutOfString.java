import java.util.Scanner;

public class charOutOfString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = "apple";
        System.out.println(str1);

        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);

        boolean isFound = false;

        for(int i = 0; i < str1.length(); i++) {
            if(ch == str1.charAt(i)) {
                isFound = true;
                System.out.println("Character is Present");
                break;
            }
        }
        if (isFound == false) {
            System.out.println("-1");
        }

    }
}