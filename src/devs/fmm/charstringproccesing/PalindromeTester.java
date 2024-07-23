package devs.fmm.charstringproccesing;

public class PalindromeTester {
    private static boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < Math.ceil((double) s.length() / 2); i++, j--) {
            if (s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }

    private static boolean isPalindromeIgnoreCase(String s) {
        String sUpper = s.toUpperCase();
        return isPalindrome(sUpper);
    }

    private static boolean isPalindromeIgnoringNonLettersAndDigits(String s) {
        for (int i = 0, j = s.length() - 1; i < Math.ceil((double) s.length() / 2); i++, j--) {
            if (!Character.isLetterOrDigit(s.charAt(i))) i++;
            if(!Character.isLetterOrDigit(s.charAt(j))) j--;

            if (s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }

    private static boolean isPalindromeIgnoringNonLettersAndDigitsAndCase(String s) {
        String sUpper = s.toUpperCase();
        for (int i = 0, j = sUpper.length() - 1; i < Math.ceil((double) sUpper.length() / 2); i++, j--) {
            if (!Character.isLetterOrDigit(sUpper.charAt(i))) i++;
            if(!Character.isLetterOrDigit(sUpper.charAt(j))) j--;

            if (sUpper.charAt(i) != sUpper.charAt(j)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("111121111"));
        System.out.println(isPalindrome("A man a plan a canal Panama"));
        System.out.println("------");
        System.out.println(isPalindromeIgnoreCase("A man a plan a canal Panama"));
        System.out.println(isPalindromeIgnoreCase("AmanaplanacanalPanama"));
        System.out.println("------");
        System.out.println(isPalindromeIgnoringNonLettersAndDigits("A man a plan a canal Panama"));
        System.out.println(isPalindromeIgnoringNonLettersAndDigits("a man a plan a canal panama"));
        System.out.println("------");
        System.out.println(isPalindromeIgnoringNonLettersAndDigitsAndCase("A man a plan a canal Panama"));
        System.out.println(isPalindromeIgnoringNonLettersAndDigitsAndCase("a man a plan a canal panama"));


    }
}
