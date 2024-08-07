package devs.fmm.writingyourownclasses.classdeclarationobjectproperties;

public class Radio {
    private boolean isOn;
    private int volume;
    private double frequency;

    public int getVolume() {
        return volume;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public void volumeUp() {
        if (volume < 100) {
            volume++;
        }
    }

    public void volumeDown() {
        if (volume > 0) {
            volume--;
        }
    }

    public void on() {
        isOn = true;
    }

    public void off() {
        isOn = false;
    }

    // naming convention for booleans getters
    private boolean isOn() {
        return isOn;
    }

    @Override
    public String toString() {

        return isOn() ? "Radio[volume=" + volume + ", frequency="+frequency+", is " + "on]" : "Radio[off]";
    }
}
