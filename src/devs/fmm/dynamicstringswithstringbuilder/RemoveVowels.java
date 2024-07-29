package devs.fmm.dynamicstringswithstringbuilder;

public class RemoveVowels {

    private static String removeVowels1(String string) {
        return string.replaceAll("[AEIOUaeiou]", "");
    }

    private static String removeVowels2(String string) {
        StringBuilder result = new StringBuilder(string);


        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == 'A' ||
                    result.charAt(i) == 'E' ||
                    result.charAt(i) == 'I' ||
                    result.charAt(i) == 'O' ||
                    result.charAt(i) == 'U' ||
                    result.charAt(i) == 'a' ||
                    result.charAt(i) == 'e' ||
                    result.charAt(i) == 'i' ||
                    result.charAt(i) == 'o' ||
                    result.charAt(i) == 'u') {
                result.delete(i, i+1);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeVowels1("Hola me llamo Juan Antonio. Vivo en Mallorca."));
        System.out.println("------------");
        System.out.println(removeVowels2("Hola me llamo Juan Antonio. Vivo en Mallorca."));
    }
}
