package devs.fmm.imperativeone.controlflow;

public class SvgCirclesRandomColors {
    public static void main(String[] args) {

        double f;
        int r;
        String color = "black";


        f = Math.random() / Math.nextDown(1.0);
        r = (int) Math.round(1 * (1.0 - f) + 3 * f);


        switch (r) {
            case 1:
                color = "blue";
                break;
            case 2:
                color = "green";
                break;
            case 3:
                color = "red";
                break;
        }

        System.out.println("<svg>\n" +
                "\t<circle cx=\"20\" cy=\"20\" r=\"5\" fill=\"" + color + "\" /> \n</svg>");

    }
}
