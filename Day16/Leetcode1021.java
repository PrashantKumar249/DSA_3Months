package Day16;

class Leetcode1021 {
    public String removeOuterParentheses(String s) {
         string result = "";
        string temp = "";
        int balance = 0;

        for (char ch : s) {
            temp += ch;

            if (ch == '(') {
                balance++;
            } else {
                balance--;
            }

            // Jab ek primitive complete ho jaye
            if (balance == 0) {
                // Remove outer parentheses
                // temp[0] and temp[last] skip karna hai
                result += temp.substr(1, temp.size() - 2);

                // Reset temp for next primitive
                temp = "";
            }
        }

        return result;
        
    }
}