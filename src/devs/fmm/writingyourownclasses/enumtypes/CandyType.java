package devs.fmm.writingyourownclasses.enumtypes;

import java.util.Enumeration;
import java.util.Optional;

public enum CandyType {
    CARAMELS,
    CHOCOLATE,
    GUMMIES,
    LICORICE,
    LOLLIPOPS,
    CHEWING_GUMS,
    COTTON_CANDY;

    static Optional<CandyType> fromName(String input){

        // CandyType.valueOf() throw an excepcion if the String is not a value of the enum

        try{
            String upperCase = input.toUpperCase();
            // Optional.of Creates an Optional
            return Optional.of(CandyType.valueOf(upperCase));
        }
        catch(IllegalArgumentException e) {
            // Instead of null we use Optional.empty()
            return Optional.empty();
        }


    }
}
