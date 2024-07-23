package devs.fmm.imperativeprogramming.loops;

import java.util.Scanner;

public class OutputSimpleChessboard {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter width");

        int width = sc.nextInt();

        System.out.println("Enter height");

        int height = sc.nextInt();

        System.out.println("Checkerboard width: " + width);

        System.out.println("Checkerboard height: " + height);


        String black = "_";
        String white = "#";

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < width; j++) {

                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print(black);
                    } else {
                        System.out.print(white);
                    }
                } else {
                    if (j % 2 == 0) {
                        System.out.print(white);
                    } else {
                        System.out.print(black);
                    }
                }

            }
            System.out.println();
        }
    }
}
