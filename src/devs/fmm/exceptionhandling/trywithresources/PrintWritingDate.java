package devs.fmm.exceptionhandling.trywithresources;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class PrintWritingDate {
    public static void main(String[] args) {
        String filePath = "/user/workzone/Documentos/DevProjects/Java/Java Programming Exercises/Recursos/PrintWriter.txt";
        try (PrintWriter writer = new PrintWriter(filePath);) {
            String today = LocalDateTime.now().toString();
            System.out.println(today);
            writer.write(today);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
