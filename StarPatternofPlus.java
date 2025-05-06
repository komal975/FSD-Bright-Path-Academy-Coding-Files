public class StarPatternofPlus {
        public static void main(String[] args){
            int num = 10;
            int num1 = num %2==0 ? num/2 : (num/2) +1;
            for (int i=1;i<=num;i++){
                for(int j=1;j<=num;j++){
                    if(i==num1|| j==num1){
                         System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
        }
    }

