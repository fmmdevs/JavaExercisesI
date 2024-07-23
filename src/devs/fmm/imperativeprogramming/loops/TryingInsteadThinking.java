package devs.fmm.imperativeprogramming.loops;

public class TryingInsteadThinking {
    public static void main(String[] args) {

        /*
            X O L
          + L X X
          = T L T
         */

        int xol, lxx, tlt;

        for (int x = 0; x < 10; x++) {
            for (int o = 0; o < 10; o++) {
                for (int t = 0; t < 10; t++) {
                    for (int l = 0; l < 10; l++) {
                        //System.out.println(x + " " + o + " " + " " + t + " " + l);
                        xol = x * 100 + o * 10 + l;
                        lxx = l * 100 + x * 10 + x;
                        tlt = t * 100 + l * 10 + t;
                        if (xol + lxx == tlt) {

                            if ((x != o && x != l && x != t) && (l != o && l != t) && (t != o)) {

                                //System.out.printf("l=%d, o=%d, x=%d, t=%d%n", l, o, x, t);

                                System.out.println("l="+l+" o="+o+" x="+x+" t="+t);
                            }

                        }
                    }
                }
            }
        }


    }
}
