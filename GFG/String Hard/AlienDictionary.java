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

        for(int i=0;i<i+1<words.length;i++){
            String w1 = words[i];
            String w2 = words[i+1];
            int len = Math.min(w1.length(),w2.length());
            int j = 0;
            
        }

    }

    public static void main(String[] args) {

    }
}
