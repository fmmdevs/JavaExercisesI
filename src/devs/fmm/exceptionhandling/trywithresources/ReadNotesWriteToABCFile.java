package devs.fmm.exceptionhandling.trywithresources;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadNotesWriteToABCFile {

    final String[] notes = {
            "C,", "D,", "E,", "F,", "G,", "B,",
            "C", "D", "E", "F", "G", "A", "B",
            "c", "d", "e", "f", "g", "a", "b",
            "c'", "d'", "e'", "f'", "g'", "a'", "b'"};


    public static void main(String[] args) {
        String filePath = "/home/user/Documentos/DevProjects/Java/Java Programming Exercises/Recursos/ABC_Input.txt";

        try (Scanner sc = new Scanner(Paths.get(filePath));
             PrintWriter writer = new PrintWriter("/home/user/Documentos/DevProjects/Java/Java Programming Exercises/Recursos/ABC_Output.txt");
            ) {
            //int lines = 0;

            String headingABC = "M:C\nL:1/4\nK:C\n";
            StringBuilder stringBuilder = new StringBuilder(headingABC);
            while (sc.hasNextLine()) {
              /*  System.out.print(sc.nextLine() + " "+lines+" " );
                lines++;*/
                stringBuilder.append(sc.nextLine());
            }
            System.out.println();
            System.out.println(stringBuilder);
            for (int i = 0; i < stringBuilder.length(); i++) {
                if (i >= 1) {
                    if (Character.isLetter(stringBuilder.charAt(i - 1)) && Character.isLetter(stringBuilder.charAt(i))) {
                        stringBuilder.insert(i , " ");
                    }
                }
            }
            System.out.println(stringBuilder);
            writer.write(stringBuilder.toString());
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
