import java.util.Scanner;

public class CharIsVowelOrNot {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        char ch;

        System.out.println("Enter the Character : ");
        ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u') {
            System.out.println("The character " + ch + " is Vowel.");
        }
        else{
            System.out.println("The character " + ch + " is Consonant");
        }
    }
}
