import java.util.Arrays;
import java.util.HashMap;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int nums[]) {

        Arrays.sort(nums);

        HashMap<Integer, Integer> duplicateMap = new HashMap<>();

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
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