class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for(int i = 0 ; i < n - 1 ; i++){
            int sum = nums[i];
            for(int j = i+1 ; j < n ; j++){
                if(sum + nums[j] == target) return new int[]{i, j};
            }
        }

        return new int[]{-1, -1};
    }
}