public class StringIsVowelOrNot {

    public static void main(String[] args) {
        int flag = 0;
        String str1 = "anshkumaradagale";
        System.out.println(str1);
        System.out.println(str1.length());

        for(int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                flag++;
            }
        }
         System.out.println(flag);
    }
}
