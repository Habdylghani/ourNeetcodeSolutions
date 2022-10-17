import java.util.Stack;

public class ValidStack {
    public static boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '(' || c == '[' || c == '{') {
                myStack.push(c);
            } else {
                if (myStack.isEmpty())
                    return false;
                if ((myStack.peek() == '(' && c == ')')
                        || (myStack.peek() == '[' && c == ']')
                        || (myStack.peek() == '{' && c == '}')) {
                    myStack.pop();
                } else {
                    return false;
                }
            }
        }
        return myStack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "(}";
        System.out.println(isValid(str));
    }
}
