package devs.fmm.writingyourownclasses.polymorphismdynamicbinding;


public class TV extends ElectronicDevice {

    private MonitorTube monitorTube;

    public TV(){
        monitorTube = new MonitorTube();
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
        return "TV{" +
                "isOn=" + isOn +
                '}';
    }
}
