public class SearchIn2D {

    public static boolean search(int[][] matrix, int target) {
        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[0].length - 1; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
     
    }

    public static void main(String[] args) {
        int nums[][] = { { 1, 1 }, { 1, 2 }, { 1, 3 } };
        int target = 3;

        System.out.println(search(nums, target));
    }
}
