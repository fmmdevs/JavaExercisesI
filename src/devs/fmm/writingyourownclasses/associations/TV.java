package devs.fmm.writingyourownclasses.associations;

public class TV {

    private MonitorTube monitorTube;

    public TV(){
        monitorTube = new MonitorTube();
    }

    public void on() {
        System.out.println("Turning TV on...");
        this.monitorTube.on();
    }

    public void off() {
        System.out.println("Turning TV off...");
        this.monitorTube.off();
    }



}
