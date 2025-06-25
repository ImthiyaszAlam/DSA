import java.util.Arrays;

public class LongestConsecutive {


    public static void longestConsecutive(int arr[]){


        Arrays.sort(arr);
        int n = arr.length;

        int firstElement = arr[0];

        for(int i=1;i<n;i++){
            int diff = arr[i+1]-arr[i];
        }

    }
    public static void main(String[] args) {
        
    }
}
