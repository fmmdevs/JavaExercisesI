package devs.fmm.specialtypes.comparatorcomparable;

import java.awt.*;
import java.util.Arrays;

public class HandleSuperheroes {

    public static void main(String[] args) {
        Point[] points={new Point()
                new Point(9,3),
                new Point(3,4),
                new Point(4,3),
                new Point(1,2)
        };

        // Point has not implemented the Comparable interface.
        //Arrays.sort(points);
        System.out.println(Arrays.toString(points));

        String [] strings={"A", "B","C","B","A"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

    }
}
