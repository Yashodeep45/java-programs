package ARRAYS;

import java.util.Scanner;

public class BinarySearch {
  public static void main(String[] args) {

    // for(int n=0;n<mid;n++){
    // System.out.println(Array[n]);
    // }
    // System.out.println(Array[mid]);
    // System.out.println("MIS INDEX= "+mid);
    // System.out.println(Array[mid]);
    int Array[] = { 1, 2, 3, 4, 5, 6, 7 };
    int key = 5;
    int mid = Array.length / 2;
    if (Array[mid] == key) {
      System.out.println(Array[mid]);

    }
    // if(Array[mid]>key){
    // System.out.println("true");
    // }
    if (Array[mid] > key) {
      for (int i = 0; i < mid - 1; i++) {
        if (Array[i] == key) {
          System.out.println("The index of our target is:" + i);
        }
      }
    }
    if (Array[mid] < key) {
      for (int n = mid + 1; n <= Array.length; n++) {
        if (Array[n] == key) {
          System.out.println("THE INDEX OF TARGET IS = " + n);
        }
      }
    }

  }
}
