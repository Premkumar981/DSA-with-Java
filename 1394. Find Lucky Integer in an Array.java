class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> prem = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int element = arr[i];

            if(prem.containsKey(element)==true){
                prem.put(element,prem.get(element)+1);
            }else{
                prem.put(element,1);
            }
        }
        int ans = -1;
        
        for(int key : prem.keySet()){
            if(prem.get(key)==key){
                ans = Math.max(key, ans);
            }
        }
        return ans;
    }
}
//prem
