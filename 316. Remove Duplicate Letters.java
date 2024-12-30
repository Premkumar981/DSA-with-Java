class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int idx = (int)(ch-'a');

            lastIndex[idx] = i;
        }

        boolean[] present = new boolean[26];

        Stack<Character> stk = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int idx = (int)(ch-'a');

            if(present[idx] == false){
                while(stk.size()>0 && stk.peek()>ch && lastIndex[(int)(stk.peek()-'a')]>i){
                    present[(int)(stk.peek()-'a')] = false;
                    stk.pop();
                }
                stk.push(ch);
                present[idx] = true;
            }
        }
        StringBuilder sb = new StringBuilder("");

        while(stk.size()>0){
            sb.append(stk.pop());
        }
        return sb.reverse().toString();
    }
}
//premkumarsuru
