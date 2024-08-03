package devs.fmm.writingyourownclasses.inheritance;

public class Firebox extends ElectronicDevice{

    public Firebox(){
        this.isOn=true;
    }
    @Override
    public void off(){
        // Does nothing, we always want to keep the firebox on.
    }

}
