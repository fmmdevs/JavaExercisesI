package devs.fmm.charstringproccesing;

public class CiaoCiaoInTheMiddle {
    private static boolean isCiaoCiaoInMiddle(String s) {
        if (s.length() % 2 != 0) return false;

        String ciaoCiao = "CiaoCiao";


        int beginIndexCiao = 0;
        int endIndexCiao = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ciaoCiao.charAt(0)) {
                beginIndexCiao = i;
                for (int j = 0; j < ciaoCiao.length(); j++) {
                    if (ciaoCiao.charAt(j) != s.charAt(i)) {
                        break;
                    } else if (j == ciaoCiao.length() - 1) {
                        endIndexCiao = i;
                    }
                    i++;
                }
            }

        }

        // System.out.println("--BEGIN--");
        // System.out.println(beginIndexCiao + " " + endIndexCiao + " " + (s.length()-1 ));
        // System.out.println((s.length() - 1) + " - " + endIndexCiao + " = " + beginIndexCiao);
        // System.out.println("--END--");

        return (s.length() - 1 - endIndexCiao == beginIndexCiao);

    }

    public static void main(String[] args) {

        System.out.println(isCiaoCiaoInMiddle("SupaCiaoCiaoCute"));
        System.out.println(isCiaoCiaoInMiddle("\tCiaoCiao "));
        System.out.println(isCiaoCiaoInMiddle("BambooCiaoCiaoBlop"));
        System.out.println(isCiaoCiaoInMiddle("Bernie und Ert"));
    }
}
