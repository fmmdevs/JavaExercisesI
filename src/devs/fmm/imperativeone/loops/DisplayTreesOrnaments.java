package devs.fmm.imperativeone.loops;

public class DisplayTreesOrnaments {
    public static void main(String[] args) {

        System.out.println("Enter the maximum width of the tree");

        int width = new java.util.Scanner(System.in).nextInt();


        int spaces = Math.ceilDiv(width, 2);


        for (int i = 0; i < width; i++) {

            if (i % 2 == 0) {

                for (int z = 0; z < spaces; z++) {

                    System.out.print(" ");

                }
                spaces--;

                for (int j = 0; j <= i; j++) {
                    if (Math.random() < 0.2) {
                        System.out.print("o");
                    } else {
                        System.out.print("*");

                    }
                }
                System.out.println();

            }

        }
    }
}
