package Strings;

public class ReverseWords {
    public static String Reverse(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;                
            }
            if (i < 0) {
                break;
            }
            int wordEnd = i;
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            String word = s.substring(i + 1, wordEnd + 1);

            if (result.length() == 0) {
                result.append(word);
            } else {
                result.append(" ").append(word);
            }
        }

        return result.toString();

    }

    public static void main(String[] args) {
        String str = "the sky is blue";
        System.out.println(Reverse(str));
    }
}
