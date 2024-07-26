package devs.fmm.charstringproccesing;

public class ConstrainLineBoundariesWrapLines {
    public static String wrap(String string, int width) {

        StringBuilder wrapped = new StringBuilder();

        int indexLine = 0;
        for (int i = 0; i < string.length(); i += width) {

            // last line
            if(i>=string.length()){
                wrapped.append(string, i,string.length());
            }
            // when char is not a space, we can't split the word.
            if (string.charAt(i) != ' ') {
                if(string.length()-i>=width){
                    indexLine = string.substring(i, i+width).lastIndexOf(' ');
                    wrapped.append(string, i , indexLine).append("\n");
                    i= indexLine;
                } else {

                }

            } else {
                wrapped.append(string, i, i + width).append("\n");

            }


            // find last space index
            //System.out.println(string.substring(i, i+width));

        }

        return wrapped.toString();
    }

    public static void main(String[] args) {
        String s = "Live now; make now always the most precious time. " + "Now will never come again.";
        System.out.println(wrap(s, 30));
    }
}
