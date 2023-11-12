import java.util.Stack;

public class ParenthesesChecker {

//  MVP & EXTENSION
    public boolean checkParentheses(String testString) {
        Stack<Character> stack = new Stack<>();

        for (char s : testString.toCharArray()) {
            if (s == '(' || s == '[' || s == '{' || s == '<') {
                stack.push(s);
            } else if (s == ')' || s == ']' || s == '}' || s == '>') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
// check if stack is empty and all brackets are matched
        return stack.isEmpty();
    }


}

