package devs.fmm.imperativeprogramming.methods;

public class LinePrinter {
    public static void line() {
        System.out.println("♥♥♥♥♥♥♥♥♥♥");
    }

    public static void line(int len) {
        line(len,'-');
    }

    public static void line(int len, char c) {
        for (int i = 0; i < len; i++) {
            System.out.print(c);
        }
    }

    public static void line(String prefix, int len, char c, String suffix){
        System.out.print(prefix);
        line(len,c);
        System.out.print(suffix);
    }
}
