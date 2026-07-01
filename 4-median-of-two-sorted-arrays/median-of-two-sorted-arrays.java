class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1Len = nums1.length;
        int n2Len = nums2.length;
        int mArrLen = n1Len + n2Len;
        // Merge array
        int[] mergedArray = new int[n1Len + n2Len];
        if (n1Len > 0) {
            for (int i = 0; i < n1Len; i++) {
                mergedArray[i] = nums1[i];
            }
        }
        if (n2Len > 0) {
            for (int i = 0; i < n2Len; i++) {
                mergedArray[i + n1Len] = nums2[i];
            }
        }

        // Sort
        if (mArrLen > 1) {
            for (int i = 0; i < mArrLen; i++) {
                for (int j = i + 1; j < mArrLen; j++) {
                    if (mergedArray[i] > mergedArray[j]) {
                        int temp = mergedArray[i];
                        mergedArray[i] = mergedArray[j];
                        mergedArray[j] = temp;
                    }
                }
            }
        }

        if (mArrLen % 2 != 0) {
            return (double) mergedArray[mArrLen / 2];
        } else {
            return (double) (mergedArray[mArrLen / 2] + mergedArray[(mArrLen / 2) - 1]) / 2;
        }
    }
}