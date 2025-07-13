class Solution {
    public int missingNumber(int[] nums) {
            int result = nums.length ;
            for (int i = 0 ; i <= nums.length-1 ; i++)
            {
                result += i - nums [i];
            }
            return result;
    }
    //     //length check kiya
    //     //System.out.println(nums.length);
        

    //     //hashset use karenge Integer wala
    //     HashSet <Integer> set = new HashSet<>();
    //     for(int num : nums){
    //         set.add(num);
    //     }
    //     //sirf number chahiye to nums use karo!!!

    //     //same thing just JAVA good syntax
    //     // for (int i = 0; i < nums.length; i++) {
    //     //     set.add(nums[i]);
    //     // }


    //     //check which is missing in the set and doneeeee
    //     for (int i = 0 ; i <= nums.length ; i++){

    //         //
    //         if(!set.contains(i)){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
}