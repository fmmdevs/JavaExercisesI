package devs.fmm.imperativeprogramming.methods;

public class RightTriangle {

    public static boolean isRightTriangle(double a, double b, double c) {

        if (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2))) return true;

        if (Math.pow(b, 2) == (Math.pow(a, 2) + Math.pow(c, 2))) return true;

        if (Math.pow(c, 2) == (Math.pow(a, 2) + Math.pow(b, 2))) return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isRightTriangle(3, 4, 5));
        System.out.println(isRightTriangle(5, 4, 3));
        System.out.println(isRightTriangle(5, 12, 13));
        System.out.println(isRightTriangle(1, 2, 3));
        System.out.println(isRightTriangle(1, 1, Math.sqrt(2)));


    }
}
