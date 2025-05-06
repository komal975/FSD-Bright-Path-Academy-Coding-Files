public class bitwiseOperatorsAndOrExOr {
    public static void main(String [] args)
    {
        //Negation Operator ~
        int a = 4;
        System.out.println(("Not Operator Value: "+~a));

        //Examples of AND
        System.out.println("-----Examples of And Bitwise Operator-----");
        a = 33;
        int b = 67;
        System.out.println("AND Value of " + a +" & "+b + " is: "+(a&b));

        a = 129;
        b = 343;
        System.out.println("AND Value of " + a +" & "+b + " is: "+(a&b));

        a = 57;
        b = 88;
        System.out.println("AND Value of " + a +" & "+b + " is: "+(a&b));

        a = 58;
        b = 23;
        System.out.println("AND Value of " + a +" & "+b + " is: "+(a&b));

        a = 77;
        b = 78;
        System.out.println("AND Value of " + a +" & "+b + " is: "+(a&b));

        //Examples of OR Bitwise Operator
        System.out.println("-----Examples of OR Bitwise Operator-----");
        a = 33;
        b = 67;
        System.out.println("OR Value of " + a +" & "+b + " is: "+(a|b));

        a = 129;
        b = 343;
        System.out.println("OR Value of " + a +" & "+b + " is: "+(a|b));

        a = 57;
        b = 88;
        System.out.println("OR Value of " + a +" & "+b + " is: "+(a|b));

        a = 58;
        b = 23;
        System.out.println("OR Value of " + a +" & "+b + " is: "+(a|b));

        a = 77;
        b = 78;
        System.out.println("OR Value of " + a +" & "+b + " is: "+(a|b));

        //Examples of EX-OR Bitwise Operator
        System.out.println("-----Examples of EX-OR Bitwise Operator-----");
        a = 33;
        b = 67;
        System.out.println("EX-OR Value of " + a +" & "+b + " is: "+(a^b));

        a = 129;
        b = 343;
        System.out.println("EX-OR Value of " + a +" & "+b + " is: "+(a^b));

        a = 57;
        b = 88;
        System.out.println("EX-OR Value of " + a +" & "+b + " is: "+(a^b));

        a = 58;
        b = 23;
        System.out.println("EX-OR Value of " + a +" & "+b + " is: "+(a^b));

        a = 77;
        b = 78;
        System.out.println("EX-OR Value of " + a +" & "+b + " is: "+(a^b));

    }
}
