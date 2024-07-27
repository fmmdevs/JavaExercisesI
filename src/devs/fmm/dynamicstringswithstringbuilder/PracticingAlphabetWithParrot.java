package devs.fmm.dynamicstringswithstringbuilder;

public class PracticingAlphabetWithParrot {

    private static String abcz() {
        StringBuilder result = new StringBuilder();
        for (int i = 'A'; i <= 'Z'; i++) {
          /*  System.out.println(i);
            System.out.println(Character.toString(i));*/
            result.append(Character.toString(i));
        }
        System.out.println(result);
        return result.toString();
    }

    private static String abcz(char start, char end) {
        if(start>=end){
            System.err.println("Start must be bigger than end");
            return "";
        }
        StringBuilder result = new StringBuilder();

        for (int i = start; i <= end; i++) {
            result.append(Character.toString(i));
        }
        System.out.println(result);
        return result.toString();
    }

    private static String abcz(char start, int length) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < start + length; i++) {
            result.append(Character.toString(i));
        }
        System.out.println(result);
        return result.toString();
    }

    public static void main(String[] args) {
        abcz();
        abcz('B', 'T');

        abcz('A',3);
    }


}
