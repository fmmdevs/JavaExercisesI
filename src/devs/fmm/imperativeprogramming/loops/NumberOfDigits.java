package devs.fmm.imperativeprogramming.loops;

public class NumberOfDigits {
    public static void main(String[] args) {

        System.out.println("Enter a number");

        int n = new java.util.Scanner(System.in).nextInt();

        int nDigits = 1;

        double div =  n;

        while (div > 10) {

            //System.out.println(div);

            div = div / 10;
            nDigits++;
        }

        System.out.println(n + " -> " + nDigits);


    }
}
