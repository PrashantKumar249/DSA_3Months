package Day26;

class Leetcode8 {
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        
        // 1. Skip whitespace
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        
        // 2. Check sign
        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }
        
        // 3. Convert digits
        long result = 0;  // long use kiya overflow handle karne ke liye
        
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            
            result = result * 10 + digit;
            
            // 4. Overflow check
            if (sign * result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign * result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            
            i++;
        }
        
        // 5. Return result
        return (int)(sign * result);
    }
}