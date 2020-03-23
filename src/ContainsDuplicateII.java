import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] array1 = new int[]{1,2,3,1};
        int[] array2 = new int[]{1,0,1,1};
        int[] array3 = new int[]{1,2,3,1,2,3};

        System.out.println(compare(array1, 3));;
        System.out.println(compare(array2, 1));;
        System.out.println(compare(array3, 2));;
    }

    static boolean compare(int[] array, int k) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean result = true;
            for (int j = i + 1; j < array.length; j++) {
                Integer duplicateIndex = null;
                if (array[i] == array[j]) {
                    if (duplicateIndex != null && Math.abs(duplicateIndex - j) <= k) {
                        return true;
                    }
                    if (Math.abs(i - j) > k) {
                        result = false;
                    }
                    duplicateIndex = j;
                }
            }
            if (!result) {
                return false;
            }
        }
        return true;
    }
}
