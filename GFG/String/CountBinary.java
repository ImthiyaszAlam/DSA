public class CountBinary {
    public static void main(String[] args) {
        String input = "00100101";
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') {
                for (int j = i + 1; i < input.length(); i++) {
                    if (input.charAt(i) == '1') {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);

    }
}
