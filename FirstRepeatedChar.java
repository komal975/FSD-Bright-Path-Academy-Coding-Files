public class FirstRepeatedChar {
    public static void main(String[] args) {
        String str1 = "komalumim";
        System.out.println(str1);

        int flag = 0;
        char key;

        for(int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            key = ch;
            for(int j=i+1;j<str1.length();j++){
            if(key != str1.charAt(j)){
                flag = 0; 
            }
            else {
                flag = 1;
                System.out.println(key);
                break;
            }
            }
            if(flag == 1){
            break;
            }
        }
        System.out.println(flag);


    }
}
