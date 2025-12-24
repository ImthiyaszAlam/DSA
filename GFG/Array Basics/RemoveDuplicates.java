import java.util.HashSet;

public class RemoveDuplicates {


    static int removeDuplicates(int arr[]){
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
