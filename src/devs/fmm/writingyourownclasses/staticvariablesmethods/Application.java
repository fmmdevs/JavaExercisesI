package devs.fmm.writingyourownclasses.staticvariablesmethods;

public class Application {
    public static void main(String[] args) {



        Tracer.on();
        Tracer.trace("Start");
        int i = 2;
        Tracer.off();
        Tracer.trace("i="+i);
        Tracer.trace("i=%d", i);
        Tracer.on();
        Tracer.trace("End");
    }
}
