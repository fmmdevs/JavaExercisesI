package devs.fmm.charstringproccesing;

import java.util.Arrays;

public class DetermineLargerCrewSize {

    private static void determineCrewSize(String dash) {

        String[] crews = dash.replace(" ", "").split("-");

        //System.out.println(Arrays.toString(crews));
        int ourCrew = crews[0].length();
        int theirCrew = crews[1].length();
        int difference = Math.abs(ourCrew - theirCrew);

        if (ourCrew > theirCrew) {
            System.out.println(dash + " => " + "Pirate ship had a larger crew, difference " + difference);
        } else if (theirCrew > ourCrew) {
            System.out.println(dash + " => " + "Raided ship had a larger crew, difference " + difference);
        } else {
            System.out.println("Ships had the same crew size");
        }

    }

    public static void main(String[] args) {
        String dash1 = "| - | | |";
        String dash2 = "| - | |";
        String dash3 = "| | - | |";
        String dash4 = "| | | | | - | |";

        determineCrewSize(dash1);
        determineCrewSize(dash2);
        determineCrewSize(dash3);
        determineCrewSize(dash4);
    }
}
