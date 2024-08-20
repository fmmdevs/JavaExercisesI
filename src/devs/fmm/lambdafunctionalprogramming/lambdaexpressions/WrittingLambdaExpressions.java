package devs.fmm.lambdafunctionalprogramming.lambdaexpressions;

import devs.fmm.writingyourownclasses.interfaces.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class WrittingLambdaExpressions {
    public static void main(String[] args) {

        // interface Runnable { void run();}
        Runnable runnable = () -> System.out.println("Running");

        // interface ActionListener { void actionPerformed(ActionEvent e) }
        ActionListener listener = e -> System.out.println("Action timestamp : " + e.getWhen());

        // interface Supplier<T> { T get(); }
        Supplier<Radio> radioSupplier = () -> new Radio(80);

        Radio radio = new Radio("Radio Riel");
        // interface Consumer<T> { void accept(T t); }
        Consumer<ElectronicDevice> electronicDeviceConsumer = (electronicDevice) -> System.out.println("Consuming " + electronicDevice);
        Consumer<ElectronicDevice> electronicDeviceConsumer1 = electronicDeviceConsumer.andThen(electronicDevice -> electronicDevice.off());
        Consumer<ElectronicDevice> electronicDeviceConsumer2 = electronicDeviceConsumer1.andThen(electronicDevice -> System.out.println(electronicDevice.isOn()));

        // interface Comparator<T> { int compare(T o1, T o2); }
        var electronicDevices = new ArrayList<ElectronicDevice>();
        electronicDevices.add(new Radio(10));
        electronicDevices.add(new Radio(54));
        electronicDevices.add(new TV(199));
        electronicDevices.add(new Firebox(1000));
        electronicDevices.add(new IceMachine(10));

        Comparator<ElectronicDevice> electronicDeviceComparator = (electronicDevice1, electronicDevice2) -> Integer.compare(electronicDevice1.getWattage(), electronicDevice2.getWattage());
        // Is equivalent to this:
        //Comparator<ElectronicDevice> electronicDeviceComparator = Comparator.comparingInt(ElectronicDevice::getWattage);

        System.out.println(electronicDevices);
        electronicDevices.sort(electronicDeviceComparator);
        System.out.println(electronicDevices);


        Comparator<Rectangle> rectangleComparator = Comparator.comparingDouble(Rectangle::getHeight);

    }
}
