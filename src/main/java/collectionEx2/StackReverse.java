package collectionEx2;

import java.util.Stack;

public class StackReverse {
    public static class StringUtils {
        public static String reverseString(String str) {
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < str.length(); i++) {
                stack.push(str.charAt(i));
            }

            StringBuilder reversed = new StringBuilder();
            while (!stack.isEmpty()) {
                reversed.append(stack.pop());
            }

            return reversed.toString();
        }

        public static void main(String[] args) {
            String reversedString = reverseString("Salam");
            System.out.println(reversedString);
        }
    }
}
