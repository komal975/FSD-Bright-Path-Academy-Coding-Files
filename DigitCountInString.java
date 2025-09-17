public class DigitCountInString {
    public static void main(String[] args) {
        String str1 = "Komal123@Ansh@4567";
        System.out.println(str1);

        int count = 0;
        for(int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            if(ch >= '0' && ch <= '9') {
                count++;
            }
        }
        System.out.println("The count of digits in string is : "+count);
    }
}
