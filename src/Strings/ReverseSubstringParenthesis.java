package Strings;
import java.util.*;

public class ReverseSubstringParenthesis {
    public static String reverseParentheses(String s) {
        StringBuilder str = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ('(')) {
                stack.push(i);
            } else if (c == (')')) {
                int openIndex = stack.pop();
                arr[openIndex] = i;
                arr[i] = openIndex;
            }
        }
        int dir = 1;
        int i = 0;
        while(i < s.length()){
            char c = s.charAt(i);
            if(c == '(' || c == ')'){
                i = arr[i];
                dir = -1 * dir;
            }else{
                str.append(c);
            }
            i += dir;
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String s = "(u(love)i)";
        System.out.println(reverseParentheses(s));
    }
}
