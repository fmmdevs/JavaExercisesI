package devs.fmm.dynamicstringswithstringbuilder;

public class LoseWeigthMovingDigits {

    private static int cheatedWeight(int weight) {
        StringBuilder cheating = new StringBuilder("" + weight);
        System.out.println(cheating);

        int min = 9;
        int indexMin = 0;

        int max = 1;
        int indexMax = 0;

        int digit = 0;

        for (int i = 0; i < cheating.length(); i++) {

            digit = Integer.parseInt(Character.toString(cheating.charAt(i)));

            if (digit > max) {
                max = digit;
                indexMax = i;
            }

            if (digit < min) {
                min = digit;
                indexMin = i;
            }
        }

        cheating.setCharAt(indexMin, String.valueOf(max).charAt(0));
        cheating.setCharAt(indexMax, String.valueOf(min).charAt(0));

        System.out.println(cheating);
        return Integer.parseInt(cheating.toString());
    }

    public static void main(String[] args) {

        cheatedWeight(987654321);
        System.out.println("--");
        cheatedWeight(1234);
        System.out.println("--");
        cheatedWeight(4321);
    }
}
