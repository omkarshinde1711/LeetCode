class Solution {
    
    public int maxProfit(int[] prices) {
        int num = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        if(prices.length == 1){
            return 0;
        }

        //find first minium number 
        num = prices[0]; 
        int splitindex = 0;
        for(int i = 0; i < prices.length; i++){
            if ( num > prices[i]){
                num = prices[i];
                splitindex = i;
            }
        }
        //debug
        System.out.println("num " + num);
        System.out.println("split " + splitindex); 
        //System.out.println(prices.length);
        if (splitindex == prices.length-1)
        {
            return 0;
        }
        else{
        System.out.println("max " + maxNum);            
        for (int j = splitindex; j < prices.length; j++){
            if ( maxNum < prices[j]){
                maxNum = prices[j];
            }            
        }
        return(maxNum - num);
        }
        
    //return -1;
    }
}