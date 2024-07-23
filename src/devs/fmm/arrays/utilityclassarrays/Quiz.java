package devs.fmm.arrays.utilityclassarrays;

import java.util.Arrays;

public class Quiz {
    public static void main(String[] args) {
        Object[] array1 = {"Anne Bonny", "Fortune", "Sir Francis Drake", new int[]{1, 2, 3}};
        Object[] array2 = {"Anne Bonny", "Fortune", "Sir Francis Drake", new int[]{1, 2, 3}};

        System.out.println(array1 == array2); // false, because are different objects, each reference variable is pointing
        // to a different object

        System.out.println(array1.equals(array2)); // false, Arrays are objects and have all methods from the base type:
        // java.lang.Object such equals, toString. Those are invalid for Arrays. equals has the same effect as == ,
        // in this case, as each variable is pointing to a different object it returns false.

        System.out.println(Arrays.equals(array1, array2)); // false because of the subarray (object)

        System.out.println(Arrays.deepEquals(array1, array2)); // true
    }
}
