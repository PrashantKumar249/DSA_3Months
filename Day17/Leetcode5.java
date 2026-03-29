package Day17;

public class Leetcode5 {

    public String longestPalindrome(String s) {
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {

                if (isPalindrome(s, i, j)) {
                    String sub = s.substring(i, j + 1);

                    if (sub.length() > longest.length()) {
                        longest = sub;
                    }
                }
            }
        }

        return longest;
    }

    // without reverse (2 pointer)
    public boolean isPalindrome(String s, int left, int right) {

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}