package Strings;
import java.util.*;

public class ReverseSubstringParenthesis {
    public static String reverseParentheses(String s) {
        StringBuilder str = new StringBuilder();

        char[] chars = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ('(')) {
                stack.push(i);
            } else if (chars[i] == (')')) {
                int start = stack.pop();
                reverse(chars, start + 1, i - 1);
            }
        }
        for (char c : chars) {
            if (c != '(' && c != ')') {
                str.append(c);
            }
        }
        return str.toString();
    }

    public static void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String s = "(u(love)i)";
        System.out.println(reverseParentheses(s));

    }
}
