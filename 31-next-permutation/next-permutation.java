class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;
        while(i>=0 && nums[i] >= nums[i+1]){
            i--;
        }
        if(i>=0){
            for(int j=n-1; j>i; j--){
                if(nums[j]>nums[i]){
                    swap(nums,i,j);
                    break;
                }
            }
        }
        int start = i+1;
        int end = n-1;
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}