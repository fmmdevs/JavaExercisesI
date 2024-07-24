package devs.fmm.charstringproccesing;

import java.util.Arrays;

public class BuildDiamonds {

    public static void generateDiamond(int width) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int maxWidth = upper.length() * 2;
        if (width > maxWidth - 1) {
            System.err.println("Width must be less than " + maxWidth);
        } else if (width==0) {
            System.out.println("No diamond");
        } else {

            int initialSpaces = (int) Math.floor((double) width - 1) / 2;

            int linesLength = initialSpaces + 1;

            // 1. Generate array with spaces

            StringBuilder[] spaces = new StringBuilder[linesLength];

            for (int i = 0; i < spaces.length; i++) {
                spaces[i] = new StringBuilder();
                for (int j = initialSpaces; j > 0; j--) {
                    spaces[i].append(" ");
                }
                initialSpaces--;
            }

            StringBuilder[] lines = new StringBuilder[linesLength];
            // 2. Generate lines until the middle
            //System.out.println(upper.charAt(linesLength - 1));
            String aux;
            StringBuilder aux2;
            for (int i = 0; i < lines.length; i++) {
                lines[i] = new StringBuilder();
                for (int j = 0; j < linesLength; j++) {
                    lines[i].append(upper.charAt(j));
                }
                aux = lines[i].substring(0, i + 1);
                lines[i].delete(0, lines[i].length());
                lines[i].append(aux);
                if (i != 0) {

                    aux2 = new StringBuilder(lines[i]);
                    aux = aux2.reverse().substring(1, aux2.length());
                    //System.out.println(aux);
                    lines[i].append(aux);
                }
            }
            // 3. Generate semi diamond
            StringBuilder[] semiDiamond = new StringBuilder[linesLength];
            for (int i = 0; i < lines.length; i++) {
                semiDiamond[i] = new StringBuilder(spaces[i].toString() + lines[i] + "\n");

            }

            // 4. Generate full diamond
            StringBuilder[] fullDiamond = Arrays.copyOf(semiDiamond, semiDiamond.length * 2 - 1);

            int copy = linesLength - 2;
            for (int i = linesLength; i < fullDiamond.length; i++) {
                fullDiamond[i] = new StringBuilder();
                fullDiamond[i].append(semiDiamond[copy]);
                copy--;
            }
            //System.out.println(Arrays.toString(semiDiamond));

            //System.out.println(Arrays.toString(fullDiamond));

            for (StringBuilder line : fullDiamond) {
                System.out.print("\t" + line.toString());
            }

        }
    }

    public static void main(String[] args) {

        int width = 0;

        while (true) {
            System.out.println("Enter max width for the diamond, or -1 for exit");
            width = new java.util.Scanner(System.in).nextInt();
            if(width==-1) break;
            generateDiamond(width);
        }

        System.out.println("Ciao Ciao");
    }
}
