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

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("5");
        list.add("4");
        list.forEach(System.out::print);
    }
    static void aMethod(StringBuilder sf1,StringBuilder sf2){
        sf1.append(sf2);
        sf2 = sf1;

    }
}
