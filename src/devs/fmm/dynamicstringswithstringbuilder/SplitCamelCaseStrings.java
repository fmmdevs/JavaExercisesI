package devs.fmm.dynamicstringswithstringbuilder;

public class SplitCamelCaseStrings {

    private static String camelCaseSplitter(String string) {
        StringBuilder splitter = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            if(i==0) {
                splitter.append(string.charAt(0));
                continue;
            }

            if (Character.isUpperCase(string.charAt(i))) {
                if (i - 1 > 0) {
                    if (Character.isUpperCase(string.charAt(i - 1))) {
                        splitter.append(string.charAt(i));
                    } else {
                        splitter.append(" ").append(string.charAt(i));
                    }
                }
            } else {
                splitter.append(string.charAt(i));
            }
        }
        System.out.println(splitter);
        return "";

    }

    public static void main(String[] args) {

        camelCaseSplitter("List");
        camelCaseSplitter("CiaoCiao");
        camelCaseSplitter("numberOfElements");
        camelCaseSplitter("CiaoCiaoCAPTAIN");
    }
}
