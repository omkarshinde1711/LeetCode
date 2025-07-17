class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> unique = new LinkedHashSet<>(); 
        for(int i=0; i< nums.length ;i++){
            unique.add(nums[i]);
        }
        int i =0;
        for(int val : unique){
            nums[i++] = val;
        }
        return unique.size();
    }
}