package Strings;

public class LongestSubstring {

    public static int subString(String s) {
        int lastindex[] = new int[128];
        int i;
        for (i = 0; i < 128; i++) {
            lastindex[i] = -1;
        }

        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currenChar = s.charAt(right);

            if (lastindex[currenChar] >= left) {
                left = lastindex[currenChar] + 1;
            }

            lastindex[currenChar] = right;

            int currentWindowSize = right - left + 1;

            maxLength = Math.max(maxLength, currentWindowSize);
        }

        return maxLength;

    }

    public static void main(String[] args) {
        String str = "aberacb";

        System.out.println(subString(str));

    }
}
