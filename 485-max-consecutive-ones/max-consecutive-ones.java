class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int curr = 0;
        int max = 0;

        for(int num : nums){
            if(num == 1){
                curr++;
            }else{
                curr = 0;
            }
            max = Math.max(curr,max);
        }
        return max;
    }
}