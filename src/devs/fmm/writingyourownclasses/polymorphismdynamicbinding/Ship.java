package devs.fmm.writingyourownclasses.polymorphismdynamicbinding;


import java.util.ArrayList;

public class Ship {
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
                ;
    }

    // 1:n: 1 Ship can contain many Radios
    private ArrayList<ElectronicDevice> electronicDevices = new ArrayList<>();


    public void holiday() {
        for (ElectronicDevice electronicDevice : electronicDevices) {
            electronicDevice.off();
        }
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
    }


    @Override
    public String toString() {
        return "Ship{" +
                "electronicDevices=" + electronicDevices +
                '}';
    }
}
