public class stringReverseOnPlace {
    public static void main(String[] args) {
        String str1 = "Bright Path";
        System.out.println(str1);

        int left;
        int right;

        for(int i = 0; i < str1.length(); i++) {
            char[] ch = str1.toCharArray();
            left = str1.charAt(0);
            right = str1.charAt(str1.length()-1);
            if(left < right) {
                int temp = ch[left];
                ch[left] = ch[right];
                ch[right] = (char) temp;
                left++;
                right--;
            }
        }
        String reveString = String.valueOf(str1);
        System.out.println(reveString);
    }
}
