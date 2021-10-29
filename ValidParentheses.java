//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
// determine if the input string is valid.
//An input string is valid if:
//        Open brackets must be closed by the same type of brackets.
//        Open brackets must be closed in the correct order.

//Level: Easy

//Runtime: 1ms faster than 99.14% of Java online submissions for Valid Parentheses.
//Memory: 37.4 MB

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    private static boolean isValid(String s) {
        if (s.length() % 2 != 0 || s.length() <= 0) return false;

        Map<Character, Character> map = new HashMap<>();
        Stack<Character> stk = new Stack<>();

        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        stk.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            Character currentChar = s.charAt(i);
            if (stk.size() > 0) {
                Character popChar = stk.pop();
                if (map.get(popChar) != currentChar) {
                    stk.push(popChar);
                    stk.push(currentChar);
                }
            } else {
                stk.push(currentChar);
            }
        }
        return stk.isEmpty();
    }

    public static void main(String args[]) {
        String testCase = "{[]}";
        boolean result = isValid(testCase);
        System.out.println(result);
    }
}
