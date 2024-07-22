package devs.fmm.arrays.multidimensionalarrays;

import java.util.Arrays;

public class CheckMiniSudoku {

    private static void isValidSolution(int[][] sudokuBlock) {

        int[] occurrences = new int[9];

        for (int i = 0; i < sudokuBlock.length; i++) {
            for (int j = 0; j < sudokuBlock[i].length; j++) {
                occurrences[sudokuBlock[i][j]-1]++;
            }
        }

        StringBuilder missing = new StringBuilder();
        StringBuilder repeated = new StringBuilder();
        for (int i = 0; i < occurrences.length; i++) {

            if(missing.isEmpty() && occurrences[i]==0){
                missing.append("Missing ").append(i+1);
            } else if (occurrences[i] == 0) missing.append(" ").append(i+1);

            if(repeated.isEmpty()&& occurrences[i]>1){
                repeated.append("Repeated").append(" ").append(i+1);
            } else if(occurrences[i]>1){
                repeated.append(" ").append(i+1);
            }
        }


        System.out.println(missing.isEmpty() ? "Valid Sudoku Assignment" : missing+"\n"+repeated);
        System.out.println("-------------------------------------");
    }

    public static void main(String[] args) {
        int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 8 } };
        int[][] array2 = { { 1, 2, 4 }, { 5, 6 }, {  5, 8 } };
        System.out.println(Arrays.deepToString(array));
        isValidSolution(array);

        System.out.println(Arrays.deepToString(array1));
        isValidSolution(array1);

        System.out.println(Arrays.deepToString(array2));
        isValidSolution(array2);
    }
}
