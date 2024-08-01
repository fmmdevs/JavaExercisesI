package devs.fmm.classdeclarationobjectproperties;

public class Radio {
    boolean isOn;
    int volume;

    void volumeUp() {
        if (volume < 100) {
            volume++;
        }
    }

    void volumeDown() {
        if (volume > 0) {
            volume--;
        }
    }

    void on() {
        isOn = true;
    }

    void off() {
        isOn = false;
    }

    boolean isOn() {
        return isOn;
    }

    @Override
    public String toString() {

        return isOn() ? "Radio[volume=" + volume + ", is " + "on]" : "Radio[off]";
    }
}
