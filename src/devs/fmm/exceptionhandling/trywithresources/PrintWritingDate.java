package devs.fmm.exceptionhandling.trywithresources;

import java.io.*;
import java.time.LocalDateTime;

public class PrintWritingDate {
    public static void main(String[] args) {
        String filePath = "/home/user/Documentos/DevProjects/Java/Java Programming Exercises/Recursos/PrintWriter.txt";
        try (
                FileWriter fileWriter = new FileWriter(filePath, true);
                PrintWriter writer = new PrintWriter(fileWriter);) {

            String today = LocalDateTime.now().toString();
            System.out.println(today);
            writer.write("\n" + today);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
