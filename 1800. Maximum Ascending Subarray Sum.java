class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = nums[0];
        int currMax = nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                currMax = currMax + nums[i];
            }else{
                max = Math.max(currMax, max);
                currMax = nums[i];
            }
            max = Math.max(currMax, max);
        }
        
        return max;
    }
}
//prem
