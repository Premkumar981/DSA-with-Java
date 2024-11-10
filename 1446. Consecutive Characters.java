class Solution {
    public int maxPower(String s) {
        int max = 1;
        int count = 1;

        for(int i=1;i<s.length();i++){
            char current = s.charAt(i);
            char previous = s.charAt(i-1);

            if(current == previous){
                count++;
            }else{
                max = Math.max(max, count);
                count = 1;
            }
        }
        max = Math.max(max,count);
        return max;
    }
}
//premkumarsuru
