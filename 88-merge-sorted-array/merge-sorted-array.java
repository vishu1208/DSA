class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int size = m+n;
        for(int i = m ; i < size ; i++){
            int temp = nums1[i];
            nums1[i] = nums2[i-m];
            nums2[i-m] = temp;
        }
        Arrays.sort(nums1);
    }
}