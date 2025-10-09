public class StringReverseOnAsItIsPlace {
    public static void main(String[] args) {
        String str1 = "Komalk Ansh";
        System.out.println(str1);

        char[] ch = str1.toCharArray();
        int left = 0;
        int right = str1.length()-6;

        int left1 = 7;
        int right1 = str1.length()-1;

        //For Loop For First Half String
        for(int i = left; i <= right; i++) {
        while(left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
            }
        }

        //For Loop For Second Half String
        for(int i = left1; i <= right1; i++) {
            while(left1 < right1) {
                char temp1 = ch[left1];
                ch[left1] = ch[right1];
                ch[right1] = temp1;
                left1++;
                right1--;
            }
        }
        String revString1 = String.valueOf(ch);
        System.out.println(revString1);
    }
}
