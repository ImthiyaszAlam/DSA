import java.util.ArrayList;

public class Alternate {

    public static void main(String[] args) {

    }

    static ArrayList<Integer> returnAlternate(int[] arr) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i += 2) {
            result.add(arr[i]);
        }

        return result;
    }
}
