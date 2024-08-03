package devs.fmm.writingyourownclasses.inheritance;


import java.util.ArrayList;

public class Ship {
    // 1:n: 1 Ship can contain many Radios
    private ArrayList<ElectronicDevice> electronicDevices = new ArrayList<>();


    public void load(ElectronicDevice electronicDevice) {
        if(electronicDevice instanceof Radio){
            if(((Radio) electronicDevice).getVolume()!=0){
                electronicDevices.add(electronicDevice);
                System.out.println("Remember to pay license fee!");
            }
        } else{
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
