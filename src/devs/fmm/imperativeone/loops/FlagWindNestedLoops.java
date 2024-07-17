package devs.fmm.imperativeone.loops;

public class FlagWindNestedLoops {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");

            }
            System.out.println();
        }
        System.out.println("----------------");

        int z;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                z = 6 - i;
                if (j == 1) {

                    while (z > 0) {
                        System.out.print(" ");
                        z--;
                    }
                }

                System.out.print(i+" ");


            }
            System.out.println();
        }
    }
}
