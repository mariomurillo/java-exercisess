package com.java.exercises.projecteuler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindSumMultiples {

  public static void main(String[] args) {

    int a = 3;
    int b = 5;
    int limit = 1000;

    List<Integer> aMultiples = findMultiples(a, limit);
    List<Integer> bMultiples = findMultiples(b, limit);

    int sum = getSum(aMultiples, bMultiples);

    System.out.println(sum);
  }

  private static int getSum(List<Integer> aMultiples, List<Integer> bMultiples) {

    int sum = 0;

    Set<Integer> multiples = new HashSet<>();
    multiples.addAll(aMultiples);
    multiples.addAll(bMultiples);

    for (int multiple : multiples) {
      sum += multiple;
    }
    return sum;
  }

  private static List<Integer> findMultiples(int n, int limit) {

    List<Integer> multiplesOfN = new ArrayList<>();
    for (int i=1; i<limit; i++) {
      if (i%n == 0) {
        multiplesOfN.add(i);
      }
    }
    return multiplesOfN;
  }
}
