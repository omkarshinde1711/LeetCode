class Solution {
    public void sortColors(int[] nums) {
        // Insertion Sort Approch 
        // int i,j,key;
        // int n = nums.length;
        // for ( i = 1 ; i < n ; i++){
        //     key = nums[i]; // element to insert
        //     j = i-1;
        //     while ( j >= 0 && nums[j] > key){
        //         nums[j+1] = nums[j];
        //         j--;
        //     }
        //     nums[j+1] = key; //insert kar rahe at rigth position
        //     }
        // }

        // Selection Sort
        int n = nums.length;
            for ( int i = 0 ; i < n ; i++){

                int minIndex = i;   //current index ko minimum consider karo

                for ( int j = i+1 ; j < n ; j++){
                    if(nums[j] < nums[minIndex])  //check if koi aur minimum hai kya
                    minIndex = j;                 //usko minIndex bana do
                }

                //only swap to write place means at index j 
                //if minIndex i nahi ho toh.... 
                if (minIndex != i){
                        int temp = nums[i];
                        nums[i] = nums[minIndex];
                        nums[minIndex] = temp;
                    }
            }
    }
}