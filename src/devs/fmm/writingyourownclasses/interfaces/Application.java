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

        System.out.println("----------------");
        System.out.println(ship);


      /*  System.out.println("------------------");
        Distance oneKm = Distance.ofKilometer( 1 );
        System.out.printf( "1km = %d km, %d m%n", oneKm.kilometer(), oneKm.meter() );
        Distance moreMeter = Distance.ofMeter( 12345 );
        System.out.printf( "12345m = %d km, %d m", moreMeter.kilometer(), moreMeter. meter() );

*/
        ship.removePowerConsumingElectronicDevices();
        System.out.println(ship);
    }
}
