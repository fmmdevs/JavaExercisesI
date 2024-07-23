package devs.fmm.imperativeprogramming.controlflow;

public class SwitchStatementToSwitchExpression {
    public static void main(String[] args) {

        System.out.println("Enter month number");

        int month = new java.util.Scanner(System.in).nextInt();

        System.out.println("Enter year");
        int year = new java.util.Scanner(System.in).nextInt();

        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

        int days = switch (month) {
            case 2 -> isLeapYear ? 29 : 28;

            case 4, 6, 9, 11 -> 30;

            default -> 31;
        };

        System.out.println(days+" days");
    }
}
