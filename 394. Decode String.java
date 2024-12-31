class Solution {
    public String decodeString(String s) {
        Stack<Integer> number = new Stack<>();
        Stack<String> main = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch >= '0' && ch <= '9'){
                int num = 0;
                
                while(i<s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                    num = num * 10 + (int)(s.charAt(i)-'0');
                    i++;
                }
                i--;
                number.push(num);
            }else if(ch != ']'){
                main.push(ch + "");
            }else{
                String str = "";
                while(!main.peek().equals("[")){
                    str = main.pop() + str;
                }
                main.pop();
                int repetation = number.pop();

                StringBuilder sb = new StringBuilder("");

                while(repetation>0){
                    sb.append(str);
                    repetation--;
                }
                main.push(sb.toString());
            }
        }
        StringBuilder ans = new StringBuilder("");

        while(main.size()>0){
            ans.insert(0,main.pop());
        }
        return ans.toString();
    }
}
//premkumarsuru
