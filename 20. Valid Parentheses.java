class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch=='(' || ch=='{' || ch=='['){
                stk.push(ch);
            }else if(stk.size()>0 && ch==']' && stk.peek()=='['){
                stk.pop();
            }else if(stk.size()>0 && ch=='}' && stk.peek()=='{'){
                stk.pop();
            }else if(stk.size()>0 && ch==')' && stk.peek()=='('){
                stk.pop();
            }else{
                return false;
            }
        }

        if(stk.size()==0){
            return true;
        }else{
            return false;
        }
    }
}
//premkumarsuru
