class Solution {
    public void moveZeroes(int[] nums) {
        //starting position
        int insertat = 0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[insertat] = nums[i];
                insertat++;
            }
        }
            while(insertat<nums.length){
                nums[insertat++] = 0;
            }     
    }
}