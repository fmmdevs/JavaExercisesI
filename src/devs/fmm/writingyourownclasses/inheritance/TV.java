package devs.fmm.writingyourownclasses.inheritance;

import devs.fmm.writingyourownclasses.associations.MonitorTube;

public class TV extends ElectronicDevice {

    private MonitorTube monitorTube;

    public TV(){
        monitorTube = new MonitorTube();
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



}
