class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];

        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i]+"";
        }

        Arrays.sort(arr,(string1, string2)->(string1+string2).compareTo(string2+string1));

        StringBuilder ans = new StringBuilder("");

        for(int i=arr.length-1;i>=0;i--){
            ans.append(arr[i]);
        }
        if(ans.charAt(0)=='0'){
            return "0";
        }else{
            return ans.toString();
        }
    }
}
//premkumarsuru
