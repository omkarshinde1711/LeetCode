class Solution {
    
    static int num , maxNum;
    static int splitindex;
    
    public int maxProfit(int[] prices) {
        if(prices.length == 1){
            return 0;
        }

        //find first minium number 
        num = prices[0]; 
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
        for (int j = splitindex; j < prices.length; j++){
            if ( maxNum < prices[j]){
                maxNum = prices[j];
            }            
        }
        return(maxNum - num);
        }
        //System.out.println("max " + maxNum);            
    //return -1;
    }
}