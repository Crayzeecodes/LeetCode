import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int evalRPN(String[] tokens) {
       
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (String s : tokens) {
            if (isOperator(s)) {
                
                int num1 = stack.pop(); 
                int num2 = stack.pop();
                int result = 0;
                

                if (s.equals("*")) {
                    result = num2 * num1;
                } else if (s.equals("/")) {
                    result = num2 / num1;
                } else if (s.equals("-")) {
                    result = num2 - num1;
                } else if (s.equals("+")) {
                    result = num2 + num1;
                } else if (s.equals("%")) {
                    result = num2 % num1;
                }
                stack.push(result);
            } else {

                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }

    public boolean isOperator(String token) {

        return token.equals("*") || token.equals("/") || token.equals("-") || token.equals("+") || token.equals("%");
    }
}
