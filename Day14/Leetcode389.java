package Day14;

class Leetcode389 {
    public char findTheDifference(String s, String t) {
        StringBuilder temp = new StringBuilder(t);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) == ch) {
                    temp.deleteCharAt(j);
                    break;
                }
            }
        }

        return temp.charAt(0);
    }
}
