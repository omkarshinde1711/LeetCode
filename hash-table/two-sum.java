class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> Checker = new HashMap <>();
        for ( int i = 0; i < nums.length; i++){
            int diff = target - nums[i]; 
            if (Checker.containsKey(diff)){
                return new int[]{Checker.get(diff),i};
            }
            Checker.put(nums[i],i);
        }
    throw new IllegalArgumentException("No two sum solution found");
    }  
}