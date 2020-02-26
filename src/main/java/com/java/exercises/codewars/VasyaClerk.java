package com.java.exercises.codewars;

import java.util.HashMap;
import java.util.Map;

public class VasyaClerk {

  public static String Tickets(int[] peopleInLine) {
    String result = "YES";
    Map<Integer, Integer> changeMap = new HashMap<>();
    changeMap.put(25, 0);

    for (int value : peopleInLine) {
      switch (value){
        case 25:
          changeMap.put(value, changeMap.get(value) + value);
          break;
        case 50:
          Integer bill = changeMap.get(25);

          if (bill != null && bill != 0) {
            changeMap.put(25, bill - 25);
            changeMap.put(50, value);
          } else {
            result = "NO";
          }
          break;
        case 100:
          Integer bill25 = changeMap.get(25);
          Integer bill50 = changeMap.get(50);

          if (bill25 != null && bill25 != 0) {
            if (bill50 != null && bill50 != 0) {
              changeMap.put(50, bill50 - 50);
              changeMap.put(25, bill25 - 25);
            } else if (bill25 >= 75) {
              changeMap.put(25, bill25 - 75);
            } else {
              result = "NO";
            }
          } else {
            result = "NO";
          }
      }
    }
    return result;
  }

  public static void main(String[] args) {

    int[] tickets = {25,25,50,100};
    System.out.println(Tickets(tickets));
  }
}
