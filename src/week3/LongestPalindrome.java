package week3;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c]++;
        }
        int res = 0;
        for (int c : count) {
            res += c / 2 * 2;
            if (c % 2 == 1 && res % 2 == 0) res++;
        }
        return res;
    }
}
