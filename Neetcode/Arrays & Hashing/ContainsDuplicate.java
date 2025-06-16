import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int nums[]) {

        HashSet<Integer> duplicateMap = new HashSet<>();

        for (int num : nums) {

            if (duplicateMap.contains(num)) {
                return true;
            }
            duplicateMap.add(num);
        }
        return false;
    }

    public static void main(String[] args) {

        int nums[] = { 1, 2, 3, 1 };
        int nums1[] = { 1, 2, 3, 4 };

        System.out.println(containsDuplicate(nums));
        ;
        System.out.println();
        System.out.println(containsDuplicate(nums1));
        ;

    }
}