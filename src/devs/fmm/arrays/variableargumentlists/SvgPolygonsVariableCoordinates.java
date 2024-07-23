package devs.fmm.arrays.variableargumentlists;

public class SvgPolygonsVariableCoordinates {

    private static void printSvgPolygon(int... coordinates) {

        if(coordinates.length % 2 != 0 ) {
            System.err.println("Coordinates must be even");
        } else {
            StringBuilder svg = new StringBuilder("<svg height=\"260\" width=\"500\">");
            svg.append("\n\t<polygon points=\"");

            for (int i = 0; i < coordinates.length; i++) {
                svg.append(coordinates[i]);

                if (i % 2 == 0) {
                    svg.append(",");
                } else {
                    if (i != coordinates.length - 1) svg.append(" ");
                }
            }

            svg.append("\" style=\"fill:lime;stroke:purple;stroke-width:3\" />");
            svg.append("\n</svg>");

            System.out.println(svg);
        }


    }

    public static void main(String[] args) {
        int[] coordinates = {123, 32, 4, 45, 456, 65, 67};
        int[] coordinates1 = {34, 65, 76, 89, 76, 76, 534534, 234, 23, 324, 234, 234, 234, 23};

        printSvgPolygon(coordinates);
        printSvgPolygon(coordinates1);
        printSvgPolygon(200, 10, 250, 190, 160, 210);
    }
}
