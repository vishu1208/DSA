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

        // 1. Find the first number from the right that is smaller than its next element and set that index as index ( if there is no such element then just reverse the array and return  )

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

        // 2. start the search from the right find the element the is largest then the index and swep that 
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

        // 3. Reverse the Array from  index + 1 to nums.length - 1

        reverse(nums, index+1 , n-1);

        return;

    }
}