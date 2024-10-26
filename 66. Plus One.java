class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;

        if(digits[length-1] != 9){
            digits[length-1] = digits[length-1]+1;
            return digits;
        }

        digits[length-1]=0;

        for(int i=length-2;i>=0;i--){

            if(digits[i] != 9){
                digits[i] = digits[i]+1;
                return digits;
            }
            digits[i]=0;
        }

        int[] ans = new int[length+1];
        ans[0]=1;
        return ans;
    }
}
//premkumarsuru
