package devs.fmm.writingyourownclasses.interfaces;

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
        return "ElectronicDevice[" +
                "wattage=" + wattage +
                "kW]";
    }
}
