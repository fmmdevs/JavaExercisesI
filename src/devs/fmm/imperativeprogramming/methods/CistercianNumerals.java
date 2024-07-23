package devs.fmm.imperativeprogramming.methods;

import java.util.Arrays;

public class CistercianNumerals {
    private final static int[][] base = {{100, 85, 100, 115}};

    private final static int[][] digitOne = {{100, 85, 110, 85}};

    private final static int[][] digitTwo = {{100, 95, 110, 95}};

    private final static int[][] digitThree = {{100, 85, 110, 95}};

    private final static int[][] digitFour = {{100, 95, 110, 85}};

    private final static int[][] digitFive = sum(digitOne, digitFour);

    private final static int[][] digitSix = {{110, 95, 110, 85}};

    private final static int[][] digitSeven = sum(digitOne, digitSix);

    private final static int[][] digitEight = sum(digitTwo, digitSix);

    private final static int[][] digitNine = sum(sum(digitOne, digitTwo), digitSix);

    private final static int[][][] digits = {digitOne, digitTwo, digitThree, digitFour, digitFive, digitSix, digitSeven, digitEight, digitNine};


    // Sum 2 digits
    public static int[][] sum(int[][] digit1, int[][] digit2) {

        int[][] sum = new int[digit1.length + digit2.length][4];

        int i = 0;

        for (int[] line : digit1) {
            sum[i] = line;
            i++;
        }


        for (int[] line : digit2) {
            sum[i] = line;
            i++;
        }

        return sum;

    }

    // digit [1-9]
    public static int[][] tens(int[][] digit) {

        // Very important to copy the array if not we will modify it!!!
        int[][] copy = new int[digit.length][];
        for (int i = 0; i < digit.length; i++) {
            copy[i] = Arrays.copyOf(digit[i], digit[i].length);
        }

        for (int[] line : copy) {
            if (line[0] != base[0][0] && line[2] != base[0][2]) {
                line[0] -= 20;
                line[2] -= 20;
            } else {
                line[2] -= 20;
            }
        }
        return copy;
    }

    public static String generateSvg(int[][] number) {

        StringBuilder svg = new StringBuilder("\t<g style=\"stroke:grey;stroke‑linecap:round;stroke‑width:2\" transform=\"\" >\n");

        svg.append("\t\t<line x1=\"").append(base[0][0]).append("\" y1=\"").append(base[0][1]).append("\" x2=\"").append(base[0][2]).append("\" y2=\"").append(base[0][3]).append("\" />\n");

        for (int[] line : number) {
            // if svg were type String this operations would be very inefficient because String is immutable
            // every concatenation creates a new object String, for that we use StringBuilder
            //svg+="\t\t<line x1=\""+ line[0]+"\" y1=\""+line[1]+"\" x2=\""+line[2]+"\" y2=\""+line[3]+"\" </line>\n";

            svg.append("\t\t<line x1=\"").append(line[0]).append("\" y1=\"").append(line[1]).append("\" x2=\"").append(line[2]).append("\" y2=\"").append(line[3]).append("\" />\n");
        }

        svg.append("\t</g>\n");

        return svg.toString();
    }


    public static void main(String[] args) {

        System.out.println("Enter a number, please");

        int number = new java.util.Scanner(System.in).nextInt();
        int rest = 0;

        String units = "";
        String tens = "";
        String cents = "";
        String thousands = "";

        int digit = 0;
        if (number >= 1000) {
            digit = (int) Math.floor((double) number / 1000);

            rest = number % 1000;
            thousands = generateSvg(digits[digit - 1]).replace("transform=\"\"", "transform=\"rotate (180 100 100)\"");
            number = rest;
        }

        if (number >= 100) {
            digit = (int) Math.floor((double) number / 100);

            rest = number % 100;
            cents = generateSvg(tens(digits[digit - 1])).replace("transform=\"\"", "transform=\"rotate (180 100 100)\"");
            number = rest;
        }

        if (number >= 10) {
            digit = (int) Math.floor((double) number / 10);
            rest = number % 10;

            tens = generateSvg(tens(digits[digit - 1]));
            number = rest;
        }

        if (number >= 1) {
            units = generateSvg(digits[rest - 1]);
        }

       /* System.out.println("Thousands: \n" + thousands);
        System.out.println("Cents: \n" + cents);
        System.out.println("Tens: \n" + tens);
        System.out.println("Units: \n" + units);*/

        int height = 140;
        int width = 140;

        String cisterianNumber = "<svg height=\"" + height + "\" width=\"" + width + "\">\n" + thousands + cents + tens + units +
                "</svg>";

        System.out.println(cisterianNumber);


    }


}
