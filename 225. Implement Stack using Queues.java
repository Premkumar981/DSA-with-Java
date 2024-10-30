class MyStack {
    private Queue<Integer> mainQueue;
    private Queue<Integer> copyQueue;

    public MyStack() {
        mainQueue = new LinkedList<>();
        copyQueue = new LinkedList<>();
    }
    
    public void push(int x) {
        while(mainQueue.size()>0){
            copyQueue.add(mainQueue.remove());
        }

        mainQueue.add(x);

        while(copyQueue.size()>0){
            mainQueue.add(copyQueue.remove());
        }
    }
    
    public int pop() {
        return mainQueue.remove();
    }
    
    public int top() {
        return mainQueue.peek();
    }
    
    public boolean empty() {
        if(mainQueue.size()==0){
            return true;
        }else{
            return false;
        }
    }
}
//premkumarsuru

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
