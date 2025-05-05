public class StarPatternHlafStarPyramid {
    public static void main(String[] args)
    {
        for(int i = 1; i <=3 ; i++)
        {
            for(int j = 1; j <= 5; j++)
            {
                 if (i == 2 || j == 2 || j == 4) {
                    System.out.println("*");
             }
                else{
                    System.out.print(" ");
                }
                
        }
        System.out.println();
    }
}
}

