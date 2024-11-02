import java.util.Stack;
import java.util.List;
class MinStack {
    private int min;
    Stack<List<Integer>> hold;

    public MinStack() {
        hold = new Stack<List<Integer>>();
    }
    
    public void push(int val) {
        if(hold.isEmpty())
            hold.push(Arrays.asList(val,val));
        else
            hold.push(Arrays.asList(val,Math.min(hold.peek().get(1),val)));
    }
    
    public void pop() {
        hold.pop();
    }
    
    public int top() {
        return hold.peek().get(0);
    }
    
    public int getMin() {
        return hold.peek().get(1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */