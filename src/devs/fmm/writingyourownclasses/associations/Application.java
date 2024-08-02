package devs.fmm.writingyourownclasses.associations;

public class Application {
    public static void main(String[] args) {

        Radio radio = new Radio();
        Radio radio2 = new Radio("Radio Clandestine");
        Radio radio3 = new Radio(88.3);
        radio.on();
        radio2.on();
        radio3.on();
        System.out.println(radio);
        System.out.println(radio2);
        System.out.println(radio3);
    }
}
