package devs.fmm.imperativeprogramming.methods;

public class RecursionRepdigit {

    static boolean isRepdigit(long n) {
        //if ((n % 100) / 10 != n % 10) return n < 10;
        if (n % 100 % 11 != 0) return n < 10;
        System.out.println("(n % 100)/10 = " + (n % 100) / 10);
        System.out.println("n % 10 = " + n % 10);
        System.out.println("-------------");

        return isRepdigit(n / 10);
    }

    public static void main(String[] args) {

        System.out.println("Enter a number");
        long n = new java.util.Scanner(System.in).nextLong();
        System.out.println(isRepdigit(n));
    }
}
