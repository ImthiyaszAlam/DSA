public class ReverseArray {

    public static void reverseArray(int arr[]) {
        int n = arr.length;
        int tempArr[] = new int[n];

        for (int i = 0; i < n; i++) {
            tempArr[i] = arr[n - i - 1];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = tempArr[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 13, 4, 2, 11, 6 };
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
