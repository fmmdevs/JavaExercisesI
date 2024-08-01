package devs.fmm.classdeclarationobjectproperties;

public class Radio {
    boolean isOn;
    int volume;

    @Override
    public String toString() {
        return isOn ? "Radio on with volume = "+volume : "Radio off";
    }
}
