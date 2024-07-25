package devs.fmm.charstringproccesing;

import java.util.Arrays;

public class DecolumnizeTexts {
    public static String decolumnize(String text) {

        //1. Split by \n
        String[] columns = text.split("(\n)");

        //System.out.println(Arrays.toString(columns));

        //int[] possibleIndex = new int[10];
        int splitIndex = 0;
        char charBeforeLast;
        char lastChar;


        //2. Detect index that separate the two columns.
        for (int i = 0; i < columns.length; i++) {

            for (int j = columns[i].length() - 1; j >= 2; j--) {
                charBeforeLast = columns[i].charAt(j);
                lastChar = columns[i].charAt(j - 1);
                if (Character.isLetter(charBeforeLast) && lastChar == ' ' && columns[i].charAt(j - 2) == ' ') {
                    //possibleIndex[z]=j-2;
                    splitIndex = j - 2;
                    //System.out.println(Arrays.toString(possibleIndex));
                }
                //System.out.println(charBeforeLast+" "+ lastChar+ " " + columns[i].charAt(j));
            }
        }

        // 3. Create StringBuilder in two steps, one for each column, using the index we found
        StringBuilder decolumnize = new StringBuilder();

        // 3.1 First column
        for (int i = 0; i < columns.length; i++) {
            decolumnize.append(columns[i], 0, splitIndex + 1).append("\n");
        }
        // 3.2 Second column
        for (int i = 0; i < columns.length; i++) {
            decolumnize.append(columns[i], splitIndex + 2, columns[i].length()).append("\n");
        }

        System.out.println(decolumnize);

        return decolumnize.toString();
    }


    public static void main(String[] args) {
        String text =
                "I'm dishonest, and a to watch out for,\n" +
                        "dishonest man you    because you can\n" +
                        "can always trust to  never predict when\n" +
                        "be dishonest.        they're going to do\n" +
                        "Honestly, it's the   something incredibly\n" +
                        "honest ones you want stupid.";


        decolumnize(text);
    }
}
