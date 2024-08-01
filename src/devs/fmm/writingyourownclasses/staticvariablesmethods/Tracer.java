package devs.fmm.writingyourownclasses.staticvariablesmethods;

public class Tracer {

    static boolean isOn = false;

    static void trace(String msg) {
        if (isOn) System.out.println(msg);
    }

    static void trace(String format, Object... args){
        if(isOn) System.out.printf(format,args);
    }

    static void on() {
        isOn = true;
    }

    static void off() {
        isOn = false;
    }
}
