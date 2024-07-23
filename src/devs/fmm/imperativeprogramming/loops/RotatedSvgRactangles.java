package devs.fmm.imperativeprogramming.loops;

public class RotatedSvgRactangles {
    public static void main(String[] args) {

        System.out.println("<svg height=\"200\" width=\"200\">");

        for (int i = 0; i < 36; i++) {

            System.out.println("\t<rect x=\"50\" y=\"50\" width=\"100\" height=\"100\" stroke=\"black\" " +
                    "fill=\"none\" transform=\"rotate(" + (i * 10) + " 100 100)\" />");

        }

        System.out.println("</svg>");
    }
}
