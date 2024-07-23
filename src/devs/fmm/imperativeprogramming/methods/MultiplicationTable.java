package devs.fmm.imperativeprogramming.methods;

public class MultiplicationTable {

    private static void multiplicationTableHtml(int quantity, String name1, int price1, String name2, int price2) {

        System.out.println("<html>");

        System.out.println("\t<table>");

        System.out.println("\t\t<tr><th>QUANTITY</th><th>"+name1+"</th><th>"+name2+"</th></tr>");

        for (int i = 1; i <= quantity; i++) {

            System.out.println("\t\t<tr><td>" + i + "</td><td>" + (price1 * i) + "</td><td>" + (price2 * i) + "</td></tr>");

        }

        System.out.println("\t</table>");

        System.out.println("</html>");
    }

    public static void main(String[] args) {

        multiplicationTableHtml(10,"FLAMETOWER", 500,"FIRE EXTIGUISHER", 100);

    }
}
