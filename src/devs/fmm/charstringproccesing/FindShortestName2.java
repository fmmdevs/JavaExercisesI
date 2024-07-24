package devs.fmm.charstringproccesing;

import java.util.Arrays;

public class FindShortestName2 {
    private static String shortestName(String... names) {
        String shortNames = String.join(" ", names);
        String[] arrayShortNames = shortNames.split(" ");

        int shortestLength = arrayShortNames[0].length();
        int indexShortest = 0;

        for (int i = 0; i < arrayShortNames.length; i++) {

            if(arrayShortNames[i].length()<shortestLength){
                shortestLength=arrayShortNames[i].length();
                indexShortest=i;
            }
        }
        return arrayShortNames[indexShortest];
    }

    public static void main(String[] args) {
        System.out.println(shortestName("Albert Tross", "Blowfish", "Nick Olaus", "Jo Ker"));
    }
}
