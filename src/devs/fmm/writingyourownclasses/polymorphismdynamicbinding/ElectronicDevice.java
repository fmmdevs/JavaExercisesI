package devs.fmm.writingyourownclasses.polymorphismdynamicbinding;

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
}
