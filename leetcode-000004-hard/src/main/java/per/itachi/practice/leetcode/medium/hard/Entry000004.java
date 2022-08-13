package per.itachi.practice.leetcode.medium.hard;

import java.util.concurrent.ThreadLocalRandom;

/**
 * The demanded time complexity is O(log(m+n))
 * */
public class Entry000004 {

    public static void main(String[] args) {
//        int[] nums1 = generateIntArray();
//        int[] nums2 = generateIntArray();
        int[] nums1 = new int[] {1, 3};
        int[] nums2 = new int[] {2};
        traverseIntArray(nums1);
        traverseIntArray(nums2);
        double result = findMedianSortedArrays(nums1, nums2);
        System.out.printf("The result is %f. ", result);
    }

    private static int[] generateIntArray() {
        // limit (count, maxvalue) (10, 50)
        int count = ThreadLocalRandom.current().nextInt(10);
        int[] array = new int[count];
        for (int i = 0; i < count; ++i) {
            array[i] = ThreadLocalRandom.current().nextInt(100);
        }
        return array;
    }

    private static void traverseIntArray(int[] array) {
        System.out.printf("The generated array with %d elements: ", array.length);
        for (int i = 0; i < array.length; ++i) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }

    /**
     * Time spends 2ms, and defeats 93.39% users.
     * Memory costs 39.8MB, and defeats 30.43% users.
     * Unexpectedly, it passed. Actually, the following algorithm doesn't meet O(log(m+n)).
     * */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] numMerged = new int[nums1.length + nums2.length];
        int idx1 = 0;
        int idx2 = 0;
        int idxMerged = 0;

        while (idx1 < nums1.length && idx2 < nums2.length) {
            if (nums1[idx1] <= nums2[idx2]) {
                numMerged[idxMerged++] = nums1[idx1++];
            }
            else {
                numMerged[idxMerged++] = nums2[idx2++];
            }
        }
        if (idx1 < nums1.length) {
            while (idx1 < nums1.length) {
                numMerged[idxMerged++] = nums1[idx1++];
            }
        }
        if (idx2 < nums2.length) {
            while (idx2 < nums2.length) {
                numMerged[idxMerged++] = nums2[idx2++];
            }
        }

        if (numMerged.length <= 0) {
            return .0;
        }

        if ((numMerged.length & 1) == 1) {
            // odd
            return (double) numMerged[numMerged.length/2 + 1 - 1];//because 0-based
        }
        else {
            // even
            double mid1 = (double)numMerged[numMerged.length/2 - 1];
            double mid2 = (double)numMerged[numMerged.length/2 + 1 - 1];
            return (mid1 + mid2) / 2.0;
        }
    }

}
