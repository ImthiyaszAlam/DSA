public class ValidSudoku {

    public static boolean isValidSudoku(char[][] sudokuBoard) {

        int n = sudokuBoard.length;

        // Row
        for (int i = 0; i < n; i++) {

            // Column
            for (int j = 0; j < n; j++) {
                char currentElement = sudokuBoard[i][j];
                System.out.print(currentElement + ", ");
            }
            System.out.println();

        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        isValidSudoku(board);
    }
}
