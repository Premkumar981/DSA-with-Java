class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int number = 0;
        int total_count = 0;

        for(int element : nums){
            if(element == target){
                total_count++;
            }else if(element < target){
                number++;
            }
        }

        List<Integer> answer = new ArrayList<>();

        while(total_count>0){
            answer.add(number);
            number++;
            total_count--;
        }
        return answer;
    }
}
//premkumarsuru
