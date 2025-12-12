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

        if (mat[x][y] == word.charAt(widX)) {

            char temp = mat[x][y];
            mat[x][y] = '#';

            boolean res = findMatch(mat, word, x - 1, y, widX + 1) ||
                    findMatch(mat, word, x + 1, y, widX + 1) ||
                    findMatch(mat, word, x, y-1, widX + 1)||
                    findMatch(mat, word, x, y+1, widX + 1);
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
