package devs.fmm.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class ReverseArray {
    static void reverse(double[] numbers) {

        double aux;
        for (int i = 0, j = numbers.length - 1; i < (Math.floor((double) numbers.length / 2)); i++, j--) {

            //System.out.println("numbers[" + i + "]=" + numbers[i] + " numbers[" + j + "]=" + numbers[j]);
            aux = numbers[i];

            numbers[i] = numbers[j];
            numbers[j] = aux;
        }
    }

    static double[] randomNumbers(int size) {
        Random random = new Random();
        double[] numbers = new double[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextDouble(50, 20000);
        }
        return numbers;
    }


    public static void main(String[] args) {

        double[] numbers = randomNumbers(10);
        System.out.println(Arrays.toString(numbers));

        // Using stream, Interface Comparator
       /* numbers= Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToDouble(Double::doubleValue)
                .toArray();

        System.out.println(Arrays.toString(numbers));
*/


        reverse(numbers);

        System.out.println(Arrays.toString(numbers));

      /*  double[] numbers1 = randomNumbers(11);
        System.out.println(Arrays.toString(numbers1));

        reverse(numbers1);
        System.out.println(Arrays.toString(numbers1));*/


    }
}
