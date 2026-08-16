class Solution {
    public int maxProfit(int[] prices) {

        int buy =Integer.MAX_VALUE;
        int maxPro = 0;

        for(int pri : prices){
            if(pri < buy) buy = pri;

            else if( pri - buy > maxPro) {
                maxPro = pri - buy;
            }
        }

        return maxPro;
        
    }
}