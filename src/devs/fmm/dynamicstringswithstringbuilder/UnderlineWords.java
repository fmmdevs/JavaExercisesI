package devs.fmm.dynamicstringswithstringbuilder;

import java.sql.SQLOutput;

public class UnderlineWords {
    static void printUnderline(String string, String search) {
        String[] words = string.split(" ");
        StringBuilder underline = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].equalsIgnoreCase(search)) {
                    underline.append("-");
                } else {
                    underline.append(" ");
                }
            }
            underline.append(" ");
        }
        //System.out.println(string.length()+ " "+ underline.length());
        System.out.println(string);
        System.out.println(underline);
        System.out.println();
    }

    public static void main(String[] args) {
        String string = "There is more treasure in books than in all the pirates' loot on Treasure Island";
        printUnderline(string, "treasure");
        printUnderline(string, "IN");
    }
}
