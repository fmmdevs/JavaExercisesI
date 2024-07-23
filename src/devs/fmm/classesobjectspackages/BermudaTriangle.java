package devs.fmm.classesobjectspackages;

import java.awt.*;
import java.util.Scanner;

public class BermudaTriangle {

    public static boolean isPointOnLine(Point lineP1, Point lineP2, Point point) {
        // y = mx + b

        // m = (y2-y1)/(x2-x1)

        double m = ((double) lineP2.y - lineP1.y) / ((double) lineP2.x - lineP2.x);

        //b = y-mx;
        double b = lineP1.y - m * lineP1.x;

        return point.y == m * point.x + b;
    }

    static Polygon resetWithRandomTriangle(Polygon polygon, int min, int max) {
        // Reset Polygon
        polygon.reset();

        double f;
        int x, y;

        for (int i = 0; i < 3; i++) {
            // Random x between [mix,max]
            f = Math.random() / Math.nextDown(1.0);
            x = (int) Math.round(min * (1.0 - f) + max * f);

            // Random y between [mix,max]
            f = Math.random() / Math.nextDown(1.0);
            y = (int) Math.round(min * (1.0 - f) + max * f);
            polygon.addPoint(x, y);
        }

        return polygon;
    }

    // min and max for coordinates
    static Polygon createRandomTriangle() {
       /* Polygon triangle = new Polygon();
        double f;
        int x,y;

        for(int i = 0; i<3; i++){
            // Random x between [mix,max]
            f = Math.random() / Math.nextDown(1.0);
            x =(int) Math.round(min * (1.0 - f) + max * f);

            // Random y between [mix,max]
            f= Math.random()/Math.nextDown(1.0);
            y =(int) Math.round(min * (1.0 - f) + max * f);
            triangle.addPoint(x,y);
        }
        return triangle;*/

        return resetWithRandomTriangle(new Polygon(), 0, 50);
    }

    public static void main(String[] args) {

        final int DIMENSION = 50;
        final String RAINBOW = "\uD83C\uDF08";
        final String FOG = "\uD83C\uDF2B";
        final String OCTOPUS = "\uD83D\uDC19";

        final String BOAT = "\uD83D\uDEE5";
        final String DEATH = "\uD83D\uDC80";

        Scanner sc = new Scanner(System.in);

        Polygon polygon = new Polygon();

        int x1, x2, x3, y1, y2, y3;

        x1 = 5;
        y1 = 5;

        x2 = 23;
        y2 = 45;

        x3 = 47;
        y3 = 1;

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        Point p3 = new Point(x3, y3);

        polygon.addPoint(p1.x, p1.y);
        polygon.addPoint(p2.x, p2.y);
        polygon.addPoint(p3.x, p3.y);


        resetWithRandomTriangle(polygon, 0, DIMENSION - 1);

        System.out.println("Enter ship's position x");
        int xShip = sc.nextInt();

        System.out.println("Enter ship's position y");
        int yShip = sc.nextInt();

        Point shipPosition = new Point(xShip, yShip);

        for (int x = 0; x < DIMENSION; x++) {
            for (int y = 0; y < DIMENSION; y++) {

                if (x == shipPosition.x && y == shipPosition.y) {

                    if (polygon.contains(shipPosition)) {

                        System.out.print(DEATH);

                    } else {

                        System.out.print(BOAT);
                    }

                } else if (x == 0 || x == DIMENSION - 1 || y == 0 || y == DIMENSION - 1) {

                    System.out.print(RAINBOW);

                } else {
                    // Interesting: We can use ternary operator inside sout
                    System.out.print(polygon.contains(x, y) ? OCTOPUS : FOG);
                }

            }
            System.out.println();
        }

    }
}
