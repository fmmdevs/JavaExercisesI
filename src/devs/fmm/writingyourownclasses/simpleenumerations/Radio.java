package devs.fmm.writingyourownclasses.simpleenumerations;

public class Radio {
    private boolean isOn;
    private int volume;
    private double frequency;
    private Modulation modulation;

    public Modulation getModulation() {
        return modulation;
    }

    public void setModulation(Modulation modulation) {
        this.modulation = modulation;
    }

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

        return isOn() ? "Radio[volume=" + volume + ", frequency=" + frequency +" "+ modulation + "]" : "Radio[off]";
    }
}
