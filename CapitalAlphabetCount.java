public class CapitalAlphabetCount {

    public static void main(String[] args) {
        String str1 = "Komal@12@ANSH";
        System.out.println(str1);
        int count = 0;

        for(int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }
        System.out.println("Count of Capital Alphabets in String : "+count);
    }
}
