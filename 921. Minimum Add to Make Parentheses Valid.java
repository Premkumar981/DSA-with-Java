class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stk = new Stack<>();

        int count = 0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch=='('){
                stk.push(ch);
            }else if(stk.size()>0 && stk.peek()=='('){
                stk.pop();
            }else{
                count++;
            }
        }
        return stk.size() + count;
    }
}
//premkumarsuru
