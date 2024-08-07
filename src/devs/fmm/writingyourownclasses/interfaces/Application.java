package devs.fmm.writingyourownclasses.interfaces;


import java.lang.management.CompilationMXBean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Application {
    public static void main(String[] args) {


        Firebox firebox = new Firebox(404);
        IceMachine iceMachine = new IceMachine(120);
        Radio radio = new Radio(10);
        TV tv = new TV(200);

        System.out.println(firebox);
        System.out.println(iceMachine);
        System.out.println(radio);
        System.out.println(tv);

        Ship ship = new Ship();
        ship.load(firebox);
        ship.load(iceMachine);
        ship.load(radio);
        ship.load(tv);

        System.out.println("\nMost Power Consuming Electronic Device in the Ship:");
        System.out.println(ship.findMostPowerConsumingElectronicDevice());

    }
}
