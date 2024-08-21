package devs.fmm.specialtypes.comparatorcomparable;

import javax.swing.*;
import java.awt.Point;
import java.util.*;

public class FindStoresNearby {

    record Store(Point location, String name) {
    }

    static List<Store> findStoresAround(Collection<Store> stores, Point center) {

        Comparator<Store> orderByDistanceToCenter = (s1, s2) -> Double.compare(s1.location().distance(center), s2.location.distance(center));
         return stores.stream().sorted(orderByDistanceToCenter).toList();

    }

    public static void main(String[] args) {


        List<Store> stores = new ArrayList<>();
        stores.add(new Store(new Point(1, 2), "Shop1"));
        stores.add(new Store(new Point(6, 10), "Shop2"));
        stores.add(new Store(new Point(11, 12), "Shop3"));
        stores.add(new Store(new Point(21, 22), "Shop4"));
        stores.add(new Store(new Point(2, 3), "Shop5"));
        stores.add(new Store(new Point(4, 7), "Shop6"));
        stores.add(new Store(new Point(50, 12), "Shop7"));
        stores.add(new Store(new Point(67, 34), "Shop8"));
        stores.add(new Store(new Point(43, 42), "Shop9"));
        stores.add(new Store(new Point(24, 22), "Shop10"));
        stores.add(new Store(new Point(12, 21), "Shop11"));
        stores.add(new Store(new Point(12, 2), "Shop12"));

        JOptionPane.showMessageDialog(null, "Enter origin coordinates");
        Point center = new Point(Integer.parseInt(JOptionPane.showInputDialog("x")), Integer.parseInt(JOptionPane.showInputDialog("y")));

        System.out.println(findStoresAround(stores,center));



    }
}
