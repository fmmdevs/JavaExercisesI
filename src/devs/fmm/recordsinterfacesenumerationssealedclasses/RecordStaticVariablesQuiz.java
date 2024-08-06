package devs.fmm.recordsinterfacesenumerationssealedclasses;

import java.util.UUID;

public class RecordStaticVariablesQuiz {
    // Compiles
    record Candy( String name, int calories){
        public static String id = UUID.randomUUID().toString();
    }

    // Valid alternative (not recommended)
    record Candy2(String name, int calories){
        public static String id;
        Candy2{
            id=UUID.randomUUID().toString();
        }
    }

    public static void main(String[] args) {
        Candy candy = new Candy("Mint", 4000);
        // Why would you want an UUID shared by all instances of Candy?
        System.out.println(Candy.id);

        Candy2 candy2 = new Candy2("Peppermint", 2000);
        System.out.println(candy2);
        System.out.println(Candy2.id);
    }
}
