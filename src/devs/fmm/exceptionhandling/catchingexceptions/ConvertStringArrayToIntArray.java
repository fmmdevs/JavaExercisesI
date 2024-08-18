package devs.fmm.exceptionhandling.catchingexceptions;

import java.util.Arrays;

public class ConvertStringArrayToIntArray {
    static int[] parseInts(String... numbers){
        if(numbers == null) throw new NullPointerException("The argument can't be null");
        int[] numbersInt = new int[numbers.length];

        for(int i = 0; i<numbersInt.length; i++){
            try {
                numbersInt[i] = Integer.parseInt(numbers[i]);
            } catch (NumberFormatException e){
                numbersInt[i] = 0;
                System.out.println("String at position " + i + " is not a number (is "+numbers[i]+" )");
            }
        }

        return numbersInt;
    }

    public static void main(String[] args) {
        int[] ints = parseInts("123","123333","1111","34234", null, "666","Hola", "7777");
        System.out.println(Arrays.toString(ints));

        try {
            parseInts(null);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
