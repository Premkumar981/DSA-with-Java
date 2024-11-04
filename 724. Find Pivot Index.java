class Solution {
    public int pivotIndex(int[] nums) {
        int rightSum = 0;

        for(int ele : nums){
            rightSum += ele;
        }

        int leftSum = 0;
        for(int i=0;i<nums.length;i++){
            rightSum -= nums[i];

            if(rightSum == leftSum){
                return i;
            }

            leftSum += nums[i];
        }
        return -1;
    }
}
//premkumarsuru
