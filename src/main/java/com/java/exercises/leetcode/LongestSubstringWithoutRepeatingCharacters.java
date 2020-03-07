package com.java.exercises.leetcode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

  public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstring("bbbbb"));
  }

  public static int lengthOfLongestSubstring(String s) {

    int count = s.isBlank() ? 0 : 1;
    int countTemp = 0;

    Set<Character> set = new HashSet<>();

    for (int i = 0; countTemp < s.length() - i; i++) {
      char value = s.charAt(i);
      set.add(value);
      for (int j = i+1; j < s.length(); j++) {
        char nextValue = s.charAt(j);
        if (set.add(nextValue)) {
          countTemp = set.size();
          count = countTemp > count ? countTemp : count;
        } else {
          set.clear();
          break;
        }
      }
    }

    return count;
  }
}
