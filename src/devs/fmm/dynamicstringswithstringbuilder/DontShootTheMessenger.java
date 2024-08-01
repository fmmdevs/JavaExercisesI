package devs.fmm.dynamicstringswithstringbuilder;

public class DontShootTheMessenger {

    private static String joinSplitMessages(String... messengerParts) {

        StringBuilder assemblingMsg = new StringBuilder();

        int maxLength = 0;

        for (int i = 0; i < messengerParts.length; i++) {
            if (messengerParts[i].length() > maxLength) {
                maxLength = messengerParts[i].length();
            }
        }

        //System.out.println(maxLength);
        int length = 0;
        // We use i to get the letter in that position, we need to know the maxLength of all messengerParts in order
        // to get all the letters of each messengerPart and we are going to check the length of the current message
        // because could be less than the maxLength
        for (int i = 0; i < maxLength; i++) {
            // We use j to iterate through the array of messengerParts
            for (int j = 0; j < messengerParts.length; j++) {
                // Obtaining the length of the current messengerPart
                    length = messengerParts[j].length();
                    //System.out.println("j "+j+" "+"i "+i+" length "+length);
                    // If the current messagePart length is bigger than i we append that letter
                    if(i<length){
                        //System.out.print(messengerParts[j].charAt(i));
                        assemblingMsg.append(messengerParts[j].charAt(i));
                    }



            }
        }
        System.out.println(assemblingMsg);


        return assemblingMsg.toString();
    }

    public static void main(String[] args) {
        joinSplitMessages("Hoy", "ok");
        joinSplitMessages("Hooky");
        joinSplitMessages("Hk", "oy", "o");
        joinSplitMessages("H", "", "ooky");
    }
}
