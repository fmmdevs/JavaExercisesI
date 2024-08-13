package devs.fmm.nestedtypes;

public class Application1 {
    public static void main(String[] args) {
        Radio radio = new Radio("Radio Riel");

        // Is like the nested class was static
        radio.setModulation(Radio.Modulation.AM);
        // If we use a static import of Modulation(import static ...nestedtypes.Radio.Modulation.*) it would be like this:
        // radio.setModulation(AM)

    }
}
