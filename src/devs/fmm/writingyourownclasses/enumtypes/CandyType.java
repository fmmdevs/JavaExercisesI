package devs.fmm.writingyourownclasses.enumtypes;

import java.util.Enumeration;
import java.util.Optional;
import java.util.Random;

public enum CandyType {
    CARAMELS ( 9 ),
    CHOCOLATE ( 5 ),
    GUMMIES ( 4 ),
    LICORICE ( 3 ),
    LOLLIPOPS ( 2 ),
    CHEWING_GUMS ( 3 ),
    COTTON_CANDY ( 1 );

    private final int addictiveQuality;

    CandyType(int addictiveQuality) {
        this.addictiveQuality=addictiveQuality;
    }

    public int getAddictiveQuality(){
        return addictiveQuality;
    }

    public CandyType next() {
        return switch (this){
            case GUMMIES -> CHOCOLATE;
            case LOLLIPOPS -> Math.random()>0.5 ? LICORICE : CHEWING_GUMS;
            case COTTON_CANDY -> LOLLIPOPS;
            case LICORICE, CHEWING_GUMS -> GUMMIES;
            case CARAMELS, CHOCOLATE -> CARAMELS;
        };
    }

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

        // Math.random() * values().length
        int randomInt = random.nextInt(CandyType.values().length);
        return CandyType.values()[randomInt];

    }



    public static void main(String[] args) {

        for(int i = 0; i< 100; i++){

            System.out.println(CandyType.random());

        }
    }
}
