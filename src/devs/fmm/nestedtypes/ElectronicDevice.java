package devs.fmm.nestedtypes;

import java.util.Comparator;

public class ElectronicDevice {
    protected boolean isOn;
    protected int wattage;

    public ElectronicDevice(){}

    public ElectronicDevice(int wattage){
        this.wattage=wattage;
    }

    public void on() {

        isOn = true;
    }

    public void off() {

        isOn = false;
    }

    public int getWattage() {
        return wattage;
    }

    public int compare(ElectronicDevice o1, ElectronicDevice o2){

        // Local class
        class CompareElectronicDevice implements Comparator<ElectronicDevice>{

            @Override
            public int compare(ElectronicDevice o1, ElectronicDevice o2) {
                return Integer.compare(o1.getWattage(), o2.getWattage());
            }
        }
        CompareElectronicDevice compare = new CompareElectronicDevice();
        return compare.compare(o1,o2);


    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    // naming convention for booleans getters
    public boolean isOn() {

        return isOn;
    }

    public static int numberOfElectronicDevicesSwitchedOn(ElectronicDevice... devices){
        int count = 0;
        for(ElectronicDevice device: devices){
            if(device.isOn()) count++;
        }
        return count;
    }

    @Override
    public String toString() {
        return "\n\tElectronicDevice[" +
                "wattage=" + wattage +
                "kW]";
    }
}
