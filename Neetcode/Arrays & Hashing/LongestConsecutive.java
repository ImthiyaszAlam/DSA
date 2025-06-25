import java.util.Arrays;

public class LongestConsecutive {

    public static void longestConsecutive(int arr[]) {

        Arrays.sort(arr);
        int n = arr.length;

        int lastElement = arr[0];

        int consecutiveArray[] = new int[];

        for (int i = 1; i < n; i++) {
            int diff = arr[i] - lastElement;
            if (diff == 1) {
                consecutiveArray[i] = lastElement;
            }
            lastElement = arr[i];
        }

    }

    public static void main(String[] args) {

    }
}
