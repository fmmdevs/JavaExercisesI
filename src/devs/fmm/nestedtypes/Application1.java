package devs.fmm.nestedtypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Application1 {
    public static void main(String[] args) {
        ArrayList<ElectronicDevice> electronicDevices = new ArrayList<>();
        Radio radio = new Radio("Radio Riel");
        Radio radio3 = new Radio(40);
        Radio radio4 = new Radio(160);
        Radio radio5 = new Radio(10);
        Radio radio2 = new Radio(110);
        electronicDevices.add(radio);
        electronicDevices.add(radio2);
        electronicDevices.add(radio3);
        electronicDevices.add(radio4);
        electronicDevices.add(radio5);
        electronicDevices.add(radio);


        // Is like the nested class was static
        radio.setModulation(Radio.Modulation.AM);
        // If we use a static import of Modulation(import static ...nestedtypes.Radio.Modulation.*) it would be like this:
        // radio.setModulation(AM)

        Comparator<ElectronicDevice> wattComparator = new Comparator<ElectronicDevice>() {
            @Override
            public int compare(ElectronicDevice o1, ElectronicDevice o2) {
                return Integer.compare(o1.getWattage(), o2.getWattage());
            }
        };

        System.out.println(electronicDevices);
        electronicDevices.sort(wattComparator);
        System.out.println(electronicDevices);
    }
}
