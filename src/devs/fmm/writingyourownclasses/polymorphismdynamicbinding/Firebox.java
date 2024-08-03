package devs.fmm.writingyourownclasses.polymorphismdynamicbinding;

public class Firebox extends ElectronicDevice {

    public Firebox(){
        this.isOn=true;
    }
    // If we want to
    /*@Override
    public void off(){
        this.isOn=false;
    }*/

    @Override
    public String toString() {
        return "Firebox{" +
                "isOn=" + isOn +
                '}';
    }
}
