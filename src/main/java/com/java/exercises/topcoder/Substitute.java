package com.java.exercises.topcoder;

public class Substitute {

  public int getValue(String key, String code) {

    String resultString = "";
    for (int i = 0; i < code.length(); i++) {
      int value = key.indexOf(code.charAt(i));

      if (value != -1) {
        value++;
        value = value > 9 ? value = 0 : value;
        resultString = resultString.concat(String.valueOf(value));
      }
    }
    return Integer.parseInt(resultString);
  }
}
