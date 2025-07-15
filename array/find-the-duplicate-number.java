class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        HashMap <Integer ,Integer> Freq = new HashMap();
        for (int i = 0; i < n ; i++){
            if(Freq.containsKey(nums[i])){
                return nums[i];
            }
            else {
                Freq.put(nums[i],1);
            } 
             
        }
        return -1;
    }
}