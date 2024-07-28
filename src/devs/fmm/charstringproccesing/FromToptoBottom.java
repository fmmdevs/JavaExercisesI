package devs.fmm.charstringproccesing;

import java.util.Arrays;

public class FromToptoBottom {

    private static void printVerticalToHorizontalWriting(String s) {
        // Split String where line break is placed
        String[] lines = s.split("\\R");

        //System.out.println(Arrays.toString(lines));

        //System.out.println(lines.length);
        for (int i = 0; i < lines.length; i++) {
            for (int j = 0; j < lines[i].length(); j++) {

                System.out.print(lines[j].charAt(i));

            }
        }
    }

    public static void main(String[] args) {
        String s = "s u\ney!\nao ";
        System.out.println("original:");
        System.out.println(s);
        System.out.println("---------");
        System.out.println("translated:");
        printVerticalToHorizontalWriting(s);
    }
}
