class Solution {
    public void moveZeroes(int[] nums) {
        //Two Pointer Approch
        int[] nums2 = new int [nums.length];
        int index=0;
        for(int i = 0; i<nums.length;i++){
                if(nums[i] != 0){
                    nums[i] = nums2[index];
                    index++;
                }
        }
        for(int j : nums){
            System.out.print(nums2[j]);
        }
    }
}
