public class stringPalindrome {

    public static void main(String[] args) {

        String str1 = "malayalam";
        System.out.println(str1);

        int flag = 0;

        for(int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            
            for(int j = str1.length()-1; j > i; j--) {
                if(str1.charAt(i) != str1.charAt(j)) {
                   flag = 0; 
                   System.out.println("String " +str1+ " is not Palindrome");
                   break;
                }
                else {
                    flag = 1;
                    System.out.println("String " +str1+ " is Palindrome");
                    break;
                }
            }
            if(flag == 1) {
                break;
            }
            else {
                break;
            }
        }
        System.out.println(flag);
    }
}
