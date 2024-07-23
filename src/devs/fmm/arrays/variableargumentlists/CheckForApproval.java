package devs.fmm.arrays.variableargumentlists;

public class CheckForApproval {
    private static boolean allTrue(boolean firstVote, boolean... remainingVotes) {
        if (firstVote) {
            for (boolean vote : remainingVotes) {
                if (vote == false) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(allTrue(true, true, true));
        System.out.println(allTrue(true));
        System.out.println(allTrue(true, true, false));
        //System.out.println(allTrue(true, null, true));
       // System.out.println(allTrue());


    }
}
