public class Repeating1toNm1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3};
        int n = arr.length-1;
        int actualSum = 0;
        int expectedSum = n*(n+1)/2;

        for(int i:arr){
            actualSum+=i;
        }

    }
}
