import java.util.Arrays;

public class MissingInArray {

    static int findMissing(int[] arr) {

        int n = arr.length + 1;
        Arrays.sort(arr);
        int arraySum = n * (n + 1) / 2;
        System.out.println("arraySum: "+arraySum);
        int actualSum = 0;

        System.out.println("actualSum: "+actualSum);
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        return arraySum - actualSum;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5 };
        System.out.println(findMissing(arr));
    }
}
