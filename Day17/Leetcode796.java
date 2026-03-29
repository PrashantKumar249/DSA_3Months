package Day17;

public class Leetcode796 {
    public boolean rotateString(String s, String goal) {
        
        // Length check (important)
        if (s.length() != goal.length()) {
            return false;
        }

        String temp = s;

        // Try all rotations
        for (int i = 0; i < s.length(); i++) {
            
            // Check if equal
            if (temp.equals(goal)) {
                return true;
            }

            // Left rotate
            temp = temp.substring(1) + temp.charAt(0);
        }

        return false;
    }
}
