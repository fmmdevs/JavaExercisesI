package devs.fmm.dynamicstringswithstringbuilder;

import java.util.Arrays;

public class NumberToTextualUnaryEncoding {

    private static String encode(int... values) {

        StringBuilder encoding = new StringBuilder();
        for (int i = 0; i < values.length; i++) {

            for (int j = 0; j < values[i]; j++) {
                encoding.append("1");
            }
            encoding.append("0");
        }
        // encode(0,0,0) -> 0000
        if (!encoding.toString().contains("1") && !encoding.toString().isEmpty()) {
            encoding.append("0");
        }

        return encoding.toString();
    }

    private static int[] decode(String value) {
        int[] decoder = new int[value.length()];

        int counter = 0;
        int index = 0;
        for (int i = 0; i < value.length(); i++) {

            if (i == 0 && value.charAt(i) == '0') {
                decoder[index] = 0;
                index++;
                continue;
            }

            if (value.charAt(i) == '1') {
                do {
                    counter++;
                    i++;
                } while (value.charAt(i) == '1');
                decoder[index] = counter;
                index++;
                counter = 0;
            } else {
                //System.out.println("charAt("+i+")=" + value.charAt(i) + "charAt("+(i+1)+")=" + value.charAt(i + 1));
                if (value.charAt(i) == '0' && value.charAt(i -1) == '0') {
                    decoder[index] = 0;
                    index++;
                } else {
                    continue;
                }
            }
        }

        return Arrays.copyOf(decoder,index);
    }

    public static void main(String[] args) {

        System.out.println("encoding [0,1,2,3,0,1] :");
        System.out.println(encode(0, 1, 2, 3, 0, 1));
        System.out.println("encoding [0,0,0] :");
        System.out.println(encode(0, 0, 0));
        System.out.println("encoding nothing :");
        System.out.println(encode());

        System.out.println("---------------");
        System.out.println("decoding \"0101101110010\"");
        System.out.println(Arrays.toString(decode("0101101110010")));

    }

}
