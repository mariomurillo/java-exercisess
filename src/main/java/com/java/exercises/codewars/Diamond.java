package com.java.exercises.codewars;

import java.util.LinkedList;

public class Diamond {

  public static String print(int n) {

    boolean isEven = n%2 == 0 ? true : false;

    if (n < 1 || isEven) {
      return null;
    }

    LinkedList<StringBuilder> diamondList = new LinkedList<>();
    int countSpaces = 0;
    StringBuilder mainLine = new StringBuilder();

    for (int i=n; i>0; i-=2) {
      if (diamondList.isEmpty()) {
        for (int j=0; j<n; j++) {
          mainLine.append("*");
        }
        diamondList.add(mainLine);
      } else {
        StringBuilder otherLine = new StringBuilder(mainLine);
        StringBuilder spaces = new StringBuilder();
        int spacesQuantity = countSpaces / 2;
        for (int j=0; j< spacesQuantity; j++) {
          spaces.append(" ");
        }
        otherLine.replace(0, spacesQuantity, spaces.toString());
        otherLine.replace(n - spacesQuantity, n, "");
        diamondList.addFirst(otherLine);
        diamondList.addLast(new StringBuilder(otherLine));
      }
      countSpaces += 2;
    }
    StringBuilder diamond = new StringBuilder();
    for (StringBuilder line : diamondList) {
      diamond.append(line.append('\n'));
    }
    return diamond.toString();
  }

  public static void main(String[] args) {
    System.out.println(print(5));
  }
}
