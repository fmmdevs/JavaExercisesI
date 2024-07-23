package devs.fmm.imperativeprogramming.methods;

public class LinePrinterDemo {
    public static void main(String[] args) {
        LinePrinter.line();

        LinePrinter.line(4);

        System.out.println();

        LinePrinter.line(4, '$');

        System.out.println();

        LinePrinter.line("╠", 3, '=', "╣");
    }
}
