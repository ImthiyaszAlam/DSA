import java.util.ArrayList;

public class Leaders {

    public static ArrayList<Integer> findLeaders(int arr[]) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            boolean isLeader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <arr[j]) {
                    isLeader = false;
                    break;
                }
            }

            if (isLeader) {
                result.add(arr[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int listArray[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(findLeaders(listArray));
    }
}
