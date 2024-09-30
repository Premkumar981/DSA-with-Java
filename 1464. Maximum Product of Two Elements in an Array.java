class Solution {
    public int maxProduct(int[] nums) {
        int Smax = -1;
        int max = -1;

        for(int i=0;i<nums.length;i++){
            if(max < nums[i]){
                Smax = max;
                max = nums[i];
            }else if(Smax < nums[i]){
                Smax = nums[i];
            }
        }
        int ans = (max-1) * (Smax-1);
        return ans;
    }
}