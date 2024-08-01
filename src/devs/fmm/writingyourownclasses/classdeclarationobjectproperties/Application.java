package devs.fmm.writingyourownclasses.classdeclarationobjectproperties;

public class Application {
    public static void main(String[] args) {

        Radio grandmasOldRadio= new Radio();
        grandmasOldRadio.on();

        grandmasOldRadio.volumeUp();
        grandmasOldRadio.volumeUp();
        System.out.println(grandmasOldRadio);
        grandmasOldRadio.volumeDown();
        System.out.println(grandmasOldRadio);
        grandmasOldRadio.volumeUp();
        System.out.println(grandmasOldRadio);
        grandmasOldRadio.off();
        System.out.println(grandmasOldRadio);

        System.out.println(Radio.stationNameToFrequency("Walking the Plank"));
        System.out.println(Radio.stationNameToFrequency(null));
    }
}
