import java.util.Scanner;

public class KilometerConversionToMeterCentimeter {
    public static void main(String[] args) 
    {
        int Kilometer;
        int Meter;
        int CentiMeter;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Kilometer :");
        Kilometer = sc.nextInt();
        System.out.println("Our Kilometer is: "+Kilometer);

        Meter = Kilometer * 1000;
        System.out.println("Total meter in "+ Kilometer + " Kilometer is :" + Meter + " Meter");

        CentiMeter = Kilometer * 100000;
        System.out.println("Total centimeter in "+ Kilometer + " Kilometer is :" + CentiMeter + " Centimeter");
    }
}
