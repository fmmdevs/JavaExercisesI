package devs.fmm.writingyourownclasses.inheritance;


public class Application {
    public static void main(String[] args) {

        Radio r1 = new Radio();
        r1.on();
        Radio r2 = new Radio();
        r2.off();

        IceMachine ice1 = new IceMachine();
        ice1.on();

        System.out.println("Number of Electronic Devices Switched On : "+ ElectronicDevice.numberOfElectronicDevicesSwitchedOn(r1, r2, ice1));
    }
}
