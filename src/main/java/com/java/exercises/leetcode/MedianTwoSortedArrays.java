package com.java.exercises.leetcode;

public class MedianTwoSortedArrays {

  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

    if (nums1.length == 0) {
      return findMedianSortedArray(nums2);
    } else if (nums2.length == 0) {
      return findMedianSortedArray(nums1);
    } else if(nums1.length == 1 && nums2.length == 1) {
      return (nums1[0] + nums2[0]) / 2;
    }

    int i=0, j=0, k=0;
    int[] nums = new int[nums1.length + nums2.length];
    int n;

    while (k<nums.length) {
      if (i >= nums1.length) {
        nums[k++] = nums2[j++];
        continue;
      }
      if (j >= nums2.length) {
        nums[k++] = nums1[i++];
        continue;
      }
      nums[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
    }

    return findMedianSortedArray(nums);
  }

  public static double findMedianSortedArray(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }
    double median;

    if (nums.length % 2 == 0) {
      median = nums[nums.length/2] + nums[(nums.length/2)-1];
      median = median/2;
    } else {
      median = nums[nums.length/2];
    }
    return median;
  }

  public static void main(String[] args) {
    int[] nums1 = {2,4,6,10,12,14,16,18,20};
    int[] nums2 = {22};
    System.out.println(findMedianSortedArrays(nums1,nums2));
  }
}
