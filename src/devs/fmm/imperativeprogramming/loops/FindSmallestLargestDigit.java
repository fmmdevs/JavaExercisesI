package devs.fmm.imperativeprogramming.loops;

public class FindSmallestLargestDigit {
    public static void main(String[] args) {

        System.out.println("Enter an integer");

        long number = new java.util.Scanner(System.in).nextLong();

        String numberString = String.valueOf(number);

        int smallest, largest;
        smallest = Integer.parseInt(String.valueOf(numberString.charAt(0)));
        largest = smallest;

        for (int i = 0; i < numberString.length(); i++) {

            int digit = Integer.parseInt(String.valueOf(numberString.charAt(i)));

            if (digit < smallest) {
                smallest = digit;

            }

            if (digit > largest) {
                largest = digit;
            }
        }
        System.out.println(number+ " -> "+smallest+", "+largest);
    }
}
