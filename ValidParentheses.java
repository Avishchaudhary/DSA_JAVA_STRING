import java.util.HashMap;
import java.util.Stack;

//valid parentheses 
public class ValidParentheses {
    public static void main(String[] args) {
        String str = "()[]{}";
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '('); // that's why we take character and character in the hash map
        map.put(']', '[');
        map.put('}', '{');
        // now make a stack
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            // make a singlr char
            char singlechar = str.charAt(i);
            // if it is a closing stack than pop
            if (map.containsKey(singlechar)) {
                if (stack.empty()) {
                    System.out.println("false");
                } else {
                    char topvalue = stack.pop();
                    if (topvalue != map.get(singlechar)) {
                        System.out.println("false");
                    }
                }
            } else {
                // if pening bracket than push in the stack
                stack.push(singlechar);
            }
        }
        System.out.println(stack.isEmpty());
    }
}
