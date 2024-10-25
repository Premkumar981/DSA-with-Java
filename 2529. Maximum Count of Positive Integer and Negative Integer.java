class Solution {
    public int maximumCount(int[] nums) {
        int maxNegativeIndex = lastNegative(nums) + 1;
        int minPositiveIndex = nums.length - firstPositive(nums);

        return Math.max(maxNegativeIndex, minPositiveIndex);
    }

    public int lastNegative(int[] nums){
        int start = 0;
        int end = nums.length-1;

        int ans = -1;

        while(start<=end){
            int mid=(start+end)/2;

            if(nums[mid]<0){
                ans = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }

    public int firstPositive(int[] nums){
        int start = 0;
        int end = nums.length-1;

        int ans = nums.length;

        while(start<=end){
            int mid = (start+end)/2;

            if(nums[mid]>0){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
}
//premkumarsuru
