class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        for ( int i = 0 ; i < n-1 ; i++ ){
            int count = 0;
            for ( int j = i + 1 ; j < n ; j++){
                if (nums[i] == nums[j]){
                    count++;
                }
                if(count >= 1)
                {
                    return nums[i];
                }
            }
        }
        return 0;
    }
}