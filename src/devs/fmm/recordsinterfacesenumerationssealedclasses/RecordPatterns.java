package devs.fmm.recordsinterfacesenumerationssealedclasses;

import java.util.Properties;

public class RecordPatterns {
    record MischiefMonkey(String name, boolean isMutinous){}

    record FeistyParrot(String name, String favoritePhrase, boolean isMutinous){}

    static Properties convertToProperties(Object o){
        Properties  properties = new Properties();

        if(o instanceof MischiefMonkey monkey){
            if(!monkey.isMutinous()) {
                properties.setProperty("Name", monkey.name());
            }
        } else if( o instanceof FeistyParrot parrot){
            if(!parrot.isMutinous()){
                properties.setProperty("Name", parrot.name());
                properties.setProperty("Favourite Phrase", parrot.favoritePhrase());
            }
        }

        return properties;
    }

    public static void main(String[] args) {
        Properties properties = convertToProperties(new MischiefMonkey("Monkey", false));
        Properties properties1 = convertToProperties(new FeistyParrot("Parrot", "Helllooou",false));
        Properties properties2 = convertToProperties(new MischiefMonkey("Monkey", true));
        Properties properties3 = convertToProperties(new FeistyParrot("Parrot", "Helllooou",true));

        Properties properties4 = convertToProperties(null);

        System.out.println(properties);
        System.out.println(properties1);
        System.out.println(properties2);
        System.out.println(properties3);
        System.out.println(properties4);
    }
}
