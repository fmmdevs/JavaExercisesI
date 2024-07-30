package devs.fmm.dynamicstringswithstringbuilder;

public class DontShootTheMessenger {

    private static String joinSplitMessages(String... messengerPart) {

        StringBuilder assemblingMsg = new StringBuilder();
/*
        for (int i = 0; i < messengerPart.length; i++) {
            assemblingMsg[i] = new StringBuilder(messengerPart[i]);
        }*/

        for (int i = 0; i < messengerPart.length; i++) {
            if(messengerPart[i].length()>i){
                System.out.println(messengerPart[i].charAt(i+1));
            }

            for (int j = 0; j < messengerPart[i].length(); j++) {
                System.out.println("j="+j+" i="+i);
                if(j<messengerPart.length) {
                    assemblingMsg.append(messengerPart[j].charAt(i));
                    System.out.println(assemblingMsg);
                }
            }

        }


        return "";
    }

    public static void main(String[] args) {
        joinSplitMessages("Hoy", "ok");

        /*joinSplitMessages("Hooky");
        joinSplitMessages("Hk", "oy", "o");
        joinSplitMessages("H", "", "ooky");*/
    }
}
