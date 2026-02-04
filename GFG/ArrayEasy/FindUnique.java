public class FindUnique {

    public static int findUnique(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = -1;
                    count++;
                }
            }
        }
        return arr[i];
    }

    public static void main(String[] args) {

    }
}
