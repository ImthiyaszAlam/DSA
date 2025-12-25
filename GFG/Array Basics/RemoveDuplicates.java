import java.util.HashSet;

public class RemoveDuplicates {

    static int removeDuplicates(int arr[]) {
        HashSet<Integer> set = new HashSet<>();

        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                arr[idx++] = arr[i];
            }
        }
        return idx;
    }

    public static void main(String[] args) {

    }
}
