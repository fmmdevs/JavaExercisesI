package devs.fmm.imperativeone.loops;

public class DrawFishyStitchingMotifs {
    public static void main(String[] args) {

        System.out.println("Enter the number of repetitions");

        int repetitions = new java.util.Scanner(System.in).nextInt();

        for(int i = 0; i<repetitions; i++){
            for(int j = 0; j<repetitions; j++){
                System.out.print("><> ");
            }
            for(int j = 0; j<repetitions; j++){
                System.out.print("<>< ");
            }
            System.out.println();

        }
    }
}
