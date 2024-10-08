package devs.fmm.nestedtypes;

import java.util.Comparator;

public class Radio extends ElectronicDevice {
    private int volume;
    private double frequency;
    private Modulation modulation = Modulation.FM;

    // static nested class
    public static class ElectronicDeviceWattComparator implements Comparator<ElectronicDevice> {


        @Override
        public int compare(ElectronicDevice o1, ElectronicDevice o2) {
            return Integer.compare(o1.getWattage(),o2.getWattage());
        }
    }

     public enum Modulation{
        AM,
        FM;
    }


    private final double MIN_AM_FREQUENCY = 148.5 * 1_000;
    private final double MAX_AM_FREQUENCY = 26.1 * 1_000_000;
    private final double MIN_FM_FREQUENCY = 87.5 * 1_000_000;
    private final double MAX_FM_FREQUENCY = 108 * 1_000_000;


    // String or double? units?
    private double minFrequency;
    private double maxFrequency;

    public Radio() {
    }

    public Radio(int watts){
        this.wattage=watts;
    }

    public Radio(double frequency) {
        this.frequency = frequency;
        this.isOn=true;
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

        if(!isOn) on();

        if (volume < 100) {
            volume++;
        }
    }

    public void volumeDown() {
        if (volume > 0) {
            volume--;
        }
        if(volume==0) off();
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

        return isOn() ? super.toString()+" Radio[volume=" + volume + ", frequency=" + frequency + " " + modulation + "]" : super.toString()+" Radio[off]";
    }
}
