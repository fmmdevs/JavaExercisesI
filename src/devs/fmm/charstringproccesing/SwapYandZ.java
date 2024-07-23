package devs.fmm.charstringproccesing;

import java.sql.SQLOutput;

public class SwapYandZ {

    private static void printSwappedYZ(String string) {
        int asciiDifference = Character.getNumericValue('z') - Character.getNumericValue('y');
        for (int i = 0; i < string.length(); i++) {
            System.out.print(
                    string.charAt(i) == 'y' || string.charAt(i) == 'Y' ?
                    Character.toString(string.charAt(i) + asciiDifference) :
                    string.charAt(i) == 'z' || string.charAt(i) == 'Z' ?
                            Character.toString(string.charAt(i) - asciiDifference) :
                            string.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printSwappedYZ("yootaxz");
        printSwappedYZ("yootaxzYYYYZA");
        printSwappedYZ("yanthoxzl");
    }
}
