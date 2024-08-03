package devs.fmm.writingyourownclasses.inheritance;

import devs.fmm.writingyourownclasses.associations.Radio;

import java.util.ArrayList;

public class Ship {
    // 1:n: 1 Ship can contain many Radios
    private ArrayList<devs.fmm.writingyourownclasses.associations.Radio> radios = new ArrayList<>();


    public void load(devs.fmm.writingyourownclasses.associations.Radio radio) {
        radios.add(radio);
    }

    public int countDevicesSwitchedOn() {
        int count = 0;
        for (Radio radio : radios) {
            if (radio.isOn()) count++;
        }
        return count;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "radios=" + radios +
                "}";
    }
}
