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

    static double stationNameToFrequency(String stationName) {
        if(stationName==null) return 0;
        return switch (stationName) {
            case "Walking the Plank" -> 98.3;
            case "Radio 3" -> 88.4;
            case "Radio Riel" -> 97.1;
            case "Radio Clandestine"-> 77.7;
            default -> 0;
        };
    }

    @Override
    public String toString() {

        return isOn() ? "Radio[volume=" + volume + ", frequency=" + frequency + ", is " + "on]" : "Radio[off]";
    }
}
