package devs.fmm.writingyourownclasses.interfaces;


import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class Ship {

    private final static int MAXIMUM_POWER_CONSUMPTION = 300;
    public static class AsciiArt {
        public static final String RADIO = " .‑.\n|o.o|\n|:_:|";
        public static final String BIG_TV = """ 
                .‑‑‑..‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑..‑‑‑. 
                |   ||.‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑.||   | 
                |.‑.|||                                    |||.‑.| 
                | o |||                                    ||| o | 
                |`‑'|||                                    |||`‑'| 
                |.‑.|||                                    |||.‑.| 
                | O |||                                    ||| O | 
                |`‑'||`‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑'||`‑'| 
                `‑‑‑'`‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑‑'`‑‑‑' 
                       _||_                            _||_ 
                      /____\\                         /____\\""";
        public static final String TV ="\\  /\n _\\/_\n|    |\n|____|";
        public static final String SOCKET = """
                                  ____ 
                             ____|    \\\\ 
                            (____|      `._____ 
                             ____|         _|___ 
                            (____|       .' 
                                 |____/""";

    }

    // 1:n: 1 Ship can contain many Radios
    private ArrayList<ElectronicDevice> electronicDevices = new ArrayList<>();


    public void holiday() {
        for (ElectronicDevice electronicDevice : electronicDevices) {
            electronicDevice.off();
        }
    }

    public ElectronicDevice findMostPowerConsumingElectronicDevice(){
        ElectronicDeviceWattComparator comparator = new ElectronicDeviceWattComparator();
        return Collections.max(electronicDevices,comparator);
    }

    public void removePowerConsumingElectronicDevices(){
        //IsElectronicDeviceAboveMaxPower predicate = new IsElectronicDeviceAboveMaxPower();
        class IsElectronicDeviceAboveMaxPower implements Predicate<ElectronicDevice>{

            @Override
            public boolean test(ElectronicDevice electronicDevice) {
                return electronicDevice.getWattage()>MAXIMUM_POWER_CONSUMPTION;
            }
        }
        electronicDevices.removeIf(new IsElectronicDeviceAboveMaxPower());
    }
    public void printLoadList(){


        for(ElectronicDevice electronicDevice : electronicDevices){
            if(electronicDevice instanceof Radio){
                System.out.println(AsciiArt.RADIO);
            } else if(electronicDevice instanceof TV && electronicDevice.wattage>10000 ){

                System.out.println(AsciiArt.BIG_TV);
            } else if(electronicDevice instanceof TV){

                System.out.println(AsciiArt.TV);
             } else {
                System.out.println(AsciiArt.SOCKET);
            }

        }
    }

    // pattern matching
    public void printLoadList1(){

        StringBuilder printer = new StringBuilder();
        for(ElectronicDevice electronicDevice : electronicDevices){
            printer.append(switch (electronicDevice){
                case Radio radio -> AsciiArt.RADIO;
                case TV tv -> tv.wattage>10000 ? AsciiArt.BIG_TV+AsciiArt.TV : AsciiArt.TV;
                default -> AsciiArt.SOCKET;
            });

        }
        System.out.println(printer);
    }

    public void load(ElectronicDevice electronicDevice) {
        if (electronicDevice instanceof Radio) {
            if (((Radio) electronicDevice).getVolume() != 0) {
                electronicDevices.add(electronicDevice);
                System.out.println("Remember to pay license fee!");
            }
        } else {
            electronicDevices.add(electronicDevice);
        }
        ElectronicDeviceWattComparator comparator = new ElectronicDeviceWattComparator();
        electronicDevices.sort(comparator);
    }


    @Override
    public String toString() {
        return "Ship{" +
                "electronicDevices=" + electronicDevices +
                '}';
    }
}
