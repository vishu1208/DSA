class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int left = 0;
        int right = 0;
        int n = nums1.length + nums2.length;
        int count = 0;
        double ans = 0;
        if (n % 2 == 0 && n != 0) {
            while (left < nums1.length && right < nums2.length) {
                if (nums1[left] <= nums2[right]) {
                    if (count == n/2 - 1 || count == n/2) {
                        ans += nums1[left];
                    }
                    left++;
                    count++;
                } else {
                    if (count == n/2 - 1 || count == n/2) {
                        ans += nums2[right];
                    }
                    right++;
                    count++;
                }
            }
            while (left < nums1.length) {

                if (count == n/2 - 1 || count == n/2) {
                    ans += nums1[left];
                }
                left++;
                count++;

            }
            while (right < nums2.length) {

                if (count == n/2 - 1 || count == n/2) {
                    ans += nums2[right];
                }
                right++;
                count++;
            }
            ans = ans/2;
        } else {
             while (left < nums1.length && right < nums2.length) {
                if (nums1[left] <= nums2[right]) {
                    if (count == n/2) {
                        ans = nums1[left];
                    }
                    left++;
                    count++;
                } else {
                    if (count == n/2) {
                        ans = nums2[right];
                    }
                    right++;
                    count++;
                }
            }
            while (left < nums1.length) {

                if (count == n/2) {
                    ans = nums1[left];
                }
                left++;
                count++;

            }
            while (right < nums2.length) {

                if (count == n/2) {
                    ans = nums2[right];
                }
                right++;
                count++;
            }
        }
        return ans;
    }
}