package devs.fmm.exceptionhandling.writingyourownexceptionclasses;

public class IllegalWattException extends RuntimeException{
    public IllegalWattException(String message) {
        super(message);
    }
}
