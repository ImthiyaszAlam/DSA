/**
 * ArrayPairs
 */
public class ArrayPairs {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                count++;
                System.out.print("(" +arr[i]+" "+arr[j]+ ")" +",");
            }
            System.out.println();
        }
        System.out.println("total pairs: "+count);
    }
}