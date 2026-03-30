package Day18;

public class Leetcode151 {
    public String reverseWords(String s) {

        String[] arr = s.trim().split(" ");
        String ans = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!arr[i].equals("")) {   // empty words skip
                ans += arr[i] + " ";
            }
        }

        return ans.trim();
    }
}