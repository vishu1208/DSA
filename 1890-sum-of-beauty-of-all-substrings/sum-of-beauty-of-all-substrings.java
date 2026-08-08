class Solution {
    public int beautySum(String s) {
        
        int ans = 0;

        for( int i = 0 ; i < s.length() ; i++){
            HashMap<Character, Integer> mpp = new HashMap<>();

            for(int j = i ; j < s.length() ; j++){
                mpp.put(s.charAt(j) , mpp.getOrDefault(s.charAt(j), 0) + 1);

                int mini = Integer.MAX_VALUE;
                int maxi = Integer.MIN_VALUE;

                for(int val : mpp.values()){
                    mini = Math.min(val , mini);
                    maxi = Math.max(val , maxi);
                }

                ans += (maxi-mini);
            }
        }

        return ans;
    }
}