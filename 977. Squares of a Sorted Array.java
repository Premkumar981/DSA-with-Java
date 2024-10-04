class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];

        int start = 0;
        int end = nums.length-1;
        int ptr = ans.length-1;

        while(start<=end){
            int startSquare = nums[start] * nums[start];
            int endSquare = nums[end] * nums[end];

            if(startSquare>endSquare){
                ans[ptr] = startSquare;
                start++;
            }else{
                ans[ptr] = endSquare;
                end--;
            }
            ptr--;
        }
        return ans;
    }
}
