public class WordSearch {

    static boolean validCoord(int x, int y, int m, int n) {
        if (x >= 0 && x < m && y >= 0 && x < n) {
            return true;
        }
        return false;
    }

    static boolean findWord(int index, String word, char[][] grid, int x, int y, int dirX, int dirY) {
        if (index == word.length()) {
            return true;
        }

        if (validCoord(x, y, grid.length, grid[0].length) && word.charAt(index) == grid[x][y]) {
            return findWord(index, word, grid, x, y, dirX, dirY);
        }
        return false;
    }

    public static void main(String[] args) {
        int index = 0;
        String word = "alam";
        char[][] grid = {
            {'a'},{'b'},{'c'}
        };
        int x = 1;
        int y = 0;
        int dirX = 01;
        int dirY = 10;
        findWord(index, word, grid, x, y, dirX, dirY)
    }
}