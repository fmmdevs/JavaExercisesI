package devs.fmm.charstringproccesing;

public class BuildingHtmlSimpleConcatenation {

    private static String htmlElement(String tag, String body) {
        if (body == null && tag != null && !tag.equals("")) {

            return "<" + tag + "></" + tag + ">";

        } else if (body != null && tag != null && !tag.equals("")) {

            return "<" + tag + ">" + body + "</" + tag + ">";

        } else if (body != null && (tag == null || tag.equals(""))) {

            return body;

        } else{
            return "";
        }
    }

    private static String strong(String body) {
        return htmlElement("strong", body);
    }

    private static String emphasized(String body) {
        return htmlElement("em", body);
    }

    public static void main(String[] args) {
        System.out.println(htmlElement("strong", "strong is bold"));
        System.out.println(strong(emphasized("strong + emphasized")));
        System.out.println(htmlElement("span", null));
        System.out.println(htmlElement("", "no"));
        System.out.println(htmlElement(null, "not strong"));
        System.out.println(htmlElement(null, null));


    }
}
