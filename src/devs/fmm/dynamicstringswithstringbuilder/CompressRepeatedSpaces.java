package devs.fmm.dynamicstringswithstringbuilder;

import java.util.ArrayList;
import java.util.Arrays;

public class CompressRepeatedSpaces {
    static StringBuilder compressSpace(StringBuilder string) {

     /*   int[] beginIndexes = new int[string.length() / 2];
        int[] endIndexes = new int[string.length() / 2];*/

        // ArrayList to save the beginning and end indexes of a sequence of spaces
        ArrayList<Integer> beginIndexes = new ArrayList<>();
        ArrayList<Integer> endIndexes = new ArrayList<>();

        // find start and end indexes where there is two or more spaces
        for (int i = 0; i < string.length(); i++) {
            if (i + 1 < string.length()) {
                if (string.charAt(i) == ' ' && string.charAt(i + 1) == ' ') {
                    beginIndexes.add(i);
                    while (string.charAt(i + 1) == ' ') {
                        i++;
                        if (i + 1 >= string.length()) break;
                    }
                    endIndexes.add(i);
                }
            }
        }
        System.out.println(beginIndexes);
        System.out.println(endIndexes);

        for(int i = beginIndexes.size()-1; i>=0; i--){
            string.delete(beginIndexes.get(i),endIndexes.get(i));
        }
        System.out.println(string);
        return string;
    }

    public static void main(String[] args) {
        compressSpace(new StringBuilder("Hola Holaa  Holaaa   Holaaaa    Holaaaaa     "));
        compressSpace(new StringBuilder("Will       you      shut  up,        man!    This    is  the                way!"));
    }
}
