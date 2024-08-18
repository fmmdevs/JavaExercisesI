package devs.fmm.exceptionhandling.writingyourownexceptionclasses;
import devs.fmm.writingyourownclasses.interfaces.*;
public class App {


    public static void main(String[] args) {

        Radio radio = new Radio();

        try {
            radio.setWattage(-123);
        } catch (IllegalWattException e) {
            System.err.println(e);
            System.out.println("Hey");
        }

        System.out.println("Program continues");

    }
}
