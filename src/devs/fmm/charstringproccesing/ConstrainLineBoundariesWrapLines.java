package devs.fmm.charstringproccesing;

public class ConstrainLineBoundariesWrapLines {
    public static String wrap(String string, int width) {

        StringBuilder wrapped = new StringBuilder();

        int lastIndex = 0;
        // lastIndex -> where last line were split
        for (int i = lastIndex; i < string.length(); i += width) {

            // check if last line
            if (string.length() <= i + width) {

                wrapped.append(string, i, string.length());

            } else {
                // finding splitIndex

                if (string.charAt(i + width) == ' ') {

                    // System.out.println("espace " + i + " " + width);
                    wrapped.append(string.substring(i, i + width).trim()).append("\n");

                } else {

                    //System.out.println("substring " + string.substring(i, i + width));
                    // lastIndex of a ' ' char in a specific line
                    lastIndex = i + string.substring(i, i + width).lastIndexOf(' ');
                    //System.out.println(i + " " + lastIndex);
                    wrapped.append(string.substring(i, lastIndex).trim()).append("\n");
                    i = lastIndex - width + 1;
                }

            }


        }


        // find last space index
        //System.out.println(string.substring(i, i+width));


        return wrapped.toString();
    }

    public static void main(String[] args) {
        String s = "Live now; makes now always the most precious time. " + "Now will never come again.";
        System.out.println(s);
        System.out.println(wrap(s, 30));
    }
}
