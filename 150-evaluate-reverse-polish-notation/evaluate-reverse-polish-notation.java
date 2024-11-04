import java.util.Stack;

class Solution {
    private boolean isNumber(String token) {
        try{
            Integer.parseInt(token);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    private int operation(String op, int n2,int n1) {
        return switch (op) {
            case "/" -> n1 / n2;
            case "-" -> n1 - n2;
            case "+" -> n1 + n2;
            case "*" -> n1 * n2;
            default -> 0;
        };
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> hold = new Stack<>();
        for(int i  = 0 ; i < tokens.length; i++) {
            if(isNumber(tokens[i]))
                hold.push(Integer.parseInt(tokens[i]));
            else
                hold.push(operation(tokens[i], hold.pop(), hold.pop()));
        }
    return hold.pop();
    }
}