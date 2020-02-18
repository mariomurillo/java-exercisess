package com.java.exercises.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class TwoSum {

  public static void main(String[] args) {

    TwoSum twoSum = new TwoSum();

    int []nums = {1,3,4,2};

    int[] result = twoSum.twoSum(nums, 6);

    for (int i : result) {
      System.out.println(i);
    }
  }

  public int[] twoSum(int[] nums, int target) {

    int positionA = 0;
    int positionB = 0;

    Map<Integer, Integer> numsMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      numsMap.put(nums[i], i);
    }

    int i = 0;

    while (positionB == 0) {
      positionA = i;
      Integer positionTemp = numsMap.get(target - nums[positionA]);
      if (positionTemp != null && positionTemp != positionA) {
        positionB = positionTemp;
      }
      i++;
    }

    int[] positions = {positionA, positionB};

    return positions;
  }
}
