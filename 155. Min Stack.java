class MinStack {
    private Stack<Integer> stk;
    private Stack<Integer> minstk;

    public MinStack() {
        stk = new Stack<>();
        minstk = new Stack<>();
    }
    
    public void push(int val) {
        if(stk.size()==0 || minstk.peek()>=val){
            minstk.push(val);
        }
        stk.push(val);
    }
    
    public void pop() {
        int e1 = stk.pop();
        int e2 = minstk.peek();

        if(e1==e2){
            minstk.pop();
        }
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return minstk.peek();
    }
}
//premkumarsuru

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
