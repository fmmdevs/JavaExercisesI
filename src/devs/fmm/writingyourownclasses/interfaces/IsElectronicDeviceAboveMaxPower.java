package devs.fmm.writingyourownclasses.interfaces;

import java.util.function.Predicate;

public class IsElectronicDeviceAboveMaxPower implements Predicate<ElectronicDevice> {
    private final int MAXIMUM_POWER_COMSUMPTION= 100;

    @Override
    public boolean test(ElectronicDevice electronicDevice) {
        return MAXIMUM_POWER_COMSUMPTION>electronicDevice.getWattage();
    }
}
