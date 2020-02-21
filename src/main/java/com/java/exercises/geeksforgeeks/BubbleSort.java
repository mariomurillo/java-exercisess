package com.java.exercises.geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BubbleSort {

  public static void main(String[] args) {

    List<Integer> disorderArray = Arrays.asList(1, 2, 3, 7, 5, 6, 4, 8);

    System.out.println(sort(disorderArray));

  }

  private static List<Integer> sort(List<Integer> disorderArray) {

    LinkedList<Integer> sortArray = new LinkedList<>();
    sortArray.addAll(disorderArray);
    boolean swapped = false;

    int n = sortArray.size();
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j+1 < n-i; j++) {
        if (sortArray.get(j) > sortArray.get(j+1)) {
          Integer previous = sortArray.set(j+1, sortArray.get(j));
          sortArray.set(j, previous);
          swapped = true;
        }
      }
      if (!swapped) {
        break;
      }
    }

    return sortArray;
  }
}
