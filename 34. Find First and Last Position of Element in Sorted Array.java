class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        if(nums.length==0){
            return ans;
        }

        ans[0] = first(nums,target);
        ans[1] = second(nums, target);
        return ans;
    }

    public int first(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;

        while(start<=end){
            int mid = (start+end)/2;

            if(nums[mid]==target){
                ans = mid;
                end = mid-1;
            }else if(target>nums[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }

    public int second(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;

        while(start<=end){
            int mid = (start+end)/2;

            if(nums[mid]==target){
                ans = mid;
                start = mid+1;
            }else if(target>nums[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
}
//prem
