public class PrdocutArray {

    public static int[] productArrayExceptSelf(int nums[]) {

        int currentProduct = 1;
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                currentProduct = currentProduct * j;
            }
            answer[i] = currentProduct;
        }

        return answer;
    }

    public static void main(String[] args) {
        int 
    }
}