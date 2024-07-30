package devs.fmm.dynamicstringswithstringbuilder;

import java.util.Random;

public class InsertAndRemoveCrackles {

    private static final String crack = "♫CRACK♪";


    private static String crackle(String message) {

        Random random = new Random();
        StringBuilder crackledMsg = new StringBuilder(message);
        //String crack = " ♫CRACK♪ ";
        int crackFrequency = 1;

        for (int i = 0; i < crackledMsg.length(); i++) {
            if (random.nextInt(10) < crackFrequency) {
                crackledMsg.insert(i, crack);
                i += crack.length();
            }
        }
        System.out.println(crackledMsg);
        return crackledMsg.toString();
    }

    // More realistic
    private static String crackle1(String message) {

        Random random = new Random();
        StringBuilder crackledMsg = new StringBuilder(message);
        int crackFrequency = 1;

        for (int i = 0; i < crackledMsg.length(); i++) {
            if (random.nextInt(10) < crackFrequency) {
                crackledMsg.delete(i, i + crack.length());
                crackledMsg.insert(i, crack);
                i += crack.length();
            }
        }
        System.out.println(crackledMsg);
        return crackledMsg.toString();
    }

    private static String decrackle(String crackledMsg) {
        return crackledMsg.replaceAll(crack, "");
    }


    public static void main(String[] args) {

        String crackle1 = crackle("MAYDAY MAYDAY MAYDAY WE ARE SINKING WE NEED HELP, ANYONE LISTENING");
        System.out.println(decrackle(crackle1));
        System.out.println("-----------");
        String crackle2 = crackle1("MAYDAY MAYDAY MAYDAY WE ARE SINKING WE NEED HELP, ANYONE LISTENING");
        System.out.println(decrackle(crackle2));

    }
}
