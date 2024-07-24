package devs.fmm.charstringproccesing;

public class CountStringOccurrences {

    public static int countMatches(String string, String other) {

        if (string == null || other == null || string.isEmpty() || other.isEmpty()) return 0;

        int counter = 0;
        int lastIndex = 0;

        while(string.indexOf(other,lastIndex)!=-1){
            counter++;
            lastIndex=string.indexOf(other,lastIndex)+other.length();
        }

        System.out.println(counter);
        return counter;

    }

    public static void main(String[] args) {
        CountStringOccurrences.countMatches("abba", "a");
        CountStringOccurrences.countMatches("aaaa", "aa");
        CountStringOccurrences.countMatches("abba", "ab");
    }
}
