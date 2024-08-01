package devs.fmm.writingyourownclasses.constructors;

public class Radio {
    private boolean isOn;
    private int volume;
    private double frequency;
    private Modulation modulation = Modulation.FM;

    private final double MIN_AM_FREQUENCY = 148.5 * 1_000;
    private final double MAX_AM_FREQUENCY = 26.1 * 1_000_000;
    private final double MIN_FM_FREQUENCY = 87.5 * 1_000_000;
    private final double MAX_FM_FREQUENCY = 108 * 1_000_000;


    // String or double? units?
    private double minFrequency;
    private double maxFrequency;

    public Radio() {
    }

    public Radio(double frequency) {
        this.frequency = frequency;
    }

    public Radio(String stationName) {
        frequency = Radio.stationNameToFrequency(stationName);
    }

    // Copy Constructor
    public Radio(Radio radio) {
        this.volume=radio.volume;
        this.frequency = radio.frequency;
        this.modulation = radio.modulation;
        this.isOn = radio.isOn;
        this.minFrequency = radio.minFrequency;
        this.maxFrequency = radio.maxFrequency;
    }


    public Modulation getModulation() {
        return modulation;
    }

    public void setModulation(Modulation modulation) {
        this.modulation = modulation;
        if (modulation == Modulation.AM) {
            minFrequency = MIN_AM_FREQUENCY;
            maxFrequency = MAX_AM_FREQUENCY;
        }
        if (modulation == Modulation.FM) {
            minFrequency = MIN_FM_FREQUENCY;
            maxFrequency = MAX_FM_FREQUENCY;
        }
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

    static double stationNameToFrequency(String stationName) {
        if (stationName == null) return 0;
        return switch (stationName) {
            case "Walking the Plank" -> 98.3;
            case "Radio 3" -> 88.4;
            case "Radio Riel" -> 97.1;
            case "Radio Clandestine" -> 77.7;
            default -> 0;
        };
    }

    @Override
    public String toString() {

        return isOn() ? "Radio[volume=" + volume + ", frequency=" + frequency + " " + modulation + "]" : "Radio[off]";
    }
}
