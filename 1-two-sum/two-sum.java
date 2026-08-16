class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            int contain = target - nums[i];

            if(mpp.containsKey(contain)) return new int[]{i , mpp.get(contain)};

            mpp.put(nums[i], i);
        }

        return new int[]{-1, -1};

        // for(int i = 0 ; i < n - 1 ; i++){
        //     int sum = nums[i];
        //     for(int j = i+1 ; j < n ; j++){
        //         if(sum + nums[j] == target) return new int[]{i, j};
        //     }
        // }

        // return new int[]{-1, -1};
    }
}