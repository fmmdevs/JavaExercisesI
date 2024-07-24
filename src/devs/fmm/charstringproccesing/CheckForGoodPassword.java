package devs.fmm.charstringproccesing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckForGoodPassword {
    public static boolean isGoodPassword(String password) {
        System.out.println(password);
        // 1. min length 16
        if (password.length() < 16) return false;

        // 2. contains at least one of A-Z, a-z, 0-9, "!@#$%^&*()_+[]{}|;:',.<>?/"

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = upper.toLowerCase();
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()_+[]{}|;:',.<>?/";
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasNumber = false;
        boolean hasSymbols = false;

        for (int i = 0; i < upper.length(); i++) {
            if (password.contains(String.valueOf(upper.charAt(i)))) {
                hasUpper = true;
                break;
            }
        }
        for (int i = 0; i < lower.length(); i++) {
            if (password.contains(String.valueOf(lower.charAt(i)))) {
                hasLower = true;
                break;
            }
        }
        for (int i = 0; i < numbers.length(); i++) {
            if (password.contains(String.valueOf(numbers.charAt(i)))) {
                hasNumber = true;
                break;
            }
        }

        for (int i = 0; i < symbols.length(); i++) {
            if (password.contains(String.valueOf(symbols.charAt(i)))) {
                hasSymbols = true;
                break;
            }
        }
        return (hasUpper&&hasNumber&&hasSymbols&hasLower);
    }

    public static void main(String[] args) {
        System.out.println(isGoodPassword(""));
        System.out.println(isGoodPassword("Aa1!test"));
        System.out.println(isGoodPassword("Zz9#Test123"));

        System.out.println(isGoodPassword("StrongPass123!@#"));
        System.out.println(isGoodPassword("Complex_Example_456$"));
        System.out.println(isGoodPassword("TestingPass1@Secure"));
        System.out.println(isGoodPassword("Qwerty!123_ABC"));
        System.out.println(isGoodPassword("A1a@B2b#C3c$D4d%"));
        System.out.println(isGoodPassword("!Q2w3E$R4t5Y^U6i7O"));
        System.out.println(isGoodPassword("testpassword1!")); // Falta de mayúsculas
        System.out.println(isGoodPassword("weak123password$")); // Falta de mayúsculas
        System.out.println(isGoodPassword("TESTPASSWORD1!")); // Falta de minúsculas
        System.out.println(isGoodPassword("WEAK123PASSWORD$")); // Falta de minúsculas
        System.out.println(isGoodPassword("TestPassword!")); // Falta de números
        System.out.println(isGoodPassword("Secure$Password")); // Falta de números
        System.out.println(isGoodPassword("TestPassword123")); // Falta de caracteres especiales
        System.out.println(isGoodPassword("AnotherStrongPassword1")); // Falta de caracteres especiales
        System.out.println(isGoodPassword("Aa1!")); // Demasiado corta
        System.out.println(isGoodPassword("Z1b!")); // Demasiado corta


    }
}
