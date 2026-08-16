class Solution {

    public int[] reverse(int[] nums,int i ,int j){
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        return nums;
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        if(n <= 1) return;

        int index = -1;

        int i = n - 2;

        while( i >= 0 ){
            if(nums[i] < nums[i+1] ) {
                index = i;
                break;
            }
            i--;
        }

        if(i < 0){

        reverse(nums , 0 , n-1);

        return;
        }

        i = n-1;

        while(i > 0){
            if( nums[i] > nums[index] ){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;

                break;
            }
            i--;
        }

        reverse(nums, index+1 , n-1);

        return;

    }
}