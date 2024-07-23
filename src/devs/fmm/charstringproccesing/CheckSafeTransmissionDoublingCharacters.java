package devs.fmm.charstringproccesing;

public class CheckSafeTransmissionDoublingCharacters {

    private static int isEveryCharacterTwice(String characters) {
        // number of symbols is odd return 0
        if (characters.length() % 2 == 1) return 0;

        char characterOne, characterTwo;
        for (int i = 0; i < characters.length(); i += 2) {

            characterOne = characters.charAt(i);
            characterTwo = characters.charAt(i + 1);

            // each character doesn't occur twice in a row, return the negative index where it should be
            if(characterOne!=characterTwo) return -(i+1);

        }
        // each character occurs twice returns positive number
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isEveryCharacterTwice("jjoovveellyynn"));
        System.out.println(isEveryCharacterTwice("ccapptttaaiinn"));
        System.out.println(isEveryCharacterTwice("222"));

    }
}
