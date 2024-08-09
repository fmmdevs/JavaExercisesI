package devs.fmm.writingyourownclasses.enumtypes;

import java.util.Enumeration;
import java.util.Optional;
import java.util.Random;

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

    static CandyType random(){
        // We use Random to generate a int between 0 and the length of the array with the values of CandyType
        Random random = new Random();
        int randomInt = random.nextInt(CandyType.values().length);
        return CandyType.values()[randomInt];

    }

    public static void main(String[] args) {

        for(int i = 0; i< 100; i++){

            System.out.println(CandyType.random());

        }
    }
}
