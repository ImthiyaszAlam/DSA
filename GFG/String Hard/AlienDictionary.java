import java.util.ArrayList;

public class AlienDictionary {

    static String findOrder(String[] words) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int inDegreee[] = new int[26];

        boolean exists[] = new boolean[26];
        for (int i = 0; i < 26; i++) {
            graph.add(new ArrayList<>());
        }

        for (String word : words) {
            for (char ch : word.toCharArray()) {
                exists[ch - 'a'] = true;
            }
        }

    }

    public static void main(String[] args) {

    }
}
