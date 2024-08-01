package devs.fmm.classdeclarationobjectproperties;

public class Application {
    public static void main(String[] args) {

        Radio grandmasOldRadio= new Radio();
        System.out.println(grandmasOldRadio.isOn());
        grandmasOldRadio.on();
        System.out.println(grandmasOldRadio.isOn);
        System.out.println(grandmasOldRadio.volume);
        grandmasOldRadio.volumeUp();
        grandmasOldRadio.volumeUp();
        System.out.println(grandmasOldRadio);
        grandmasOldRadio.volumeDown();
        System.out.println(grandmasOldRadio);
        grandmasOldRadio.volumeUp();
        System.out.println(grandmasOldRadio);
        grandmasOldRadio.off();
        System.out.println(grandmasOldRadio);
    }
}
