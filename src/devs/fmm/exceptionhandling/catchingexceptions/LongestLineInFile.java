package devs.fmm.exceptionhandling.catchingexceptions;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LongestLineInFile {
    public static void main(String[] args) {

        String filePath = "/home/workzone/Documentos/DevProjects/Java/Java Programming Exercises/family-names.txt";

        try {
            List<String> names = Files.readAllLines(Paths.get(filePath));
            int longestLength = 0;
            String longestName ="";

            int secondLongestLength = 0;
            String secondLongestName = "";
            for(String name : names){
                if(name.length()>longestLength) {
                    longestName=name;
                    longestLength=name.length();
                } else if(name.length()>secondLongestLength) {
                    secondLongestName=name;
                    secondLongestLength=name.length();
                }
            }

            System.out.println("The longest name is " + longestName);
            System.out.println("The second longest name is " + secondLongestName);
        } catch (IOException e){
            System.out.println("Error : " + e );
        } catch (SecurityException e){
            System.err.println("Security Exception!" + e);
        }
    }
}
