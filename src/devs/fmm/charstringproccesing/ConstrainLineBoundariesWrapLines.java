package devs.fmm.charstringproccesing;

public class ConstrainLineBoundariesWrapLines {
    public static String wrap(String string, int width) {

        StringBuilder wrapped = new StringBuilder();

        int index = 0;
        // i: beginIndex . index
        for (int i = 0; i < string.length(); i += width) {

            System.out.println(string.charAt(i) + " ");
            // last line
            if (string.length() < i + width) {

                wrapped.append(string, i, string.length());

            } else {
                // finding splitIndex

                if (string.charAt(index + width) == ' ') {

                    index = index + width;
                } else {

                    index = string.substring(i, index + width).lastIndexOf(' ');
                }

                wrapped.append(string, index, i);
                i = index;
            }


        }


        // find last space index
        //System.out.println(string.substring(i, i+width));


        return wrapped.toString();
    }

    public static void main(String[] args) {
        String s = "Live now; make now always the most precious time. " + "Now will never come again.";
        System.out.println(s);
        System.out.println(wrap(s, 10));
    }
}
