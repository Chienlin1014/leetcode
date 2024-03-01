package solved.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MedianOfTwoSortedArrays {
    public  double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] array = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).toArray();
        Arrays.sort(array);
        int length = array.length;
        if (length % 2 == 0) {
            return (double) (array[length/2] + array[length/2 - 1]) / 2;
        }else {
            return array[length/2];
        }
    }
}
