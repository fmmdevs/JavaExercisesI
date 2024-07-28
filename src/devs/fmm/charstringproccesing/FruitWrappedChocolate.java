package devs.fmm.charstringproccesing;

public class FruitWrappedChocolate {

    private static boolean checkChocolate(String fruitSkewer) {

        System.out.println(fruitSkewer.charAt(0) + " vs " + fruitSkewer.charAt(fruitSkewer.length() - 1));

        if (fruitSkewer.length() == 1) return true;

        int middleIndex = (fruitSkewer.length() - 1) / 2;

        // for symmetry we need a odd length, and middle character must be F
        if (fruitSkewer.length() % 2 != 1 || (fruitSkewer.charAt(middleIndex) != 'F')) return false;

        if (fruitSkewer.charAt(0) != fruitSkewer.charAt(fruitSkewer.length() - 1)) return false;


        return checkChocolate(fruitSkewer.substring(1, fruitSkewer.length() - 1));


        //System.out.println(fruitSkewer.charAt(middleIndex));

    }

    public static void main(String[] args) {

        String fruitSkewer1 = "dhFhd";
        String fruitSkewer2 = "dhhFhd";
        String fruitSkewer3 = "dhhdFhhhd";

        System.out.println("-----------------");
        System.out.println(fruitSkewer1);
        System.out.println(checkChocolate(fruitSkewer1));
        System.out.println("-----------------");
        System.out.println(fruitSkewer2);
        System.out.println(checkChocolate(fruitSkewer2));
        System.out.println("-----------------");
        System.out.println(fruitSkewer3);
        System.out.println(checkChocolate(fruitSkewer3));
        System.out.println("-----------------");

      /*  checkChocolate(fruitSkewer2);
        checkChocolate(fruitSkewer3);*/

    }
}
