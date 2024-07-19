package devs.fmm.imperativeone.methods;

public class RecursionDingDong {

    // Recursive method that calculates the sum of the digits of a number dong
    static long ding(long dong) {
        return dong == 0 ? 0 : (dong % 10 + ding(dong / 10));
    }

    public static void main(String[] args) {
        System.out.println("Enter a number");

        long dong = new java.util.Scanner(System.in).nextLong();

        System.out.println(ding(dong));
    }
}
