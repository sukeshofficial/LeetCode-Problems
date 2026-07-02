import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> symbols = new Stack<>();
        Map<Character, Character> parentheses = new HashMap<>();
        parentheses.put(')', '(');
        parentheses.put(']', '[');
        parentheses.put('}', '{');

        for(char ch: s.toCharArray()) {
            if(parentheses.containsKey(ch)) {
                if (symbols.isEmpty())
                    return false;

                char top = symbols.pop();

                if (top != parentheses.get(ch)) {
                    return false;
                }
            } else {
                symbols.push(ch);
            }
        }
        return symbols.isEmpty();
    }
}