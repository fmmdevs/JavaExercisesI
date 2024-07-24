package devs.fmm.charstringproccesing;

import java.util.Arrays;

public class SumOfTheDigits {

    private static int digitSum(long value){

        String valueString = String.valueOf(value);
        System.out.println(valueString);
        int result=0;
        for(int i = 0; i<valueString.length(); i++){
            result+= Integer.parseInt(Character.toString(valueString.charAt(i)));
            //System.out.println(result+ " " + valueString.charAt(i));
        }
        System.out.println(result);
        return result;
    }

    private static int digitSum(String value){
        return digitSum(Long.parseLong(value));
    }

    public static void main(String[] args) {
        digitSum(1112999911);
        digitSum(199911);
        digitSum("1112999911");
        digitSum("1111");
        digitSum("999999999");

    }
}
