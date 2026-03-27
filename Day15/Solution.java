package Day15;

public class Solution {
    public String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            // Jab tak current string prefix se start nahi hoti
            while (strs[i].indexOf(prefix) != 0) {
                // prefix chhota karo
                prefix = prefix.substring(0, prefix.length() - 1);

                // agar empty ho gaya
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}