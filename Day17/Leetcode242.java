package Day17;

import java.util.Arrays;

class Leetcode242 {
    public boolean isAnagram(String s, String t) {

        // Step 1: length check
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: sort both strings
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        // Step 3: compare
        return Arrays.equals(a, b);
    }
}
