package com.java.exercises.projecteuler;

import java.util.ArrayList;
import java.util.List;

public class EvenFibonacciNumbers {

  public static void main(String[] args) {

    int limit = 4000000;
    List<Integer> fibonacciNumbers = generateFibonaccies(limit);

    Integer sum = fibonacciNumbers.stream().filter(f -> isEven(f)).reduce(0, Integer::sum);

    System.out.println(sum);
  }

  private static boolean isEven(int n) {
    return n%2 == 0;
  }

  private static List<Integer> generateFibonaccies(int limit) {

    List<Integer> fibonacciNumbers = new ArrayList<>();
    fibonacciNumbers.add(1);
    fibonacciNumbers.add(2);

    int currentFibonacci = 0;
    int i = 2;

    while (currentFibonacci < limit) {
      currentFibonacci = fibonacciNumbers.get(i-1) + fibonacciNumbers.get(i-2);
      fibonacciNumbers.add(currentFibonacci);
      i++;
    }

    return fibonacciNumbers;
  }

}
