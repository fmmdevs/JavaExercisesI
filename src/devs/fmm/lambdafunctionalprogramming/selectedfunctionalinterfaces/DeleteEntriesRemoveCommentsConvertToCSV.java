package devs.fmm.lambdafunctionalprogramming.selectedfunctionalinterfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DeleteEntriesRemoveCommentsConvertToCSV {


    public static void main(String[] args) {
        record City(String name, int population) {
        }

        List<City> cityTour = new ArrayList<>();

        City g = new City("Gotham (cathedral)", 8_000_000);
        City m = new City("Metropolis (pleasure garden)", 1_600_000);
        City h = new City("Hogsmeade (shopping street)", 1_124);

        Collections.addAll(cityTour, g, m, h);

        System.out.println(cityTour);

        // Removing cities with less than 10_000 population using removeIf
        // implementing boolean test(T t) from functional interface Predicate
        cityTour.removeIf(city -> city.population() < 10_000);
        System.out.println(cityTour);

        // Removing comments in brakets from each city name using replaceAll()
        // implementing UnaryOperator<E> operator
        cityTour.replaceAll(city -> new City(city.name().substring(0, city.name().indexOf('(')-1), city.population()));
        System.out.println(cityTour);

        // Using forEach to make the data of the cities appear on the screen in CSV format
        cityTour.forEach(city -> System.out.println(city.name() + "," + city.population()));


    }
}
