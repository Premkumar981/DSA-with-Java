class MyQueue {
    private Stack<Integer> mainstk;
    private Stack<Integer> copystk;

    public MyQueue() {
        mainstk = new Stack<>();
        copystk = new Stack<>();
    }
    
    public void push(int x) {
        while(mainstk.size()>0){
            copystk.push(mainstk.pop());
        }

        mainstk.push(x);

        while(copystk.size()>0){
            mainstk.push(copystk.pop());
        }
    }
    
    public int pop() {
        return mainstk.pop();
    }
    
    public int peek() {
        return mainstk.peek();
    }
    
    public boolean empty() {
        if(mainstk.size()==0){
            return true;
        }else{
            return false;
        }
    }
}
//premkumarsuru

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
