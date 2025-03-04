class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int exp_sum = n*(n+1)/2;
        int act_sum = 0;

        for(int num : nums){
            act_sum += num;
        }
        return exp_sum - act_sum;
    }
}