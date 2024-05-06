package leetCode;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }
        int max = 0;
        int start = 0;
        int end = 0;

        while (end < s.length()) {
            char ch = s.charAt(end);

            while (s.substring(start, end).indexOf(ch) != -1) {
                start++;
            }

            max = Math.max(max, end - start + 1);

            end++;
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println(result);

    }
}