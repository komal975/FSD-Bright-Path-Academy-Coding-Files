public class SmallAlphabetCount {
    
    public static void main(String[] args) {
        String str1 = "komal@1996@ansh";
        System.out.println(str1);
        int count = 0;
        
        for(int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if(ch <= 'z' && ch >= 'a') {
                count++;
            }
        }
        System.out.println("Count of small alphabets in string : " +count);
    }

}
