package devs.fmm.arrays.multidimensionalarrays;

import java.util.Arrays;
import java.util.Random;

public class EnlargeImage {
    private static int[][] magnify(int[][] array, int factor) {

        int originalColumns = array.length;
        int originalRows = array[0].length;

        int magnifiedColumns = originalColumns * factor;
        int magnifiedRows = originalRows * factor;
        int[][] magnified = new int[magnifiedColumns][magnifiedRows];

        int element;
        int z;
        int x = 0;
        int y = 0;

        int repeatArray = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                element = array[i][j];
                //System.out.println("Array [" + i + "," + j + "]=" + element);
                z = 0;

                while (z < factor) {

                    magnified[x][y] = element;
                    //System.out.println("Magnified [" + x + "," + y + "]=" + magnified[x][y]);

                    if (y == magnifiedRows - 1 && x != magnifiedColumns - 1) {
                        repeatArray = 0;

                        while (repeatArray < factor) {
                            //System.out.println("Copy:"+ (repeatArray+1));

                            if (x == magnified.length - 1) break;

                            x++;
                            magnified[x] = Arrays.copyOf(magnified[x - 1], magnified[x - 1].length);
                            repeatArray++;
                        }
                        y = 0;
                    } else {

                        y++;
                    }
                    z++;
                }
            }
        }
        return magnified;
    }

    private static int[][] generateRandomImage(int rows, int columns) {

        Random random = new Random();

        int[][] randomImage = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                randomImage[i][j] = random.nextInt(256);
            }
        }

        return randomImage;
    }

    public static void main(String[] args) {
        int[][] image1 = {{1, 2, 3}, {4, 5, 6}};

        System.out.println(Arrays.deepToString(magnify(image1, 2)));
        System.out.println(Arrays.deepToString(magnify(image1, 3)));

        int[][] randomImage1 = generateRandomImage(2,3);
        System.out.println(Arrays.deepToString(randomImage1));

        int[][] randomImage2 = generateRandomImage(5,5);
        System.out.println(Arrays.deepToString(randomImage2));
        System.out.println("---");
        System.out.println(Arrays.deepToString(magnify(randomImage2,5)));
    }
}
