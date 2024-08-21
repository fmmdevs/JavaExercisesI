package devs.fmm.specialtypes.comparatorcomparable;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortPointsByDistancetoCenter {


    public static void main(String[] args) {

        // With a local class
        class PointDistanceToZeroComparator implements Comparator<Point> {

            @Override
            public int compare(Point o1, Point o2) {
                return Double.compare(o1.distance(new Point(0,0)), o2.distance(new Point(0,0)));
            }
        }

        Point[] points = {new Point(9, 3), new Point(3, 4), new Point(4, 3), new Point(1, 2)};

        Arrays.sort(points, new PointDistanceToZeroComparator());

        System.out.println(Arrays.toString(points));

        System.out.println("--------------------------------------------------------");

        Point[] points2 = {new Point(9, 3), new Point(3, 4), new Point(4, 3), new Point(1, 2)};

        Arrays.sort(points2, (p1,p2)->Double.compare(p1.distance(0,0),p2.distance(0,0)));
        System.out.println(Arrays.toString(points2));

        System.out.println("--------------------------------------------------------");
        Point[] points3 = {new Point(9, 3), new Point(3, 4), new Point(4, 3), new Point(1, 2)};

        Arrays.sort(points3, Comparator.comparingDouble(p -> p.distance(0, 0)));
        System.out.println(Arrays.toString(points2));



    }
}
