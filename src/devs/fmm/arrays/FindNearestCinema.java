package devs.fmm.arrays;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class FindNearestCinema {

    // Return the distance to the closest point to 0,0
    // With size we can specify how many array elements should be considered
    static double minDistance(Point[] points, int size) {
        // distance = sqrt( ((x2-x1)^2) + ((y2-y1)^2) )
        // x1=0 y1=0 => sqrt( (x2)^2 + (y2)^2 )
        double minDistance = Math.sqrt(Math.pow(points[0].x, 2) + Math.pow(points[0].y, 2));
        double distance;
        for (int i = 1; i < size; i++) {
            distance = Math.sqrt(Math.pow(points[i].x, 2) + Math.pow(points[i].y, 2));

            if (minDistance > distance) minDistance = distance;

        }

        return minDistance;
    }

    // Return the distance to the closest point to 0,0 and the point itself
    static Object[] minDistanceWithPoint(Point[] points, int size) {

        try {
            // Class Point has a method to calculate distances
            double distance;

            double minDistance = Point.distance(0, 0, points[0].x, points[0].y);

            Point closerPoint = new Point();

            for (int i = 1; i < size; i++) {
                try {
                    distance = Point.distance(0, 0, points[i].x, points[i].y);

                    if (minDistance > distance) {
                        minDistance = distance;
                        closerPoint.setLocation(points[i].x, points[i].y);
                    }
                } catch (NullPointerException e) {
                    System.err.println("Error: " + e.getMessage());

                }

            }

            //Object[] distanceAndPoint = {closerPoint, minDistance};
            return new Object[]{closerPoint, minDistance};


        } catch (NullPointerException e) {
            System.err.println("Error: " + e.getMessage());

        }
        return null;
    }

    static Point[] randomPoints(int size) {
        Random random = new Random();

        Point[] points = new Point[size];

        for (int i = 0; i < size; i++) {
            points[i] = new Point(random.nextInt(100), random.nextInt(100));
        }

        return points;
    }

    public static void main(String[] args) {
        Point[] points = {new Point(10, 20), new Point(12, 2), new Point(44, 4)};

        System.out.println(minDistance(points, points.length));

        System.out.println(Arrays.toString(minDistanceWithPoint(points, points.length)));
        System.out.println("---------------------");

        // with random points
        Point[] points2 = randomPoints(20);
        System.out.println(Arrays.toString(points2));

        System.out.println(minDistance(points2, points2.length));
        System.out.println(Arrays.toString(minDistanceWithPoint(points2, points2.length)));


        System.out.println("---------------------");
        System.out.println("Testing null exception");

        Point[] pointsNull = null;

        Point[] pointsNull1 = {new Point(1, 2), new Point(3, 6), null, new Point(45, 34)};

        System.out.println(Arrays.toString(minDistanceWithPoint(pointsNull, 3)));
        System.out.println(Arrays.toString(minDistanceWithPoint(pointsNull1, pointsNull1.length)));
    }
}
