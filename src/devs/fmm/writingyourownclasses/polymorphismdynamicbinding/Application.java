package devs.fmm.writingyourownclasses.polymorphismdynamicbinding;


public class Application {
    public static void main(String[] args) {

        Radio r1 = new Radio();
        r1.volumeUp();

        Radio r2 = new Radio();
        r2.volumeUp();

        Radio r3 = new Radio();

        TV tv = new TV();

        Firebox alarm = new Firebox();

        Ship ship = new Ship();

        ship.load(r1);
        ship.load(r2);
        ship.load(r3);
        ship.load(tv);
        ship.load(alarm);

        System.out.println(ship);

        ship.holiday();

        System.out.println(ship);
    }
}
