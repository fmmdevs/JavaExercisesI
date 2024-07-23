package devs.fmm.charstringproccesing;

public class FindShortestName {
    private static String shortestName(String... names) {

        StringBuilder shortest = new StringBuilder(names[0]);
        StringBuilder lastString = new StringBuilder();

        for (String name : names) {
            for (int i = 0; i < name.length(); i++) {

                if (name.charAt(i) != ' ') {
                    lastString.append(name.charAt(i));
                    if (i == name.length() - 1 || name.charAt(i + 1) == ' ') {
                        if(lastString.length()<shortest.length()){
                            shortest.delete(0,shortest.length());
                            shortest.append(lastString);
                        }
                        lastString.delete(0,lastString.length());
                    }
                }
            }
        }
        return shortest.toString();
    }

    public static void main(String[] args) {
        System.out.println(shortestName("Albert Tross", "Blowfish", "Nick Olaus", "Jo Ker"));
    }
}
