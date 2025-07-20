class Solution {
    
    static int num;
    static int splitindex;
    
    public int maxProfit(int[] prices) {
        //find first minium number 
        num = prices[0]; 
        for(int i = 0; i < prices.length; i++){
            if ( num > prices[i]){
                num = prices[i];
                splitindex = i;
            }
        } 
        System.out.println(num);            
    return -1;
    }
}