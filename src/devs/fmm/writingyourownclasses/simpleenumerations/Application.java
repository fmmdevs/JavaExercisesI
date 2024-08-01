package devs.fmm.writingyourownclasses.simpleenumerations;

public class Application {
    public static void main(String[] args) {

        Radio radio = new Radio();
        radio.on();
        radio.setFrequency(23.4);
        radio.volumeUp();
        radio.setModulation(Modulation.AM);
        System.out.println(radio);

        radio.setModulation(Modulation.FM);
        System.out.println(radio);
        radio.off();
        System.out.println(radio);
    }
}
