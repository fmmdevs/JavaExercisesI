package devs.fmm.writingyourownclasses.interfaces;

public class IceMachine extends ElectronicDevice {

    public IceMachine(){}

    public IceMachine(int watts){
        this.wattage=watts;
    }

    @Override
    public String toString() {
        return super.toString()+" IceMachine{" +
                "isOn=" + isOn +
                '}';
    }
}
