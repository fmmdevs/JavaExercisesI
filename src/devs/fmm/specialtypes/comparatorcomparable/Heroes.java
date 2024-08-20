package devs.fmm.specialtypes.comparatorcomparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Heroes {
    private Heroes() {
    }


    public record Hero(String name, Heroes.Hero.Sex sex, int yearFirstAppearance) {
        public enum Sex {MALE, FEMALE}

        public Hero {
            Objects.requireNonNull(name);
            Objects.requireNonNull(sex);
        }
    }

    public static class Universe {
        private final String name;
        private final List<Hero> heroes;

        public Universe(String name, List<Hero> heroes) {
            this.name = Objects.requireNonNull(name);
            this.heroes = Objects.requireNonNull(heroes);
        }

        public String name() {
            return name;
        }

        public Stream<Hero> heroes() {
            return heroes.stream();
        }
    }

    private static final Hero DEADPOOL = new Hero("Deadpool (Wade Wilson)", Hero.Sex.MALE, 1991);
    private static final Hero LANA_LANG = new Hero("Lana Lang", Hero.Sex.FEMALE, 1950);
    private static final Hero THOR = new Hero("Thor (Thor Odinson)", Hero.Sex.MALE, 1950);
    private static final Hero IRON_MAN = new Hero("Iron Man (Anthony 'Tony' Stark)", Hero.Sex.MALE, 1963);
    private static final Hero SPIDERMAN = new Hero("Spider‐Man (Peter Parker)", Hero.Sex.MALE, 1962);
    private static final Hero WONDER_WOMAN = new Hero("Wonder Woman (Diana Prince)", Hero.Sex.FEMALE, 1941);
    private static final Hero CAPTAIN_AMERICA = new Hero("Captain America (Steven Rogers)", Hero.Sex.MALE, 1941);
    private static final Hero SUPERMAN = new Hero("Superman (Clark Kent)", Hero.Sex.MALE, 1938);
    private static final Hero BATMAN = new Hero("Batman (Bruce Wayne)", Hero.Sex.MALE, 1939);

    public static final List<Hero> DC = List.of(SUPERMAN, LANA_LANG, WONDER_WOMAN, BATMAN);
    public static final List<Hero> MARVEL = List.of(DEADPOOL, CAPTAIN_AMERICA, THOR, IRON_MAN, SPIDERMAN);
    public static final List<Hero> ALL = Stream.concat(DC.stream(), MARVEL.stream()).toList();
    public static final List<Universe> UNIVERSES = List.of(new Universe("DC", DC), new Universe("Marvel", MARVEL));


    public static void main(String[] args) {

        List<Hero> allHeroes = new ArrayList<>(Heroes.ALL);
        // anonymous class (In descended order)
        Comparator<Hero> heroComparator = new Comparator<Hero>() {
            @Override
            public int compare(Hero o1, Hero o2) {
                if (Integer.compare(o2.yearFirstAppearance(), o1.yearFirstAppearance()) == 0) {
                    return o1.name().compareTo(o2.name());
                } else return Integer.compare(o2.yearFirstAppearance(), o1.yearFirstAppearance());
            }
        };
        System.out.println("Original order: ");
        System.out.println(allHeroes);

        System.out.println("Using anonymous class and descended order and if the year is the same ordering for name in ascending order");
        allHeroes.sort(heroComparator);
        System.out.println(allHeroes);


        // Implementation of Comparator in a Local class is ascending order
        class localClassHeroComparator implements Comparator<Hero> {

            @Override
            public int compare(Hero o1, Hero o2) {
                return Integer.compare(o1.yearFirstAppearance(), o2.yearFirstAppearance());
            }
        }
        allHeroes.sort(new localClassHeroComparator());
        System.out.println("Local class in ascending order :");
        System.out.println(allHeroes);


        // With a lambda expresion
        allHeroes.sort((hero1, hero2) -> Integer.compare(hero1.yearFirstAppearance(), hero2.yearFirstAppearance()));
        System.out.println("Lambda expresion in ascending order: ");
        System.out.println(allHeroes);


    }

}