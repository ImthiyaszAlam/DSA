import java.util.List;

public class RecursionPermutation {

    public static void recurPerm(int index, StringBuilder str, List<String> ans) {
        if (index == str.length())
            ans.add(str.toString());
        return;

    }

    public static void main(String[] args) {

    }
}
