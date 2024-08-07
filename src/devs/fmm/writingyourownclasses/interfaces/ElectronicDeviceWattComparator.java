package devs.fmm.writingyourownclasses.interfaces;

import java.util.Comparator;

public class ElectronicDeviceWattComparator implements Comparator<ElectronicDevice> {

    @Override
    public int compare(ElectronicDevice o1, ElectronicDevice o2) {
        // negative if o1<o2
        // positive if o1>o2
        // 0 equals
        return o1.getWattage()-o2.getWattage();
    }
}
