package devs.fmm.writingyourownclasses.associations;

public class Application {
    public static void main(String[] args) {

        Ship ship1 = new Ship();
        Ship ship2 = new Ship();

        ship1.load(new Radio(43.5));
        ship1.load(new Radio(23.5));
        ship1.load(new Radio(13.5));
        ship1.load(new Radio(43.5));
        ship1.load(new Radio(23.5));
        ship1.load(new Radio(73.5));

        ship2.load(new Radio(73.5));

        System.out.println("Ship 1 has "+ ship1.countDevicesSwitchedOn() + " devices on");
        System.out.println("Ship 2 has "+ ship2.countDevicesSwitchedOn() + " devices on");

        System.out.println(ship2);
        System.out.println(ship1);
    }
}
