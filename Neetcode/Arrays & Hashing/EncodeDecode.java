public class EncodeDecode {

    public static void encode(String strs[]) {

        for (int i = 0; i < strs.length; i++) {
            String currentWord = strs[i];
            int currentWordLength = currentWord.length();
            String currentWordToEncode = currentWord + currentWordLength + "#";
        }
    }

    public static void main(String[] args) {

    }
}
