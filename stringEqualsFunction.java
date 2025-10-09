public class stringEqualsFunction {
    public static void main(String[] args) {
        String s1 = new String("bright");
        String s2 = "bright";
        

        /* Heap                                                    SCP
         * s1 -> bright                                            s2 -> bright <- s3
         */


        //1. Use of ==
        System.out.println(s1==s2);//Retuns false, Because s1 & s2 are different objects even strings are same.

        //2. Use of .equals()
        System.out.println(s1.equals(s2));//Returns True, s1 & s2 are different objects but those objects have same contents.

        String s3 = s2;

        //1. ==
        System.out.println(s2==s3); //Returns true,s2 & s3 both objects are pointing to the same content & in same scp memory so, returns true.

        //2. .equals()
        System.out.println(s2.equals(s3)); //Returns true, s2 & s3 having same contents so, returns true.
    }
}
