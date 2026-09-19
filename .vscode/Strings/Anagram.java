package Strings;

public class Anagram {

    public static boolean isAnagram(String s, String t) {
        int i;
        if (s.length() != t.length()) {
            return false;
        }

        int[] charCount = new int[26];

        for (i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
        }

        for (i = 0; i < t.length(); i++) {
            charCount[t.charAt(i) - 'a']--;
        }

        for (int j : charCount) {
            if (j != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "cat";
        String t = "act";

        if (isAnagram(s, t)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
