package devs.fmm.writingyourownclasses.interfaces;

public class Firebox extends ElectronicDevice {

    public Firebox(){
        this.isOn=true;
    }
    // If we want to
    /*@Override
    public void off(){
        this.isOn=false;
    }*/

    public Firebox(int watts){
        this.wattage=watts;
    }

    @Override
    public String toString() {
        return super.toString()+" Firebox{" +
                "isOn=" + isOn +
                '}';
    }
}
