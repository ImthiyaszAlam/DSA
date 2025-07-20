import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    public static int minWindow(String s, String t) {

        Map<Character, Integer> tCount = new HashMap<>();
        for (char currentElement : t.toCharArray()) {
            if (tCount.containsKey(tCount.getOrDefault(tCount, 0) + 1)) {

            }

            tCount.put(currentElement, tCount.getOrDefault(currentElement, tCount.getOrDefault(tCount, 0) + 1));
        }


        //Sliding Window
    }

    public static void main(String[] args) {

    }
}
