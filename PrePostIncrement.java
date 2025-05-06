public class PrePostIncrement {
    public static void main(String [] args)
    {
        int x = 10;
        int y = 0;
        //Pre Increment
        System.out.println("---Pre Increment---");
        y = ++x;
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        
        x=10;
        y=0;
         y = --x;
         System.out.println("x = "+x);
         System.out.println("y = "+y);

         System.out.println("------------");

         //post increment
         System.out.println("---Post Increment---");
         x = 10;
         y = 0;
         y = x++;
         System.out.println("x = "+x);
         System.out.println("y = "+y);

         x=10;
         y=0;
         y = x--;
         System.out.println("x = "+x);
         System.out.println("y = "+y);

        System.out.println("---------------------------------------------");
        System.out.println(" Equation Solving Using Pre & Post Increment");
        
        x=10;
        y=10;
        int z =0;
        System.out.println("Equation 1");
        z = ++x - y-- + x--;
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("z = "+z);

        x=10;
        y=10;
        z =0;
        System.out.println("Equation 2");
        z = x++ + y++ - --x + --y;
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("z = "+z);

        x=10;
        y=10;
        z =0;
        System.out.println("Equation 3");
        z = x-- - ++x + y++ - y--;
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("z = "+z);

        x=10;
        y=10;
        z =0;
        System.out.println("Equation 4");
        z = y++ - x-- + ++z + x++;
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("z = "+z);
        System.out.println("----------------------------------------------------");

        System.out.println("Equation solving using new values and new variables");
        x=20;
        y=30;
        z =0;
        System.out.println("Equation 3");
        z = ++x - y--;
        x = y++ * z++;
        y = --x + z++ ; 
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("z = "+z);
    }
}
