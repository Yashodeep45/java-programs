package ARRAYS;

import java.util.Scanner;

public class Reverse {
  public static void Rev(int Array[]) {
    int start = 0, last = Array.length - 1;
    while (start < last) {
      int temp = Array[last];
      Array[last] = Array[start];
      Array[start] = temp;

      start++;
      last--;
    }
    for (int i = 0; i < Array.length; i++) {
      System.out.print(Array[i]);

    }

  }

  public static void main(String[] args) {

    int Array[] = { 1, 2, 3, 4 };
    Rev(Array);

  }
}
