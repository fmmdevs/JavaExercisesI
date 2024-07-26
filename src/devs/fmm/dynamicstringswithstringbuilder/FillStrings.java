package devs.fmm.dynamicstringswithstringbuilder;

public class FillStrings {
    public static String mix(String string , String fill){
        StringBuilder mixed = new StringBuilder(string);
        for(int i =0; i<mixed.length(); i++){
            if(i%2==1){
                mixed.insert(i,fill);
            }
        }

        System.out.println(mixed);
        return mixed.toString();
    }

    public static void main(String[] args) {
        mix("We're out of rum!", "-");
        mix("Blymey", "♥");
    }
}
