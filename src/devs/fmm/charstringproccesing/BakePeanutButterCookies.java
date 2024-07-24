package devs.fmm.charstringproccesing;

import java.util.Arrays;

public class BakePeanutButterCookies {
    private static int timesCookiesCanBeBaked(String ingredients) {

        int bakes = 0;

        String otherIngredients= String.join("",ingredients.split("(PSE|PES|SPE|SEP|EPS|ESP)"));

        //System.out.println(ingredients);
        //System.out.println(otherIngredients);
        bakes = (ingredients.length()-otherIngredients.length())/3;
        //System.out.println(bakes);


        return bakes;
    }

    public static void main(String[] args) {
        System.out.println(timesCookiesCanBeBaked("PSESEPESP"));
        System.out.println(timesCookiesCanBeBaked("PPPEEESSS"));
        System.out.println(timesCookiesCanBeBaked("SEPEPLSEE"));
    }
}
