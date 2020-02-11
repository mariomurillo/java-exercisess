package com.java.exercises.codechef;

import java.util.*;

public class Bytelandia {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i=0;

    while (sc.hasNextLine() && i<10) {
      int testCase = sc.nextInt();

      System.out.println(calculateChange(testCase));

      i++;
    }
    sc.close();
  }

  private static int calculateChange(int testCase) {
    if (testCase <= 0 || testCase >= 1000000000) {
      return testCase;
    } else {
      int coin1 = testCase/2;
      int coin2 = testCase/3;
      int coin3 = testCase/4;

      int sum = coin1 + coin2 + coin3;

      return sum > testCase ? calculateChange(testCase/2) +
          calculateChange(testCase/3) + calculateChange(testCase/4) : testCase;
    }
  }
}
