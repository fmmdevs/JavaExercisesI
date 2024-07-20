package devs.fmm.classesobjectspackagestwo.creatingobjects;

import java.awt.*;
import java.util.Scanner;

public class BermudaTriangle {

    public static boolean isPointOnLine(Point lineP1, Point lineP2, Point point) {
        // y = mx + b

        // m = (y2-y1)/(x2-x1)

        double m = (lineP2.y - lineP1.y) / (lineP2.x - lineP2.x);

        //b = y-mx;
        double b = lineP1.y - m * lineP1.x;

        return point.y == m * point.x + b;
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


        System.out.println("Enter ship's position x");
        int xShip = sc.nextInt();

        System.out.println("Enter ship's position y");
        int yShip = sc.nextInt();

        Point shipPosition = new Point(xShip, yShip);

        for (int x = 0; x < 50; x++) {
            for (int y = 0; y < 50; y++) {

                if(x==shipPosition.x && y==shipPosition.y){

                    if(polygon.contains(shipPosition)) {

                        System.out.print(DEATH);

                    } else {

                        System.out.print(BOAT);
                    }

                } else if (x == 0 || x == 49 || y == 0 || y == 49) {

                    System.out.print(RAINBOW);

                } else if (polygon.contains(new Point(x, y))) {

                    System.out.print(OCTOPUS);

                } else {

                    System.out.print(FOG);
                }

            }
            System.out.println();
        }

    }
}
