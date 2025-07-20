class Solution {
    
    public int maxProfit(int[] prices) {
        //edge case
        if ( prices == null || prices.length <= 1){
            return 0;
        }
        int minPrice = prices[0]; // initializing to the first day
        int maxProfit = 0; // no profit so far

        for ( int i = 1; i < prices.length; i++){
            //whats current profit 
            int currentProfit = prices[i] - minPrice;

            if( currentProfit > maxProfit){
                maxProfit = currentProfit;
            }

            if ( prices[i] < minPrice){
                minPrice = prices[i];
            }
        }
    return maxProfit;
    }
}
