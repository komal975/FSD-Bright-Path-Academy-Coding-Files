public class SymbolCountInString {
    public static void main(String[] args) {
        String str1 = "Komal@Ansh@Kumar$123!>?";
        System.out.println(str1);

        int count = 0;
        int flag = 0;

        for(int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            if(ch >= '0' && ch <= '9') {
                flag = 0;
            }
            else if(ch >= 'a' && ch <= 'z') {
                flag = 0;
            }
            else if(ch >= 'A' && ch <= 'Z') {
                flag = 0;
            }
            else {
                flag = 1;
                count++;
            }
        }
        System.out.println(count);
        System.out.println(flag);
    }
}
