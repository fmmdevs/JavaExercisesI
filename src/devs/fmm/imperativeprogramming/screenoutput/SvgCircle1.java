package devs.fmm.imperativeprogramming.screenoutput;

import java.util.Scanner;

public class SvgCircle1 {
    public static void main(String[] args) {
        System.out.println("<svg height=\"400\" width=\"1000\">\n" +
                "\t<circle cx=\"100\" cy=\"100\" r=\"50\" />\n</svg>");


        int x, y;
        double r;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca int posicion x");
        x = entrada.nextInt();

        System.out.println("Introduzca int posicion y");
        y = entrada.nextInt();

        //r = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 - 1.0;


        double f = Math.random() / Math.nextDown(1.0);
        r = 10 * (1.0 - f) + 20 * f;

        System.out.println("<svg height=\"400\" width=\"1000\">\n" +
                "\t<circle cx=\"" + x + "\" cy=\"" + y + "\" r=\"" + r + "\" />\n</svg>");

        // alternatives for forming random numbers

    /*    double rnd1;

        double rnd2;

        for(int i = 0; i<100; i++){
            rnd1 = java.util.concurrent.ThreadLocalRandom.current().nextDouble(10,20);
            rnd2 = java.util.concurrent.ThreadLocalRandom.current().nextInt(10,20);
            System.out.println(rnd1+ " "+ rnd2);
        }*/

    }

}
