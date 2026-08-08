class Solution {
    public int helper(String s, int left, int right){
        while( left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        return ( right - left - 1 );
    }
    public String longestPalindrome(String s) {
        int left = 0 ;
        int right = 0;
        
        for( int i = 0 ; i < s.length() ; i++){
            int lenOdd = helper(s , i , i);
            int lenEven = helper(s , i , i + 1);

            int max = Math.max(lenOdd, lenEven);

            if ( max > (right - left)){
                left = i - (max - 1)/2;
                right = i + (max/2);
            }
        }

        return s.substring(left , right+1);
    }
}