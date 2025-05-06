public class NumberPattern1n23n456n78910 {
    public static void main(String[] args)
    {
        for(int i = 1; i <= 10; i++)
        {
            for(int j = 1; j <= 10; j++)
            {
               if (i == 1 && j == 1) {
                    System.out.print(i); 
               }
               else{
                System.out.print(j);
               }
                
            }

        }
    }
}
