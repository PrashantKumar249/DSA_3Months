package Day15;


class Leetcode1903 {
    public String largestOddNumber(String num) {

        String result = "";

        // Check every possible ending index
        for (int i = 0; i < num.length(); i++) {

            char last = num.charAt(i);

            // If last digit is odd
            if ((last - '0') % 2 == 1) {

                String sub = num.substring(0, i + 1);

                // Compare length (largest number)
                if (sub.length() > result.length()) {
                    result = sub;
                }
            }
        }

        return result;
    }
}