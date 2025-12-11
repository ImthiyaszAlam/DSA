public class WordSearch4 {

    static boolean findMatch(char[][] mat, String word, int x, int y, int widX) {

        int wLen = word.length();
        int m = mat.length;
        int n = mat[0].length;

        if (widX == wLen) {
            return true;
        }

        if (x < 0 || y < 0 || x >= n || y >= m) {
            return false;
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
