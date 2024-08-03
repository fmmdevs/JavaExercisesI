package devs.fmm.writingyourownclasses.inheritance;


public class Application {
    public static void main(String[] args) {

        Radio r1 = new Radio();
        r1.on();
        r1.volumeUp();

        Radio r2 = new Radio();
        r2.off();

        IceMachine ice1 = new IceMachine();
        ice1.on();


        Ship ship1 = new Ship();
        ship1.load(r1);
        ship1.load(r2);
        ship1.load(ice1);

        System.out.println("Number of Electronic Devices Switched On : "+ ElectronicDevice.numberOfElectronicDevicesSwitchedOn(r1, r2, ice1));

        System.out.println(ship1);


        Firebox fb = new Firebox();
        System.out.println(fb.isOn());
        fb.off();
        System.out.println(fb.isOn());

    }
}
