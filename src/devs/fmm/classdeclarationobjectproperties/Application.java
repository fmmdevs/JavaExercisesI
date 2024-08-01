package devs.fmm.classdeclarationobjectproperties;

public class Application {
    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.volume= 100;
        radio.isOn= true;
        System.out.println(radio);

        Radio radio2 = new Radio();
        radio2.volume=20;
        radio2.isOn=false;
        System.out.println(radio2);
    }
}
