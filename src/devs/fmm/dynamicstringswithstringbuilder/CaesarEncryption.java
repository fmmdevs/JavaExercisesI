package devs.fmm.dynamicstringswithstringbuilder;

public class CaesarEncryption {

    static String caesar(String s, int rotation) {
        int z = 'z';
        int Z = 'Z';
        int a = 'a';
        int A = 'A';

        //System.out.println(a + " " + A);
        //System.out.println(z + " " + Z);
        //System.out.println("----");

        StringBuilder caesar = new StringBuilder();

        int codepoint;
        int dif;
        for (int i = 0; i < s.length(); i++) {

            codepoint = Character.codePointAt(s, i);
            //System.out.println(Character.toString(codepoint)+" "+codepoint);

            if(Character.isUpperCase(s.charAt(i))){
                if(codepoint+rotation>90){
                    // Z=90; rotation = 3; 90+3-90-1=2 => 'B'
                    dif = codepoint-90+rotation-1;
                    caesar.append(Character.toString(65+dif));
                } else {
                    caesar.append(Character.toString(codepoint+rotation));
                }
            } else if(Character.isLowerCase(s.charAt(i))){
                if(codepoint+rotation>122){
                    dif= codepoint-122+rotation-1;
                    caesar.append(Character.toString(97+dif));
                } else {
                    caesar.append((Character.toString(codepoint+rotation)));
                }
            } else{
                // keeping other chars like spaces and symbols
                caesar.append(s.charAt(i));
            }


        }

        System.out.println(caesar);
        return caesar.toString();
    }

    static String decaesar(String s, int rotation){

        int z = 'z';
        int Z = 'Z';
        int a = 'a';
        int A = 'A';

        //System.out.println(a + " " + A);
        //System.out.println(z + " " + Z);
        //System.out.println("----");

        StringBuilder caesar = new StringBuilder();

        int codepoint;
        int dif;
        for (int i = 0; i < s.length(); i++) {

            codepoint = Character.codePointAt(s, i);
            //System.out.println(Character.toString(codepoint)+" "+codepoint);

            if(Character.isUpperCase(s.charAt(i))){
                if(codepoint-rotation<65){
                    dif = codepoint-rotation-65+1;
                    /*System.out.println(codepoint+" "+ rotation);
                    System.out.println(dif);*/
                    caesar.append(Character.toString(90+dif));
                } else {
                    caesar.append(Character.toString(codepoint-rotation));
                }
            } else if(Character.isLowerCase(s.charAt(i))){
                if(codepoint-rotation<97){
                   // System.out.println(codepoint+" "+ rotation);

                    dif = codepoint-rotation-97+1;
                    //System.out.println(dif);

                    caesar.append(Character.toString(122+dif));
                } else {
                    caesar.append((Character.toString(codepoint-rotation)));
                }
            } else{
                // keeping other chars like spaces and symbols
                caesar.append(s.charAt(i));
            }
        }

        System.out.println(caesar);
        return caesar.toString();

    }


    public static void main(String[] args) {
        caesar("ABC abc XYZ xyz w", 3);
        System.out.println("----------");
        decaesar("DEF def ABC abc z",3);
        System.out.println("----------");
        caesar( "abxyz. ABXYZ!", 13 );
        System.out.println("----------");
        decaesar( caesar( "abxyz. ABXYZ!", 13 ), 13 );
    }
}
