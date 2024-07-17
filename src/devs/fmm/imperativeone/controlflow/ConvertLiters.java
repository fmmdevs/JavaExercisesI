package devs.fmm.imperativeone.controlflow;

public class ConvertLiters {
    public static void main(String[] args) {

        System.out.println("Enter quantity in liters");

        double litters = new java.util.Scanner(System.in).nextDouble();

        if (litters >= 1.0) {
            System.out.println("approx. " + (long) Math.floor(litters) + " l");
        } else if (litters >= 0.1) {
            System.out.println("approx. " + (long) Math.floor(litters * 100) + " cl");
        } else if (litters >= 0.001) {
            System.out.println("approx. " + (long) Math.floor(litters * 1000) + " ml");
        } else {
            System.out.println("Value too small to display");
        }



    }
}
