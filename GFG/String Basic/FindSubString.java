import java.util.ArrayList;
import java.util.List;

public class FindSubString {

    public static List<String> findSubstring(String str) {

        List<String> result = new ArrayList<>();

        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i; j < str.length() - 1; j++) {
                result.add(i, j + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
