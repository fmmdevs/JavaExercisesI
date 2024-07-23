package devs.fmm.charstringproccesing;

import java.util.Scanner;

public class GiveDefiantAnswers {

    public static void main(String[] args) {

        String noIdea = " No idea!";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        String question = sc.nextLine();

        if (question.charAt(question.length() - 1) == '?') {
            System.out.println(question + noIdea);
        } if("No idea!".equals(question)) {
            System.out.println("Aye!");
        }
    }
}
