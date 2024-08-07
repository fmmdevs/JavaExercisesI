package devs.fmm.writingyourownclasses.interfaces;


public class TV extends ElectronicDevice {

    private MonitorTube monitorTube;

    public TV(){
        monitorTube = new MonitorTube();
        on();
    }

    public TV(int watts){
        this.wattage=watts;
        monitorTube=new MonitorTube();
        on();
    }

    public void on() {
        System.out.println("Turning TV on...");
        super.on();
        this.monitorTube.on();
    }

    public void off() {
        System.out.println("Turning TV off...");
        super.off();
        this.monitorTube.off();
    }

    @Override
    public String toString() {
        return super.toString()+" TV{" +
                "isOn=" + isOn +
                '}';
    }
}
