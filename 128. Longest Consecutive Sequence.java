class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],false);
        }

        for(int key : hm.keySet()){
            if(hm.containsKey(key-1)==false){
                hm.put(key,true);
            }
        }

        int max = 0;
        for(int key : hm.keySet()){
            int temp=1;

            if(hm.get(key)==true){
                while(hm.containsKey(key+temp)==true){
                    temp++;
                }
            }
            max = Math.max(max, temp);
        }
        return max;
    }
}
//premkumarsuru
