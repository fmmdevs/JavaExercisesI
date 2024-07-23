package devs.fmm.imperativeprogramming.loops;

public class SvgPearlChain {
    public static void main(String[] args) {

        System.out.println("<svg height=\"100\" width=\"1600\">");
        for (int i = 0; i < 50; i++) {
            System.out.println("<circle cx=\"" + (20 + 30 * i) + "\" cy=\"20\" r=\"5\" fill=\"blue\" />");
            System.out.println("<circle cx=\"" + (30 + 30 * i) + "\" cy=\"20\" r=\"5\" fill=\"green\" />");
            System.out.println("<circle cx=\"" + (40 + 30 * i) + "\" cy=\"20\" r=\"5\" fill=\"orange\" />");
        }
        System.out.println("</svg>");


    }
}
